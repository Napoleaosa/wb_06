package func.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import FuncionarioDAO.FuncionarioDAO;
import func.model.Funcionario;





	public class FormPrincipal extends JFrame {

		private JButton btnNovo = new JButton("Novo");
		private JLabel lblLista = new JLabel("Lista de Alunos:");
		private JTextArea txtLista = new JTextArea();
		
		private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		public FormPrincipal() {
			inicializar();
			acoes();
			
			FuncionarioDAO dao = new FuncionarioDAO();
			funcionarios = dao.lerFuncionario();
			
			preencherFuncionarios();
		}
	

	
	private void inicializar() {
		this.setLayout(null);
		this.btnNovo.setBounds(50, 30, 150, 20);
		this.lblLista.setBounds(50, 70, 300, 20);
		this.txtLista.setBounds(50, 90, 500, 160);
		
		this.getContentPane().add(btnNovo);
		this.getContentPane().add(lblLista);
		this.getContentPane().add(txtLista);
		
		this.setSize(800, 600);
		this.setVisible(true);	
	}
	
	private void acoes() {
		btnNovo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FormDetFuncionario frm = new FormDetFuncionario();
				frm.show();
				
				Funcionario tmp = frm.getFuncionario();
				if (tmp != null) {
					funcionarios.add(tmp);
					FuncionarioDAO dao = new FuncionarioDAO();
					try {
						dao.gravarFuncionarios(funcionarios);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(frm, e2.getMessage());
					}
				}
				
				
				
			}
		});
	}
	
	private void preencherFuncionarios() {
		txtLista.setText("");		for (Funcionario funcionario : funcionarios) {
			txtLista.append(funcionario.getNome()	+" ["+funcionario.getCpf()+"]");
			txtLista.append("\n");
		}
	}


}
