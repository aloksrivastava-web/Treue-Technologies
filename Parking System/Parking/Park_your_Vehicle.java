package Parking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.mysql.cj.protocol.Resultset;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Park_your_Vehicle {

	JFrame frame;
	JFrame f;  

	private JTextField VC_number;
	private JTextField VC_type;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Park_your_Vehicle window = new Park_your_Vehicle();
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
	public Park_your_Vehicle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.setBounds(100, 100, 652, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("       Enter Your Vehicle Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(152, 33, 316, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vehicle Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(48, 157, 153, 55);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vehicle Type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(48, 222, 123, 41);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Park");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/voting_system";
					Connection con=DriverManager.getConnection(url, "root", "Alok@123");
					String query="insert into parked_cars values (?,?)";
					Statement stmt = con.createStatement();
					String qu="SELECT COUNT(*) from parked_cars";
				    ResultSet rs = stmt.executeQuery(qu);
					rs.next();
					MainApp p=new MainApp();
					String name=p.textField.getText();
					int count=rs.getInt(1);
				    if(count>20)
					{
				    	 f=new JFrame();  
				    	 JOptionPane.showMessageDialog(f,"Sorry ! Booking Slots are full ");  
				    }else {
					PreparedStatement st=con.prepareStatement(query);
					st.setString(2,VC_number.getText());
					st.setString(1,VC_type.getText());
					int i=st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton, i+" Record added Successfully");
					
				}
				}catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(80, 326, 135, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VC_number.setText("");
				VC_type.setText("");
			}
		});
		btnNewButton_1.setBounds(243, 326, 159, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		VC_number = new JTextField();
		VC_number.setBounds(271, 165, 197, 31);
		frame.getContentPane().add(VC_number);
		VC_number.setColumns(10);
		
		VC_type = new JTextField();
		VC_type.setBounds(272, 235, 196, 31);
		frame.getContentPane().add(VC_type);
		VC_type.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParkMain p=new ParkMain();
				p.frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(427, 325, 135, 47);
		frame.getContentPane().add(btnNewButton_2);
	}
}
