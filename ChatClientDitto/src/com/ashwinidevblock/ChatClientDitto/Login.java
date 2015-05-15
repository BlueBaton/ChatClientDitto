package com.ashwinidevblock.ChatClientDitto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFieldAddress;
	private JLabel labelIPAdd;
	private JLabel lblName;
	private JLabel lblPort;
	private JTextField textFieldPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getLookAndFeel());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 380);
		setSize(300, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(67, 80, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblName = new JLabel("Name");
		lblName.setBounds(130, 56, 33, 14);
		contentPane.add(lblName);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(67, 136, 159, 20);
		contentPane.add(textFieldAddress);
		
		labelIPAdd = new JLabel("IP Address");
		labelIPAdd.setBounds(112, 111, 70, 14);
		contentPane.add(labelIPAdd);
		
		lblPort = new JLabel("Port");
		lblPort.setBounds(130, 167, 33, 14);
		contentPane.add(lblPort);
		
		textFieldPort = new JTextField();
		textFieldPort.setColumns(10);
		textFieldPort.setBounds(67, 192, 159, 20);
		contentPane.add(textFieldPort);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Name = textField.getText();
				String Address = textFieldAddress.getText();
				int Port = Integer.parseInt(textFieldPort.getText());
				login(Name, Address, Port);
			}
		});
		btnNewButton.setBounds(102, 244, 89, 23);
		contentPane.add(btnNewButton);
	}
	private void login(String Name, String Address, int Port){
		dispose();

		System.out.println("Button Pressed"+"   "+Name+"   "+Address+"   "+Port);
		new Client(Name, Address, Port);
		
	}
}
