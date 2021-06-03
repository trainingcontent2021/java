package day3.multithreading.threadstate;

public class TestThreadState {

	public static void main(String[] args) {
		Thread.State[] states = Thread.State.values();
		
		for( Thread.State state : states)
		{
			System.out.println(state);
		}

	}

}
