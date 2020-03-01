package stateandbehavior;

import java.util.Arrays;
import java.util.List;

public class Digit {

	private int base;
	private int value = 0;

	public Digit(int base) {
		this.base = base;
	}

	public String toString() {
		return String.valueOf("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(value));
	}

	public int getValue() {
		return value;
	}

	public boolean increment() {
		value += 1;
		if (value == base) {
			value = 0;
			return true;
		}
		return false;
    }

    public static void main(String[] args) {
        System.out.println("This is digit!");

        List<Integer> myList = Arrays.asList(1,2,3,4,5);

        myList.stream().forEach((myInteger) -> {
            System.out.println("My integer" + myInteger);
        });
    }
}
