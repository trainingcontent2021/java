package day2.string;

import java.util.Arrays;

public class TestStringMethods {

	public static void main(String[] args) {
		
//------------Substring()-----------------
		String str = "program";
        // from the first character to the end
        System.out.println(str.substring(0));  // program
        // from the 4th character to the end
        System.out.println(str.substring(3));  // gram
        
        // from 1st to the 7th  character
        System.out.println(str.substring(0, 7));  // program

        // from 1st to the 5th  character
        System.out.println(str.substring(0, 5));  // progr

        // from 4th to the 5th character
        System.out.println(str.substring(3, 5));  // gr
        
   //------------replace()-----------------
        String str1 = "C++ Programming";

        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java")); // Java Programming

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // substring not in the string
        System.out.println("Java".replace("C++", "C")); // Java
        
   //----------------charAt()
        // first character
        System.out.println(str1.charAt(0)); // 'C'
        
   //------------getByte------------------

        String str2 = "Java";
        byte[] byteArray;

        // convert the string to a byte array
        // using platform's default charset
        byteArray = str2.getBytes();
        System.out.println(Arrays.toString(byteArray));
        
  //-----------indexOf()----
        String str3 = "Learn Java";
        int result1;

        // getting index of character 'J'
        result1 = str3.indexOf('J');
        System.out.println(result1); // 6
   //-------------ComparteTo - Compares string in dictionary order
        /*
         * returns 0 if the strings are equal
returns a negative integer if the string comes before the str argument in the dictionary order
returns a positive integer if the string comes after the str argument in the dictionary order*/
        String string1 = "Learn Java";
        String string2 = "Learn Java";
        String string3 = "Learn Kolin";
        int result;

        // comparing str1 with str2
        result = string1.compareTo(string2);
        System.out.println(result); // 0

        // comparing str1 with str3
        result = string1.compareTo(string3);
        System.out.println(result); // -1

        // comparing str3 with str1
        result = string3.compareTo(string1);
        System.out.println(result); // 1
        
  //----toLowerCase---------------------
        System.out.println(str1.toLowerCase()); 
        System.out.println(str1.toUpperCase()); 
        
  //------------trim()
        String s1 = "     Learn   Java Programming ";
        System.out.println(str1);
        System.out.println(str1.trim());
        
 //----------replaceAll()
        String st1 = "Learn\nJava \n\n   ";
        String result2;

        // replace all whitespace characters with empty string
        result2 = st1.replaceAll("\\s", "");
        System.out.println(result2);  // LearnJava
    }
}
