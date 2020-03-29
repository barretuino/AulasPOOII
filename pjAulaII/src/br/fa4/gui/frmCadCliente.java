package br.fa4.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.fa4.modelagem.Cliente;

/**
 * Classe de View - Frame que será visualizado
 * na interação com o usuário
 * @author Prof. Paulo Barreto
 * @date 01/03/2016
 */
public class frmCadCliente extends JFrame implements ActionListener{
	//1º Passo Declarar o objeto
	JLabel lbNome, lbEmail, lbCodigo;
	JTextField txtNome, txtEmail, txtCodigo;
	JButton btCadastrar, btLimpar;
	Cliente cliente;
	
	public frmCadCliente(){
		setTitle("Cadastro de Cliente");
		setSize(300,250);
		setLayout(new FlowLayout());
		
		//2º Passo Instanciar Objeto (Construção)
		lbNome = new JLabel("Nome:");
		lbEmail = new JLabel("Email:");
		lbCodigo = new JLabel("Código:");
		txtNome = new JTextField(20);
		txtEmail = new JTextField(20);
		txtCodigo = new JTextField(20);
		
		btCadastrar = new JButton("Cadastrar");
		btLimpar = new JButton("Limpar");
		
		cliente = new Cliente();
		btCadastrar.setMnemonic('C');
		btLimpar.setMnemonic('L');
		
		//3º Adicionar ao Frame
		add(lbCodigo);
		add(txtCodigo);
		add(lbNome);
		add(txtNome);
		add(lbEmail);
		add(txtEmail);
		add(btCadastrar);
		add(btLimpar);
		
		//4º Passo (Opcional)
		btCadastrar.addActionListener(this);
		btLimpar.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmCadCliente frm= new frmCadCliente();
		frm.setDefaultCloseOperation(
					JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == btCadastrar){
			cliente.setNome(txtNome.getText());
			cliente.setEmail(txtEmail.getText());
			cliente.setCodigo(
				Integer.parseInt(txtCodigo.getText()));
			
			JOptionPane.showMessageDialog(null,
					cliente.toString());
		}
		if(evento.getSource() == btLimpar){
			txtCodigo.setText("");
			txtNome.setText("");
			txtEmail.setText("");
			
			txtCodigo.requestFocus();
		}
	}
}
