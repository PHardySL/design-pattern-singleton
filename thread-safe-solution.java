class Main {
    public static void main(String args[]) {
        Runnable runnable = () -> {
            ImportantObject x = ImportantObject.getInstance();
            System.out.println("Hashcode is " + x.hashCode());
        };

        for (int i = 1; i <= 5; i++) {
            new Thread(runnable).start();
        }
    }
}

class ImportantObject {
    private static ImportantObject single_instance = null;
    public Object s;

    private ImportantObject() {
        s = new Object();
    }

    public static synchronized ImportantObject getInstance() {
        if (single_instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            single_instance = new ImportantObject();
        }
        return single_instance;
    }
}
