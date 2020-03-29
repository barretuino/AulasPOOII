package pjAulaIII;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Exemplo de FlowLayout
 * @author Prof. Paulo Barreto
 * Gerenciadores de Layout
 * Aula III - 08/03/2016
 */

public class frmFlowLayout extends JFrame{
	//Atributos
	//1º Passo - Declaração
	JButton btCalcular, btLimpar, btSair;

	public frmFlowLayout() {
		setTitle("Exemplo de Gerenciador FlowLayout");
		setSize(300,150);
		
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.RIGHT);
		setLayout(layout);		
		
		//2º Passo - Construção
		btCalcular = new JButton("Calcular");
		btLimpar = new JButton("Limpar");
		btSair = new JButton("Sair");
		
		//3º Passo - Adição no Frame
		add(btCalcular);
		add(btLimpar);
		add(btSair);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmFlowLayout frm = new frmFlowLayout();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
