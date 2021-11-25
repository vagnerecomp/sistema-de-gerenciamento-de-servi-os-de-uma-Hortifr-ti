package br.uefs.ecomp.view;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		JanelaPrincipal janPrincipal = new JanelaPrincipal();
		
		janPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define o tipo de fechamento.
		janPrincipal.setSize(600, 400);// Define o tamanho da janela.
		janPrincipal.setVisible(true);// Mostra a janela.
		janPrincipal.setLocationRelativeTo(null);// Define que o programa seja iniciado no centro.
		janPrincipal.setResizable(false);// N�o permite que a janela seja redimencionada.
		
	}

}
