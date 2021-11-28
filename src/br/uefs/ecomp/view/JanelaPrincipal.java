package br.uefs.ecomp.view;

//Feito por Vagner; Henrique e Taison Machado

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class JanelaPrincipal extends JFrame{
	private JPanel painel1;
	
	//Ao instanciar essa classe o construtor chama os métodos que definem o funcionamento do programa
	public JanelaPrincipal(){
		super("Hortifruti");
		
		criarPaineis();
		criarMenu();
		criarBotoes();
	}
	

	
	
	

	
 void criarMenu(){
		JMenuBar barraMenu = new JMenuBar();
		
		//Cria os menus.
		JMenu cadastro = new JMenu("Cadastro");
		JMenu venda = new JMenu("Venda");
		JMenu sair = new JMenu("Sair");
		
		sair.addMenuListener(new MenuListener(){

			
			@Override
			public void menuSelected(MenuEvent e) {
				System.exit(0); // Fecha a janela quando o menu sair for selecionado.
			}

			@Override
			public void menuDeselected(MenuEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void menuCanceled(MenuEvent e) {
				// TODO Auto-generated method stub	
			}
			
		});
		
		
		//Adiona os menus � barra de menu.
		barraMenu.add(cadastro);
		barraMenu.add(venda);
		barraMenu.add(sair);
		
		//Cria os itens do menu cadastro.	
		JMenuItem itemProduto = new JMenuItem("Produto");
		JMenuItem itemCliente = new JMenuItem("Cliente");
		JMenuItem itemFornecedor = new JMenuItem("Fornecedor");

		//Cria��o dos atalhos.
		itemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
		itemFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
		itemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
		//Definindo ação do menu para cadastrar cliente
		itemCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				JanelaCadCliente cadCliente = new JanelaCadCliente();
				cadCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define o tipo de fechamento.
				cadCliente.setSize(600, 400);// Define o tamanho da janela.
				cadCliente.setVisible(true);// Mostra a janela.
				cadCliente.setLocationRelativeTo(null);// Define que o programa seja iniciado no centro.
				cadCliente.setResizable(false);// N�o permite que a janela seja redimencionada.
				
				
				
			}
		}); // Adiociona a Listener de cadastrar clientes ao item de menu.
		
		//Adiciona os sub-itens do menu cadastro.
		cadastro.add(itemCliente);
		cadastro.add(itemFornecedor);
		cadastro.add(itemProduto);
		
		//Adiciona o barra de menu � janela.
		setJMenuBar(barraMenu);
	}
	
	public void criarBotoes(){
		JButton botProdutos = new JButton("Produtos");
		botProdutos.setFont(new Font("Times new Roman",Font.BOLD,20)); //Muda a fonte e o estilo da letra.
		botProdutos.setBackground(Color.WHITE); // Muda a cor dos botoes.
		botProdutos.setBounds(10, 130, 150, 50);// Posiciona o bot�o e muda seu tamanho.
		
		JButton botClientes = new JButton("Clientes");
		botClientes.setFont(new Font("Times new Roman",Font.BOLD,20));
		botClientes.setBackground(Color.WHITE);
		botClientes.setBounds(10, 70, 150, 50);
		//botClientes.addActionListener(cadastrarListener);// Adiociona a Listener de cadastrar clientes ao bot�o.
		
		JButton botFornecedores = new JButton("Fornecedores");
		botFornecedores.setFont(new Font("Times new Roman",Font.BOLD,20));
		botFornecedores.setBackground(Color.WHITE);
		botFornecedores.setBounds(10, 190, 150, 50);
		
		JButton botVendas = new JButton("Vendas");
		botVendas.setFont(new Font("Times new Roman",Font.BOLD,20));
		botVendas.setBackground(Color.WHITE);
		botVendas.setBounds(10, 250, 150, 50);
		
		
				//adicionando Ações aos botões
		botClientes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						dispose();//Feito por Vagner; Henrique e Taison Machado
						JanelaCadCliente cadCliente = new JanelaCadCliente();
						cadCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define o tipo de fechamento.
						cadCliente.setSize(600, 400);// Define o tamanho da janela.
						cadCliente.setVisible(true);// Mostra a janela.
						cadCliente.setLocationRelativeTo(null);// Define que o programa seja iniciado no centro.
						cadCliente.setResizable(false);// N�o permite que a janela seja redimencionada.
						
						
						
					}
				}); 
				
		//Adiciona os bot�es ao painel.
		painel1.add(botProdutos);
		painel1.add(botClientes);
		painel1.add(botFornecedores);
		painel1.add(botVendas);
	}
	
	public void criarPaineis(){
	
		painel1 = new JPanel();
		painel1.setLayout(null); // Faz com que os componentes possam ser livremente manipulados.
		
		add(painel1, BorderLayout.CENTER); // Adiciona o painel ao centro da janela.
	}
	
}
