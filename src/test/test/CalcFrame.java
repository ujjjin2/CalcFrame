package test.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame{
	
	private JPanel panelUp;
	private JPanel panelDown;
	private JPanel inpanl1;
	private JPanel inpanl2;
	private JPanel inpanl3;
	private JPanel inpanl4;
	
	private JTextField tf1;
	private JTextField tf2;
	
	
	private JButton[] btn;
	private String[] number= {"%","CE","C","지움","1/x","x^2","루트","/","7","8","9","*",
								"4","5","6","-","1","2","3","+","+/-","0",".","="};
	
	private JButton btntitle;
	private JButton[] btn2;
	private String[] menu = {"MC","MR","M+","M-","Ms","Mv"}; 
	
	
	public CalcFrame(String title) {
		setTitle(title);
		setSize(300, 300);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		PanelUp();
		
		panelDown();
		
		setVisible(true);
	}

	private void PanelUp() {
		panelUp = new JPanel();
		//panelUp.setBackground(Color.RED);
		panelUp.setLayout(new GridLayout(4,1));
		
		inpanl1 = new JPanel();
		//inpanl1.setBackground(Color.red);
		inpanl1.setLayout(new FlowLayout());
		btntitle = new JButton("표준");
		
		inpanl1.add(btntitle);
		panelUp.add(inpanl1);
		
		inpanl2 = new JPanel();
		//inpanl2.setBackground(Color.blue);
		inpanl2.setLayout(new FlowLayout());
		tf1 = new JTextField(10);
		inpanl2.add(tf1);
		panelUp.add(inpanl2);
		
		inpanl3 = new JPanel();
		//inpanl3.setBackground(Color.red);
		inpanl3.setLayout(new FlowLayout());
		tf2 = new JTextField(10);
		inpanl3.add(tf2);
		panelUp.add(inpanl3);
		
		inpanl4 = new JPanel();
		//inpanl4.setBackground(Color.blue);
		inpanl4.setLayout(new GridLayout(1,6));
		btn2 = new JButton[6];
		for (int i = 0; i < menu.length; i++) {
			inpanl4.add(btn2[i] = new JButton(menu[i]));
		}
		panelUp.add(inpanl4);
		
		add(panelUp);
	}

	private void panelDown() {
		panelDown = new JPanel();
		//panelDown.setBackground(Color.blue);
		panelDown.setLayout(new GridLayout(6,4));
		btn = new JButton[24];
		for (int i = 0; i < number.length; i++) {
			panelDown.add(btn[i] = new JButton(number[i]));
		}
		btn[23].setBackground(Color.red);
		add(panelDown);
	}
}
