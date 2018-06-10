import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActivePassive extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActivePassive frame = new ActivePassive();
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
	public ActivePassive() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 790);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO ByFitnessTime");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(127, 28, 548, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DEAR USER");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(115, 105, 298, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblWeAreVery = new JLabel("We are very happy to see you among us...");
		lblWeAreVery.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblWeAreVery.setBounds(115, 138, 298, 22);
		contentPane.add(lblWeAreVery);
		
		JLabel lblAreYouPassve = new JLabel("ARE YOU PASSIVE OR ACTIVE FOR SPORTS?");
		lblAreYouPassve.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAreYouPassve.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblAreYouPassve.setBounds(115, 180, 541, 22);
		contentPane.add(lblAreYouPassve);
		
		JLabel lblPleaseClickPassive = new JLabel("Please click passive if you are new to sports.");
		lblPleaseClickPassive.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPleaseClickPassive.setBounds(115, 223, 298, 22);
		contentPane.add(lblPleaseClickPassive);
		
		JRadioButton rdbtnActve = new JRadioButton("ACTIVE");
		rdbtnActve.setBackground(new Color(255, 255, 255));
		rdbtnActve.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rdbtnActve.setBounds(115, 271, 109, 23);
		contentPane.add(rdbtnActve);
		
		JRadioButton rdbtnPassve = new JRadioButton("PASSIVE");
		rdbtnPassve.setBackground(new Color(255, 255, 255));
		rdbtnPassve.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rdbtnPassve.setBounds(277, 271, 109, 23);
		contentPane.add(rdbtnPassve);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img\\Lock_48px.png"));
		label.setBounds(514, 340, 82, 66);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("img\\Lock_48px.png"));
		label_1.setBounds(343, 340, 56, 66);
		contentPane.add(label_1);
		
		table = new JTable();
		table.setBackground(new Color(245, 245, 245));
		table.setForeground(Color.BLACK);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setEnabled(false);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1st STEP", "2nd STEP", "3rd STEP"},
				{"Walk", null, null},
				{"Run", null, null},
				{"Jump", null, null},
				{"Jump rope", null, null},
				{"Sit-up", null, null},
				{"Dumbell side", null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(117, 301, 519, 160);
		contentPane.add(table);
		
		JLabel lblafterTheCurrent = new JLabel("(After the current step is completed.)");
		lblafterTheCurrent.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblafterTheCurrent.setBounds(115, 487, 298, 22);
		contentPane.add(lblafterTheCurrent);
		
		JLabel lblYouCanGo = new JLabel("You can go to the next step");
		lblYouCanGo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblYouCanGo.setBounds(115, 504, 241, 38);
		contentPane.add(lblYouCanGo);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage m = new Mainpage();
				m.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_2.setIcon(new ImageIcon("img\\Rubik's Cube1_50px.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_2.setIcon(new ImageIcon("img\\Rubik's Cube_50px.png"));
			}
		});
		label_2.setIcon(new ImageIcon("img\\Rubik's Cube_50px.png"));
		label_2.setBounds(9, 73, 50, 66);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage m = new Mainpage();
				m.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setIcon(new ImageIcon("img\\Undo1_52px.png"));			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_3.setIcon(new ImageIcon("img\\Undo_52px.png"));			}
		});
		label_3.setIcon(new ImageIcon("img\\Undo_52px.png"));
		label_3.setBounds(9, 0, 56, 52);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("img\\continue.png"));
		label_4.setBounds(137, 577, 548, 79);
		contentPane.add(label_4);
	}
}
