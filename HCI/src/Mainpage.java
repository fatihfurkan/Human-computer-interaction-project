import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import com.toedter.calendar.JDateChooser;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mainpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage frame = new Mainpage();
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
	public Mainpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 786);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setBounds(439, 28, 43, 32);
		label.setIcon(new ImageIcon("img\\Search_32.png"));
		
		txtSearch = new JTextField();
		txtSearch.setBounds(74, 28, 408, 32);
		txtSearch.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtSearch.setText("SEARCH");
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("CHOOSE ACTIVE/PASSIVE");
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ActivePassive a = new ActivePassive();
				a.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(new Color(204, 51, 51));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(new Color(51, 51, 51));
			}
		});
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setBounds(74, 71, 410, 66);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBorder(new LineBorder(new Color(0, 139, 139), 5, true));
		
		JLabel lblRequ = new JLabel("REQUIRED CALORIES PER DAY");
		lblRequ.setBackground(new Color(220, 220, 220));
		lblRequ.setBounds(74, 148, 408, 66);
		lblRequ.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRequ.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequ.setVerticalAlignment(SwingConstants.TOP);
		lblRequ.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblDalyTakenCalores = new JLabel("DAILY TAKEN CALORIES");
		lblDalyTakenCalores.setBounds(74, 225, 408, 66);
		lblDalyTakenCalores.setVerticalAlignment(SwingConstants.TOP);
		lblDalyTakenCalores.setHorizontalAlignment(SwingConstants.CENTER);
		lblDalyTakenCalores.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDalyTakenCalores.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JButton btnNewButton_1 = new JButton("NUTRITION");
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setVerticalTextPosition(SwingConstants.TOP);
		btnNewButton_1.setIcon(new ImageIcon("img\\Hamburger_32.png"));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Nutrition n = new Nutrition();
				n.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setForeground(new Color(204, 51, 51));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setForeground(new Color(138, 43, 226));
			}
		});
		btnNewButton_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		btnNewButton_1.setBackground(new Color(220, 220, 220));
		btnNewButton_1.setBounds(74, 302, 195, 147);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setForeground(new Color(138, 43, 226));
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(txtSearch);
		contentPane.add(btnNewButton);
		contentPane.add(lblRequ);
		contentPane.add(lblDalyTakenCalores);
		contentPane.add(btnNewButton_1);
		
		JButton btnDaly = new JButton("DAILY ACTIVITIES");
		btnDaly.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnDaly.setForeground(new Color(255, 140, 0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDaly.setForeground(new Color(204, 51, 51));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Exercise ex = new Exercise();
				ex.setVisible(true);
				dispose();
			}
		});
		btnDaly.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDaly.setVerticalTextPosition(SwingConstants.TOP);
		btnDaly.setIcon(new ImageIcon("img\\Exercise_32.png"));
		btnDaly.setToolTipText("");
		btnDaly.setBackground(new Color(220, 220, 220));
		btnDaly.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		btnDaly.setForeground(new Color(255, 140, 0));
		btnDaly.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnDaly.setBounds(287, 302, 195, 147);
		contentPane.add(btnDaly);
		
		JButton btnPhotos = new JButton("PHOTOS&VIDEOS");
		btnPhotos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Photovideo p = new Photovideo();
				p.setVisible(true);
			dispose(); 
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPhotos.setForeground(new Color(204, 51, 51));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPhotos.setForeground(new Color(60, 179, 113));
			}
		});
		btnPhotos.setIcon(new ImageIcon("img\\Gallery_32.png"));
		btnPhotos.setVerticalTextPosition(SwingConstants.TOP);
		btnPhotos.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPhotos.setBackground(new Color(220, 220, 220));
		btnPhotos.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		btnPhotos.setForeground(new Color(60, 179, 113));
		btnPhotos.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPhotos.setBounds(74, 460, 195, 147);
		contentPane.add(btnPhotos);
		
		JButton button = new JButton("SETTINGS");
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setVerticalTextPosition(SwingConstants.TOP);
		button.setIcon(new ImageIcon("img\\Settings_32.png"));
		button.setBackground(new Color(220, 220, 220));
		button.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(new Color(65, 105, 225));
		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button.setBounds(287, 460, 195, 147);
		contentPane.add(button);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(74, 618, 408, 32);
		contentPane.add(dateChooser);
		
		JLabel lblCal = new JLabel("2341 cal");
		lblCal.setForeground(new Color(220, 20, 60));
		lblCal.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblCal.setBounds(229, 158, 122, 66);
		contentPane.add(lblCal);
		
		JLabel lblCal_1 = new JLabel("782 cal");
		lblCal_1.setForeground(new Color(220, 20, 60));
		lblCal_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblCal_1.setBounds(239, 235, 87, 66);
		contentPane.add(lblCal_1);
	}
}
