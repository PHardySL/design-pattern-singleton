class Main {
    public static void main(String args[]) {
        ImportantObject x = ImportantObject.getInstance();
        ImportantObject y = ImportantObject.getInstance();
        ImportantObject z = ImportantObject.getInstance();

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());
        if (x == y && y == z) {
            System.out.println(
                    "Three objects point to the same memory location i.e, to the same object");
        } else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location");
        }
    }
}

class ImportantObject {
    private static ImportantObject single_instance = null;

    private ImportantObject() {
    }

    public static ImportantObject getInstance() {
        if (single_instance == null) {
            single_instance = new ImportantObject();
        }
        return single_instance;
    }
}