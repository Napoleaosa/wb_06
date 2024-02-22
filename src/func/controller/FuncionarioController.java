package func.controller;

import java.util.ArrayList;
import java.util.List;
import FuncionarioDAO.FuncionarioDAO;
import func.model.Funcionario;
import func.view.FormPrincipal;

public class FuncionarioController {

	public static void main(String[] args) {
		
			
			FormPrincipal frmPri = new FormPrincipal();
			frmPri.show();
			

			

			// Gera��o de funça
			Funcionario a1 = new Funcionario(123L, "Yuri", "000.000.000-00");
			Funcionario a2 = new Funcionario(124L, "Napole�o", "111.111.111-11");
			Funcionario a3 = new Funcionario(125L, "Fabricio", "111.111.111-11");
			Funcionario a4 = new Funcionario(126L, "Julia", "111.111.111-11");
			Funcionario a5 = new Funcionario(127L, "Emily", "111.111.111-11");
			Funcionario a6 = new Funcionario(128L, "Elysson", "111.111.111-11");
			Funcionario a7 = new Funcionario(129L, "Nilson", "111.111.111-11");
			Funcionario a8 = new Funcionario(130L, "Ant�nio", "111.111.111-11");

			// Listagem de funça
			List<Funcionario> lista = new ArrayList<Funcionario>();
			lista.add(a1);
			lista.add(a2);
			lista.add(a3);
			lista.add(a4);
			lista.add(a5);
			lista.add(a6);
			lista.add(a7);
			lista.add(a8);

			

			FuncionarioDAO dao = new FuncionarioDAO();
			try {
				dao.gravarFuncionarios(lista);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			// Leitura
			List<Funcionario> novaLista = new ArrayList<Funcionario>();
			novaLista = dao.lerFuncionario();

			for (Funcionario funcionario : novaLista) {
				System.err.println(funcionario.getNome());
			}

		}

	}


