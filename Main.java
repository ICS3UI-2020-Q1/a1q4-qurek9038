import java.util.Scanner;
/**
 *This program calculates the slope of a line given two points
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //Create a scanner for user input 
    Scanner input = new Scanner (System.in);

    //Ask the user for the x coordinate of the first point
    System.out.println("Please enter in the x coordinate of the first point");

    //Determine variable for x coordinate of the first point
    int xOne = input.nextInt();

    //Ask the user for the y coordinate of the first point
    System.out.println("Please enter in the y coordinate of the first point");

    //Determine variable of the y coordinate of the first point
    int yOne = input.nextInt();

    //Ask the user for the x coordinate of the second point
    System.out.println("Please enter in the x coordinate of the second point");

    //Determine variable of the x coordinate of the second point
    int xTwo = input.nextInt();

    //Ask the user for the y coordinate of the second point
    System.out.println("Please enter in the y coordinate of the second point");

    //Determine variable of the y coordinate of the second point
    int yTwo = input.nextInt();

    //Claculate slope
    int slope = (yTwo-yOne)/(xTwo-xOne);

    //Display the answer for the slop of the line
    System.out.println("The slope of your line would be " + slope + ".");








  }
}
