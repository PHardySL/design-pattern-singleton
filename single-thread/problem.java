class Main {
    public static void main(String args[]) {
        ImportantObject x = new ImportantObject();
        ImportantObject y = new ImportantObject();
        ImportantObject z = new ImportantObject();

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
    public ImportantObject() {
    }
}