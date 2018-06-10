import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Photovideo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Photovideo frame = new Photovideo();
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
	public Photovideo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 691);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Settings");
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setIcon(new ImageIcon("img\\Settings_32.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(129, 38, 110, 110);
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
		btnPhotosVdeos.setFont(new Font("Times New Roman", Font.BOLD, 9));
		btnPhotosVdeos.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPhotosVdeos.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPhotosVdeos.setBounds(249, 38, 110, 110);
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
		btnDalyActvtes.setBounds(369, 38, 110, 110);
		contentPane.add(btnDalyActvtes);
		
		JButton btnNurton = new JButton("NURITION");
		btnNurton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Nutrition n = new Nutrition();
				n.setVisible(true);
				dispose();
			}
		});
		btnNurton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNurton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNurton.setIcon(new ImageIcon("img\\Beer_Can_48.png"));
		btnNurton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNurton.setBounds(489, 38, 110, 110);
		contentPane.add(btnNurton);
		
		JButton btnVideos = new JButton("Videos");
		btnVideos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video v = new video();
				v.setVisible(true);
				dispose();		
			}
		});
		btnVideos.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnVideos.setBackground(Color.WHITE);
		btnVideos.setBounds(284, 269, 64, 26);
		contentPane.add(btnVideos);
		
		JButton btnPhotos = new JButton("Photos");
		btnPhotos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video v = new video();
				v.setVisible(true);
				dispose();	
			}
		});
		btnPhotos.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPhotos.setBackground(Color.WHITE);
		btnPhotos.setBounds(380, 269, 64, 26);
		contentPane.add(btnPhotos);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("img\\run.png"));
		label_1.setBounds(129, 209, 400, 108);
		contentPane.add(label_1);
		
		JButton button = new JButton("Videos");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video v = new video();
				v.setVisible(true);
				dispose();	
			}
		});
		button.setBorder(new LineBorder(new Color(0, 0, 0)));
		button.setBackground(Color.WHITE);
		button.setBounds(284, 380, 64, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Videos");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video v = new video();
				v.setVisible(true);
				dispose();	
			}
		});
		button_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(284, 477, 64, 26);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Videos");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video v = new video();
				v.setVisible(true);
				dispose();	
			}
		});
		button_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(284, 574, 64, 26);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Photos");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video v = new video();
				v.setVisible(true);
				dispose();	
			}
		});
		button_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(380, 380, 64, 26);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Photos");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video v = new video();
				v.setVisible(true);
				dispose();	
			}
		});
		button_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(380, 477, 64, 26);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Photos");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				video v = new video();
				v.setVisible(true);
				dispose();	
				}
		});
		button_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(380, 574, 64, 26);
		contentPane.add(button_5);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img\\str.png"));
		label.setBounds(129, 328, 392, 95);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("img\\cardio.png"));
		label_2.setBounds(129, 434, 448, 80);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("img\\zumba.png"));
		label_3.setBounds(129, 525, 412, 95);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				label_4.setIcon(new ImageIcon("img\\Mesh_50px.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage m = new Mainpage();
				m.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_4.setIcon(new ImageIcon("img\\Mesh1_50px.png"));
			}
		});
		label_4.setIcon(new ImageIcon("img\\Mesh_50px.png"));
		label_4.setBounds(27, 86, 50, 58);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				label_5.setIcon(new ImageIcon("img\\Undo_52px.png"));
				}
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage m = new Mainpage();
				m.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_5.setIcon(new ImageIcon("img\\Undo1_52px.png"));		
				}
		});
		label_5.setIcon(new ImageIcon("img\\Undo_52px.png"));
		label_5.setBounds(27, 11, 52, 52);
		contentPane.add(label_5);
	
	}
}
