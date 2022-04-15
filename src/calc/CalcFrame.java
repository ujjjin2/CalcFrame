package calc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame{

	private JPanel JpCenter;
	private JPanel JpUP;
	private JButton[] btn;

	
	private String[] number = {"%","CE","C","⇦","1/x","x²","√2","÷","7","8","9","×",
			"4","5","6","-","1","2","3","+","+/-","0",".","="};
	private JPanel panelUP;
	private JPanel panelCenter;
	private JPanel panelDown;
	private JLabel JL;
	private JMenuBar mb;
	private JMenu menu;
	private JLabel norm;
	private JMenu reduce;
	private JPanel panel1;
	private JPanel panel2;
	private JTextField tf;
	private JButton[] btn2;
	private String[] menunu = {"MC","MR","M+","M-","Ms","Mv"};
	private JTextField tf2; 
	
	
	public CalcFrame(String title) {
		setTitle(title);
		setSize(380, 670);
		setResizable(false);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		JpUP();
		JPCenter();
		makeMenu();
		this.setJMenuBar(mb);
		setVisible(true);
	}
	
	  private void makeMenu() 
	   {
	        mb = new JMenuBar(); 
	        mb.setOpaque(true);
	        mb.setBackground(Color.LIGHT_GRAY);
	        
	        menu = new JMenu(" ≡ ");
	        menu.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 19));
	        
	        norm = new JLabel(" 표준 ");
	        norm.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 19));
	        
	        reduce = new JMenu(" # ");
	        reduce.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 19));
	      
	        mb.add(menu);
	        mb.add(norm);
	        mb.add(reduce);
	   }

	private void JpUP() {
		JpUP = new JPanel();
		JpUP.setLayout(new BorderLayout());
		//JpUP.setBackground(Color.blue);
		
		panelCenter = new JPanel();
		//panelCenter.setBackground(Color.blue);
		panelCenter.setLayout(new BorderLayout());
		
		panel1 = new JPanel();
		//panel1.setBackground(Color.gray);
		panel1.setLayout(new BorderLayout());
		tf = new JTextField(10);
		
		tf.setHorizontalAlignment(JTextField.RIGHT);
	
		panel1.add(tf);
		panelCenter.add(panel1);
		
		panel2 = new JPanel();
		//panel2.setBackground(Color.black);
		panel2.setLayout(new BorderLayout());
		tf2 = new JTextField(10);
		

		tf2.setHorizontalAlignment(JTextField.RIGHT);
		panel2.add(tf2);
		panelCenter.add(panel2, BorderLayout.NORTH);
		
		JpUP.add(panelCenter, BorderLayout.CENTER);
		
		panelDown = new JPanel();
		panelDown.setLayout(new GridLayout(1,6));
		//panelDown.setBackground(Color.red);
		btn2 = new JButton[6];
		
		for (int i = 0; i < menunu.length; i++) {
			panelDown.add(btn2[i] = new JButton(menunu[i]));
			btn2[i].setBackground(Color.white);
		}
		btn2[0].setEnabled(false);
		btn2[1].setEnabled(false);
		btn2[5].setEnabled(false);
		JpUP.add(panelDown, BorderLayout.SOUTH);
		
		add(JpUP);
		
	}

	private void JPCenter() {
		JpCenter = new JPanel();
		JpCenter.setLayout(new GridLayout(6,4));
		btn = new JButton[24];
		for (int i = 0; i < number.length; i++) {
			JpCenter.add(btn[i] = new JButton(number[i]));
			btn[i].setBackground(Color.white);
		}
		JpCenter.setBackground(Color.black);
		
		add(JpCenter , BorderLayout.CENTER);
	}
}
