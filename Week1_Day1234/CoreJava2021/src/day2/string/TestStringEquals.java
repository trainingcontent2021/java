package day2.string;

public class TestStringEquals {
	    public static void main(String[] args)
	    {
	        String s1 = new String("HELLO");
	        String s2 = new String("HELLO");
	        System.out.println(s1 == s2); //Check for Reference comparision
	        System.out.println(s1.equals(s2)); // Checks the equals value comparision
	    }
	}

