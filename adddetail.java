import java.awt.*;
import java.sql.*;
import java.util.logging.Level;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class adddetail extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adddetail frame = new adddetail();
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
	public adddetail() {
		setResizable(false);
		setBounds(100, 100, 1163, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setForeground(new Color(255, 255, 128));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel.setBounds(29, 128, 106, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.BOLD, 20));
		textField.setBounds(179, 129, 203, 32);
		textField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("IDNO");
		lblNewLabel_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_1.setBounds(29, 226, 106, 32);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Serif", Font.BOLD, 18));
		textField_1.setBounds(179, 228, 203, 32);
		textField_1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setForeground(new Color(255, 255, 128));
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_2.setBounds(29, 323, 106, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AGE");
		lblNewLabel_3.setForeground(new Color(255, 255, 128));
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_3.setBounds(42, 433, 106, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MAILID");
		lblNewLabel_4.setForeground(new Color(255, 255, 128));
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_4.setBounds(564, 161, 106, 32);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Serif", Font.BOLD, 16));
		textField_2.setBounds(722, 161, 245, 35);
		textField_2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("MOBNO");
		lblNewLabel_5.setForeground(new Color(255, 255, 128));
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_5.setBounds(29, 541, 119, 37);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Serif", Font.BOLD, 18));
		textField_3.setBounds(179, 545, 203, 32);
		textField_3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("JOBTITTLE");
		lblNewLabel_6.setForeground(new Color(255, 255, 128));
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_6.setBounds(564, 273, 148, 37);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Serif", Font.BOLD, 16));
		textField_4.setBounds(722, 278, 245, 33);
		textField_4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("SALARY");
		lblNewLabel_7.setForeground(new Color(255, 255, 128));
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_7.setBounds(593, 405, 119, 28);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Serif", Font.BOLD, 18));
		textField_5.setBounds(722, 405, 245, 32);
		textField_5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("EMPLOYEE DETAILS");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 46));
		lblNewLabel_8.setBounds(476, 10, 474, 66);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Serif", Font.BOLD, 18));
		textField_6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		textField_6.setBounds(179, 325, 203, 32);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Serif", Font.BOLD, 18));
		textField_7.setBounds(184, 435, 156, 37);
		textField_7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");	
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 128));
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton.setBounds(643, 553, 197, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(adddetail.class.getResource("/img/images (1).jpg")));
		lblNewLabel_9.setBounds(0, 0, 1170, 750);
		contentPane.add(lblNewLabel_9);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VIJAY","VIJAY");
			PreparedStatement ps=con.prepareStatement("Insert into EMPLOG values(?,?,?,?,?,?,?,?)");
			
			String n=textField.getText();
			String n1=textField_1.getText();
			String n2=textField_6.getText();
			String n3=textField_7.getText();
			String n4=textField_2.getText();
			String n5=textField_3.getText();
			String n6=textField_4.getText();
			String n7=textField_5.getText();
			
			textField.setText(n);
			textField_1.setText(n1);
			textField_6.setText(n2);
			textField_7.setText(n3);
			textField_2.setText(n4);
			textField_3.setText(n5);
			textField_4.setText(n6);
			textField_5.setText(n7);
			
			ps.setString(1, n);
			ps.setString(2, n1);
			ps.setString(3, n2);
			ps.setString(4, n3);
			ps.setString(5, n4);
			ps.setString(6, n5);
			ps.setString(7, n6);
			ps.setString(8, n7);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(contentPane,"INSERT SUCCESS");
			
			textField.setText(" ");
			textField_1.setText(" ");
			textField_6.setText(" ");
			textField_7.setText(" ");
			textField_2.setText(" ");
			textField_3.setText(" ");
			textField_4.setText(" ");
			textField_5.setText(" ");
		} catch (Exception e1) {}
			}
		});

	
	}
}
