package eg.edu.alexu.csd.oop.calculator.cs53;

import javax.swing.*;

public class Main
{
	public static void main(String[] args)
	{
		GUI g=new GUI();
		g.setSize(250,450);
		g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		g.setVisible(true);
		g.setResizable(false);
	}
}
