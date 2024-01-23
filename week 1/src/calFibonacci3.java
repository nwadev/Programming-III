// 18.32



import java.util.Scanner;
public class calFibonacci3 {
    
    // fibonacci numbers
    /*
    if (index == 0)
        return 0;
    else if (index == 1)
        return 1;
    else
        return fib(index − 1) + fib(index − 2);
     */


     // main function
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the index number for the fibonacci number: ");
int i = input.nextInt();




System.out.println("The index number "+ i + "has the fibonacci number " + fib(i));

}



public static long fib(int i){
    if (i  == 0)
        return 0;
    else if (i == 1)
        return 1;
    else
        return fib(i - 1) + fib(i - 2);


}




}
