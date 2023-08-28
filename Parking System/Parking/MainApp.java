package Parking;

import java.awt.EventQueue;
import javax.swing.JPasswordField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.mysql.cj.jdbc.ConnectionGroupManager;
import com.mysql.cj.xdevapi.Statement;

import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.*;
import java.awt.*;    
import javax.swing.*;

public class MainApp {

	JFrame frame;
	JTextField textField;
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	 private JPasswordField passwordField;
	 private JPasswordField passwordField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(121, 142, 96, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(121, 197, 114, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                String password = passwordField_1.getText();

                if (authenticateUser(username, password)) {

    				ParkMain pi=new ParkMain();
					MainApp window = new MainApp();
    				pi.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    JOptionPane.showMessageDialog(btnNewButton, "Login failed. Please check your credentials.");
                }
            }


			private boolean authenticateUser(String username, String password) {
				// TODO Auto-generated method stub
				 String jdbcUrl = "jdbc:mysql://localhost:3306/voting_system";
		         String dbUser = "root";
			     String dbPassword = "Alok@123";

			        try {
			            Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
			            String query = "SELECT * FROM registration WHERE username = ? AND password = ?";
			            PreparedStatement preparedStatement = connection.prepareStatement(query);
			            preparedStatement.setString(1, username);
			            preparedStatement.setString(2, password);
			            ResultSet resultSet = preparedStatement.executeQuery();

			            return resultSet.next(); // If a matching user is found, authentication is successful.

			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			        
				return false;
			}
        });
		
    
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(164, 287, 108, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration pi=new Registration();
				MainApp window = new MainApp();
				pi.frame.setVisible(true);
				window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		});
		btnNewButton_1.setBounds(422, 287, 130, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(297, 142, 149, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Online Parking System");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(218, 30, 203, 62);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField_1.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(282, 287, 130, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		JCheckBox check = new JCheckBox("Show Password");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check.isSelected())
				{
					passwordField_1.setEchoChar((char)0);
				}
				else
				{
					passwordField_1.setEchoChar('*');

				}
			}
		});
		check.setFont(new Font("Times New Roman", Font.BOLD, 13));
		check.setBounds(452, 211, 149, 34);
		frame.getContentPane().add(check);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(297, 209, 149, 38);
		frame.getContentPane().add(passwordField_1);
	}
}
