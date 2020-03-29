package pjAulaIV;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmTrataAcao extends JFrame 
                         implements ActionListener {
	
	//Atributos
	JLabel lbTexto1, lbTexto2;
	JTextField txtTexto1, txtTexto2;
	JButton btReplicar, btLimpar;
	JPanel pnCampos, pnBotoes;
	
	public frmTrataAcao() {
		setTitle("Exemplo de Tratamento de ações");
		setSize(300,150);
		
		lbTexto1 = new JLabel("Informe Texto:");
		lbTexto2 = new JLabel("Replica do Texto:");
		txtTexto1 = new JTextField(20);
		txtTexto2 = new JTextField(20);
		
		btReplicar = new JButton("Replicar");
		btLimpar = new JButton("Limpar");
		
		//Adicionar um componente a lista do Tratador de
		//Ações ActionListener
		txtTexto1.addActionListener(this);
		btReplicar.addActionListener(this);
		btLimpar.addActionListener(this);
		
		pnCampos = new JPanel(new GridLayout(2,2));
		pnBotoes = new JPanel(new GridLayout(1,2));
		
		pnCampos.add(lbTexto1);
		pnCampos.add(txtTexto1);
		pnCampos.add(lbTexto2);
		pnCampos.add(txtTexto2);
		
		pnBotoes.add(btReplicar);
		pnBotoes.add(btLimpar);
		
		add(pnCampos, BorderLayout.CENTER);
		add(pnBotoes, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if((evento.getSource() == btReplicar) ||
		   (evento.getSource() == txtTexto1)){			
			txtTexto2.setText(txtTexto1.getText());
			txtTexto1.setText("");			
			
			txtTexto1.requestFocus();
		}
		if(evento.getSource() == btLimpar){
			txtTexto1.setText("");
			txtTexto2.setText("");
			
			txtTexto1.requestFocus();
		}
	}

	public static void main(String[] args) {
		frmTrataAcao frm = new frmTrataAcao();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}