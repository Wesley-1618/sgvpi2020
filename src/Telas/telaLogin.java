package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class telaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoLogin;
	private JPasswordField campoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLogin frame = new telaLogin();
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
	public telaLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 135, 84, 41, 89, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 17, 20, 17, 20, 36, 23, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		campoLogin = new JTextField();
		GridBagConstraints gbc_campoLogin = new GridBagConstraints();
		gbc_campoLogin.anchor = GridBagConstraints.NORTH;
		gbc_campoLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoLogin.insets = new Insets(0, 0, 5, 5);
		gbc_campoLogin.gridwidth = 3;
		gbc_campoLogin.gridx = 1;
		gbc_campoLogin.gridy = 1;
		contentPane.add(campoLogin, gbc_campoLogin);
		campoLogin.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		campoSenha = new JPasswordField();
		GridBagConstraints gbc_campoSenha = new GridBagConstraints();
		gbc_campoSenha.anchor = GridBagConstraints.NORTH;
		gbc_campoSenha.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoSenha.insets = new Insets(0, 0, 5, 5);
		gbc_campoSenha.gridwidth = 3;
		gbc_campoSenha.gridx = 1;
		gbc_campoSenha.gridy = 3;
		contentPane.add(campoSenha, gbc_campoSenha);

		JButton btnLogin = new JButton("Login");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.SOUTH;
		gbc_btnLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 5;
		contentPane.add(btnLogin, gbc_btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeUsuario = campoLogin.getText();
				@SuppressWarnings("deprecation")
				String senha = campoSenha.getText();
				if (nomeUsuario.trim().equals("admin") && senha.trim().equals("admin")) {
					new telaPrincipal().setVisible(true);
					telaLogin.this.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha errados!!!");
					}
			}
		});
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 5, 5);
		gbc_btnSair.anchor = GridBagConstraints.NORTH;
		gbc_btnSair.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSair.gridx = 3;
		gbc_btnSair.gridy = 5;
		contentPane.add(btnSair, gbc_btnSair);
	}
}
