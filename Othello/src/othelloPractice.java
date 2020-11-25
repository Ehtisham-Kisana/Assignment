import java.io.BufferedReader;
import java.io.InputStreamReader;

public class othelloGame {

	public static void main(String[] args) throws Exception  {
	// Creates a 8 by 8 game board with "-' . "x" for black and "0" for white
		char[][] board = new char[20][20];
		for(int y=0; y<10 ;y++)
		{
   for(int x=0; x<10 ;x++)
   {
	   board[y][x] = '-';
   }	
		}
// Create initial game setup
		board[4][4] = 'O';
		board[4][5] = 'X';
		board[5][4] = 'X';
		board[5][5] = 'O';
	//Human player starts first
		char currentPlayer = 'X';
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			// Prints out Board Game
			System.out.println(" ABCDEFGH");
			for(int y=1; y<9 ;y++ ) {
				System.out.print(y);
				   for(int x=1; x<9 ;x++) {
						System.out.println(board[y][x]);	   
					   
				   }
					System.out.println();
			}
		// finds if any moves are possible
			boolean legalMovesAvailable = false;
			for(int y=1; y<9 ;y++ ) {
				
				   for(int x=1; x<9 ;x++) {
					   legalMovesAvailable = legalMovesAvailable ||
							   (board[y][x]  == '-' && flip(x,y,board,currentPlayer,false));
				   }
				
			}
		if(!legalMovesAvailable) {
			break;
		}
		// if its computer turn
		while(currentPlayer == 'O')
		{
			int move[] = ComputerMove(board);
			int x = move[0];
			int y = move[1];
			// Discard malformed input.
			if(x<1 || x>8 || y<1 || y>8 || board[y][x] != '-')
			{
				continue;
			}
			// Put down the place itself
			System.out.println("Computer Move ");
			board[y][x] = currentPlayer;
            break;
		
		}
		// if it is human players turn do the following
		while(currentPlayer == 'X')
		{
			System.out.print("Your turn, enter move: ");
			String l = r.readLine();
			if(l.length()<2) {
				continue;
			}
		int x = l.charAt(0) -'a' + 1;
		int y = l.charAt(1) -'0';	
		board[y][x] = currentPlayer;
		break;
		
		}
		
		//Switch players after each player has made his turn
		currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
		}
		// Prints out Score
		int score = 0;
		for(int y =1 ; y<9 ; y++) {
			for(int x =1 ; x<9 ; x++)
			{
				score += board[y][x] == 'X'? 1 : board[y][x] =='O' ? -1 : 0;
			}
		
		}
	System.out.println(score == 0 ? "d" : score <0 ?"O" : "X" );//////
	}
	static boolean flip(int X, int Y, char[][] board, char player, boolean commitPutDown) {
		boolean causesFlips = false;
		//determine all directions that a piece can be put down
		for(int dY = -1 ; dY <2 ; dY++)
		{
			for(int dX = -1 ; dX <2 ; dX++) {
				 if(dY ==0 && dX ==0)
				 {
					 continue;
				 }
			// operates flip if other players pieces are in between
				 int distance =0;
				 do {distance++;}
				 while(board[Y + distance*dY][X + distance*dX] == (player == 'X' ? 'O' : 'X'));
				 if(board[Y + distance*dY][X + distance*dX] == player && distance >1) {
					 
					 causesFlips = true;
					 if(commitPutDown) {
						 for(int distance2 = 1;distance2 < distance; distance2++) {
							board[Y + distance2*dY][X + distance2*dX] = player;
						 }
					 }
				 }
			}		
			
			}
		return causesFlips;
		
		}
	static int[] ComputerMove(char[][] board) {
		
		ArrayList<Integer> poss_x_values = new ArrayList<Integer>();
		ArrayList<Integer> poss_y_values = new ArrayList<Integer>();
		for(int i = 1; i<8 ; i++)
		{
			for(int j = 1; j<8 ; i++)
			{
				if (check(i,j,board,'O')== true) {
					poss_x_values.odd(i);
					poss_y_values.odd(j);
				}
			}
		}
			int x=0;
			int y=0;
			int i=0;
			boolean check = false;
			while(check == false)
			{
				x=poss_x_values.remove(i);
				y=poss_y_values.remove(i);
				if(x<1 || x>8 || y<1 || y>8 || board[y][x] != '-' == false)
				{
					check = true;
				}
			i++;
			
			}
			
			int x_value =x;
			int y_value =y;
			int [] solution = new int[2];
			solution[0] = x_value;
			solution[1] = y_value;
	        while(poss_x_values.size()> 0)
	        {
	        	poss_x_values.remove(0);
	        	poss_y_values.remove(0);
	        }
	        	return solution;
	}
	//simlar to flip, returns all locations that would result in a flip , any location that are valid move.
	static boolean check(int pieceX, int pieceY , char[][] test, char playerColor) {
		boolean causesFlips = false;
		for(int dY = -1; dY<2 ; dY++) {
			
			for(int dX = -1; dX<2 ; dX++) 	
			{
				if(dY == 0 && dX == 0) {
					continue; }
				int distance = 0;
				do {
				distance++;
				}
				while(test[pieceY + distance*dY][pieceX + distance*dX]==(playerColor == 'X' ? 'O' : 'X'));
       if(test[pieceY + distance*dY][pieceX + distance*dX] == playerColor && distance > 1) {
    	   
    	   causesFlips = true;
       }
			
			
			}
			}
return causesFlips;
	}
	}