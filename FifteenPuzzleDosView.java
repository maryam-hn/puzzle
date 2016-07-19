package fifteenpuzzledos;

/**
 * Class view.
 */

public class FifteenPuzzleDosView {
    
    // the "display" method prints the numbers in a grid pattern
    public void display(int[] squares) {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(format(squares[i * 4 + j]));
            System.out.println();
        }
    }
    
    //  "format" method makes a layout that adds spaces for the numbers to appear on the command line
    private String format(int number) {
        if (number == 0) return "   ";
        return ((number < 10) ? " " : "") + number + " ";
    }
}
