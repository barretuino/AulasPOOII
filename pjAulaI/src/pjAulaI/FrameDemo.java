package pjAulaI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameDemo extends JFrame{
	
	//Atributos
	//1� Passo - Declarar
	JLabel lbNome, lbEmail;
	JTextField txtNome, txtEmail;
	JButton btCadastrar, btLimpar;
	
	public FrameDemo(){
		setTitle("Exemplo de Frame");
		setSize(300, 250);
		setLayout(new FlowLayout());
		
		//2� Passo - Construir
		lbNome = new JLabel("Nome:");
		lbEmail = new JLabel("Email:");
		
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		
		btCadastrar = new JButton("Cadastrar");
		btLimpar = new JButton("Limpar");
				
		//3� Passo - Adicionar ao JFrame
		add(lbNome);
		add(txtNome);
		add(lbEmail);
		add(txtEmail);
		add(btCadastrar);
		add(btLimpar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FrameDemo frm = new FrameDemo();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}