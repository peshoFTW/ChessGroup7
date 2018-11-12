package edu.school.chessgame;

import java.awt.Color;

public class Bishop extends ChessPiece{

	public Bishop(int row, int column, Color color) {
		//super e kliuchova duma s pomoshtta na koqto
		//se vikat neshta ot nasledeniq klas
		//nasledeniq klas narichame bazov
		//kogato dumata e posledvana samo ot krugli skobi
		//i argumenti v tqh tova znachi che se
		//vika konstruktora na bazoviq klas
		//konstruktora na bazoviq klas trqbva da bude
		//izvikan na purviq red na konstruktora na 
		//klasa naslednik
		super(row, column, "B", color);
	}

	@Override
	public boolean moveTo(int row, int column, ChessPiece[] pieces) {
		if(row < 0 || column < 0 || row > 7 || column > 7)
		{
			return false;
		}
		int r = row - getRow();
		int c = column - getColumn();
		if(r<0 && c>0)
		{
			//top right
			int currentRow = getRow();
			int currentColumn = getColumn();
			while(currentRow != row && currentColumn != column)
			{
				currentColumn++;
				currentRow--;
				for(int i = 0; i<pieces.length; i++)
				{
					ChessPiece p = pieces[i];
					if(p != null && p.getRow()==currentRow && p.getColumn()==currentColumn)
					{
						if(p.getRow() == row && p.getColumn() == column && p.getColor().equals(getColor()))
						{
							return false;
						}
						else if(p.getRow() == row && p.getColumn() == column && !p.getColor().equals(getColor()))
						{
							pieces[i] = null;
							setRow(row);
							setColumn(column);
						    return true;	
						}
						return false;
					}
				}
				setRow(row);
				setColumn(column);
				return true;
			}
		}
		if(r>0 && c>0)
		{
			//bottom right
		}
		if(r>0 && c<0)
		{
			//bottom left
		}
		if(r<0 && c<0)
		{
			//top left
		}
		return false;
	}

}
