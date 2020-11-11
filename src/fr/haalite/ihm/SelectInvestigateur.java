package fr.haalite.ihm;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.haalite.business.Investigateur;

/**
 * Servlet implementation class SelectInvestigateur
 */
@WebServlet("/SelectInvestigateur")
public class SelectInvestigateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectInvestigateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Investigateur investigateur = new Investigateur();
		investigateur.setNom("Lita Chantler");
		investigateur.setIdInvestigateur(1);
		investigateur.setVolonte(4);
		investigateur.setIntelligence(4);
		investigateur.setForce(2);
		investigateur.setAgilite(2);
		
		request.setAttribute("investigateur", investigateur);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/SelectInvestigateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
