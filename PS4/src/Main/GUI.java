package Main;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField InitialAmount;
	private JTextField TotalYears;
	private JTextField YearlyInterest;
	private JTextField futureValue;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}			)
		;
	}

	public GUI() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel splitPanel = new JPanel();
		splitPanel.setBounds(22, 25, 390, 175);
		frame.getContentPane().add(splitPanel);
		splitPanel.setLayout(null);
		
		JLabel InvestmentAmount = new JLabel("Initial Amount");
		InvestmentAmount.setFont(new Font("Calibri", Font.BOLD, 12));
		InvestmentAmount.setBounds(10, 10, 155, 30);
		splitPanel.add(InvestmentAmount);
		
		InitialAmount = new JTextField();
		InitialAmount.setBounds(220, 10, 140, 30);
		splitPanel.add(InitialAmount);
		InitialAmount.setColumns(10);
		
		JLabel Years = new JLabel("Years");
		Years.setFont(new Font("Calibri", Font.BOLD, 12));
		Years.setHorizontalAlignment(SwingConstants.LEFT);
		Years.setBounds(10, 60, 130, 25);
		splitPanel.add(Years);
		
		TotalYears = new JTextField();
		TotalYears.setBounds(220, 55, 140, 30);
		splitPanel.add(TotalYears);
		TotalYears.setColumns(10);
		
		JLabel YearlyInterestinterest = new JLabel("Annual Interest Rate");
		YearlyInterestinterest.setHorizontalAlignment(SwingConstants.LEFT);
		YearlyInterestinterest.setFont(new Font("Calibri", Font.BOLD, 12));
		YearlyInterestinterest.setBounds(10, 100, 155, 15);
		splitPanel.add(YearlyInterestinterest);
		
		JLabel futurevalue = new JLabel("Future Value");
		futurevalue.setFont(new Font("Calibri", Font.BOLD, 12));
		futurevalue.setHorizontalAlignment(SwingConstants.LEFT);
		futurevalue.setBounds(10, 150, 130, 15);
		splitPanel.add(futurevalue);
		
		YearlyInterest = new JTextField();
		YearlyInterest.setBounds(220, 100, 140, 30);
		splitPanel.add(YearlyInterest);
		YearlyInterest.setColumns(10);
		
		futureValue = new JTextField();
		futureValue.setBounds(220, 140, 140, 30);
		splitPanel.add(futureValue);
		futureValue.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				futureValue.setBackground(Color.PINK);
				double total;
				double initial = Double.parseDouble(InitialAmount.getText());
				double years = Double.parseDouble(TotalYears.getText());
				double interest = Double.parseDouble(YearlyInterest.getText());
				
				Calc tester = new Calc();
				
				total = tester.FutureValue(initial, years, interest);
				
				futureValue.setText("$ " + total);
		
			}
		}				);
		
		
		calculateButton.setBounds(250, 210, 127, 41);
		frame.getContentPane().add(calculateButton);
	}
}