import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.CompoundBorder;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.DebugGraphics;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;

public class Nutrition extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nutrition frame = new Nutrition();
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
	public Nutrition() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 962, 810);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTotalcalCarbohydrateFat = new JLabel("    Total(cal)                 Carbohydrate                   Fat                      Protein");
		lblTotalcalCarbohydrateFat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTotalcalCarbohydrateFat.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotalcalCarbohydrateFat.setBounds(174, 139, 493, 52);
		contentPane.add(lblTotalcalCarbohydrateFat);
		
		JLabel label = new JLabel("     1345                             834                            387                        212");
		label.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label.setBorder(new LineBorder(new Color(0, 0, 0)));
		label.setBounds(174, 189, 493, 52);
		contentPane.add(label);
		
		JLabel lblBreakfast = new JLabel("      Breakfast");
		lblBreakfast.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblBreakfast.setBorder(new LineBorder(new Color(186, 85, 211)));
		lblBreakfast.setBounds(87, 288, 112, 35);
		contentPane.add(lblBreakfast);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("img\\Cheese_48.png"));
		label_1.setBounds(209, 274, 73, 50);
		contentPane.add(label_1);
		
		JLabel lblLunch = new JLabel("        Lunch");
		lblLunch.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblLunch.setBorder(new LineBorder(new Color(186, 85, 211)));
		lblLunch.setBounds(318, 288, 112, 35);
		contentPane.add(lblLunch);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("img\\Thanksgiving_48.png"));
		label_2.setBounds(440, 274, 73, 52);
		contentPane.add(label_2);
		
		JLabel lblDinner = new JLabel("        Dinner");
		lblDinner.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblDinner.setBorder(new LineBorder(new Color(186, 85, 211)));
		lblDinner.setBounds(555, 288, 112, 35);
		contentPane.add(lblDinner);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("img\\Fish_Food_48.png"));
		label_3.setBounds(677, 274, 81, 61);
		contentPane.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Meal", "Egg", "Cheese", "Olive"}));
		comboBox.setBounds(87, 334, 164, 35);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose Meal", "Soup", "Salad", "Chicken"}));
		comboBox_1.setBounds(318, 334, 164, 35);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Choose Meal", "Steak", "Fish", "Macaroni"}));
		comboBox_2.setBounds(555, 334, 164, 35);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(null);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel.setIcon(new ImageIcon("img\\a1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setIcon(new ImageIcon("img\\a.png"));
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("img\\a.png"));
		lblNewLabel.setBounds(10, 437, 73, 73);
		contentPane.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_4.setIcon(new ImageIcon("img\\f1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_4.setIcon(new ImageIcon("img\\f.png"));
			}
		});
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setIcon(new ImageIcon("img\\f.png"));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(93, 451, 73, 73);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_5.setIcon(new ImageIcon("img\\I1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_5.setIcon(new ImageIcon("img\\I.png"));
			}
		});
		label_5.setIcon(new ImageIcon("img\\I.png"));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(259, 511, 73, 73);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_6.setIcon(new ImageIcon("img\\l1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_6.setIcon(new ImageIcon("img\\l.png"));
			}
		});
		label_6.setIcon(new ImageIcon("img\\l.png"));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(176, 469, 73, 73);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_7.setIcon(new ImageIcon("img\\p1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_7.setIcon(new ImageIcon("img\\p.png"));
			}
		});
		label_7.setIcon(new ImageIcon("img\\p.png"));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(342, 563, 73, 73);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_8.setIcon(new ImageIcon("img\\s1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_8.setIcon(new ImageIcon("img\\s.png"));
			}
		});
		label_8.setIcon(new ImageIcon("img\\s.png"));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(404, 618, 73, 73);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_9.setIcon(new ImageIcon("img\\u1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_9.setIcon(new ImageIcon("img\\u.png"));
			}
		});
		label_9.setIcon(new ImageIcon("img\\u.png"));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(428, 687, 73, 73);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("img\\images.jpg"));
		label_10.setBounds(534, 469, 239, 178);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setBorder(new LineBorder(new Color(173, 255, 47), 32));
		label_11.setBackground(new Color(127, 255, 0));
		label_11.setBounds(783, 497, 24, 25);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setBorder(new LineBorder(new Color(0, 191, 255), 29));
		label_12.setBounds(783, 533, 24, 25);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setBorder(new LineBorder(new Color(255, 215, 0), 29));
		label_13.setBounds(783, 569, 24, 25);
		contentPane.add(label_13);
		
		JLabel lblCarbohydrate = new JLabel("Carbohydrate");
		lblCarbohydrate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCarbohydrate.setBounds(818, 496, 112, 28);
		contentPane.add(lblCarbohydrate);
		
		JLabel lblFat = new JLabel("Fat");
		lblFat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFat.setBounds(817, 533, 112, 28);
		contentPane.add(lblFat);
		
		JLabel lblProtein = new JLabel("Protein");
		lblProtein.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblProtein.setBounds(818, 566, 112, 28);
		contentPane.add(lblProtein);
		
		JLabel lblSneakMeal = new JLabel("Sneak Meal");
		lblSneakMeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSneakMeal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblSneakMeal.setBorder(new LineBorder(new Color(186, 85, 211)));
		lblSneakMeal.setBounds(21, 570, 178, 52);
		contentPane.add(lblSneakMeal);
		
		JLabel label_14 = new JLabel("");
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_14.setIcon(new ImageIcon("img\\add1.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_14.setIcon(new ImageIcon("img\\add.png"));
			}
		});
		label_14.setIcon(new ImageIcon("img\\add.png"));
		label_14.setBounds(50, 633, 105, 102);
		contentPane.add(label_14);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Service Size", "0.5 oz", "1 oz", "1.5 oz", "2 oz"}));
		comboBox_3.setBounds(87, 392, 164, 25);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Service Size", "0.5 oz", "1 oz", "1.5 oz", "2 oz"}));
		comboBox_4.setBounds(318, 394, 164, 25);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Service Size", "0.5 oz", "1 oz", "1.5 oz", "2 oz"}));
		comboBox_5.setBounds(560, 394, 164, 25);
		contentPane.add(comboBox_5);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("img\\Back_26px.png"));
		label_15.setBounds(231, 81, 58, 47);
		contentPane.add(label_15);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("img\\Chevron Right_26px.png"));
		lblNewLabel_1.setBounds(567, 81, 67, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Wed, April 1");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(359, 95, 177, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("img\\Pizza_48px.png"));
		label_16.setBounds(208, 563, 81, 61);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_17.setIcon(new ImageIcon("img\\Undo1_52px.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_17.setIcon(new ImageIcon("img\\Undo_52px.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				dispose();
			}
		});
		label_17.setIcon(new ImageIcon("img\\Undo_52px.png"));
		label_17.setBounds(21, 11, 58, 52);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_18.setIcon(new ImageIcon("img\\cubes1.png"));			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_18.setIcon(new ImageIcon("img\\cubes.png"));			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage mp = new Mainpage();
				mp.setVisible(true);
				dispose();
			}
		});
		label_18.setIcon(new ImageIcon("img\\cubes.png"));
		label_18.setBounds(10, 81, 81, 61);
		contentPane.add(label_18);
	
	
	}
}
