import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Servlets de Cadastro de Alunos", urlPatterns = { "/svlAluno" })
public class svlAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public svlAluno() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Aluno aluno = new Aluno();
		
		aluno.setRa(Integer.parseInt(request.getParameter("ra")));
		aluno.setNome(request.getParameter("nome"));
		aluno.setNota(Float.parseFloat(request.getParameter("nota")));
		aluno.setDivida(Float.parseFloat(request.getParameter("divida")));
		
		//Estabelecendo minha conexão
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("computacao");
		
		//Criando um manager da conexão
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		response.getWriter().append("Aluno Cadastrado com Sucesso");
		
	}
}
