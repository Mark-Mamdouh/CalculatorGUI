package eg.edu.alexu.csd.oop.calculator.cs53;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GUI extends JFrame 
{
	private JTextField answerField;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, equals, save, load, undo, redo, clear, decimal, negative, delete;
	private String stemp1, stemp2, sanswer;
	private double answer = 0.0;
	private JPanel contentPanel;
	private boolean equalsClicked = false, opChosen = false;
	private char operation = ' ';

	public GUI()
	{
		super("Calculator");

		answerField = new JTextField(null, 21);
		answerField.setEditable(false); // because it is used to show answer only and can't be edited

		contentPanel = new JPanel();
		contentPanel.setBackground(Color.darkGray);
		contentPanel.add(answerField, BorderLayout.NORTH);
		contentPanel.setLayout(new FlowLayout());

		Numbers n = new Numbers();
		Calc c = new Calc();

		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		equals = new JButton("=");
		save = new JButton("Save");
		load = new JButton("Load");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		clear = new JButton("C");
		decimal = new JButton(".");
		negative = new JButton("( - )");
		delete = new JButton("del");
		
		Dimension dim = new Dimension(75, 35);
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(new Dimension(155,35));
		add.setPreferredSize(dim);
		sub.setPreferredSize(dim);
		mul.setPreferredSize(dim);
		div.setPreferredSize(dim);
		equals.setPreferredSize(new Dimension(115, 40));
		save.setPreferredSize(new Dimension(100, 40));
		load.setPreferredSize(new Dimension(100, 40));
		undo.setPreferredSize(new Dimension(100, 40));
		redo.setPreferredSize(new Dimension(100, 40));
		clear.setPreferredSize(dim);
		decimal.setPreferredSize(dim);
		negative.setPreferredSize(dim);
		delete.setPreferredSize(new Dimension(115, 40));
		
		one.addActionListener(n);
		two.addActionListener(n);
		three.addActionListener(n);
		four.addActionListener(n);
		five.addActionListener(n);
		six.addActionListener(n);
		seven.addActionListener(n);
		eight.addActionListener(n);
		nine.addActionListener(n);
		zero.addActionListener(n);
		decimal.addActionListener(n);
		negative.addActionListener(n);
		delete.addActionListener(n);

		
		add.addActionListener(c);
		sub.addActionListener(c);
		mul.addActionListener(c);
		div.addActionListener(c);
		equals.addActionListener(c);
		clear.addActionListener(c);
		
		contentPanel.add(one);
		contentPanel.add(two);
		contentPanel.add(three);
		contentPanel.add(four);
		contentPanel.add(five);
		contentPanel.add(six);
		contentPanel.add(seven);
		contentPanel.add(eight);
		contentPanel.add(nine);
		contentPanel.add(zero);
		contentPanel.add(clear);
		contentPanel.add(add);
		contentPanel.add(sub);
		contentPanel.add(mul);
		contentPanel.add(div);
		contentPanel.add(decimal);
		contentPanel.add(negative);
		contentPanel.add(equals);
		contentPanel.add(delete);
		contentPanel.add(save);
		contentPanel.add(load);
		contentPanel.add(undo);
		contentPanel.add(redo);
		

		this.setContentPane(contentPanel);
	}

	private class Numbers implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton src = (JButton) event.getSource();
			if (src.equals(one)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "1";
					} else {
						stemp1 += "1";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "1";
					} else {
						stemp2 += "1";
					}
				}
			}
			if (src.equals(two)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "2";
					} else {
						stemp1 += "2";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "2";
					} else {
						stemp2 += "2";
					}
				}
			}
			if (src.equals(three)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "3";
					} else {
						stemp1 += "3";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "3";
					} else {
						stemp2 += "3";
					}
				}
			}
			if (src.equals(four)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "4";
					} else {
						stemp1 += "4";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "4";
					} else {
						stemp2 += "4";
					}
				}
			}
			if (src.equals(five)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "5";
					} else {
						stemp1 += "5";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "5";
					} else {
						stemp2 += "5";
					}
				}
			}
			if (src.equals(six)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "6";
					} else {
						stemp1 += "6";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "6";
					} else {
						stemp2 += "6";
					}
				}
			}
			if (src.equals(seven)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "7";
					} else {
						stemp1 += "7";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "7";
					} else {
						stemp2 += "7";
					}
				}
			}
			if (src.equals(eight)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "8";
					} else {
						stemp1 += "8";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "8";
					} else {
						stemp2 += "8";
					}
				}
			}
			if (src.equals(nine)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "9";
					} else {
						stemp1 += "9";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "9";
					} else {
						stemp2 += "9";
					}
				}
			}
			if (src.equals(zero)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "0";
					} else {
						stemp1 += "0";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "0";
					} else {
						stemp2 += "0";
					}
				}
			}
			if (src.equals(decimal)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "0.";
					} else {
						if (stemp1 != null) {
							if (stemp1.contains(".")) {
								System.out.println("You already have a decimal point");
							} else {
								stemp1 += ".";
							}
						}
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "0.";
					} else {
						if (stemp2 != null) {
							if (stemp2.contains(".")) {
								System.out.println("You already have a decimal point");
							} else {
								stemp2 += ".";
							}
						}
					}
				}
			}
			if(src.equals(negative)){
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "-";
					}else {
						if(stemp1 != null && stemp1.startsWith("-")){
							stemp1 = stemp1.substring(1);
						}else{
							stemp1 = "-" + stemp1;
						}
					}
				}else {
					if (stemp2 == null) {
						stemp2 = "-";
					}else {
						if(stemp2 != null && stemp2.startsWith("-")){
							stemp2 = stemp2.substring(1);
						}else{
							stemp2 = "-" + stemp1;
						}
					}
				}
			}
			if (src.equals(delete)){
				if(opChosen == false){
					if(stemp1 == null){
						System.out.println("cannot delete nothing"); 
					}
					else{
						stemp1 = stemp1.substring(0, stemp1.length()-1);
					}
				}else{
					if(stemp2 == null){
						System.out.println("cannot delete nothing"); 
					}
					else{
						stemp2 = stemp2.substring(0, stemp2.length()-1);
					}
				}
			}
			if (equalsClicked == false) {
				if (opChosen == false) {
					answerField.setText(stemp1);
				} else {
					answerField.setText(stemp2);
				}
			}
		}
	}

	private class Calc implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton src = (JButton) event.getSource();
			if (src.equals(add)) {
				if (stemp1 == null) {
					System.out.println("Choose your number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '+';
					} else {
						if (stemp1 != null && stemp2 != null) {
							System.out.println("two operations only");
						}
					}
				}
			}
			if (src.equals(sub)) {
				if (stemp1 == null) {
					System.out.println("Choose your number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '-';
					} else {
						if (stemp1 != null && stemp2 != null) {
							System.out.println("two operations only");
						}
					}
				}
			}
			if (src.equals(mul)) {
				if (stemp1 == null) {
					System.out.println("Choose your number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '*';
					} else {
						if (stemp1 != null && stemp2 != null) {
							System.out.println("two operations only");
						}
					}
				}
			}
			if (src.equals(div)) {
				if (stemp1 == null) {
					System.out.println("Choose your number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '/';
					} else {
						if (stemp1 != null && stemp2 != null) {
							System.out.println("two operations only");
						}
					}
				}
			}
			if (src.equals(equals)) {
				if (stemp1 == null) {
					System.out.println("Choose your number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						System.out.println("Choose both numbers first");
					}
				}
				if (stemp1 != null && stemp2 != null) {
					double d1 = 0.0, d2 = 0.0;
					d1 = Double.parseDouble(stemp1);
					d2 = Double.parseDouble(stemp2);
					switch (operation) {
					case '+':
						answer = d1 + d2;
						break;
					case '-':
						answer = d1 - d2;
						break;
					case '*':
						answer = d1 * d2;
						break;
					case '/':
						answer = d1 / d2;
						break;
					}
					sanswer = Double.toString(answer);
					answerField.setText(sanswer);
					if (operation == '/' && d2 == 0.0) {
						answerField.setText("Cannot divide by zero");
					}
				}
			}
			if (src.equals(clear)) {
				stemp1 = null;
				stemp2 = null;
				operation = ' ';
				answerField.setText(null);
				equalsClicked = false;
				opChosen = false;
			}
		}

	}
}
