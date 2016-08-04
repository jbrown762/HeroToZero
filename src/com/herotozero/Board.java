package com.herotozero;

public class Board
{
	int rows;
	int columns;
	boolean gameOver = false;
	
	public Board(int rows, int columns)
	{
		this.rows = rows;
		this.columns = columns;
	}
	
	public static void main(String[] args)
	{
		Board b = new Board(10, 10);
		
		b.gameLoop();
		
	}

	private void gameLoop()
	{
		while(!gameOver){
			
			
			
		}
		
	}
}
