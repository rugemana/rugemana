package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel controlpane;
	private JTextField nametxf;
	private JTextField typetxf;
	private JTextField serialtxf;
	private JTextField modeltxf;
	private JTextField manufacturetxf;
	private JTextField statustxf;
	private JTextField idtxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration frame = new registration();
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
	public registration() {
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Dialog", Font.BOLD, 16));
		setBackground(new Color(0, 0, 0));
		setTitle("DEVICES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 515);
		controlpane = new JPanel();
		controlpane.setFont(new Font("Tahoma", Font.BOLD, 14));
		controlpane.setForeground(new Color(255, 255, 255));
		controlpane.setBackground(new Color(64, 128, 128));
		controlpane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(controlpane);
		controlpane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(27, 77, 67, 14);
		controlpane.add(lblNewLabel);
		
		nametxf = new JTextField();
		nametxf.setBounds(200, 88, 119, 20);
		controlpane.add(nametxf);
		nametxf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TYPE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(27, 118, 67, 24);
		controlpane.add(lblNewLabel_2);
		
		typetxf = new JTextField();
		typetxf.setBounds(200, 122, 119, 20);
		controlpane.add(typetxf);
		typetxf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SERIAL NUMBER");
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(27, 172, 117, 14);
		controlpane.add(lblNewLabel_3);
		
		serialtxf = new JTextField();
		serialtxf.setBounds(200, 171, 119, 20);
		controlpane.add(serialtxf);
		serialtxf.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(0, 255, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_device_tracker_system","root","");
			String sql="INSERT INTO device VALUES(?,?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(idtxf.getText()));
			st.setString(2,nametxf.getText());
			st.setString(3, typetxf.getText());
			st.setString(4, serialtxf.getText());
			st.setString(5, modeltxf.getText());
			st.setString(6, manufacturetxf.getText());
			st.setString(7,statustxf.getText() );
			
			st.executeUpdate();
			JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
			
			st.close();
			con.close();
					
					
					
					
					
					
					
					
					
				} catch (Exception e2) {
					
				}	
					
					
					
					
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(36, 371, 134, 31);
		controlpane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idtxf.setText(null);
				nametxf.setText(null);
				typetxf.setText(null);
				serialtxf.setText(null);
				modeltxf.setText(null);
				manufacturetxf.setText(null);
				statustxf.setText(null);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(370, 371, 89, 31);
		controlpane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("MODEL");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(27, 212, 96, 20);
		controlpane.add(lblNewLabel_4);
		
		modeltxf = new JTextField();
		modeltxf.setBounds(200, 214, 119, 20);
		controlpane.add(modeltxf);
		modeltxf.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("MANUFACTURE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(27, 268, 143, 31);
		controlpane.add(lblNewLabel_5);
		
		manufacturetxf = new JTextField();
		manufacturetxf.setBounds(200, 268, 119, 20);
		controlpane.add(manufacturetxf);
		manufacturetxf.setColumns(10);
		
		statustxf = new JTextField();
		statustxf.setBounds(200, 318, 119, 20);
		controlpane.add(statustxf);
		statustxf.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("STATUS");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(27, 324, 117, 14);
		controlpane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("DEVICE DETAILS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(172, 11, 216, 26);
		controlpane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("ID");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(27, 52, 49, 14);
		controlpane.add(lblNewLabel_7);
		
		idtxf = new JTextField();
		idtxf.setBounds(200, 45, 119, 20);
		controlpane.add(idtxf);
		idtxf.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("LOCATION");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(128, 255, 128));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				location ad= new location();
				if(e.getSource()==btnNewButton_2) {
					ad.main(new String[0]);
				}
			}
		});
		btnNewButton_2.setBounds(210, 372, 119, 29);
		controlpane.add(btnNewButton_2);
	}
}
