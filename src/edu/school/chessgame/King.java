package edu.school.chessgame;

import java.awt.Color;

public class King extends ChessPiece{

	public King(int row, int column, Color color) {
		//super e kliuchova duma s pomoshtta na koqto
		//se vikat neshta ot nasledeniq klas
		//nasledeniq klas narichame bazov
		//kogato dumata e posledvana samo ot krugli skobi
		//i argumenti v tqh tova znachi che se
		//vika konstruktora na bazoviq klas
		//konstruktora na bazoviq klas trqbva da bude
		//izvikan na purviq red na konstruktora na 
		//klasa naslednik
		super(row, column, "K", color);
	}

	@Override
	public boolean moveTo(int row, int column, ChessPiece[] pieces) {
		if(row < 0 || column < 0 || row > 7 || column > 7)
		{
			return false;
		}
		int r = row - getRow();
		int c = column - getColumn();
		if(r>1 || c>1 || r<-1 || c<-1) return false;
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
			int currentRow = getRow();
			int currentColumn = getColumn();
			while(currentRow != row && currentColumn != column)
			{
				currentColumn++;
				currentRow++;
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
		if(r>0 && c<0)
		{
			//bottom left
			int currentRow = getRow();
			int currentColumn = getColumn();
			while(currentRow != row && currentColumn != column)
			{
				currentColumn--;
				currentRow++;
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
		if(r<0 && c<0)
		{
			//top left
			int currentRow = getRow();
			int currentColumn = getColumn();
			while(currentRow != row && currentColumn != column)
			{
				currentColumn--;
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
		if(r==0 && c<0)
		{
			//left
			int currentRow = getRow();
			int currentColumn = getColumn();
			while(currentColumn != column)
			{
				currentColumn--;
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
		if(r==0 && c>0)
		{
			//right
			int currentRow = getRow();
			int currentColumn = getColumn();
			while(currentColumn != column)
			{
				currentColumn++;
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
		if(r<0 && c==0)
		{
			//up
			int currentRow = getRow();
			int currentColumn = getColumn();
			while(currentRow != row)
			{
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
		if(r>0 && c==0)
		{
			//down
			int currentRow = getRow();
			int currentColumn = getColumn();
			while(currentRow != row)
			{
				currentRow++;
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
		return false;
	}

}
