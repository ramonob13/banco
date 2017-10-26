package br.edu.ifpb.esperanca.poo.calc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(107, 23, 217, 53);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnCalculation = new JTextPane();
		txtpnCalculation.setText("Calculation");
		txtpnCalculation.setBounds(27, 11, 160, 31);
		panel.add(txtpnCalculation);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(170, 97, 86, 20);
		contentPane.add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		JLabel lblNum = new JLabel("Num1");
		lblNum.setBounds(114, 100, 46, 14);
		contentPane.add(lblNum);
		
		JLabel lblNum_1 = new JLabel("Num2");
		lblNum_1.setBounds(107, 128, 71, 14);
		contentPane.add(lblNum_1);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(180, 128, 86, 20);
		contentPane.add(textFieldNum2);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(124, 177, 46, 14);
		contentPane.add(lblResult);
		
		textFieldResult = new JTextField();
		textFieldResult.setColumns(10);
		textFieldResult.setBounds(180, 174, 86, 20);
		contentPane.add(textFieldResult);
		
		JButton btnSomar = new JButton("SOMAR");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String text1 = textFieldNum1.getText().toString();
				float num1 = Float.parseFloat(text1);
				String text2 = textFieldNum2.getText().toString();
				float num2 = Float.parseFloat(text2);
				
				float soma = num1 + num2;
				textFieldResult.setText("" + soma);
				
			}
		});
		btnSomar.setBounds(71, 212, 89, 23);
		contentPane.add(btnSomar);
		
		JButton btnSubtrao = new JButton("SUBTRA\u00C7\u00C3O");
		btnSubtrao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String text1 = textFieldNum1.getText().toString();
				float num1 = Float.parseFloat(text1);
				String text2 = textFieldNum2.getText().toString();
				float num2 = Float.parseFloat(text2);
				
				float sub = num1 - num2;
				textFieldResult.setText(""+ sub);
				
				
				
			}
		});
		btnSubtrao.addHierarchyBoundsListener(new HierarchyBoundsAdapter() {
			@Override
			public void ancestorMoved(HierarchyEvent arg0) {
			}
		});
		btnSubtrao.setBounds(281, 87, 122, 20);
		contentPane.add(btnSubtrao);
		
		JButton btnMultiplicar = new JButton("MULTIPLICAR");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String text1 = textFieldNum1.getText().toString();
				float num1 = Float.parseFloat(text1);
				
				String text2 = textFieldNum2.getText().toString();
				float num2 = Float.parseFloat(text2);
				
				float multiplicar = num1 * num2;
				
				textFieldResult.setText(""+ multiplicar);
				
				
				
			}
		});
		btnMultiplicar.setBounds(300, 168, 103, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnDiviso = new JButton("DIVIS\u00C3O");
		btnDiviso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text1 = textFieldNum1.getText().toString();
				float num1 = Float.parseFloat(text1);
				
				String text2 = textFieldNum2.getText().toString();
				float num2 = Float.parseFloat(text2);
				
				float divisao = num1 / num2;
				
				textFieldResult.setText(""+ divisao);
			}
		});
		btnDiviso.setBounds(228, 212, 89, 23);
		contentPane.add(btnDiviso);
		
		
	}
}
