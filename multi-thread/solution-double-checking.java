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
    private volatile static ImportantObject single_instance;

    private ImportantObject() {
    }

    public static synchronized ImportantObject getInstance() {
        if (single_instance == null) {
            synchronized (ImportantObject.class) {
                if (single_instance == null) {
                    try {
                        Thread.sleep(1000); // this simulates a more "intensive" singleton object
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                single_instance = new ImportantObject();
            }
        }
        return single_instance;
    }
}

// this is called "double-checked locking" synchronisation only happens when
// creating the object, so it only happens once
