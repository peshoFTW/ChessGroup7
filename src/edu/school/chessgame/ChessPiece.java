package edu.school.chessgame;

import java.awt.Color;

public abstract class ChessPiece {
	private int row;
	private int column;
	private Color color;
	private boolean selected;
	private boolean moved;
	private String description;
	
	public void setRow(int value)
	{
		if(value >= 0 && value <= 7)
			row = value;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public void setColumn(int value)
	{
		if(value >= 0 && value <= 7)
			column = value;
	}
	
	public int getColumn()
	{
		return column;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void setSelected(boolean value)
	{
		selected = value;
	}
	
	public boolean isSelected()
	{
		return selected;
	}
	
	public void setMoved(boolean value)
	{
		moved = value;
	}
	
	public boolean hasMoved()
	{
		return moved;
	}
	
	public String toString()
	{
		return description;
	}
	
	public ChessPiece(int row, int column, 
			String description, Color color)
	{
		setRow(row);
		setColumn(column);
		//tiq dvete nqmat setteri
		this.description = description;
		this.color = color;
		//moje da se polzvat i setterite
		//moje i da ne gi polzvame zashtoto
		//v tqh nqma proverka za dopustimi
		//stoynosti
		this.selected = false; //poslednite 2 reda moje da sa i bez this.
		this.moved = false;
	}
	//abstracten method - metod chieto deystvie e ne definirano za
	//suotvetniq klas i vupreki tova znaem
	//che vsqka edna instanciq na klasa(promenliva ot tip tozi klas)
	//moje da izvurshva tova deystvie, no po 
	//razlichen nachin v zavisimost ot tova kakva figura e
	public abstract boolean moveTo(int row, int column, ChessPiece[] pieces);
}

