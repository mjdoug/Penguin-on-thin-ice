import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  int posX = 0;
      int posY = 0; 
	  String[][] Board = {
              {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" },
              { "a", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" },
              {  "b", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"  },
              { "c", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"  },
              { "d", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"  },
              { "e", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"  },
              { "f", "-", "-", "-", "-", "-", "P", "-", "-", "-", "-", "-"  },
              { "g", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"  },
              { "h", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"  },
              { "i", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"  },
              { "j", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"  },
              {"k", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-" }};
      
      for (int i = 0; i < 12; i++) {
          for (int j = 0; j < 12; j++) {
              System.out.print(Board[i][j] + " ");
          }
          System.out.println();
      }
      System.out.println();	
      
      boolean playerWin= false;
      while(!playerWin)
      {
    	  System.out.println("What block would you like to take?:");
          Scanner sc = new Scanner(System.in);
          String input = sc.nextLine();
          String col = input.substring(0,1);
          String row = input.substring(1);
          
           
      
      for(int i = 0; i < Board.length; i++)
      {
    	  for(int j = 1; j < Board[0].length; j++)
    	  {
    		  if(Board[i][j].equals(col))
    		  {
    			  posX = j;
    		  }
    	  }
    	  if(Board[i][0].equals(row))
		  {
			  posY = i;
		  }
      }
       Board[posY][posX] = " ";
      for (int i = 0; i < 12; i++) {
          for (int j = 0; j < 12; j++) {
        	 
        	  Board[6][6] = "P";
              System.out.print(Board[i][j] + " ");
          }
          System.out.println();
          
      }
      if(Board[1][1].equals(" ") && Board[1][2].equals(" ") &&Board[1][3].equals(" ")&&Board[1][4].equals(" ")&&Board[1][5].equals(" ")&&Board[1][6].equals(" ")&&Board[1][7].equals(" ")&&Board[1][8].equals(" ")&&Board[1][9].equals(" ")&&Board[1][10].equals(" ")&&Board[1][11].equals(" ")&&Board[1][1].equals(" ") && Board[2][1].equals(" ") &&Board[3][1].equals(" ")&&Board[4][1].equals(" ")&&Board[5][1].equals(" ")&&Board[6][1].equals(" ")&&Board[7][1].equals(" ")&&Board[8][1].equals(" ")&&Board[9][1].equals(" ")&&Board[10][1].equals(" ")&&Board[11][1].equals(" ")&& Board[11][2].equals(" ") && Board[11][3].equals(" ") &&Board[11][4].equals(" ")&&Board[11][5].equals(" ")&&Board[11][6].equals(" ")&&Board[11][7].equals(" ")&&Board[11][8].equals(" ")&&Board[11][9].equals(" ")&&Board[11][10].equals(" ")&&Board[11][11].equals(" ")&&Board[10][11].equals(" ")&&Board[9][11].equals(" ") && Board[8][11].equals(" ") &&Board[7][11].equals(" ")&&Board[6][11].equals(" ")&&Board[5][11].equals(" ")&&Board[4][11].equals(" ")&&Board[3][11].equals(" ")&&Board[2][11].equals(" ")&&Board[1][11].equals(" ")&&Board[1][10].equals(" ")&&Board[1][11].equals(" "))
      {
    	  System.out.println("Game Over. You lost");
      	playerWin=true;
    	  
      }
      
     
      if(Board[2][2].equals(" ") && Board[2][3].equals(" ") && Board[2][4].equals(" ")&& Board[2][5].equals(" ")&& Board[2][6].equals(" ")&&Board[2][7].equals(" ")&&Board[2][8].equals(" ")&&Board[2][9].equals(" ")&&Board[2][10].equals(" ") && Board[3][2].equals(" ") && Board[4][2].equals(" ")&& Board[5][2].equals(" ")&& Board[6][2].equals(" ")&&Board[7][2].equals(" ")&&Board[8][2].equals(" ")&&Board[9][2].equals(" ")&& Board[10][2].equals(" ")&&Board[10][3].equals(" ") && Board[10][4].equals(" ") && Board[10][5].equals(" ")&& Board[10][6].equals(" ")&& Board[10][7].equals(" ")&&Board[10][8].equals(" ")&&Board[10][9].equals(" ")&&Board[10][10].equals(" ")&&Board[3][10].equals(" ") && Board[4][10].equals(" ") && Board[5][10].equals(" ")&& Board[6][10].equals(" ")&& Board[7][10].equals(" ")&&Board[8][10].equals(" ")&&Board[9][10].equals(" "))
      {
    	  System.out.println("Game Over. You lost");
      	playerWin=true; 
      }
      if(Board[3][3].equals(" ") && Board[3][4].equals(" ") && Board[3][5].equals(" ")&& Board[3][6].equals(" ")&& Board[3][7].equals(" ")&&Board[3][8].equals(" ")&&Board[3][9].equals(" ")&&Board[4][9].equals(" ")&&Board[5][9].equals(" ")&&Board[6][9].equals(" ")&&Board[7][9].equals(" ")&&Board[8][9].equals(" ")&&Board[9][9].equals(" ")&&Board[9][8].equals(" ")&&Board[9][7].equals(" ")&&Board[9][6].equals(" ")&&Board[9][5].equals(" ")&&Board[9][4].equals(" ")&&Board[9][3].equals(" ")&&Board[8][3].equals(" ")&&Board[7][3].equals(" ")&&Board[6][3].equals(" ")&&Board[4][3].equals(" "))
      {
    	System.out.println("Game Over. You lost");
    	playerWin=true;
       }
      if(Board[5][5].equals(" ") && Board[5][6].equals(" ") && Board[5][7].equals(" ")&& Board[6][7].equals(" ")&& Board[7][7].equals(" ")&&Board[7][6].equals(" ")&&Board[7][5].equals(" ")&&Board[6][5].equals(" "))
      {
    	System.out.println("Game Over. You lost");
    	playerWin=true;
       }
      if(Board[4][4].equals(" ") && Board[4][5].equals(" ") && Board[4][6].equals(" ")&& Board[4][7].equals(" ")&& Board[4][8].equals(" ")&&Board[5][8].equals(" ")&&Board[6][8].equals(" ")&&Board[7][8].equals(" ")&& Board[8][8].equals(" ")&& Board[8][7].equals(" ")&& Board[8][6].equals(" ")&& Board[8][5].equals(" ")&& Board[8][4].equals(" ")&& Board[7][4].equals(" ")&& Board[6][4].equals(" ")&& Board[5][4].equals(" "))
      {
    	System.out.println("Game Over. You lost");
    	playerWin=true;
       }
      
      
      
      
      }
      
     
     
      
  }
}
	 