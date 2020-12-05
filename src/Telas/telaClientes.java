package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class telaClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tbCliente;
	private JTextField tfCodCliente;
	private JTextField tfCadCliente;
	private JTextField tfEmailCliente;
	private JTextField tfTelCliente;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaClientes frame = new telaClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaClientes() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCadastraCliente = new JButton("Cadastrar Cliente");
		btnCadastraCliente.setBounds(85, 410, 135, 23);
		contentPane.add(btnCadastraCliente);

		tbCliente = new JTable();
		tbCliente.setBounds(310, 5, 461, 545);
		contentPane.add(tbCliente);

		JButton btnModificarCliente = new JButton("Modificar Cliente");
		btnModificarCliente.setBounds(85, 435, 135, 23);
		contentPane.add(btnModificarCliente);

		JButton btnExcluirCliente = new JButton("Excluir Cliente");
		btnExcluirCliente.setBounds(85, 460, 135, 23);
		contentPane.add(btnExcluirCliente);

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setBounds(85, 485, 135, 23);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaPrincipal().setVisible(true);
				telaClientes.this.dispose();
			}
		});
		contentPane.add(btnInicio);
		
		JLabel lblCodCliente = new JLabel("Cod .:");
		lblCodCliente.setBounds(10, 50, 46, 14);
		contentPane.add(lblCodCliente);
		
		tfCodCliente = new JTextField();
		tfCodCliente.setBounds(85, 47, 200, 20);
		contentPane.add(tfCodCliente);
		tfCodCliente.setColumns(10);
		
		JLabel lblCadCliente = new JLabel("CPF | CNPJ .:");
		lblCadCliente.setBounds(10, 100, 65, 14);
		contentPane.add(lblCadCliente);
		
		tfCadCliente = new JTextField();
		tfCadCliente.setBounds(85, 97, 200, 20);
		contentPane.add(tfCadCliente);
		tfCadCliente.setColumns(10);
		
		JLabel lblEmailCliente = new JLabel("E-Mail .:");
		lblEmailCliente.setBounds(10, 150, 46, 14);
		contentPane.add(lblEmailCliente);
		
		tfEmailCliente = new JTextField();
		tfEmailCliente.setBounds(85, 147, 200, 20);
		contentPane.add(tfEmailCliente);
		tfEmailCliente.setColumns(10);
		
		JLabel lblTelCliente = new JLabel("Telefone .:");
		lblTelCliente.setBounds(10, 200, 65, 14);
		contentPane.add(lblTelCliente);
		
		tfTelCliente = new JTextField();
		tfTelCliente.setBounds(85, 197, 200, 20);
		contentPane.add(tfTelCliente);
		tfTelCliente.setColumns(10);
	}
}
