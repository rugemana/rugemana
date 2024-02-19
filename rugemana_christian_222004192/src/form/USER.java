package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetInternalMethods;
import com.mysql.cj.xdevapi.Table;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class USER extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nametxf;
	private JTextField emailtxf;
	private JTextField roletxf;
	private JTextField addresstxf;
	private JTextField gendertxf;
	private JTextField passwordtxf;
	private JTextField compasstxf;
	private JTextField idtxf;
	private JTable table;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					USER frame = new USER();
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
	public USER() {
		setTitle("USERS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 86, 72, 29);
		contentPane.add(lblNewLabel);
		
		nametxf = new JTextField();
		nametxf.setBounds(150, 92, 152, 20);
		contentPane.add(nametxf);
		nametxf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(16, 148, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		emailtxf = new JTextField();
		emailtxf.setBounds(150, 147, 152, 20);
		contentPane.add(emailtxf);
		emailtxf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ROLE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(25, 196, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		roletxf = new JTextField();
		roletxf.setBounds(150, 195, 152, 20);
		contentPane.add(roletxf);
		roletxf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ADDRESS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(22, 245, 96, 20);
		contentPane.add(lblNewLabel_3);
		
		addresstxf = new JTextField();
		addresstxf.setBounds(150, 247, 152, 20);
		contentPane.add(addresstxf);
		addresstxf.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(22, 292, 96, 14);
		contentPane.add(lblNewLabel_4);
		
		gendertxf = new JTextField();
		gendertxf.setBounds(150, 291, 152, 20);
		contentPane.add(gendertxf);
		gendertxf.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("PASSWORD");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(16, 344, 109, 14);
		contentPane.add(lblNewLabel_5);
		
		passwordtxf = new JTextField();
		passwordtxf.setBounds(150, 343, 152, 20);
		contentPane.add(passwordtxf);
		passwordtxf.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 393, 171, 14);
		contentPane.add(lblNewLabel_6);
		
		compasstxf = new JTextField();
		compasstxf.setBounds(191, 392, 149, 20);
		contentPane.add(compasstxf);
		compasstxf.setColumns(10);
		
		 
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			idtxf.setText(null);	
			nametxf.setText(null);
			emailtxf.setText(null);
			roletxf.setText(null);
			addresstxf.setText(null);
			gendertxf.setText(null);
			passwordtxf.setText(null);
			compasstxf.setText(null);
				
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(597, 465, 89, 36);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("WELCOME TO USER PROFILE");
		lblNewLabel_7.setBackground(new Color(128, 0, 0));
		lblNewLabel_7.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblNewLabel_7.setBounds(180, 11, 304, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel idlb = new JLabel("ID");
		idlb.setFont(new Font("Tahoma", Font.BOLD, 18));
		idlb.setBounds(24, 44, 80, 29);
		contentPane.add(idlb);
		
		idtxf = new JTextField();
		idtxf.setColumns(10);
		idtxf.setBounds(150, 50, 149, 20);
		contentPane.add(idtxf);
		
		JButton viewbtn = new JButton("VIEW");
		viewbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  
				
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_device_tracker_system","root","");
				java.sql.Statement st=con.createStatement();
				String query="SELECT * FROM account";
				ResultSet rs=st.executeQuery(query);
				java.sql.ResultSetMetaData rsdm=rs.getMetaData();
				DefaultTableModel model=(DefaultTableModel)table_2.getModel();
				int cols=rsdm.getColumnCount();
				String[]colName=new String[cols];
				for(int i=0;i<cols;i++)
				colName[i]=rsdm.getColumnName(i+1);
				model.setColumnIdentifiers(colName);
				String ID,NAME,EMAIL,ROLE,ADDRESS,GENDER,PASSWORD,CONFIRM_PASSWORD;
				while(rs.next()) {
					ID=rs.getString(1);
					NAME=rs.getString(2);
					EMAIL=rs.getString(3);
					ROLE=rs.getString(4);
					ADDRESS=rs.getString(5);
					GENDER=rs.getString(6);
					PASSWORD=rs.getString(7);
					CONFIRM_PASSWORD=rs.getString(8);
					String[]row= {ID,NAME,EMAIL,ROLE,ADDRESS,GENDER,PASSWORD,CONFIRM_PASSWORD};	
					model.addRow(row);
					
							
				}
				
				
			}catch (Exception e2) {
				// TODO: handle exception
			}
				
			
			}

			
		});
		viewbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		viewbtn.setBounds(54, 465, 89, 36);
		contentPane.add(viewbtn);
		
		JButton btnNewButton_5 = new JButton("UPDATE");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_device_tracker_system","root","");
String sql="UPDATE account SET name=?,email=?,role=?,address=?,gender=?,password=?,confirm_password=? WHERE id=?";					
PreparedStatement st=con.prepareStatement(sql);

st.setString(1,nametxf.getText());
st.setString(2, emailtxf.getText());
st.setString(3, addresstxf.getText());
st.setString(4, roletxf.getText());
st.setString(5, gendertxf.getText());
st.setString(6,passwordtxf.getText() );
st.setString(7,compasstxf.getText() );					
st.setInt(8, Integer.parseInt(idtxf.getText()));					
					
					
JOptionPane.showMessageDialog(btnNewButton_5, "data changed!!!");
st.executeUpdate();
st.close();
con.close();
					
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
				
				
			}
		});
		btnNewButton_5.setBounds(398, 465, 111, 36);
		contentPane.add(btnNewButton_5);
		
		JButton deletebtn = new JButton("DELETE");
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_device_tracker_system","root","");	
				String sql="DELETE FROM account WHERE  id=?";
				int idtxf=Integer.parseInt(JOptionPane.showInputDialog("Enter ID  to delete ")); 
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1, idtxf);
				Component Delete;
				JOptionPane.showMessageDialog(deletebtn, "recored out!!");
				st.executeUpdate();
				st.close();
				con.close();
				
				
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}	
				
			}
		});
		deletebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		deletebtn.setBounds(223, 465, 89, 36);
		contentPane.add(deletebtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(312, 49, 397, 337);
		contentPane.add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		
		
	}

	protected PreparedStatement setInt(int i, int idtxf2) {
		// TODO Auto-generated method stub
		return null;
	}
}
