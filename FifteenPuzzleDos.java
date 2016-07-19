
package fifteenpuzzledos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class FifteenPuzzleDos {

public static void main(String[] args) { //main method class
Scanner input = new Scanner(System.in); // gets input from user
FifteenPuzzleDosView puzzleView = new FifteenPuzzleDosView(); // class view
FifteenPuzzleDosController puzzleController = new FifteenPuzzleDosController(); // class Controller

String heading1 = "Choose a number you want to move";
System.out.printf( "%-15s", heading1);
    
JOptionPane.showMessageDialog(null, "Hello, welcome to a bad attempt of a Slider Puzzle Game! Please type out your number you choose to move","", JOptionPane.PLAIN_MESSAGE); //<== greeting and brief introduction message box==>

        
       	int number;
        	while (true) {
            	puzzleView.display(puzzleController.squares);
            	System.out.print("\nMove: ");// prints out move
            	number = input.nextInt();
            	if (number == 0)
                break;
            puzzleController.move(number);
            
   


}

}
}
