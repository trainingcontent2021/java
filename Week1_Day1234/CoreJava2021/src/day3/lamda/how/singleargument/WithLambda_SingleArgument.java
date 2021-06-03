package day3.lamda.how.singleargument;

interface Calculator{  
    public int add(int a, int b);  
}  

public class WithLambda_SingleArgument {
    public static void main(String[] args) {  
          
        //with lambda  
    	Calculator c1= (a,b) -> (a+b);
    	  System.out.println(c1.add(10,20));    
    	  Calculator c2 =(int a,int b)->{  
              return (a+b);   
              };  
          System.out.println(c2.add(100,200));  
    }  
}  

