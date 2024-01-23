// 18.7
import java.util.Scanner;





//Tail recursion is when the recurison is the lst step (calling its self)
// non tail recurison is when the last step isnt a recurison call (calling itself and then doing extra shit)

public class towergame5 {
public static void main(String []args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of disks: ");

    int n = input.nextInt();



    // solution
    System.out.println("The steps to solve are: ");
    moveDisks(n,'A','B','C');
}


public static void moveDisks(int n , char fromTower, char toTower, char auxTower){
    if (n == 1)  // base case
        System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);


    else {
        moveDisks(n - 1, fromTower , auxTower , toTower );
        System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        moveDisks(n - 1, auxTower, toTower,fromTower);
    }
    }




}
    

