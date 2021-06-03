package day3.lamda.how.noargument;

interface Shape1{  
    public void draw();  
}  
public class WithLambda_NoArgument {
    public static void main(String[] args) {  
        int width=10;  
        //without lambda, Shape implementation using anonymous class  
        //with lambda  
        Shape1 d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();
    }  
}  

