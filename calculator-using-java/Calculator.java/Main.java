import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	Boolean isoperatorClicked=false;
	
	JFrame jf;
	JLabel displayLabel;
	
	String oldvalue;
	String newvalue;
	String operator;

	
	JButton SevenButton;
	JButton EightButton;
	JButton NineButton;
	JButton FourButton;
	JButton FiveButton;
	JButton SixButton;
	JButton OneButton;
	JButton TwoButton;
	JButton ThreeButton;
	JButton DotButton;
	JButton ZeroButton;
	JButton EqualButton;
	JButton DivButton;
	JButton MultButton;
	JButton SubButton;
	JButton AddButton;
	JButton ClearButton;
	
	public Calculator() {
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 550);
		jf.setLocation(300,100);
		
		displayLabel=new JLabel();
		displayLabel.setFont(new Font("Arial",Font.PLAIN,25));
		displayLabel.setBounds(20, 50, 540, 40);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		
		
		SevenButton=new JButton("7");
		SevenButton.setBounds(20, 130, 80, 80);
		SevenButton.setFont(new Font("Arial", Font.BOLD, 20));
		SevenButton.addActionListener(this);
		jf.add(SevenButton);
		
		EightButton=new JButton("8");
		EightButton.setBounds(115, 130, 80, 80);
		EightButton.setFont(new Font("Arial", Font.BOLD, 20));
		EightButton.addActionListener(this);
		jf.add(EightButton);
		
		NineButton=new JButton("9");
		NineButton.setBounds(210, 130, 80, 80);
		NineButton.setFont(new Font("Arial", Font.BOLD, 20));
		NineButton.addActionListener(this);
		jf.add(NineButton);
		
		//First row
		
		FourButton=new JButton("4");
		FourButton.setBounds(20, 220, 80, 80);
		FourButton.addActionListener(this);
		FourButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(FourButton);
		
		FiveButton=new JButton("5");
		FiveButton.setBounds(115, 220, 80, 80);
		FiveButton.addActionListener(this);
		FiveButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(FiveButton);
		
		SixButton=new JButton("6");
		SixButton.setBounds(210, 220, 80, 80);
		SixButton.addActionListener(this);
		SixButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(SixButton);
		
		//Second row
		
		OneButton=new JButton("1");
		OneButton.setBounds(20, 310, 80, 80);
		OneButton.addActionListener(this);
		OneButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(OneButton);
		
		TwoButton=new JButton("2");
		TwoButton.setBounds(115, 310, 80, 80);
		TwoButton.addActionListener(this);
		TwoButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(TwoButton);
		
		ThreeButton=new JButton("3");
		ThreeButton.setBounds(210, 310, 80, 80);
		ThreeButton.addActionListener(this);
		ThreeButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(ThreeButton);
		
		//Third row
		
		DotButton=new JButton(".");
		DotButton.setBounds(20, 400, 80, 80);
		DotButton.addActionListener(this);
		DotButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(DotButton);
		
		ZeroButton=new JButton("0");
		ZeroButton.setBounds(115, 400, 80, 80);
		ZeroButton.addActionListener(this);
		ZeroButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(ZeroButton);
		
		EqualButton=new JButton("=");
		EqualButton.setBounds(210, 400, 80, 80);
		EqualButton.addActionListener(this);
		EqualButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(EqualButton);
		
		//Fourth row
		
		DivButton=new JButton("/");
		DivButton.setBounds(310, 130, 80, 80);
		DivButton.addActionListener(this);
		DivButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(DivButton);
		
		MultButton=new JButton("x");
		MultButton.setBounds(310, 220, 80, 80);
		MultButton.addActionListener(this);
		MultButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(MultButton);
		
		SubButton=new JButton("-");
		SubButton.setBounds(310, 310, 80, 80);
		SubButton.addActionListener(this);
		SubButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(SubButton);
		
		AddButton=new JButton("+");
		AddButton.setBounds(310, 400, 80, 80);
		AddButton.addActionListener(this);
		AddButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(AddButton);
		
		ClearButton=new JButton("CLEAR");
		ClearButton.setBounds(400, 400, 120, 80);
		ClearButton.addActionListener(this);
		ClearButton.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(ClearButton);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	
	public static void main(String[] args) {
		new Calculator();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==SevenButton) {
			
			if(isoperatorClicked) {
				displayLabel.setText("7");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
		}else if(e.getSource()==EightButton){
			if(isoperatorClicked) {
				displayLabel.setText("8");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if(e.getSource()==NineButton){
			if(isoperatorClicked) {
				displayLabel.setText("9");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else if(e.getSource()==FourButton){
			if(isoperatorClicked) {
				displayLabel.setText("4");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}

		}else if(e.getSource()==FiveButton){
			if(isoperatorClicked) {
				displayLabel.setText("5");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource()==SixButton){
			if(isoperatorClicked) {
				displayLabel.setText("6");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource()==OneButton){
			if(isoperatorClicked) {
				displayLabel.setText("1");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource()==TwoButton){
			if(isoperatorClicked) {
				displayLabel.setText("2");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}

		}else if(e.getSource()==ThreeButton){
			if(isoperatorClicked) {
				displayLabel.setText("3");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource()==ZeroButton){
			if(isoperatorClicked) {
				displayLabel.setText("0");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==DotButton){
			displayLabel.setText(displayLabel.getText()+".");
			
		}else if(e.getSource()==EqualButton){
			
			newvalue = displayLabel.getText();
			
			float oldvalueF=Float.parseFloat(oldvalue);
			float newvalueF=Float.parseFloat(newvalue);
			
			float result=0;
			
			if(operator.equals("+")) {
				result=oldvalueF+newvalueF;
			} else if(operator.equals("-")) {
				result=oldvalueF-newvalueF;
			} else if(operator.equals("x")) {
				result=oldvalueF*newvalueF;
			} else if(operator.equals("/")) {
				result=oldvalueF/newvalueF;
			}
			
			displayLabel.setText(result+"");
			
		}else if(e.getSource()==DivButton){
			isoperatorClicked=true;
			oldvalue=displayLabel.getText();
			operator="/";
			displayLabel.setText("");  
			
		}else if(e.getSource()==SubButton){
			isoperatorClicked=true;
			oldvalue=displayLabel.getText();
			operator="-";
			displayLabel.setText("");  
			
		}else if(e.getSource()==MultButton){
			isoperatorClicked=true;
			oldvalue=displayLabel.getText();
			operator="x";
			displayLabel.setText("");  
			
		}else if(e.getSource()==AddButton){
			isoperatorClicked=true;
			oldvalue=displayLabel.getText();
			operator="+";
			displayLabel.setText("");  
			
		}else if(e.getSource()==ClearButton) {
			displayLabel.setText("");
		}
	}
}