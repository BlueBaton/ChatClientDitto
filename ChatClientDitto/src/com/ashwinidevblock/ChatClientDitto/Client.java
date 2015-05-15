package com.ashwinidevblock.ChatClientDitto;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private String Name, Address;
	private int Port;
	
	public Client(String Name, String Address, int Port) {
		
		this.Name=Name;
		this.Address=Address;
		this.Port=Port;
		createWindow();
	}

	private void createWindow(){

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 480);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
	}
}
