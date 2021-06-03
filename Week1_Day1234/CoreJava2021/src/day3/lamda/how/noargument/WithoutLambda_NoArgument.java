package day3.lamda.how.noargument;

interface Shape{  
    public void draw();  
}  
public class WithoutLambda_NoArgument {
    public static void main(String[] args) {  
        int width=10;  
        //without lambda, Shape implementation using anonymous class  
        Shape d=new Shape() {  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
    }  
}  
