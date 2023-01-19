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
	private static ImportantObject single_instance = new ImportantObject();

	private ImportantObject() {
	}

	public static ImportantObject getInstance() {
		return single_instance;
	}
}

// this is in fact thread-safe as James said but if it's an
// expensive process it might be worth initialising only when needed