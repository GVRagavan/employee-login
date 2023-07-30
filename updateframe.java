import java.awt.EventQueue;
import java.util.*; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;

public class updateframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateframe frame = new updateframe();
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
	public updateframe() {
		setResizable(false);
		setBounds(100, 100, 1170, 758);
		contentPane = new JPanel();
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATE DETAILS");
		lblNewLabel.setForeground(new Color(128, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 26));
		lblNewLabel.setBounds(469, 10, 265, 75);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\wwevi\\Downloads\\EDIT.png"));
		lblNewLabel_2.setBounds(1150, 350, 390, 370);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.BOLD, 18));
		textField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		textField.setBounds(153, 222, 210, 56);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NEW MOBNO");
		lblNewLabel_3.setForeground(new Color(128, 255, 255));
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_3.setBounds(62, 407, 145, 56);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Serif", Font.BOLD, 18));
		textField_1.setBounds(243, 415, 297, 42);
		textField_1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NEW MAILID");
		lblNewLabel_4.setForeground(new Color(128, 255, 255));
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_4.setBounds(49, 510, 140, 42);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Serif", Font.BOLD, 18));
		textField_2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		textField_2.setBounds(243, 510, 297, 41);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setForeground(new Color(255, 128, 0));
		btnNewButton.setBackground(new Color(0, 0, 160));
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton.setBounds(810, 486, 210, 66);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("ENTER EMPLOYEE IDNO TO UPDATE");
		lblNewLabel_5.setForeground(new Color(128, 255, 255));
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 24));
		lblNewLabel_5.setBounds(49, 137, 454, 75);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("NEW POSITION");
		lblNewLabel_6.setForeground(new Color(128, 255, 255));
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_6.setBounds(36, 595, 180, 42);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Serif", Font.BOLD, 18));
		textField_3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		textField_3.setBounds(243, 597, 297, 42);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(updateframe.class.getResource("/img/dark-memphis-geometric-shapes-background_23-2148362571.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1170, 760);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VIJAY","VIJAY");
					PreparedStatement ps=con.prepareStatement("Update EMPLOG set MOBNO=?,MAILID=?,JOBTITTLE=? where IDNO=?");
					String m=textField_1.getText();
				   String m1=textField_2.getText();
				   String m2=textField_3.getText();
				   String m0=textField.getText();
				   
				   textField.setText(m0);
				   textField_1.setText(m);
				   textField_2.setText(m1);
				   textField_3.setText(m2);
				   
				   ps.setString(1, m);
				   ps.setString(2, m1);
				   ps.setString(3, m2);
				   ps.setString(4, m0);
				   ps.executeUpdate();
				   
				   JOptionPane.showMessageDialog(contentPane,"UPDATE SUCCESSFULLY");
				   
				   textField.setText(" ");
				   textField_1.setText(" ");
				   textField_2.setText(" ");
				   textField_3.setText(" ");
				} catch (Exception e1) {
					
					
					
				}
			}});
		
	}
}
