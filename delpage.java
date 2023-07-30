import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class delpage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delpage frame = new delpage();
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
	public delpage() {
		setResizable(false);
		setBounds(100, 100, 957, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DELETE EMPLOYEE DETAILS");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 24));
		lblNewLabel.setBounds(288, 24, 394, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER EMPLOYYE IDNO TO DELETE ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_2.setBounds(118, 147, 394, 65);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.BOLD, 24));
		textField.setBackground(new Color(255, 255, 255));
		textField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		textField.setBounds(191, 213, 215, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 26));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(521, 398, 247, 65);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(delpage.class.getResource("/img/istockphoto-1435226158-612x612.jpg")));
		lblNewLabel_1.setBounds(0, 0, 933, 617);
		contentPane.add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VIJAY","VIJAY");
			PreparedStatement ps1=con1.prepareStatement("Delete EMPLOG where IDNO=?");
			String z=textField.getText();
			textField.setText(z);
			ps1.setString(1,z);
			ps1.executeUpdate();
			JOptionPane.showMessageDialog(contentPane,"DELETE SUCCESS");
			textField.setText(" ");
		} catch (Exception e1) {
		
		}

			}});
	}
}
