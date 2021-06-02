package day2.stringtokenizer;

import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) {
		  StringTokenizer st1 =
		             new StringTokenizer("Hello friends How are you", " ");
		        while (st1.hasMoreTokens())
		            System.out.println(st1.nextToken());
	}

}
