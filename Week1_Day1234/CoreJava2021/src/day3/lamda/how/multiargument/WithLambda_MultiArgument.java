package day3.lamda.how.multiargument;

interface Shape1{  
    public void draw(String name);  
}  

public class WithLambda_MultiArgument {
    public static void main(String[] args) {  
          
        //with lambda  
        Shape1 d2=(name)->{  
            System.out.println("Hello "+ name);  
        };  
        d2.draw("Alex");
    }  
}  

