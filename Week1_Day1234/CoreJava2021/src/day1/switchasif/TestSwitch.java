package day1.switchasif;

public class TestSwitch {

	public static void main(String[] args) {
		int weather = 5;
	      //passing variable to the switch
	      switch (weather) 
	      {
	          //comparing value of variable against each case
	        case 0:
	        case 5:
	          System.out.println("It is Sunny today!");
	          break;
	        case 1:
	          System.out.println("It is Raining today!");
	          break;
	        case 2:
	          System.out.println("It is Cloudy today!");
	          break;
	        //optional
	        default:
	          System.out.println("Invalid Input!");
	      }//Switch

}}
