public class NestedLoops

{
  public static void main(String[] args)
  {
    String [][] ticTacToeBoard =  {
    {"00", "01", "02"},
    {"10", "11", "12"},
    {"20", "21", "22"}
    };

    /*
           columns:
           0   1   2
    row 0  AA  AB  AC  
    row 1  BA  BB  BC  
    row 2  CA  CB  CC 
     */

     int rowCount = 3;
     int columnCount = 3;

    //Print out each square of ticTacToeBoard
    // To see this in action, use Debug,
    // after adding breakpoints (perhaps on each for loop line)
    for (int row = 0; row < rowCount; row++) {
        
        System.out.print("\n\t");

        for (int column = 0; column < columnCount; column++){

            System.out.print(ticTacToeBoard[row][column] + "  ");

        }
    }

  }
}