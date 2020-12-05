package Telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class telaFornecedor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tbFornecedores;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaFornecedor frame = new telaFornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaFornecedor() {
		setTitle("Fornecedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tbFornecedores = new JTable();
		tbFornecedores.setBounds(10, 177, 764, 307);
		contentPane.add(tbFornecedores);

		JButton btnCadastrarFornecedor = new JButton("Cadastrar");
		btnCadastrarFornecedor.setBounds(635, 75, 139, 23);
		contentPane.add(btnCadastrarFornecedor);

		JButton btnModificarFornecedor = new JButton("Modificar");
		btnModificarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarFornecedor.setBounds(635, 109, 139, 23);
		contentPane.add(btnModificarFornecedor);

		JButton btnExcluirFornecedor = new JButton("Excluir");
		btnExcluirFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluirFornecedor.setBounds(635, 143, 139, 23);
		contentPane.add(btnExcluirFornecedor);

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setBounds(685, 508, 89, 23);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaPrincipal().setVisible(true);
				telaFornecedor.this.dispose();
			}
		});
		contentPane.add(btnInicio);
		
		JLabel lblNewLabel = new JLabel("Cod .:");
		lblNewLabel.setBounds(35, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(103, 22, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome .:");
		lblNewLabel_1.setBounds(35, 59, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 53, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CNPJ .:");
		lblNewLabel_2.setBounds(35, 91, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(103, 84, 150, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contato .:");
		lblNewLabel_3.setBounds(35, 118, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(103, 112, 150, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone .:");
		lblNewLabel_4.setBounds(35, 147, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(103, 143, 150, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
