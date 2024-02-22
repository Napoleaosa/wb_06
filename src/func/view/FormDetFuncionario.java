package func.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


import func.model.Funcionario;



public class FormDetFuncionario extends JDialog {

	JLabel lblId = new JLabel("Id:");
	JTextField txtId = new JTextField(null, 20);	
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField(null, 20);
	JLabel lblCpf = new JLabel("Cpf:");
	JTextField txtCpf = new JTextField(null, 20);
	JButton btnGravar = new JButton("Gravar"); //declare os objetos no in�cio da classe
	JButton btnFechar = new JButton("Fechar"); 
	
	private Funcionario aluno = new Funcionario();
	private Funcionario funcionario;
	
	public FormDetFuncionario() {
		this.setLayout(new FlowLayout()); // *posiciona os componentes um ap�s o outro
		this.getContentPane().add(lblId);
		this.getContentPane().add(txtId);
		
		this.getContentPane().add(lblNome);
		this.getContentPane().add(txtNome);
		
		this.getContentPane().add(lblCpf);
		this.getContentPane().add(txtCpf);		
		
		this.getContentPane().add(btnGravar); // adiciona o primeiro bot�o
		this.getContentPane().add(btnFechar); // adiciona o segundo bot�o
		
		btnGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				aluno.setId(Long.parseLong(txtId.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setCpf(txtCpf.getText());
			
			hide();
			}
		});
		
		
	
	
	this.setModal(true);
	this.setSize(600, 480); // definindo um tamanho inicial
	//setVisible(true); // torna a tela vis�vel, pois o padr�o � invis�vel

	//pack(); // dimensiona a tela baseando-se num tamanho padr�o
}

public Funcionario getFuncionario() {
	return funcionario;
}

public void setFuncionario(Funcionario funcionario) {
	this.funcionario = funcionario;
}
	
}
		