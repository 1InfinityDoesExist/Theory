package MainClass;

class Outer {
    class Inner {
	public void display() {
	    System.out.println("Hi I am inner class");
	}
    }
}

class Super {
    static class subClass {
	public void show() {
	    System.out.println("Hi I am show class");
	}
    }
}

class Anynomous {
    public void dance() {
	System.out.println("Chal Nanki Nacche");
    }
}

public class MainJavaClass {
    public static void main(String[] args) {

	// Inner / OuterClass
	Outer.Inner outInner = new Outer().new Inner();
	outInner.display();

	// Super
	Super.subClass sup = new Super.subClass();
	sup.show();

	// Anynomous
	Anynomous anynomous = new Anynomous() {
	    public void dance() {
		System.out.println("Amarendra BahuBali Yani Mein");
	    }
	};
	anynomous.dance();

	// Autoboxing Unboxing
	Integer kter = new Integer(15);
	int x = kter.intValue();
	System.out.println(x);

	Integer iter = new Integer("10");
	if (iter != null) {
	    int i = Integer.parseInt(iter.toString());
	    System.out.println(i);
	}

	int i = 10;
	Integer it = i;
	System.out.println(it);

    }
}
