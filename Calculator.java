package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class Calculator {

	private JFrame frmScientificCalculator;
	private JTextField textField;
	private JRadioButton radian,degree;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//creating frame
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.setTitle("Scientific Calculator");
		frmScientificCalculator.setBounds(100, 100, 450, 550);
		frmScientificCalculator.setResizable(false);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScientificCalculator.getContentPane().setLayout(null);
		
		//creating textbox
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(25, 10, 380, 84);
		frmScientificCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		//creating buttons
		JButton clear = new JButton("Clear");
		clear.setForeground(new Color(0, 0, 0));
		clear.setBackground(new Color(204, 204, 204));
		clear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		clear.setBounds(10, 101, 115, 31);
		frmScientificCalculator.getContentPane().add(clear);
		
		JButton decimalpoint = new JButton(".");
		decimalpoint.setBackground(SystemColor.controlHighlight);
		decimalpoint.setFont(new Font("Tahoma", Font.PLAIN, 22));
		decimalpoint.setBounds(84, 473, 74, 35);
		frmScientificCalculator.getContentPane().add(decimalpoint);
		
		JButton zero = new JButton("0");
		zero.setBackground(SystemColor.controlHighlight);
		zero.setFont(new Font("Tahoma", Font.PLAIN, 22));
		zero.setBounds(2, 473, 74, 35);
		frmScientificCalculator.getContentPane().add(zero);
		
		JButton equals = new JButton("=");
		equals.setForeground(new Color(255, 255, 255));
		equals.setBackground(new Color(102, 51, 153));
		equals.setFont(new Font("Tahoma", Font.BOLD, 24));
		equals.setBounds(168, 473, 258, 35);
		frmScientificCalculator.getContentPane().add(equals);
		
		JButton seven = new JButton("7");
		seven.setBackground(SystemColor.controlHighlight);
		seven.setFont(new Font("Tahoma", Font.PLAIN, 22));
		seven.setBounds(2, 432, 74, 35);
		frmScientificCalculator.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.setBackground(SystemColor.controlHighlight);
		eight.setFont(new Font("Tahoma", Font.PLAIN, 22));
		eight.setBounds(84, 432, 74, 35);
		frmScientificCalculator.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.setBackground(SystemColor.controlHighlight);
		nine.setFont(new Font("Tahoma", Font.PLAIN, 22));
		nine.setBounds(168, 432, 74, 35);
		frmScientificCalculator.getContentPane().add(nine);
		
		JButton four = new JButton("4");
		four.setBackground(SystemColor.controlHighlight);
		four.setFont(new Font("Tahoma", Font.PLAIN, 22));
		four.setBounds(2, 387, 74, 35);
		frmScientificCalculator.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.setBackground(SystemColor.controlHighlight);
		five.setFont(new Font("Tahoma", Font.PLAIN, 22));
		five.setBounds(84, 387, 74, 35);
		frmScientificCalculator.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.setBackground(SystemColor.controlHighlight);
		six.setFont(new Font("Tahoma", Font.PLAIN, 22));
		six.setBounds(168, 387, 74, 35);
		frmScientificCalculator.getContentPane().add(six);
		
		JButton one = new JButton("1");
		one.setBackground(SystemColor.controlHighlight);
		one.setFont(new Font("Tahoma", Font.PLAIN, 22));
		one.setBounds(2, 342, 74, 35);
		frmScientificCalculator.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.setBackground(SystemColor.controlHighlight);
		two.setFont(new Font("Tahoma", Font.PLAIN, 22));
		two.setBounds(84, 342, 74, 35);
		frmScientificCalculator.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.setBackground(SystemColor.controlHighlight);
		three.setFont(new Font("Tahoma", Font.PLAIN, 22));
		three.setBounds(168, 342, 74, 35);
		frmScientificCalculator.getContentPane().add(three);
		
		JButton plus = new JButton("+");
		plus.setBackground(SystemColor.inactiveCaption);
		plus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		plus.setBounds(257, 342, 74, 54);
		frmScientificCalculator.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.setBackground(SystemColor.inactiveCaption);
		minus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		minus.setBounds(352, 342, 74, 54);
		frmScientificCalculator.getContentPane().add(minus);
		
		JButton multiply = new JButton("*");
		multiply.setBackground(SystemColor.inactiveCaption);
		multiply.setFont(new Font("Tahoma", Font.PLAIN, 22));
		multiply.setBounds(255, 413, 74, 54);
		frmScientificCalculator.getContentPane().add(multiply);
		
		JButton divide = new JButton("/");
		divide.setBackground(SystemColor.inactiveCaption);
		divide.setFont(new Font("Tahoma", Font.PLAIN, 22));
		divide.setBounds(352, 412, 74, 54);
		frmScientificCalculator.getContentPane().add(divide);
		
		JButton sqrt = new JButton("sqrt");
		sqrt.setBackground(SystemColor.inactiveCaption);
		sqrt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		sqrt.setBounds(257, 278, 74, 54);
		frmScientificCalculator.getContentPane().add(sqrt);
		
		JButton power = new JButton("^");
		power.setBackground(SystemColor.inactiveCaption);
		power.setFont(new Font("Tahoma", Font.PLAIN, 22));
		power.setBounds(256, 215, 74, 54);
		frmScientificCalculator.getContentPane().add(power);
		
		JButton cuberoot = new JButton("curt");
		cuberoot.setBackground(SystemColor.inactiveCaption);
		cuberoot.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cuberoot.setBounds(352, 278, 74, 54);
		frmScientificCalculator.getContentPane().add(cuberoot);
		
		JButton sine = new JButton("sin");
		sine.setBackground(SystemColor.inactiveCaption);
		sine.setFont(new Font("Tahoma", Font.PLAIN, 22));
		sine.setBounds(2, 278, 74, 54);
		frmScientificCalculator.getContentPane().add(sine);
		
		JButton cosine = new JButton("cos");
		cosine.setBackground(SystemColor.inactiveCaption);
		cosine.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cosine.setBounds(84, 278, 74, 54);
		frmScientificCalculator.getContentPane().add(cosine);
		
		JButton tan = new JButton("tan");
		tan.setBackground(SystemColor.inactiveCaption);
		tan.setFont(new Font("Tahoma", Font.PLAIN, 22));
		tan.setBounds(168, 278, 74, 54);
		frmScientificCalculator.getContentPane().add(tan);
		
		JButton sinh = new JButton("sinh");
		sinh.setBackground(SystemColor.inactiveCaption);
		sinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sinh.setBounds(2, 214, 74, 54);
		frmScientificCalculator.getContentPane().add(sinh);
		
		JButton cosh = new JButton("cosh");
		cosh.setBackground(SystemColor.inactiveCaption);
		cosh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cosh.setBounds(84, 214, 74, 54);
		frmScientificCalculator.getContentPane().add(cosh);
		
		JButton tanh = new JButton("tanh");
		tanh.setBackground(SystemColor.inactiveCaption);
		tanh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tanh.setBounds(168, 214, 74, 54);
		frmScientificCalculator.getContentPane().add(tanh);
		
		JButton log10 = new JButton("log");
		log10.setBackground(SystemColor.inactiveCaption);
		log10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		log10.setBounds(351, 146, 74, 54);
		frmScientificCalculator.getContentPane().add(log10);
		
		JButton log = new JButton("ln");
		log.setBackground(SystemColor.inactiveCaption);
		log.setFont(new Font("Tahoma", Font.PLAIN, 22));
		log.setBounds(352, 215, 74, 54);
		frmScientificCalculator.getContentPane().add(log);
		
		JButton percent = new JButton("%");
		percent.setBackground(SystemColor.inactiveCaption);
		percent.setFont(new Font("Tahoma", Font.PLAIN, 22));
		percent.setBounds(257, 146, 74, 54);
		frmScientificCalculator.getContentPane().add(percent);
		
		degree = new JRadioButton("Degree");
		degree.setFont(new Font("Tahoma", Font.PLAIN, 15));
		degree.setBounds(337, 107, 103, 21);
		frmScientificCalculator.getContentPane().add(degree);
		
		radian = new JRadioButton("Radian");
		radian.setSelected(true);
		radian.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radian.setBounds(259, 107, 74, 21);
		frmScientificCalculator.getContentPane().add(radian);
		
		JButton exp = new JButton("e");
		exp.setFont(new Font("Tahoma", Font.PLAIN, 22));
		exp.setBackground(new Color(216, 191, 216));
		exp.setBounds(84, 146, 74, 54);
		frmScientificCalculator.getContentPane().add(exp);
		
		JButton pi = new JButton("pi");
		pi.setFont(new Font("Tahoma", Font.PLAIN, 22));
		pi.setBackground(new Color(216, 191, 216));
		pi.setBounds(2, 146, 74, 54);
		frmScientificCalculator.getContentPane().add(pi);
		
		JButton fact = new JButton("!");
		fact.setFont(new Font("Tahoma", Font.PLAIN, 22));
		fact.setBackground(SystemColor.inactiveCaption);
		fact.setBounds(168, 146, 74, 54);
		frmScientificCalculator.getContentPane().add(fact);
		
		//adding action listener
		CalActionListener ca=new CalActionListener(this);
		one.addActionListener(ca);
		two.addActionListener(ca);
		three.addActionListener(ca);
		four.addActionListener(ca);
		five.addActionListener(ca);
		six.addActionListener(ca);
		seven.addActionListener(ca);
		eight.addActionListener(ca);
		nine.addActionListener(ca);
		zero.addActionListener(ca);
		decimalpoint.addActionListener(ca);
		plus.addActionListener(ca);
		minus.addActionListener(ca);
		multiply.addActionListener(ca);
		divide.addActionListener(ca);
		equals.addActionListener(ca);
		clear.addActionListener(ca);
		power.addActionListener(ca);
	    sqrt.addActionListener(ca);
	    cuberoot.addActionListener(ca);
	    sine.addActionListener(ca);
	    cosine.addActionListener(ca);
	    tan.addActionListener(ca);
	    sinh.addActionListener(ca);
	    cosh.addActionListener(ca);
	    tanh.addActionListener(ca);
	    log.addActionListener(ca);
	    log10.addActionListener(ca);
	    percent.addActionListener(ca);
	    degree.addActionListener(ca);
	    radian.addActionListener(ca);
	    exp.addActionListener(ca);
	    pi.addActionListener(ca);
	    fact.addActionListener(ca);
	}
	
	public JRadioButton getRadian() {
		return radian;
	}

	public JRadioButton getDegree() {
		return degree;
	}

	public JTextField getTextField() {
		return textField;
	}	
}
