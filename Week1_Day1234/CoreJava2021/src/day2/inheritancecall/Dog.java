package day2.inheritancecall;

class Dog extends Animal {

	  // overriding the eat() method
	  @Override
	  public void eat() {
		  super.eat();
	    System.out.println("I eat dog food");
	  }

	  // new method in subclass
	  public void bark() {
	    System.out.println("I can bark");
	  }
	}