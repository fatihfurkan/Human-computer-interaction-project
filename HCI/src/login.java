import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	int count = 0;
	private JTextField textField_4;
	private JTextField textField_5;
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 793);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(66, 101, 576, 360);
		contentPane.add(panel);
		panel.setVisible(false);
		panel.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(245, 245, 245));
		textField_2.setBounds(10, 29, 182, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(245, 245, 245));
		textField_1.setBounds(10, 77, 182, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 245, 245));
		textField.setBounds(10, 120, 182, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(245, 245, 245));
		textField_3.setBounds(10, 168, 182, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBackground(new Color(245, 245, 245));
		dateChooser.setBounds(10, 199, 182, 20);
		panel.add(dateChooser);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.setBackground(new Color(255, 255, 255));
		rdbtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnMale.setBounds(10, 254, 80, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setBackground(new Color(255, 255, 255));
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnFemale.setBounds(94, 254, 80, 23);
		panel.add(rdbtnFemale);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(245, 245, 245));
		textField_4.setColumns(10);
		textField_4.setBounds(329, 29, 182, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(245, 245, 245));
		textField_5.setColumns(10);
		textField_5.setBounds(329, 77, 182, 20);
		panel.add(textField_5);
		
		rdbtnYes = new JRadioButton("YES");
		rdbtnYes.setBackground(new Color(255, 255, 255));
		rdbtnYes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnYes.setBounds(329, 143, 64, 23);
		panel.add(rdbtnYes);
		
		rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBackground(new Color(255, 255, 255));
		rdbtnNo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNo.setBounds(429, 143, 64, 23);
		panel.add(rdbtnNo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT DISEASE", "Belly button", "Neck hernia", "Heart", "Anemia", "Arm-Leg fracture", "Blood pressure"}));
		comboBox.setBounds(329, 187, 182, 20);
		panel.add(comboBox);
		
		JLabel lblName = new JLabel("FIRST NAME");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblName.setBounds(10, 11, 109, 14);
		panel.add(lblName);
		
		JLabel lblEmal = new JLabel("EMAIL");
		lblEmal.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmal.setBounds(10, 104, 109, 14);
		panel.add(lblEmal);
		
		JLabel lblSurname = new JLabel("SURNAME");
		lblSurname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSurname.setBounds(10, 60, 109, 14);
		panel.add(lblSurname);
		
		JLabel lblNewPassword = new JLabel("NEW PASSWORD");
		lblNewPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewPassword.setBounds(10, 151, 136, 14);
		panel.add(lblNewPassword);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblGender.setBounds(10, 230, 109, 14);
		panel.add(lblGender);
		
		JLabel lblHeght = new JLabel("HEIGHT");
		lblHeght.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblHeght.setBounds(329, 11, 109, 14);
		panel.add(lblHeght);
		
		JLabel lblWeght = new JLabel("WEIGHT");
		lblWeght.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWeght.setBounds(329, 60, 109, 14);
		panel.add(lblWeght);
		
		JLabel lblDoYou = new JLabel("DO YOU HAVE ANY DISEASE?");
		lblDoYou.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDoYou.setBounds(329, 120, 200, 20);
		panel.add(lblDoYou);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(150, 285, 248, 64);
		panel.add(label_2);
		label_2.setIcon(new ImageIcon("img\\register.png"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(66, 472, 576, 255);
		contentPane.add(panel_1);
		
		panel_1.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(245, 245, 245));
		textField_6.setColumns(10);
		textField_6.setBounds(26, 74, 182, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(245, 245, 245));
		textField_7.setColumns(10);
		textField_7.setBounds(285, 74, 182, 20);
		panel_1.add(textField_7);
		
		JLabel label = new JLabel("EMAIL");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label.setBounds(26, 49, 109, 14);
		panel_1.add(label);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPassword.setBounds(285, 51, 136, 14);
		panel_1.add(lblPassword);
		
		JLabel lblHaveA = new JLabel("HAVE AN ACCOUNT?");
		lblHaveA.setForeground(new Color(0, 102, 153));
		lblHaveA.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblHaveA.setHorizontalAlignment(SwingConstants.CENTER);
		lblHaveA.setBounds(119, 0, 348, 43);
		panel_1.add(lblHaveA);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				dispose();
			}
		});
		label_3.setBounds(153, 131, 243, 83);
		panel_1.add(label_3);
		label_3.setIcon(new ImageIcon("img\\login.png"));
	
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				count++;
				if(count%2==1){
					 panel.setVisible(true);
					
				}
                 if(count%2==0){
                	 panel.setVisible(false);
                	
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setIcon(new ImageIcon("img\\create1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setIcon(new ImageIcon("img\\create.png"));
			}
		});
		label_1.setIcon(new ImageIcon("img\\create.png"));
		label_1.setBounds(86, 24, 490, 66);
		contentPane.add(label_1);
		
	
		
		
	}
}
