package pjAulaIII;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Exemplo de BorderLayout
 * @author Prof. Paulo Barreto
 * Gerênciadores de Layout
 * Aula III - 08/03/2016
 */
public class frmBorderLayout extends JFrame {
	//Atributos
	JButton btEsquerda, btDireita, btCabecalho,
	        btRodape, btCentro;
	
	public frmBorderLayout() {
		super("Exemplo de Gerenciador BorderLayout");
		setSize(500,500);
		
		btEsquerda = new JButton("Esquerda");
		btDireita = new JButton("Direita");
		btCentro = new JButton("Centro");
		btCabecalho = new JButton("Cabeçalho");
		btRodape = new JButton("Rodapé");
		
		add(btEsquerda, BorderLayout.WEST);
		add(btDireita, BorderLayout.EAST);
		add(btCentro, BorderLayout.CENTER);
		add(btCabecalho, BorderLayout.NORTH);
		add(btRodape, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmBorderLayout frm = new frmBorderLayout();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}