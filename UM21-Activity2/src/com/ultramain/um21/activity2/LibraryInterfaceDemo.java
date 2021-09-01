package com.ultramain.um21.activity2;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers mykiduser = new KidUsers();
		mykiduser.registerAccount(10);
		mykiduser.requestBook("Kids");
		KidUsers mykiduser1 = new KidUsers();
		mykiduser1.registerAccount(18);
		mykiduser1.requestBook("Fiction");
		System.out.println("--------------------------------------------------------------");
		AdultUser myadult = new AdultUser();
		myadult.registerAccount(5);
		myadult.requestBook("Kids");
		AdultUser myadult1 = new AdultUser();
		myadult1.registerAccount(23);
		myadult1.requestBook("Fiction");

	}

}

interface LibraryUser {
	public void registerAccount(int a);

	public void requestBook(String b);
}

class KidUsers implements LibraryUser {
	int age;
	String bookType;

	public void registerAccount(int a) {
		this.age = a;
		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
		}
	}

	public void requestBook(String b) {
		this.bookType = b;
		if (bookType.equals("Kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}

class AdultUser implements LibraryUser {
	int age;
	String bookType;

	public void registerAccount(int a) {
		this.age = a;
		if (age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		} else {
			System.out.println("Sorry,Age must be greater than 12 to register as an Adult");
		}
	}

	public void requestBook(String b) {
		this.bookType = b;
		if (bookType.equals("Fiction")) {
			System.out.println("Book issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult fiction books");
		}
	}

}
