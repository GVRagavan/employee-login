import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Mywindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mywindow frame = new Mywindow();
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
	public Mywindow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145,720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 6));
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE LOGIN");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblNewLabel_1.setBounds(407, 91, 320, 70);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("ADD DETAILS");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 189, 104));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adddetail ad=new adddetail();
				ad.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton.setBounds(47, 181, 203, 63);
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIEW DETAILS");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(153, 189, 104));
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					viewpage vp=new viewpage();
					vp.setVisible(true);
				} catch (Exception e1) {
					
				
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton_1.setBounds(47, 490, 203, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBackground(new Color(153, 189, 104));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delpage dp=new delpage();
				dp.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton_2.setBounds(820, 480, 203, 58);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("UPDATE");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setBackground(new Color(153, 189, 104));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateframe uf=new updateframe();
				uf.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton_3.setBounds(820, 181, 203, 63);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Mywindow.class.getResource("/img/welcome-icon-welcome-website-button-on-green-low-poly-background-HRNYMR.jpg")));
		lblNewLabel.setBounds(0, 0, 1140, 720);
		contentPane.add(lblNewLabel);
	}
}
