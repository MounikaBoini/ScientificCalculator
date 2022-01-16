package calc;


import java.awt.event.*;



public class CalActionListener implements ActionListener
{
	Calculator cal;
	String op1,op2,oper;
	double ans;
	public CalActionListener(Calculator calculator) {
		this.cal=calculator;
		op1=op2=oper="";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		if(s.equals("Degree"))
		{
			cal.getRadian().setSelected(false);
		}
		else if(s.equals("Radian"))
			cal.getDegree().setSelected(false);
		
		else if((s.charAt(0)>='0' && s.charAt(0)<='9') || s.charAt(0)=='.'||s.equals("e")||s.equals("pi"))		//operands
		{
			if(oper=="")
				op1=op1+s;	//operand1
			else
				op2=op2+s;	//operand1
			
		  cal.getTextField().setText(op1+oper+op2);	//set value in textbox
		}
		else if(s.equals("Clear"))
		{
			op1=oper=op2="";
			cal.getTextField().setText(op1+oper+op2);
		}
		else if(s.charAt(0)=='=')
		{
		  try{
				if(op1.equals("e") && oper=="")
				 ans=Math.E;
				else if(op1.equals("pi") && oper=="")
				 ans=Math.PI;
				else
				 this.calculate(oper);
				
				cal.getTextField().setText(cal.getTextField().getText()+"="+ans);
				op1=Double.toString(ans);
				oper=op2="";
				
			}
			catch(NumberFormatException e1)
			{
				cal.getTextField().setText("0");
			}
		}
		else
		{
			if(oper.equals("")||s.equals(""))
				oper=s;
			else {
				try {
				this.calculate(oper);
				
				op1=Double.toString(ans);
				oper=s;
				op2="";
			}
			catch(NumberFormatException e1)
			{
					cal.getTextField().setText("0");
			}
		  }
			
			cal.getTextField().setText(op1+oper+op2);
		}
		
		
	}
	void calculate(String oper)
	{
		if(op1.equals("e"))
			op1=Double.toString(Math.E);
		if(op2.equals("e"))
			op2=Double.toString(Math.E);
		
		if(op1.equals("pi"))
			op1=Double.toString(Math.PI);
		if(op2.equals("pi"))
			op2=Double.toString(Math.PI);
		
	    if(oper.equals("+"))
			ans=(Double.parseDouble(op1) + Double.parseDouble(op2));
		else if(oper.equals("-"))
			ans=(Double.parseDouble(op1) - Double.parseDouble(op2));
		else if(oper.equals("*"))
			ans=(Double.parseDouble(op1) * Double.parseDouble(op2));
		else if(oper.equals("^"))
			ans=Math.pow(Double.parseDouble(op1), Double.parseDouble(op2));
		else if(oper.equals("sqrt"))
		{
			ans=Math.sqrt(Double.parseDouble(op2));
			op1="";
		}
		else if(oper.equals("curt"))
		{
			ans=Math.cbrt(Double.parseDouble(op2));
			op1="";
		}
		else if(oper.equals("sin"))							//returns sin of given radian angle
		{
			if(cal.getDegree().isSelected())
			{
				ans=Math.sin(Math.toRadians(Double.parseDouble(op2)));
			}
			else
			ans=Math.sin(Double.parseDouble(op2));
			
			op1="";
		}
		else if(oper.equals("cos"))						//returns cos of given radian angle
		{
			if(cal.getDegree().isSelected())
			{
				ans=Math.cos(Math.toRadians(Double.parseDouble(op2)));
			}
			else
			ans=Math.cos(Double.parseDouble(op2));
			
			op1="";
		}
		else if(oper.equals("tan"))						//returns tan of given radian angle
		{
			if(cal.getDegree().isSelected())
			{
				ans=Math.tan(Math.toRadians(Double.parseDouble(op2)));
			}
			else
			ans=Math.tan(Double.parseDouble(op2));
			
			op1="";
		}
		else if(oper.equals("sinh"))							//returns sinh of given radian angle
		{
			ans=Math.sinh(Double.parseDouble(op2));
			op1="";
		}
		else if(oper.equals("cosh"))							//returns cosh of given radian angle
		{
			ans=Math.cosh(Double.parseDouble(op2));
			op1="";
		}
		else if(oper.equals("tanh"))							//returns tanh of given radian angle
		{
			ans=Math.tanh(Double.parseDouble(op2));
			op1="";
		}
		else if(oper.equals("ln"))							//returns log of given value base e
		{
			ans=Math.log(Double.parseDouble(op2));
			op1="";
		}
		else if(oper.equals("log"))							//returns log of given value base 10
		{
			ans=Math.log10(Double.parseDouble(op2));
			op1="";
		}
		else if(oper.equals("%"))							//returns percentage 
		{
			ans=(Double.parseDouble(op1)/100);
			op2="";
		}
		else if(oper.equals("!"))							//calculate factorial of integer upto 20
		{
			try {
			ans=fact(Integer.parseInt(op1));
			op2="";
			}
			catch(Exception e)
			{
				ans=0;
			}
		}
		else
			ans=(Double.parseDouble(op1) / Double.parseDouble(op2));
	}

     long fact(int n) {
		return n==0? 1: n*fact(n-1);
	}


}
