package b.aktionen;

import java.awt.*;

import javax.swing.*;

public class SwingRechner {
	private JFrame frame;
	public JTextField screen;
	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bc,plus,minus,mal,geteilt,gleich;
	static String operation; // die eingegebene Zahl als String
	 static double previousOpr; // der vorherige Operator
	 static double currentOpr ; // der jetzige Operator

	
	
	
	public SwingRechner() {
		frame =new JFrame();
		frame.setTitle("TaschenRechner");
		frame.setLocation(600,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JTextField screen=new JTextField();
		screen.setEditable(false);
		screen.setText("0");
		frame.add(screen,BorderLayout.NORTH);
		
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bc = new JButton("C");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton mal = new JButton("*");
		JButton geteilt = new JButton("/");
		JButton gleich = new JButton("=");
		
		JPanel down = new JPanel();
		down.setLayout(new GridLayout(4,4));
		down.add(b7);down.add(b8);down.add(b9);down.add(plus);down.add(b4);
		down.add(b5);down.add(b6);down.add(minus);down.add(b1);down.add(b2);
		down.add(b3);down.add(mal);down.add(bc);down.add(b0);down.add(gleich);
		down.add(geteilt);
		frame.add(down,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		
					
		
		b0.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+0;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b1.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+1;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b2.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+2;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b3.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+3;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b4.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+4;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b5.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+5;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b6.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+6;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b7.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+7;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b8.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+8;
			screen.setText("");
			
			screen.setText(num+"");
		});
		
		b9.addActionListener( e-> {
			double num=0;
			num=Double.parseDouble(screen.getText())*10+9;
			screen.setText("");
			screen.setText(num+"");
		});
		
		plus.addActionListener( e-> {
			previousOpr=Double.parseDouble(screen.getText());
			screen.setText("0");
			operation="+";
			
		});
		
		minus.addActionListener( e-> {
			previousOpr=Double.parseDouble(screen.getText());
			screen.setText("0");
			operation="-";
		});
		
		mal.addActionListener( e-> {
			previousOpr=Double.parseDouble(screen.getText());
			screen.setText("0");
			operation="*";
			
		});
		
		geteilt.addActionListener( e-> {
			previousOpr=Double.parseDouble(screen.getText());
			screen.setText("0");
			operation="/";
			
		});
		
		bc.addActionListener( e-> {
			currentOpr=0;
			previousOpr=0;
			screen.setText("0");
			operation="";
			
		});
		
		gleich.addActionListener( e-> {
			currentOpr=Double.parseDouble(screen.getText());
			screen.setText("");
			if(operation.equals("+")) {
			screen.setText(previousOpr+currentOpr+"");	
			}else if(operation.equals("-")) {
			screen.setText(previousOpr-currentOpr+"");	
			}else if(operation.equals("*")) {
				screen.setText(previousOpr*currentOpr+"");	
			}else if(operation.equals("/")) {
				screen.setText(previousOpr/currentOpr+"");	
			}
		});
		}
		
	public static void main(String[] args) {
		new SwingRechner();	
		}

}
