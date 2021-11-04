package com.servlets;

import java.io.IOException;
import java.util.Date;

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
 * Servlet implementation class UpdateNote
 */
public class UpdateNote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateNote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			int noteId = Integer.parseInt(request.getParameter("id"));
			String noteTitle = request.getParameter("title");
			String noteContent = request.getParameter("content");
			SessionFactory factory = FactoryProvider.getSessionFactory();
			Session hibernateSession = factory.openSession();
			Transaction hibernateTransaction = hibernateSession.beginTransaction();
			Note note = hibernateSession.get(Note.class,noteId);
			note.setNoteTitle(noteTitle);
			note.setNoteContent(noteContent);
			note.setDateAdded(new Date());
			hibernateTransaction.commit();
			hibernateSession.close();
			response.setContentType("text/html");
			response.sendRedirect("all_notes.jsp");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
