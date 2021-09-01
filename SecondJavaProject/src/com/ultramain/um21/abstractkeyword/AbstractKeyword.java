package com.ultramain.um21.abstractkeyword;

public class AbstractKeyword {
	public static void main(String[] args) {
		Son myson = new Son();
		myson.study();

		Daughter mydaughter = new Daughter();
		mydaughter.cook();

	}
}

abstract class GrandFather {
	abstract public void study();
}

abstract class Dad {
	public void play() {
		System.out.println("Dad plays football...");
	}

	abstract public void cook();
}

class Son extends GrandFather {

	public void study() {
		System.out.println("Studying Engineering....");
	}
}

class Daughter extends Dad {

	public void cook() {
		System.out.println("Daughter cooking.....");
	}
}