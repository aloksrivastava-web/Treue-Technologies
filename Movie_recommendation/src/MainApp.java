import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	JFrame frame;
	public String genre,lang="";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
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
	public MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Movie Recommendation System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(145, 16, 415, 114);
		contentPane.add(lblNewLabel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(479, 16, 1, 1);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_1 = new JLabel("Select Your Preferences");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(63, 140, 223, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Genre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(86, 209, 74, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Language\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(86, 268, 133, 45);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				genre=(String) comboBox.getSelectedItem();
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "ACTION", "ADVENTURE", "COMEDY", "DRAMA", "HORROR"}));
		comboBox.setBounds(246, 209, 149, 29);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lang=(String) comboBox_1.getSelectedItem();
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KANNADA", "ENGLISH", "HINDI", "TAMIL", "MALYALLAM"}));
		comboBox_1.setBounds(246, 275, 149, 35);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(genre=="SELECT" || lang=="SELECT" || genre==""|| lang=="")
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please select your preferences");
				}else {
			    Movie_list mv=new Movie_list(genre,lang);
				mv.frame.setVisible(true);
				frame.dispose();
				}
			}
		});
		btnNewButton.setBounds(246, 358, 133, 33);
		contentPane.add(btnNewButton);
	}
}
