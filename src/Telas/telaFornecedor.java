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
	private JTextField tfCodFornec;
	private JTextField tfNomeFornec;
	private JTextField tfCNPJFornec;
	private JTextField tfCttFornec;
	private JTextField tfTelFornec;

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
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tbFornecedores = new JTable();
		tbFornecedores.setBounds(10, 209, 614, 307);
		contentPane.add(tbFornecedores);

		JButton btnCadastrarFornecedor = new JButton("Cadastrar");
		btnCadastrarFornecedor.setBounds(485, 71, 139, 23);
		contentPane.add(btnCadastrarFornecedor);

		JButton btnModificarFornecedor = new JButton("Modificar");
		btnModificarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarFornecedor.setBounds(485, 105, 139, 23);
		contentPane.add(btnModificarFornecedor);

		JButton btnExcluirFornecedor = new JButton("Excluir");
		btnExcluirFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluirFornecedor.setBounds(485, 139, 139, 23);
		contentPane.add(btnExcluirFornecedor);

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setBounds(485, 527, 139, 23);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaPrincipal().setVisible(true);
				telaFornecedor.this.dispose();
			}
		});
		contentPane.add(btnInicio);
		
		JLabel lblCodFornec = new JLabel("Cod .:");
		lblCodFornec.setBounds(35, 28, 46, 14);
		contentPane.add(lblCodFornec);
		
		tfCodFornec = new JTextField();
		tfCodFornec.setBounds(103, 22, 250, 20);
		contentPane.add(tfCodFornec);
		tfCodFornec.setColumns(10);
		
		JLabel lblNomeFornec = new JLabel("Nome .:");
		lblNomeFornec.setBounds(35, 59, 46, 14);
		contentPane.add(lblNomeFornec);
		
		tfNomeFornec = new JTextField();
		tfNomeFornec.setBounds(103, 53, 250, 20);
		contentPane.add(tfNomeFornec);
		tfNomeFornec.setColumns(10);
		
		JLabel lblCNPJFornec = new JLabel("CNPJ .:");
		lblCNPJFornec.setBounds(35, 91, 46, 14);
		contentPane.add(lblCNPJFornec);
		
		tfCNPJFornec = new JTextField();
		tfCNPJFornec.setBounds(103, 84, 250, 20);
		contentPane.add(tfCNPJFornec);
		tfCNPJFornec.setColumns(10);
		
		JLabel lblcttFornec = new JLabel("Contato .:");
		lblcttFornec.setBounds(35, 118, 58, 14);
		contentPane.add(lblcttFornec);
		
		tfCttFornec = new JTextField();
		tfCttFornec.setBounds(103, 112, 250, 20);
		contentPane.add(tfCttFornec);
		tfCttFornec.setColumns(10);
		
		JLabel lblTelFornec = new JLabel("Telefone .:");
		lblTelFornec.setBounds(35, 146, 58, 14);
		contentPane.add(lblTelFornec);
		
		tfTelFornec = new JTextField();
		tfTelFornec.setBounds(103, 142, 250, 20);
		contentPane.add(tfTelFornec);
		tfTelFornec.setColumns(10);
	}
}
