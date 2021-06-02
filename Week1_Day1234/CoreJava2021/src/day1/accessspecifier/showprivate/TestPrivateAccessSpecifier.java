package day1.accessspecifier.showprivate;

public class TestPrivateAccessSpecifier {

	public static void main(String[] args) {

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        //d.name = "Revature";
        
        //-----------How to access private members

        // access the private variable using the getter and setter
        d.setName("Revature");
        System.out.println(d.getName());
	}

}
