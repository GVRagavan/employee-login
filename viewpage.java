import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class viewpage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewpage frame = new viewpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throwsClassNotFoundException 
	 */
	public viewpage() throws ClassNotFoundException, SQLException {
		setResizable(false);
		setBounds(100, 100, 1177, 768);
		contentPane = new JPanel();
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 643, 1039, -606);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("SHOWDATA");
		btnNewButton.setBackground(new Color(254, 243, 35));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(46, 86, 191, 48);
		contentPane.add(btnNewButton);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(273, 86, 800, 600);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setFont(new Font("Serif", Font.BOLD, 12));
		
		btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBackground(new Color(254, 243, 35));
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(new DefaultTableModel());
			}
		});
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 25));
		btnNewButton_1.setBounds(62, 436, 156, 48);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setIcon(new ImageIcon(viewpage.class.getResource("/img/flat-comic-style-background_23-2148882944.jpg")));
		lblNewLabel.setBounds(0, 0, 1175, 763);
		contentPane.add(lblNewLabel);
	
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VIJAY","VIJAY");
				Statement st=con.createStatement();
				String query="Select * from EMPLOG";
				ResultSet rs=st.executeQuery(query);
				
				ResultSetMetaData rsmd=rs.getMetaData();
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int col=rsmd.getColumnCount();
				String[] colname=new String[col];
				for(int i=0;i<col;i++) {
					colname[i]=rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colname);
					String name,idno,gender,age,mail,mob,job,salary;
					while(rs.next()) {
						name=rs.getString(1);
						idno=rs.getString(2);
						gender=rs.getString(3);
						age=rs.getString(4);
						mail=rs.getString(5);
						mob=rs.getString(6);
						job=rs.getString(7);
						salary=rs.getString(8);
						
						String []row= {name,idno,gender,age,mail,mob,job,salary};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				
			}
		
			
			
		}});
		
		
		
	}
}
