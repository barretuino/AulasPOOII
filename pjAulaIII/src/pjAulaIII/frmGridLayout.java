package pjAulaIII;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Exemplo de GridLayout
 * @author Prof. Paulo Barreto
 * Gerenciador de Layout
 * Aula III - 08/03/2016
 */

public class frmGridLayout extends JFrame{
	//Atributos
	JButton vetBotoes[];
	JTextField txtNumero;
	JPanel pnCabecalho, pnBotoes;
	
	public frmGridLayout() {
		setTitle("Exemplo de Gerenciador GridLayout");
		setSize(350,350);
				
		pnBotoes = new JPanel(new GridLayout(6, 4));
		pnCabecalho = new JPanel(new FlowLayout());
		
		vetBotoes = new JButton[24];
		for(int i=0; i<24; i++){
			vetBotoes[i] = new JButton("bt" + i);
			
			pnBotoes.add(vetBotoes[i]);
		}
		
		txtNumero = new JTextField(20);
		txtNumero.setHorizontalAlignment(JTextField.RIGHT);
		pnCabecalho.add(txtNumero);
		
		add(pnCabecalho, BorderLayout.NORTH);
		add(pnBotoes, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmGridLayout frm = new frmGridLayout();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
