/** 
 * TicTacToe.java  
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */

public class TicTacToe
{
	private char[][] matrix; //attribute/private instance variable

   //this constructor will create the TicTacToe board from incoming String
	public TicTacToe(String inGame) //inGame = "XXX00XX00"
	{
      matrix = new char [3][3];           
         //needs finishing to create 2D array and populate with characters from inGame
      matrix [0][0] = inGame.charAt(0);
      matrix [0][1] = inGame.charAt(1);
      matrix [0][2] = inGame.charAt(2);
      matrix [1][0] = inGame.charAt(3);
      matrix [1][1] = inGame.charAt(4);
      matrix [1][2] = inGame.charAt(5);
      matrix [2][0] = inGame.charAt(6);
      matrix [2][1] = inGame.charAt(7);
      matrix [2][2] = inGame.charAt(8);
   }
   
	//This method will return the winner of the game,
   //  or message that game ends in a Tie
   //  You can 'hard-code' the winning conditionals
   public String getWinner()
	{
      if (matrix [0][0] == matrix [0][1] && matrix [0][0] == matrix [0][2])
      {
         return matrix [0][0] + " wins horizontally!";
      }
      else if (matrix [1][0] == matrix [1][1] && matrix [1][0] == matrix [1][2])
      {
         return matrix [1][0] + " wins horizontally!";
      }
      else if (matrix [2][0] == matrix [2][1] && matrix [2][0] == matrix [2][2])
      {
         return matrix [2][0] + " wins horizontally!";
      }
      else if (matrix [0][0] == matrix [1][0] && matrix [0][0] == matrix [2][0])
      {
         return matrix [0][0] + " wins vertically!";
      }
      else if (matrix [0][1] == matrix [1][1] && matrix [0][1] == matrix [2][1])
      {
         return matrix [0][1] + " wins vertially!";
      }
      else if (matrix [0][2] == matrix [1][2] && matrix [0][2] == matrix [2][2])
      {
         return matrix [0][2] + " wins vertically!";
      }
      else if (matrix [0][0] == matrix [1][1] && matrix [0][0] == matrix [2][2])
      {
         return matrix [0][0] + " wins diagonally!";
      }
      else if (matrix [0][2] == matrix [1][1] && matrix [0][2] == matrix [2][0])
      {
         return matrix [0][2] + " wins diagonally!";
      }
      else
      {
         return "TIE Game - No Winner!";
      }
   }

   // This method will return the required output shown on Word doc
	public String toString()
	{
		String output = "";
      for (int r = 0; r < 3; r++)
      {
         for (int c = 0; c < 3; c++)
         {
            output += matrix[r][c];
            output += " ";
         }
         output += "\n";
      }
      output += getWinner();
   
		return output + "\n\n";
	}
}