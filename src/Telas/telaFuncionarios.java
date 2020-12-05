package Telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.border.EtchedBorder;

public class telaFuncionarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tbFuncionario;
	private JButton btnSair;
	private JButton btnCadastrarFuncionario;
	private JButton btnModificarFuncionrio;
	private JButton btnExcluirFuncionrio;
	private JTextField tfNomeFunc;
	private JTextField tfCpfFunc;
	private JTextField tfCodFunc;
	private JTextField tfLoginFunc;
	private JPasswordField pfSenhaFunc;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaFuncionarios frame = new telaFuncionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaFuncionarios() {
		setTitle("Funcion\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tbFuncionario = new JTable();
		tbFuncionario.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"C\u00F3digo Func.", "Nome", "Login", "CPF"
			}
		));
		tbFuncionario.getColumnModel().getColumn(1).setPreferredWidth(300);
		tbFuncionario.getColumnModel().getColumn(3).setPreferredWidth(150);
		tbFuncionario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tbFuncionario.setBounds(10, 245, 614, 271);
		contentPane.add(tbFuncionario);

		JButton button = new JButton("New button");
		button.setBounds(256, 414, 89, 23);
		contentPane.add(button);

		btnSair = new JButton("Inicio");
		btnSair.setBounds(497, 519, 127, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new telaPrincipal().setVisible(true);
				telaFuncionarios.this.dispose();
			}
		});
		contentPane.add(btnSair);

		btnCadastrarFuncionario = new JButton("Cadastrar");
		btnCadastrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCadastrarFuncionario.setBounds(497, 67, 127, 23);
		contentPane.add(btnCadastrarFuncionario);

		btnModificarFuncionrio = new JButton("Modificar");
		btnModificarFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarFuncionrio.setBounds(497, 101, 127, 23);
		contentPane.add(btnModificarFuncionrio);

		btnExcluirFuncionrio = new JButton("Excluir");
		btnExcluirFuncionrio.setBounds(497, 135, 127, 23);
		contentPane.add(btnExcluirFuncionrio);
		
		tfNomeFunc = new JTextField();
		tfNomeFunc.setBounds(115, 60, 150, 20);
		contentPane.add(tfNomeFunc);
		tfNomeFunc.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome .:");
		lblNewLabel.setBounds(30, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF .:");
		lblNewLabel_1.setBounds(30, 104, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		tfCpfFunc = new JTextField();
		tfCpfFunc.setBounds(115, 101, 150, 20);
		contentPane.add(tfCpfFunc);
		tfCpfFunc.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cod .:");
		lblNewLabel_2.setBounds(30, 26, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		tfCodFunc = new JTextField();
		tfCodFunc.setBounds(115, 23, 150, 20);
		contentPane.add(tfCodFunc);
		tfCodFunc.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Login .:");
		lblNewLabel_3.setBounds(30, 144, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		tfLoginFunc = new JTextField();
		tfLoginFunc.setBounds(115, 141, 150, 20);
		contentPane.add(tfLoginFunc);
		tfLoginFunc.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Senha .:");
		lblNewLabel_4.setBounds(30, 189, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		pfSenhaFunc = new JPasswordField();
		pfSenhaFunc.setBounds(115, 186, 150, 17);
		contentPane.add(pfSenhaFunc);
		//teste
	}
}
