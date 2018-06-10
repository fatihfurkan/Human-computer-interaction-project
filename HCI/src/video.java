import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class video extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					video frame = new video();
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
	public video() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 718);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img\\video.png"));
		label.setBounds(139, 295, 705, 354);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("img\\photo.png"));
		label_1.setBounds(137, 54, 384, 240);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("img\\photo.png"));
		label_2.setBounds(492, 54, 328, 240);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Photovideo p = new Photovideo();
				p.setVisible(true);
				dispose();
						
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setIcon(new ImageIcon("img\\Undo1_52px.png"));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_3.setIcon(new ImageIcon("img\\Undo_52px.png"));

			}
		});
		label_3.setIcon(new ImageIcon("img\\Undo_52px.png"));
		label_3.setBounds(10, 0, 66, 74);
		contentPane.add(label_3);
		
		JLabel lblPhotosVdeos = new JLabel("PHOTOS & VIDEOS");
		lblPhotosVdeos.setFont(new Font("Segoe Print", Font.BOLD, 32));
		lblPhotosVdeos.setForeground(new Color(204, 0, 102));
		lblPhotosVdeos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhotosVdeos.setBounds(217, 11, 528, 46);
		contentPane.add(lblPhotosVdeos);
	}
}
