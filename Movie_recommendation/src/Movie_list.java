import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Movie_list {

	JFrame frame;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Movie_list window = new Movie_list(toString(),toString());
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
	public Movie_list(String gen,String lang) {
		initialize(gen,lang);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String ge,String l) {
		frame = new JFrame();
		frame.setBounds(100, 100, 724, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table_1 = new JTable();
		
		if(ge=="ACTION" && l=="KANNADA")
		{
		String[] columnNames = {"Movie Name"};
        Object[][] data = {
                {"Diamond Cross"},
                {"Don Kumara",},
                {"O Manase"},
                {"Iravan",},{"Bera"},{"Gadyuddha"},{"Darbar"},{"Present Prapancha 0% love"},{"Hide and Seek"},{"Veeram"},{"Gurudev Hoysala"},{"Kabzaa"},{"1 Rabari Kathe"}};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        table.setBounds(101, 82, 515, 212);
		frame.getContentPane().add(table);
		}else if(ge=="HORROR" && l=="KANNADA")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"Asvins"},
	                {"Pizza 3: The Mummy",},
	                {"ChandraMukhi 2"},
	                {"Raaghu",},{"Ana"},{"Namaste Ghost"},{"Kathanar-The Wild Spcerer"},{"Cold Case"},{"December 24"},{"Namo Bhootatma 2"},{"Iraivan"},{"Vampires of Vijaynagar"},{"Kanchana 3"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ADVENTURE" && l=="KANNADA")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"GG: Gandhada Gudi"},
	                {"777 Charlie",},
	                {"Kantara"},
	                {"Run 2",},{"Yaanaa"},{"Missing Boy"},{"Aranyakanda"},{"Rangi Taranga"},{"Nam Duniye Nam Style"},{"Ponniyin Selvan : Part I"},{"Ponniyin Selvan : Part II"},{"Avane Srimannarayana"},{"Dhoomam"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="COMEDY" && l=="KANNADA")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"Diamond Cross"},
	                {"Don Kumara",},
	                {"O Manase"},
	                {"Iravan",},{"Bera"},{"Gadyuddha"},{"Darbar"},{"Present Prapancha 0% love"},{"Hide and Seek"},{"Veeram"},{"Gurudev Hoysala"},{"Kabzaa"},{"1 Rabari Kathe"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="DRAMA" && l=="KANNADA")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"Chandini Bar"},
	                {"Nano Narayanappa",},
	                {"90 Bidi Manig Nadi"},
	                {"Cutting Shop",},{"Rupayi"},{"Nimmellara Ashirvada"},{"Mata"},{"Khasagi Putagalu"},{"Valatty"},{"Arjuna Sanyasi"},{"Miss Shetty Mr Polishetty"},{"Damayana"},{"Huchudugaru"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ACTION" && l=="English")
		{
		String[] columnNames = {"Movie Name"};
        Object[][] data = {
                {"Blue Beetle"},
                {"Rebel Moon",},
                {"Heat of Stone"},
                {"Guardians of the Galaxy vol.3",},{"Meg 2: The Trench"},{"Gran Turismo"},{"Spider-Man: Across the Spider-Verse"},{"Teenage Mutant Ninja turtles"},{"The Flash"},{"Mission Impossible"},{"Sound of freedom"},{"The Monkey King"},{"To Catch a Kiler"}};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        table.setBounds(101, 82, 515, 212);
		frame.getContentPane().add(table);
		}else if(ge=="HORROR" && l=="English")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"Talk to Me"},
	                {"The Pope's Exorcist",},
	                {"The Last Voyage pf the Demeter"},
	                {"X",},{"A Haunting in Venice"},{"Cobweb"},{"Bone Tomahawk"},{"Haunted Mansion"},{"The Meg"},{"Haunting of the Queen Mary"},{"Insidious : The Red Door"},{"Knock at the Cabin"},{"The Texas Chain Saw Massacre"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ADVENTURE" && l=="English")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"Blue Beetle"},
	                {"Rebel Moon",},
	                {"WALL-E"},
	                {"Coco",},{"Gran Turismo"},{"Fast X"},{"The Monkey King"},{"Barbie"},{"Nimona"},{"The Flash"},{"Transforme : Rise of the Beasts"},{"The Little Mermaid"},{"Crater"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="COMEDY" && l=="English")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"Good boys"},
	                {"Stuber",},
	                {"Shazam!"}, 
	                {"When We first met",},{"Blockers"},{"Game Night"},{"Jumanji: Welcome to the Jungle"},{"Thor: Ragnarok"},{"The Other Woman"},{"How to be a Latin lover"},{"A very Harold and Kumar Christmas"},{"Going in Style"},{"The campaign"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="DRAMA" && l=="English")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"Dunkirk"},
	                {"My Fault"},
	                {"The Social Network"},
	                {"The Lincoln Lawyer",},{"Pride & Prejudice"},{"The Hurt Locker"},{"Million Dollar Baby"},{"The Farewell"},{"Hide and Seek"},{"American Beauty"},{"Forrest Gump"},{"The GodFather"},{"The Blind Side"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ACTION" && l=="HINDI")
		{
		String[] columnNames = {"Movie Name"};
        Object[][] data = {
                {"Sholay "},
                {"Don ",},
                {"Dhoom "},
                {"Ghajini ",},{"Singham "},{"Bang Bang!"},{"War "},{"Baaghi"},{"Raees "},{"Dabangg "},{"Commando "},{"Baahubali: The Beginning"},{"Ek Tha Tiger "}};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        table.setBounds(101, 82, 515, 212);
		frame.getContentPane().add(table);
		}else if(ge=="HORROR" && l=="HINDI")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	                {"Raat "},
	                {"Bhoot ",},
	                {"1920 "},
	                {"Raaz ",},{"Stree "},{"Bhool Bhulaiyaa "},{"Tumbbad "},{"Ragini MMS"},{"Pari "},{"13B: Fear Has a New Address "},{"Raat Akeli Hai"},{"Pari (2018)"},{"Darna Mana Hai"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ADVENTURE" && l=="HINDI")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		    {"Lagaan "},
		                {"Swades",},
		                {"Dil Chahta Ha"},
		                {"Jab Tak Hai Jaan ",},{"Taare Zameen Par"},{"Koi... Mil Gaya"},{"PK "},{"Dhoom 3  "},{"Krrish "},{"Zindagi Na Milegi Dobara"},{"Detective Byomkesh Bakshy! "},{"Shivaay "},{"Thugs of Hindostan"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="COMEDY" && l=="HINDI")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	           		 {"Andaz Apna Apna"},
		                {"Hera Pheri ",},
		                {"Chupke Chupke"},
		                {"Munna Bhai M.B.B.S.",},{"3 Idiots"},{"Golmaal: Fun Unlimited"},{"Welcome "},{" Delhi Belly "},{"Fukrey "},{"Queen "},{"Badhaai Ho "},{"Stree "},{"Bala "}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="DRAMA" && l=="HINDI")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Taare Zameen Par"},
		                {"Lage Raho Munna Bhai ",},
		                {"3 Idiots"},
		                {"Anand ",},{"Mughal-e-Azam"},{"A Wednesday!"},{"Kabhi Khushi Kabhie Gham "},{"Black   "},{"My Name is Khan "},{"Rang De Basanti "},{" Kahaani "},{"Udaan "},{"Court "}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ACTION" && l=="TAMIL")
		{
		String[] columnNames = {"Movie Name"};
        Object[][] data = {
        		 {"Baahubali: The Beginning"},
	                {"Vikram Vedha ",},
	                {"Mankatha "},
	                {"Theri ",},{"Kabali "},{"Kaithi "},{"Vada Chennai "},{" Thuppakki  "},{"Viswasam "},{"Ayan "},{"KGF: Chapter 1 "},{"I"},{"Maari "}};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        table.setBounds(101, 82, 515, 212);
		frame.getContentPane().add(table);
		}else if(ge=="HORROR" && l=="TAMIL")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Rajmahal "},
		                {"Pisaasu ",},
		                {"Demonte Colony"},
		                {"Maya ",},{"Kanchana "},{"Aval "},{"Pizza "},{"Raa Raa  "},{"Eeram "},{"Raghava Lawrence "},{" Dhilluku Dhuddu "},{"Kuttram 23"},{"Parijatham "}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ADVENTURE" && l=="TAMIL")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Raavanan"},
		                {"Kaaviya Thalaivan ",},
		                {"Puli "},
		                {"Mersal ",},{"Imsai Arasan 23am Pulikesi "},{"Kadamban "},{"Puli Murugan "},{"Anegan   "},{"Kaashmora "},{"Peranmai "},{"Pudhupettai  "},{"Vanamagan "},{"Thani Oruvan"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="COMEDY" && l=="TAMIL")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Varuthapadatha Valibar Sangam"},
		                {"Soodhu Kavvum",},
		                {"Nanum Rowdy Dhaan "},
		                {"Kadhalum Kadanthu Pogum ",},{"Jigarthanda "},{"Boss Engira Bhaskaran"},{"Kaadhalil Sodhappuvadhu Yeppadi"},{"Idharkuthane Aasaipattai Balakumara   "},{"Thillu Mullu"},{"Ethir Neechal"},{" Maan Karate"},{"Naanum Oru Thozhilali "},{"Raja Rani"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="DRAMA" && l=="TAMIL")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Aaranya Kaandam"},
		                {"Kaatru Veliyidai",},
		                {"Super Deluxe"},
		                {"Aruvi ",},{"Pariyerum Perumal"},{"96 "},{"Aadukalam "},{" Kannathil Muthamittal "},{"Vada Chennai "},{"Kaaka Muttai "},{" Vazhakku Enn 18/9 "},{"Paruthiveeran "},{"Joker "}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ACTION" && l=="MALAYALAM")
		{
		String[] columnNames = {"Movie Name"};
        Object[][] data = {
        		 {"Pulimurugan "},
	                {"Lucifer ",},
	                {"Madura Raja"},
	                {"Kasaba ",},{"Big Brother"},{"Abrahaminte Santhathikal"},{"Villain "},{"  Oppam "},{"Masterpiece "},{"Badaami Rangarajan "},{"Janakan  "},{"Doubles "},{"Run Baby Run "}};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        table.setBounds(101, 82, 515, 212);
		frame.getContentPane().add(table);
		}else if(ge=="HORROR" && l=="MALAYALAM")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Ezra "},
		                {"Raat ",},
		                {"Oppam "},
		                {"Aakasha Ganga",},{"Bangalore Days"},{"Kali "},{"Anjaam Pathiraa"},{"The Priest  "},{"Ganagandharvan "},{"Chidambarathil Oru Appasamy "},{"Aadupuliyattam  "},{"Memories "},{"Geethanjali "}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="ADVENTURE" && l=="MALAYALAM")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Kilukkam "},
		                {"Ramji Rao Speaking",},
		                {"In Ghost House Inn "},
		                {"Minister Fatakeshto",},{"Jungle Boy "},{"Valiyavan "},{"Adventures of Omanakuttan"},{" Theevandi  "},{"Rajamanikyam "},{"Thuruppugulan "},{" Hello Dubaikkaran "},{"Vettam "},{"Thuruppu Gulan"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="COMEDY" && l=="MALAYALAM")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Meesa Madhavan"},
		                {"Kalyanaraman ",},
		                {"Manassinakkare "},
		                {"Chotta Mumbai",},{"Kilukkam "},{"Nadodikkattu "},{"Vellanakalude Nadu"},{" Hello My Dear Wrong Number  "},{"CID Moosa"},{"Udayananu Tharam "},{" Vellanakalude Nadu"},{"Kadha Parayumbol"},{"Aanaval Mothiram"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}else if(ge=="DRAMA" && l=="MALAYALAM")
		{
			String[] columnNames = {"Movie Name"};
	        Object[][] data = {
	        		 {"Drishyam "},
		                {"Maheshinte Prathikaaram",},
		                {"Bangalore Days"},
		                {"Kumbalangi Nights",},{"Premam "},{"Thondimuthalum Driksakshiyum"},{"Ustad Hotel"},{" Charlie  "},{"Munnariyippu "},{"Ee.Ma.Yau "},{"Take Off "},{"Njan Prakashan"},{"Moothon"}};
	        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(tableModel);
	        table.setBounds(101, 82, 515, 212);
			frame.getContentPane().add(table);	
		}
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.toBack();
				MainApp mv=new MainApp();
				mv.setVisible(true);
				mv.toFront();
			}
		});
		btnNewButton.setBounds(290, 345, 106, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("List of Movies");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(269, 34, 153, 34);
		frame.getContentPane().add(lblNewLabel);

        
                
	}

}
