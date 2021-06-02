package day2.abstractclass1;

public class TestGarbageCollection {
	 public static void main(String[] args) throws InterruptedException
	    {
	 TestGarbageCollection t1 = new TestGarbageCollection();
     TestGarbageCollection t2 = new TestGarbageCollection();
       
     // Nullifying the reference variable
     t1 = null;
       
     // requesting JVM for running Garbage Collector
     System.gc();
       
     // Nullifying the reference variable
     t2 = null;
       
     // requesting JVM for running Garbage Collector
     Runtime.getRuntime().gc();
 }

	@Override
	protected void finalize() throws Throwable {
		    System.out.println("Garbage collector called");
		     System.out.println("Object garbage collected : " + this);
		 }
	}
   
 

