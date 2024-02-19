package form;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class location extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField latitudetxf;
	private JTextField longitudetxf;
	private JTextField addresstxf;
	private JTextField citytxf;
	private JTextField statetxf;
	private JTextField countrytxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					location frame = new location();
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
	public location() {
		setTitle("LOCATION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LATITUDE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(43, 78, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LONGITUDE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(43, 120, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADDRESS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(43, 165, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CITY");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(43, 207, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("STATE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(43, 254, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("COUNTRY");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(43, 293, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		latitudetxf = new JTextField();
		latitudetxf.setBounds(192, 75, 223, 20);
		contentPane.add(latitudetxf);
		latitudetxf.setColumns(10);
		
		longitudetxf = new JTextField();
		longitudetxf.setBounds(192, 117, 223, 20);
		contentPane.add(longitudetxf);
		longitudetxf.setColumns(10);
		
		addresstxf = new JTextField();
		addresstxf.setBounds(192, 162, 223, 20);
		contentPane.add(addresstxf);
		addresstxf.setColumns(10);
		
		citytxf = new JTextField();
		citytxf.setBounds(192, 204, 223, 20);
		contentPane.add(citytxf);
		citytxf.setColumns(10);
		
		statetxf = new JTextField();
		statetxf.setBounds(192, 251, 223, 20);
		contentPane.add(statetxf);
		statetxf.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(43, 382, 123, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				latitudetxf.setText(null);
				longitudetxf.setText(null);
				addresstxf.setText(null);
				citytxf.setText(null);
				statetxf.setText(null);
				countrytxf.setText(null);
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(240, 384, 111, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("LOCATION DETAILS");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(129, 11, 245, 34);
		contentPane.add(lblNewLabel_6);
		
		countrytxf = new JTextField();
		countrytxf.setBounds(192, 292, 223, 20);
		contentPane.add(countrytxf);
		countrytxf.setColumns(10);
	}
}
