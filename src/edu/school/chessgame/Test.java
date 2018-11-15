package edu.school.chessgame;

import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		ChessPiece[] c = new ChessPiece[32];
		c[0] = new Bishop(7,0,Color.BLACK);
		printTable(c);
		System.out.println("=========================================");
		c[0].moveTo(5, 2, c);
		printTable(c);
	}
	
	public static void printTable(ChessPiece[] c)
	{
		for(int i = 0; i<8; i++)
		{
			for(int j = 0; j<8; j++)
			{
				ChessPiece piece = null;
				for(ChessPiece p : c)
				{
					if(p != null && p.getRow() == i && p.getColumn()==j)
					{
						piece = p;
						break;
					}
				}
				if(piece != null){
					System.out.print(piece.toString()+"|");
				}
				else{
					
					System.out.print(" |");
				}
			}
			System.out.println();
		}
	}

}
