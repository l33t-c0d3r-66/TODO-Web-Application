package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.Note;
import com.util.FactoryProvider;

/**
 * Servlet implementation class DeleteNote
 */
public class DeleteNote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteNote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			int noteId = Integer.parseInt(request.getParameter("note_id"));
			SessionFactory factory = FactoryProvider.getSessionFactory();
			Session hibernateSession = factory.openSession();
			Transaction hibernateTransaction = hibernateSession.beginTransaction();
			Note note = (Note) hibernateSession.get(Note.class, noteId);
			hibernateSession.delete(note);
			hibernateTransaction.commit();
			hibernateSession.close();
			response.sendRedirect("all_notes.jsp");
		}catch(Exception e) {
			System.out.println(e);
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
