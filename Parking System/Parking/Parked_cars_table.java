package Parking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;

public class Parked_cars_table {

	JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parked_cars_table window = new Parked_cars_table();
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
	public Parked_cars_table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 806, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(131, 74, 521, 237);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system","root","Alok@123");
            Statement st=con.createStatement();
            String query="select * from parked_cars";
            ResultSet rs=st.executeQuery(query);
            ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
		    int cols=rsmd.getColumnCount();
		    String[] colname=new String[cols];
		    for(int i=0;i<cols;i++)
		    {
		    	colname[i]=rsmd.getColumnName(i+1);
		    }
		    model.setColumnIdentifiers(colname);
		    String vcid,vctype;
		    while(rs.next())
		    {
		    	vcid=rs.getString(1);
		    	vctype=rs.getString(2);
		    	String[] row= {vcid,vctype};
		    	model.addRow(row);
		    }
		    st.close();
		    con.close();
		    
		    
		    
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		       ParkMain m=new ParkMain();
		      m.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(341, 361, 100, 45);
		frame.getContentPane().add(btnNewButton);
	}
}
