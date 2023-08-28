package Parking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

import java.sql.*;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Registration {

	JFrame frame;
	private JTextField textFieldName;
	private JTextField textField_1_email;
	private JTextField textField_2_mobile_number;
	private JTextField textField_3_username;
	private JTextField textField_4password;
//	private JRadioButton rbMale;
//	private JRadioButton rdbtnNewRadioButton_1;
	     private JRadioButton maleRadioButton;
	    private JRadioButton femaleRadioButton;
	    private ButtonGroup genderButtonGroup;
	
		/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.setBounds(100, 100, 676, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(94, 95, 88, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(94, 156, 71, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(94, 222, 119, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(94, 182, 130, 34);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(94, 260, 102, 40);
		frame.getContentPane().add(lblNewLabel_4);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(299, 95, 144, 34);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textField_1_email = new JTextField();
		textField_1_email.setBounds(299, 144, 144, 34);
		frame.getContentPane().add(textField_1_email);
		textField_1_email.setColumns(10);
		
		textField_2_mobile_number = new JTextField();
		textField_2_mobile_number.setBounds(299, 188, 144, 28);
		frame.getContentPane().add(textField_2_mobile_number);
		textField_2_mobile_number.setColumns(10);
		
		textField_3_username = new JTextField();
		textField_3_username.setBounds(299, 229, 144, 34);
		frame.getContentPane().add(textField_3_username);
		textField_3_username.setColumns(10);
		
		textField_4password = new JTextField();
		textField_4password.setBounds(299, 273, 144, 34);
		frame.getContentPane().add(textField_4password);
		textField_4password.setColumns(10);
		
		    maleRadioButton = new JRadioButton("Male");
		    maleRadioButton.setBounds(276, 326, 103, 21);
		    frame.getContentPane().add(maleRadioButton);
	        femaleRadioButton = new JRadioButton("Female");
	        femaleRadioButton.setBounds(381, 326, 103, 21);
	        frame.getContentPane().add(femaleRadioButton);
	        genderButtonGroup = new ButtonGroup();
	        genderButtonGroup.add(maleRadioButton);
	        genderButtonGroup.add(femaleRadioButton);
		
		JLabel lblNewLabel_5 = new JLabel("Enter your Details");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(209, 28, 275, 40);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainApp pi=new MainApp();
				pi.frame.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(116, 412, 112, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textField_1_email.setText("");
				textField_2_mobile_number.setText("");
				textField_3_username.setText("");
				textField_4password.setText("");
				textFieldName.setText("");
				maleRadioButton.setText("");
				femaleRadioButton.setText("");
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(276, 412, 102, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/voting_system";
					Connection con=DriverManager.getConnection(url, "root", "Alok@123");
					
					if(con.isClosed())
					{
						System.out.println("Connection is Closed");
					}
					else
					{
						System.out.println("Connection Created");
					}
					String query="insert into registration values (?,?,?,?,?,?)";
					PreparedStatement st=con.prepareStatement(query);
					st.setString(1,textFieldName.getText());
					st.setString(2,textField_1_email.getText());
					st.setString(3,textField_2_mobile_number.getText());
					st.setString(4,textField_3_username.getText());
					st.setString(5,textField_4password.getText());
					String selectedGender = "";

		            if (maleRadioButton.isSelected()) {
		                selectedGender = "Male";
		            } else if (femaleRadioButton.isSelected()) {
		                selectedGender = "Female";
		            } 
		            st.setString(6, selectedGender);
					
					int i=st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_2, i+"Record added Successfully");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(405, 412, 112, 46);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(94, 310, 119, 46);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
