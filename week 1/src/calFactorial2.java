import java.util.Scanner;

// main method
public class calFibonacci2 {

    //function 1
    public static void main(String[] args) throws Exception {
        // create the scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the an integer: ");
         int n = input.nextInt();

        //display the answer
         System.out.println("The factorial of the number " + n + " is " + factorial(n) );




    }
    

    // function 2

    public static long factorial(int n){
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1 );


    }






    /*
    recursive algorithm for computing factorial(n)

    if (n == 0)
        return 1;
    else
        return n * factorial(n − 1);
     */
}
