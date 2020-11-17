package startBank;

import java.util.Date;

public class BdoFAQ {
	private int cod_loja, cod_funcionario, cod_fornecimento, cod_fornecedor, telefone_fornecedor, cod_produto,
			cod_tipo_produto, cod_venda, quantidade_produto_venda, cod_forma_pagamento, cod_estoque,
			cod_endereco_cliente, numero_casa, cod_cliente, telefone_cliente;

	private double loja_cnpj, cpf_funcionario, cnpj_fornecedor, preco_produto, quantidade_produto, valor_compra,
			quantidade_produto_estoque, cep_cliente, cpf_cliente;

	private String nome_funcionario, funuser_login, funuser_senha, nome_fornecedor, contato_fornecedor, nome_produto,
			descricao_produto, nome_tipo_produto, forma_pagamento, nome_rua, complemento_cliente, email_cliente;

	private Date data_fornecimento;

	public int getCod_loja() {
		return cod_loja;
	}

	public BdoFAQ(int cod_loja, int cod_funcionario, int cod_fornecimento, int cod_fornecedor, int telefone_fornecedor,
			int cod_produto, int cod_tipo_produto, int cod_venda, int quantidade_produto_venda, int cod_forma_pagamento,
			int cod_estoque, int cod_endereco_cliente, int numero_casa, int cod_cliente, int telefone_cliente,
			double loja_cnpj, double cpf_funcionario, double cnpj_fornecedor, double preco_produto,
			double quantidade_produto, double valor_compra, double quantidade_produto_estoque, double cep_cliente,
			double cpf_cliente, String nome_funcionario, String funuser_login, String funuser_senha,
			String nome_fornecedor, String contato_fornecedor, String nome_produto, String descricao_produto,
			String nome_tipo_produto, String forma_pagamento, String nome_rua, String complemento_cliente,
			String email_cliente, Date data_fornecimento) {
		super();
		this.cod_loja = cod_loja;
		this.cod_funcionario = cod_funcionario;
		this.cod_fornecimento = cod_fornecimento;
		this.cod_fornecedor = cod_fornecedor;
		this.telefone_fornecedor = telefone_fornecedor;
		this.cod_produto = cod_produto;
		this.cod_tipo_produto = cod_tipo_produto;
		this.cod_venda = cod_venda;
		this.quantidade_produto_venda = quantidade_produto_venda;
		this.cod_forma_pagamento = cod_forma_pagamento;
		this.cod_estoque = cod_estoque;
		this.cod_endereco_cliente = cod_endereco_cliente;
		this.numero_casa = numero_casa;
		this.cod_cliente = cod_cliente;
		this.telefone_cliente = telefone_cliente;
		this.loja_cnpj = loja_cnpj;
		this.cpf_funcionario = cpf_funcionario;
		this.cnpj_fornecedor = cnpj_fornecedor;
		this.preco_produto = preco_produto;
		this.quantidade_produto = quantidade_produto;
		this.valor_compra = valor_compra;
		this.quantidade_produto_estoque = quantidade_produto_estoque;
		this.cep_cliente = cep_cliente;
		this.cpf_cliente = cpf_cliente;
		this.nome_funcionario = nome_funcionario;
		this.funuser_login = funuser_login;
		this.funuser_senha = funuser_senha;
		this.nome_fornecedor = nome_fornecedor;
		this.contato_fornecedor = contato_fornecedor;
		this.nome_produto = nome_produto;
		this.descricao_produto = descricao_produto;
		this.nome_tipo_produto = nome_tipo_produto;
		this.forma_pagamento = forma_pagamento;
		this.nome_rua = nome_rua;
		this.complemento_cliente = complemento_cliente;
		this.email_cliente = email_cliente;
		this.data_fornecimento = data_fornecimento;
	}

	public void setCod_loja(int cod_loja) {
		this.cod_loja = cod_loja;
	}

	public int getCod_funcionario() {
		return cod_funcionario;
	}

	public void setCod_funcionario(int cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}

	public int getCod_fornecimento() {
		return cod_fornecimento;
	}

	public void setCod_fornecimento(int cod_fornecimento) {
		this.cod_fornecimento = cod_fornecimento;
	}

	public int getCod_fornecedor() {
		return cod_fornecedor;
	}

	public void setCod_fornecedor(int cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}

	public int getTelefone_fornecedor() {
		return telefone_fornecedor;
	}

	public void setTelefone_fornecedor(int telefone_fornecedor) {
		this.telefone_fornecedor = telefone_fornecedor;
	}

	public int getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}

	public int getCod_tipo_produto() {
		return cod_tipo_produto;
	}

	public void setCod_tipo_produto(int cod_tipo_produto) {
		this.cod_tipo_produto = cod_tipo_produto;
	}

	public int getCod_venda() {
		return cod_venda;
	}

	public void setCod_venda(int cod_venda) {
		this.cod_venda = cod_venda;
	}

	public int getQuantidade_produto_venda() {
		return quantidade_produto_venda;
	}

	public void setQuantidade_produto_venda(int quantidade_produto_venda) {
		this.quantidade_produto_venda = quantidade_produto_venda;
	}

	public int getCod_forma_pagamento() {
		return cod_forma_pagamento;
	}

	public void setCod_forma_pagamento(int cod_forma_pagamento) {
		this.cod_forma_pagamento = cod_forma_pagamento;
	}

	public int getCod_estoque() {
		return cod_estoque;
	}

	public void setCod_estoque(int cod_estoque) {
		this.cod_estoque = cod_estoque;
	}

	public int getCod_endereco_cliente() {
		return cod_endereco_cliente;
	}

	public void setCod_endereco_cliente(int cod_endereco_cliente) {
		this.cod_endereco_cliente = cod_endereco_cliente;
	}

	public int getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public int getTelefone_cliente() {
		return telefone_cliente;
	}

	public void setTelefone_cliente(int telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}

	public double getLoja_cnpj() {
		return loja_cnpj;
	}

	public void setLoja_cnpj(double loja_cnpj) {
		this.loja_cnpj = loja_cnpj;
	}

	public double getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(double cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}

	public double getCnpj_fornecedor() {
		return cnpj_fornecedor;
	}

	public void setCnpj_fornecedor(double cnpj_fornecedor) {
		this.cnpj_fornecedor = cnpj_fornecedor;
	}

	public double getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(double preco_produto) {
		this.preco_produto = preco_produto;
	}

	public double getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(double quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public double getValor_compra() {
		return valor_compra;
	}

	public void setValor_compra(double valor_compra) {
		this.valor_compra = valor_compra;
	}

	public double getQuantidade_produto_estoque() {
		return quantidade_produto_estoque;
	}

	public void setQuantidade_produto_estoque(double quantidade_produto_estoque) {
		this.quantidade_produto_estoque = quantidade_produto_estoque;
	}

	public double getCep_cliente() {
		return cep_cliente;
	}

	public void setCep_cliente(double cep_cliente) {
		this.cep_cliente = cep_cliente;
	}

	public double getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(double cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getFunuser_login() {
		return funuser_login;
	}

	public void setFunuser_login(String funuser_login) {
		this.funuser_login = funuser_login;
	}

	public String getFunuser_senha() {
		return funuser_senha;
	}

	public void setFunuser_senha(String funuser_senha) {
		this.funuser_senha = funuser_senha;
	}

	public String getNome_fornecedor() {
		return nome_fornecedor;
	}

	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}

	public String getContato_fornecedor() {
		return contato_fornecedor;
	}

	public void setContato_fornecedor(String contato_fornecedor) {
		this.contato_fornecedor = contato_fornecedor;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public String getNome_tipo_produto() {
		return nome_tipo_produto;
	}

	public void setNome_tipo_produto(String nome_tipo_produto) {
		this.nome_tipo_produto = nome_tipo_produto;
	}

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public String getNome_rua() {
		return nome_rua;
	}

	public void setNome_rua(String nome_rua) {
		this.nome_rua = nome_rua;
	}

	public String getComplemento_cliente() {
		return complemento_cliente;
	}

	public void setComplemento_cliente(String complemento_cliente) {
		this.complemento_cliente = complemento_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public Date getData_fornecimento() {
		return data_fornecimento;
	}

	public void setData_fornecimento(Date data_fornecimento) {
		this.data_fornecimento = data_fornecimento;
	}

	public BdoFAQ(int codVenda, int codFormaPagamento, int codCliente, int codLoja, int codProduto, double valorCompra,
			int qtdeProdutoVenda) {
		// Tabela Venda
		this.cod_venda = codVenda;
		this.cod_forma_pagamento = codFormaPagamento;
		this.cod_cliente = codCliente;
		this.cod_loja = codLoja;
		this.cod_produto = codProduto;
		this.valor_compra = valorCompra;
		this.quantidade_produto_venda = qtdeProdutoVenda;
	}
	
	

	public BdoFAQ() {

	}

}
