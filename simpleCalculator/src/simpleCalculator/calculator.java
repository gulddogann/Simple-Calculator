package simpleCalculator;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class calculator extends JFrame {

	
	private static final long serialVersionUID = -8764962247040154812L;
	private JPanel contentPane;
	private double answer,number;
	int operation;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
        public void addInput(String str) {
       input.setText(input.getText()+str.trim());
				
			
        }
        public void calculate() {
		
        switch(operation) {
        case 1:
        	answer=number+Double.parseDouble(input.getText());
        	input.setText(Double.toString(answer));
        	break;
        case 2:
        	answer=number-Double.parseDouble(input.getText());
        	input.setText(Double.toString(answer));
        	break;
        case 3:
        	answer=number*Double.parseDouble(input.getText());
        	input.setText(Double.toString(answer));
        	break;
        case 4:
        	answer=number/Double.parseDouble(input.getText());
        	input.setText(Double.toString(answer));
        	break;
        }
        
}
	/**
	 * Create the frame.
	 */
	public calculator() {
		setType(Type.UTILITY);
		setTitle("Simple Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 10, 393, 60);
		panel.add(screen);
		screen.setLayout(null);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setForeground(new Color(0, 0, 0));
		lbl.setBackground(new Color(192, 192, 192));
		lbl.setBounds(101, 0, 292, 13);
		screen.add(lbl);
		
		input = new JTextField();
		input.setForeground(new Color(0, 0, 0));
		input.setBackground(new Color(255, 255, 255));
		input.setEnabled(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setBounds(0, 23, 393, 37);
		screen.add(input);
		input.setColumns(10);
		
		JPanel control = new JPanel();
		control.setBounds(10, 80, 393, 341);
		panel.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3 = new JButton("7");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_3.setBackground(new Color(255, 128, 0));
		btnNewButton_1_3.setForeground(new Color(0, 0, 0));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_2 = new JButton("+");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputText = input.getText();
				number =Double.parseDouble(input.getText());
				operation=1;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
				
				
			}
		});
		btnNewButton_1_2.setBackground(new Color(255, 128, 0));
		btnNewButton_1_2.setForeground(new Color(0, 0, 0));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_2);
		
		JButton btnNewButton = new JButton("6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton);
		
		JButton btnNewButton_1_7 = new JButton("5");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_7.setBackground(new Color(255, 128, 0));
		btnNewButton_1_7.setForeground(new Color(0, 0, 0));
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_5 = new JButton("4");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_5.setBackground(new Color(255, 128, 0));
		btnNewButton_1_5.setForeground(new Color(0, 0, 0));
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_11 = new JButton("-");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=2;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_11.setBackground(new Color(255, 128, 0));
		btnNewButton_1_11.setForeground(new Color(0, 0, 0));
		btnNewButton_1_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_10 = new JButton("3");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_10.setBackground(new Color(255, 128, 0));
		btnNewButton_1_10.setForeground(new Color(0, 0, 0));
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_8 = new JButton("2");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_8.setBackground(new Color(255, 128, 0));
		btnNewButton_1_8.setForeground(new Color(0, 0, 0));
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_13 = new JButton("1");
		btnNewButton_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_13.setBackground(new Color(255, 128, 0));
		btnNewButton_1_13.setForeground(new Color(0, 0, 0));
		btnNewButton_1_13.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_13);
		
		JButton btnNewButton_1_4 = new JButton("*");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=3;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_4.setBackground(new Color(255, 128, 0));
		btnNewButton_1_4.setForeground(new Color(0, 0, 0));
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_6 = new JButton("0");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_6.setBackground(new Color(255, 128, 0));
		btnNewButton_1_6.setForeground(new Color(0, 0, 0));
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_9 = new JButton("=");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText(" ");
			}
		});
		btnNewButton_1_9.setBackground(new Color(255, 128, 0));
		btnNewButton_1_9.setForeground(new Color(0, 0, 0));
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_14 = new JButton("C");
		btnNewButton_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(" ");
			}
		});
		btnNewButton_1_14.setBackground(new Color(255, 128, 0));
		btnNewButton_1_14.setForeground(new Color(0, 0, 0));
		btnNewButton_1_14.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_14);
		
		JButton btnNewButton_1_12 = new JButton("%");
		btnNewButton_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=4;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_12.setBackground(new Color(255, 128, 0));
		btnNewButton_1_12.setForeground(new Color(0, 0, 0));
		btnNewButton_1_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_12);
	}
}
