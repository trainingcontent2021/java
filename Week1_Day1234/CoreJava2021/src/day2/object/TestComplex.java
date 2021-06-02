package day2.object;

public class TestComplex {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        
        Complx c11 = new Complx(10, 15);
        Complx c22 = new Complx(10, 15);
        if (c11.equals(c22)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        
        
        

	}

}
