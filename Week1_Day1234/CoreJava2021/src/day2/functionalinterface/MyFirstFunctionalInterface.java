package day2.functionalinterface;
@FunctionalInterface
public interface MyFirstFunctionalInterface 
{   public void firstWork();
   // public void firstWork1();
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}