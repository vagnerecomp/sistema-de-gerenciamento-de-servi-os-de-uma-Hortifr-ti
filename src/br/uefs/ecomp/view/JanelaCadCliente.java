package br.uefs.ecomp.view;

//Feito por Vagner José, Henrique Bastos e Taison Machado

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

public class JanelaCadCliente extends JFrame{
	private JPanel painel1;
	//private JTextField campoNome, campoCpf, campoEstado, campoNascimento, campoEnd, campoCidade;
	
	// O construtor da classe chama os métodos que definem a tela
	public JanelaCadCliente(){
		super("Cadastro de Cliente"); // Nome da janela.
		
		criarPaineis();
		criarFormulario();
		criarBotoes();
	}
	
	//criando os componentes
	JLabel nome = new JLabel("Nome");
	JTextField campoNome = new JTextField();
	JLabel cpf = new JLabel("CPF");
	JTextField campoCpf = new JTextField();
	JLabel nascimento = new JLabel("Data de Nascimento");
	JTextField campoNascimento = new JTextField();
	JLabel estado = new JLabel("Estado");
	JTextField campoEstado = new JTextField();
	JLabel cidade = new JLabel("Cidade");
	JTextField campoCidade = new JTextField();
	JLabel end = new JLabel("Endereco");
	JTextField campoEnd = new JTextField();
	
	public void criarFormulario(){
		//Cria os r�tulos e os campos de textos do formul�rio.
		
		
		
		
		// Posiciona e redimensiona os campos e r�tulos na janela.
		nome.setBounds(10, 1, 100, 100);
		campoNome.setBounds(70, 42, 400, 20);
		cpf.setBounds(10, 30, 100, 100);
		campoCpf.setBounds(70, 71, 100, 20);
		nascimento.setBounds(240, 30, 150, 100);
		campoNascimento.setBounds(390, 71, 100, 20);
		estado.setBounds(10, 60, 100, 100);
		campoEstado.setBounds(70, 100, 200, 20);
		cidade.setBounds(10, 90, 100, 100);
		campoCidade.setBounds(70, 131, 400, 20);
		end.setBounds(10, 120, 100, 100);
		campoEnd.setBounds(100, 161, 400, 20);
		
		
		// Adiciona os campos de textos e r�tulos ao painel.
		painel1.add(nome);
		painel1.add(campoNome);
		painel1.add(cpf);
		painel1.add(campoCpf);
		painel1.add(nascimento);
		painel1.add(campoNascimento);
		painel1.add(estado);
		painel1.add(campoEstado);
		painel1.add(cidade);
		painel1.add(campoCidade);
		painel1.add(end);
		painel1.add(campoEnd);
		
		
	}
	
	public void criarBotoes(){
		//Cria as imagens que acompanham os bot�es.
		/*
		ImageIcon imgCadastrar = new ImageIcon(this.getClass().getResource("icon_cadastrar.png"));
		ImageIcon imgLimpar = new ImageIcon(this.getClass().getResource("icon_limpar.jpg"));
		ImageIcon imgSair = new ImageIcon(this.getClass().getResource("icon_sair.png"));
		ImageIcon imgVisualizar = new ImageIcon(this.getClass().getResource("icon_visualizar.jpg"));*/
		
		JButton botSalvar = new JButton("Salvar"); // Cria o bot�o e d� seu nome.
		botSalvar.setBounds(10, 250, 120, 40); // Posiciona o bot�o e define seu tamanho.
		//botCadastrar.setIcon(imgCadastrar); // Adiciona a imagem ao bot�o.
		botSalvar.setBackground(Color.WHITE); // Define a cor do bot�o.
		
		
		JButton botLimpar = new JButton("Limpar");
		botLimpar.setBounds(150, 250, 120, 40);
		//botLimpar.setIcon(imgLimpar);
		botLimpar.setBackground(Color.WHITE);

		
		JButton botVisualizar = new JButton("Visualizar");
		botVisualizar.setBounds(300, 250, 120, 40);
		//botVisualizar.setIcon(imgVisualizar);
		botVisualizar.setBackground(Color.WHITE);
		
		JButton botSair = new JButton("Sair");
		botSair.setBounds(450, 250, 120, 40);
		//botSair.setIcon(imgSair);
		botSair.setBackground(Color.WHITE);
		
		//Definindo ações dos botões
		//Criando um arquivo
		final File arquivo = new File("cadastro.txt");
		botSalvar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//Criando um buffer de strings
				/*StringBuffer dados = new StringBuffer();
				dados.append(campoNome.getText() + " / ");
				dados.append(campoCpf.getText() + " / ");
				dados.append(campoNascimento.getText() + " / ");
				dados.append(campoEnd.getText() + " / ");
				dados.append(campoCidade.getText() + " / ");
				dados.append(campoEstado.getText() + " / ");
				//campoCidade.setText(dados.toString());*/

				//Instanciando objeto para escrever no arquivo
				try( FileWriter fw = new FileWriter( arquivo ) ){
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(campoNome.getText());//Escrevendo o nome no arquivo
						bw.newLine();//quebra de linha
						bw.write(campoCpf.getText());//escrevendo cpf no arquivo
						bw.newLine();
						bw.write(campoNascimento.getText());//escrevendo data de nascimento no arquivo
						bw.newLine();
						bw.write(campoEnd.getText());//escrevendo endereço no arquivo
						bw.newLine();
						bw.write(campoCidade.getText());//escrevendo a cidade no arquivo
						bw.newLine();
						bw.write(campoEstado.getText());//escrevendo o estado no arquivo
						bw.flush();
					}catch(IOException ex){
						ex.printStackTrace();
					}

				campoNome.setText("");
				campoCidade.setText("");
				campoCpf.setText("");
				campoEnd.setText("");
				campoEstado.setText("");
				campoNascimento.setText("");
				JOptionPane v = new JOptionPane();
				v.showMessageDialog(null, "Dados Cadastrados");

				
			}
		});
		
		//Definindo ações do botão visualizar
		botVisualizar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try( FileReader fr = new FileReader(arquivo)){ //Cria um objeto leitor de arquivos pra ler o objeto aruivo
						BufferedReader br = new BufferedReader(fr);//Criar um buffer de leitura
						StringBuffer dados = new StringBuffer();//Variável que vai receber linha por linha do arquivo
						
						
						while(br.ready()){
							dados.append(br.readLine() + "\n");
						}
						//dadosCadastrados.setText(dados.toString());
						/*As instruções abaixo definem uma nova tela para exibir
						 * os dados cadastrados*/
						JFrame visual = new JFrame();
						visual.setTitle("Dados Cadastrados");
						visual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define o tipo de fechamento.
						visual.setSize(600, 400);// Define o tamanho da janela.
						visual.setVisible(true);// Mostra a janela.
						visual.setLocationRelativeTo(null);// Define que o programa seja iniciado no centro.
						visual.setResizable(false);
						
						JPanel tela = new JPanel();
						tela.setLayout(null);
						JTextArea dadosCad = new JTextArea();
						dadosCad.setSize(800,600);
						dadosCad.setText(dados.toString());
						tela.add(dadosCad);
						visual.add(tela, BorderLayout.CENTER);

					}catch(IOException ex){
						ex.printStackTrace();
					}
			}
		});
		
		//Definindo ações para o botão Limpar
		botLimpar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//Adiciona uma string vazia aos campos de textos para que possam "limpa-los". 
				campoNome.setText("");
				campoCidade.setText("");
				campoCpf.setText("");
				campoEnd.setText("");
				campoEstado.setText("");
				campoNascimento.setText("");
			}
			
		});
		
		
		
		botSair.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);// Fecha a janela quando o bot�o sair for selecionado.
			}
			
		});
		// Adiciona os bot�es ao painel.
		painel1.add(botSalvar);
		painel1.add(botLimpar);
		painel1.add(botVisualizar);
		painel1.add(botSair);
	}
	
	public void criarPaineis(){
		painel1 = new JPanel();
		painel1.setLayout(null); // Faz com que os componentes possam ser livremente manipulados.
		
		add(painel1, BorderLayout.CENTER); // Adiciona o painel ao centro da janela.
	}
}
