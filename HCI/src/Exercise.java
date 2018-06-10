import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise frame = new Exercise();
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
	public Exercise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 758);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Settings");
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setIcon(new ImageIcon("img\\Settings_32.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(166, 39, 110, 110);
		contentPane.add(btnNewButton);
		
		JButton btnPhotosVdeos = new JButton("PHOTO&VIDEO");
		btnPhotosVdeos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Photovideo n = new Photovideo();
				n.setVisible(true);
				dispose();
			}
		});
		btnPhotosVdeos.setIcon(new ImageIcon("img\\Camera_48.png"));
		btnPhotosVdeos.setFont(new Font("Times New Roman", Font.BOLD, 8));
		btnPhotosVdeos.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPhotosVdeos.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPhotosVdeos.setBounds(282, 39, 110, 110);
		contentPane.add(btnPhotosVdeos);
		
		JButton btnDalyActvtes = new JButton("DAILY ACTIVITY");
		btnDalyActvtes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise n = new Exercise();
				n.setVisible(true);
				dispose();
			}
		});
		btnDalyActvtes.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDalyActvtes.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDalyActvtes.setIcon(new ImageIcon("img\\Tear_Off_Calendar_48.png"));
		btnDalyActvtes.setFont(new Font("Times New Roman", Font.BOLD, 8));
		btnDalyActvtes.setBounds(402, 39, 110, 110);
		contentPane.add(btnDalyActvtes);
		
		JButton btnNurton = new JButton("NURITION");
		btnNurton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nutrition n = new Nutrition();
				n.setVisible(true);
				dispose();
			}
		});
		btnNurton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNurton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNurton.setIcon(new ImageIcon("img\\Beer_Can_48.png"));
		btnNurton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNurton.setBounds(522, 39, 110, 110);
		contentPane.add(btnNurton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ADD EXERCISE", "ACTIVE", "PASSIVE"}));
		comboBox.setBounds(224, 191, 326, 41);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 245, 245));
		textField.setBounds(224, 268, 326, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSetNumbermnutes = new JLabel("SET NUMBER/MINUTES");
		lblSetNumbermnutes.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSetNumbermnutes.setBounds(224, 243, 260, 14);
		contentPane.add(lblSetNumbermnutes);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ADD OPTIONS", "AEROBIC", "CARDIO", "FITNESS", "ZUMBA", "GYM"}));
		comboBox_1.setBounds(224, 313, 326, 41);
		contentPane.add(comboBox_1);
		
		JLabel label = new JLabel("SET NUMBER/MINUTES");
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label.setBounds(224, 365, 260, 14);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(245, 245, 245));
		textField_1.setColumns(10);
		textField_1.setBounds(224, 388, 326, 34);
		contentPane.add(textField_1);
		
		JLabel lblCalculate = new JLabel("CALCULATE OF THE CALORIES BURNED");
		lblCalculate.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCalculate.setBounds(208, 549, 376, 48);
		contentPane.add(lblCalculate);
		
		JLabel lblCal = new JLabel("512 CAL");
		lblCal.setForeground(new Color(148, 0, 211));
		lblCal.setFont(new Font("Times New Roman", Font.BOLD, 37));
		lblCal.setBounds(323, 596, 167, 48);
		contentPane.add(lblCal);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("img\\save.png"));
		label_1.setBounds(224, 450, 154, 62);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("img\\cancel.png"));
		label_2.setBounds(416, 450, 184, 55);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				label_3.setIcon(new ImageIcon("img\\Geometry_40px.png"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setIcon(new ImageIcon("img\\Geometry1_48px.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				dispose();
			}
		});
		label_3.setIcon(new ImageIcon("img\\Geometry_40px.png"));
		label_3.setBounds(23, 65, 46, 62);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				label_4.setIcon(new ImageIcon("img\\Undo_52px.png"));
				}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_4.setIcon(new ImageIcon("img\\Undo1_52px.png"));		
				}
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				dispose();
			}
		});
		label_4.setIcon(new ImageIcon("img\\Undo_52px.png"));
		label_4.setBounds(10, 11, 80, 48);
		contentPane.add(label_4);
	}
}
