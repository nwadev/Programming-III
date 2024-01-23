import java.util.Scanner;

public class ispalindrome {



//main fuction
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a valid string to check if its a palindrome: ");
String s = input.next();

System.out.println("The string " + s + " is a " + palindrome(s) + " palindrome");





}



// second function
public static boolean palindrome(String s){
    if (s.length() <= 1)                                    // base case
        return true;
    if (s.charAt(0)  != s.charAt(s.length() - 1))     // ends recursion
        return false;
    else                                                    // keeps recursion going                  
        return palindrome(s.substring(1,s.length() - 1) );       // substring is already at index form so no need for .charAt

}


    
}
