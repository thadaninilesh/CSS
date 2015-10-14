import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.JScrollPane;


public class CSS {
	
	JPanel menu;
	JPanel md;
	JPanel mdsha512;
	JPanel mdmd5;
	JPanel kdck;
	JPanel ds;
	JPanel asymmetric;
	JPanel symmetric;
	JLabel errorsha512 = new JLabel("");
	JLabel errormd5 = new JLabel("");
	JLabel sha512length = new JLabel("");
	JLabel md5length = new JLabel("");

	JFrame frame;
	private JTextField inputSHA512;
	private JTextField inputMD5;
	private JTextField outputMD5;
	public static JTextArea outputSHA512;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CSS window = new CSS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param t 
	 */
	public CSS(){
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Cryptography and System Security");
		frame.setBounds(100, 100, 680, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		menu = new JPanel();
		frame.getContentPane().add(menu, "name_1911189550638");
		menu.setLayout(null);
		menu.setVisible(true);
		
		JLabel lblCryptographyAndSystem = new JLabel("Cryptography and System Security");
		lblCryptographyAndSystem.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblCryptographyAndSystem.setBounds(170, 12, 365, 44);
		menu.add(lblCryptographyAndSystem);
		
		JButton messageDigest = new JButton("Message Digest");
		messageDigest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				md.setVisible(true);
				menu.setVisible(false);
			}
		});
		messageDigest.setBounds(36, 172, 209, 52);
		menu.add(messageDigest);
		
		JButton symmetricKey = new JButton("Symmetric Key");
		symmetricKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				symmetric.setVisible(true);
				menu.setVisible(false);
			}
		});
		symmetricKey.setBounds(36, 78, 209, 52);
		menu.add(symmetricKey);
		
		JButton asymmetricKey = new JButton("Asymmetric Key");
		asymmetricKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asymmetric.setVisible(true);
				menu.setVisible(false);
			}
		});
		asymmetricKey.setBounds(411, 78, 209, 52);
		menu.add(asymmetricKey);
		
		JButton kdc = new JButton("KDC");
		kdc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kdck.setVisible(true);
				menu.setVisible(false);
			}
		});
		kdc.setBounds(216, 256, 209, 52);
		menu.add(kdc);
		
		JButton digitalSignature = new JButton("Digital Signature");
		digitalSignature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ds.setVisible(true);
				menu.setVisible(false);
			}
		});
		digitalSignature.setBounds(411, 172, 209, 52);
		menu.add(digitalSignature);
		
		symmetric = new JPanel();
		frame.getContentPane().add(symmetric, "name_1985787423025");
		symmetric.setLayout(null);
		
		JLabel lblSymmetricKey = new JLabel("Symmetric Key");
		lblSymmetricKey.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblSymmetricKey.setBounds(169, 12, 159, 26);
		symmetric.add(lblSymmetricKey);
		
		JButton button_12 = new JButton("New button");
		button_12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_12.setBounds(23, 89, 157, 35);
		symmetric.add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_13.setBounds(246, 89, 157, 35);
		symmetric.add(button_13);
		
		JButton button_14 = new JButton("New button");
		button_14.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_14.setBounds(23, 159, 157, 35);
		symmetric.add(button_14);
		
		JButton button_15 = new JButton("New button");
		button_15.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_15.setBounds(246, 159, 157, 35);
		symmetric.add(button_15);
		
		JButton skback = new JButton("<<");
		skback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				menu.setVisible(true);
				symmetric.setVisible(false);
			}
		});
		skback.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		skback.setBounds(20, 44, 61, 23);
		symmetric.add(skback);
		
		asymmetric = new JPanel();
		frame.getContentPane().add(asymmetric, "name_2005229690947");
		asymmetric.setLayout(null);
		
		JLabel lblAsymmetricKey = new JLabel("Asymmetric Key");
		lblAsymmetricKey.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblAsymmetricKey.setBounds(153, 12, 172, 28);
		asymmetric.add(lblAsymmetricKey);
		
		JButton button_4 = new JButton("New button");
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_4.setBounds(20, 91, 157, 35);
		asymmetric.add(button_4);
		
		JButton button_9 = new JButton("New button");
		button_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_9.setBounds(239, 91, 157, 35);
		asymmetric.add(button_9);
		
		JButton button_10 = new JButton("New button");
		button_10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_10.setBounds(20, 160, 157, 35);
		asymmetric.add(button_10);
		
		JButton button_11 = new JButton("New button");
		button_11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_11.setBounds(239, 160, 157, 35);
		asymmetric.add(button_11);
		
		JButton askback = new JButton("<<");
		askback.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		askback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				menu.setVisible(true);
				asymmetric.setVisible(false);
			}
		});
		askback.setBounds(20, 43, 61, 23);
		asymmetric.add(askback);
		
		md = new JPanel();
		frame.getContentPane().add(md, "name_1914136635436");
		md.setLayout(null);
		md.setVisible(false);
		
		JLabel lblMessageDigest = new JLabel("Message Digest");
		lblMessageDigest.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblMessageDigest.setBounds(252, 12, 166, 42);
		md.add(lblMessageDigest);
		
		JButton sha512 = new JButton("SHA-512");
		sha512.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		sha512.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mdsha512.setVisible(true);
				md.setVisible(false);
			}
		});
		sha512.setBounds(364, 87, 235, 63);
		md.add(sha512);
		
		JButton md5 = new JButton("MD5");
		md5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		md5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mdmd5.setVisible(true);
				md.setVisible(false);
			}
		});
		md5.setBounds(364, 182, 235, 63);
		md.add(md5);
		
		JButton sha1 = new JButton("SHA-1");
		sha1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		sha1.setBounds(43, 182, 235, 63);
		md.add(sha1);
		
		JButton sha256 = new JButton("SHA-256");
		sha256.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		sha256.setBounds(43, 87, 235, 63);
		md.add(sha256);
		
		JButton mdback = new JButton("<<");
		mdback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				menu.setVisible(true);
				md.setVisible(false);
			}
		});
		mdback.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mdback.setBounds(33, 46, 55, 23);
		md.add(mdback);
		
		ds = new JPanel();
		frame.getContentPane().add(ds, "name_2025402502309");
		ds.setLayout(null);
		
		JLabel lblDigitalSignatur = new JLabel("Digital Signature");
		lblDigitalSignatur.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblDigitalSignatur.setBounds(133, 11, 181, 28);
		ds.add(lblDigitalSignatur);
		
		JButton button_5 = new JButton("New button");
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_5.setBounds(31, 102, 157, 35);
		ds.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_6.setBounds(229, 102, 157, 35);
		ds.add(button_6);

		JButton button_7 = new JButton("New button");
		button_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_7.setBounds(31, 166, 157, 35);
		ds.add(button_7);
		
		JButton button_8 = new JButton("New button");
		button_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_8.setBounds(229, 166, 157, 35);
		ds.add(button_8);

		JButton dsback = new JButton("<<");
		dsback.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		dsback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				menu.setVisible(true);
				ds.setVisible(false);
			}
		});
		dsback.setBounds(31, 53, 57, 23);
		ds.add(dsback);

		kdck = new JPanel();
		frame.getContentPane().add(kdck, "name_2029446199389");
		kdck.setLayout(null);

		JLabel lblKdc = new JLabel("KDC");
		lblKdc.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblKdc.setBounds(194, 11, 58, 28);
		kdck.add(lblKdc);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(33, 88, 157, 35);
		kdck.add(btnNewButton);

		JButton button_1 = new JButton("New button");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_1.setBounds(222, 149, 157, 35);
		kdck.add(button_1);

		JButton button_2 = new JButton("New button");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_2.setBounds(222, 88, 157, 35);
		kdck.add(button_2);

		JButton button_3 = new JButton("New button");
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_3.setBounds(33, 149, 157, 35);
		kdck.add(button_3);

		JButton kdcback = new JButton("<<");
		kdcback.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		kdcback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				menu.setVisible(true);
				kdck.setVisible(false);
			}
		});
		kdcback.setBounds(33, 41, 58, 23);
		kdck.add(kdcback);

		mdsha512 = new JPanel();
		frame.getContentPane().add(mdsha512, "name_1915805906607");
		mdsha512.setLayout(null);
		mdsha512.setVisible(false);

		JLabel lblSha = new JLabel("SHA-512");
		lblSha.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblSha.setBounds(206, 12, 98, 39);
		mdsha512.add(lblSha);
		errorsha512.setForeground(Color.RED);
		errorsha512.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		errorsha512.setBounds(69, 46, 355, 30);
		mdsha512.add(errorsha512);

		inputSHA512 = new JTextField();
		inputSHA512.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		inputSHA512.setBounds(61, 87, 572, 30);
		mdsha512.add(inputSHA512);
		inputSHA512.setColumns(10);
		
		JButton sha512Submit = new JButton("Submit");
		sha512Submit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		sha512Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = inputSHA512.getText();
				if(input.length() < 3){
					errorsha512.setText("Input size must be atleast 3 characters long");
					inputSHA512.setText("");
					outputSHA512.setText("");
					sha512length.setText("");
				}
				else{
					outputSHA512.setText("");
					String[] outputsha512 = SHA512.SHA512enc(input);
					for(int i = 0; i < outputsha512.length; i++){
						System.out.println(outputsha512[i]);
						outputSHA512.append(outputsha512[i]);
						outputSHA512.append("\n");
					}
					sha512length.setText("Length of Input: "+input.length()+" || Length of Output: "+outputsha512[outputsha512.length-1].length());
					errorsha512.setText("");
				}
			}
		});
		sha512Submit.setBounds(241, 285, 171, 30);
		mdsha512.add(sha512Submit);

		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 90, 30, 22);
		mdsha512.add(lblNewLabel);

		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblOutput.setBounds(10, 136, 46, 14);
		mdsha512.add(lblOutput);

		JButton backsha512 = new JButton("<<");
		backsha512.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				md.setVisible(true);
				mdsha512.setVisible(false);
			}
		});
		backsha512.setBounds(10, 46, 49, 23);
		mdsha512.add(backsha512);

		sha512length.setForeground(Color.BLUE);
		sha512length.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		sha512length.setBounds(111, 251, 471, 22);
		mdsha512.add(sha512length);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 132, 572, 107);
		mdsha512.add(scrollPane);

		outputSHA512 = new JTextArea();
		scrollPane.setViewportView(outputSHA512);
		outputSHA512.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		outputSHA512.setLineWrap(true);
		outputSHA512.setColumns(128);
		outputSHA512.setRows(5);
		outputSHA512.setAutoscrolls(true);

		mdmd5 = new JPanel();
		frame.getContentPane().add(mdmd5, "name_3766358692563");
		mdmd5.setLayout(null);
		mdmd5.setVisible(false);

		JLabel lblMd = new JLabel("MD5");
		lblMd.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblMd.setBounds(220, 12, 62, 38);
		mdmd5.add(lblMd);
		errormd5.setForeground(Color.RED);
		errormd5.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		errormd5.setBounds(91, 53, 349, 25);
		mdmd5.add(errormd5);

		inputMD5 = new JTextField();
		inputMD5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		inputMD5.setBounds(70, 90, 411, 25);
		mdmd5.add(inputMD5);
		inputMD5.setColumns(10);
		
		outputMD5 = new JTextField();
		outputMD5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		outputMD5.setBounds(70, 126, 411, 25);
		mdmd5.add(outputMD5);
		outputMD5.setColumns(10);

		JButton submitMD5 = new JButton("Submit");
		submitMD5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		submitMD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputmd5 = inputMD5.getText();
				if(inputmd5.length() < 3 ){
					errormd5.setText("Input size must be atleast 3 characters long");
				}
				else{
					String output = MD5.MD5enc(inputmd5);
					outputMD5.setText(output);
					md5length.setText("Length of input: "+inputmd5.length()+" || Length of output: "+output.length());
				}
			}
		});
		submitMD5.setBounds(140, 163, 210, 38);
		mdmd5.add(submitMD5);

		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblInput.setBounds(14, 94, 36, 14);
		mdmd5.add(lblInput);

		JLabel lblOutput_1 = new JLabel("Output");
		lblOutput_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblOutput_1.setBounds(14, 130, 46, 14);
		mdmd5.add(lblOutput_1);

		JButton button = new JButton("<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				md.setVisible(true);
				mdmd5.setVisible(false);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button.setBounds(10, 56, 62, 23);
		mdmd5.add(button);
		
		md5length.setForeground(Color.BLUE);
		md5length.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		md5length.setBounds(14, 213, 467, 22);
		mdmd5.add(md5length);
	}
}