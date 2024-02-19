package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.Box;

public class register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtxf;
	private JTextField nametxf;
	private JTextField emailtxf;
	private JTextField addresstxf;
	private JTextField roletxf;
	private JTextField gendertxf;
	private JTextField passwordtxf;
	private JTextField compasstxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
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
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(33, 63, 81, 24);
		contentPane.add(lblNewLabel);
		
		idtxf = new JTextField();
		idtxf.setBounds(259, 65, 144, 20);
		contentPane.add(idtxf);
		idtxf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 110, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		nametxf = new JTextField();
		nametxf.setBounds(259, 108, 144, 20);
		contentPane.add(nametxf);
		nametxf.setColumns(10);
		
		emailtxf = new JTextField();
		emailtxf.setBounds(259, 156, 144, 20);
		contentPane.add(emailtxf);
		emailtxf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(33, 159, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("address");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(33, 202, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		addresstxf = new JTextField();
		addresstxf.setBounds(259, 200, 144, 20);
		contentPane.add(addresstxf);
		addresstxf.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("role");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(33, 253, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		roletxf = new JTextField();
		roletxf.setBounds(259, 251, 144, 20);
		contentPane.add(roletxf);
		roletxf.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("gender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(33, 304, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		gendertxf = new JTextField();
		gendertxf.setBounds(259, 301, 144, 20);
		contentPane.add(gendertxf);
		gendertxf.setColumns(10);
		
		JButton btnNewButton = new JButton("SIGN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_device_tracker_system","root","");
			String sql="INSERT INTO account VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(idtxf.getText()));
			st.setString(2,nametxf.getText());
			st.setString(3, emailtxf.getText());
			st.setString(4, addresstxf.getText());
			st.setString(5, roletxf.getText());
			st.setString(6, gendertxf.getText());
			st.setString(7,passwordtxf.getText() );
			st.setString(8,compasstxf.getText() );
			
			st.executeUpdate();
			JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
			
			st.close();
			con.close();
					
					
					
					
					
					
					
					
					
				} catch (Exception e2) {
					
				}	
				loginform ad= new loginform();
				if(e.getSource()==btnNewButton) {
					ad.main(new String[0]);
				}
			}
		});
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(33, 429, 125, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idtxf.setText(null);
				nametxf.setText(null);
				emailtxf.setText(null);
				addresstxf.setText(null);
				roletxf.setText(null);
				gendertxf.setText(null);
				passwordtxf.setText(null);
				compasstxf.setText(null);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(280, 429, 89, 41);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("password");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(33, 348, 96, 24);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("confirm password");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(33, 389, 125, 24);
		contentPane.add(lblNewLabel_7);
		
		passwordtxf = new JTextField();
		passwordtxf.setBounds(259, 351, 144, 20);
		contentPane.add(passwordtxf);
		passwordtxf.setColumns(10);
		
		compasstxf = new JTextField();
		compasstxf.setBounds(259, 392, 144, 20);
		contentPane.add(compasstxf);
		compasstxf.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("REGISTRATION  FORM");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(127, 11, 360, 33);
		contentPane.add(lblNewLabel_8);
	}
}
