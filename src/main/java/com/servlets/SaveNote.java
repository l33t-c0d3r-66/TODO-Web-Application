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
 * Servlet implementation class SaveNote
 */
public class SaveNote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveNote() {
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
			String noteTitle = request.getParameter("title");
			String noteContent = request.getParameter("content");
			Note note = new Note(noteTitle, noteContent,new Date());
			System.out.println(note.getNoteTitle()+" "+note.getNoteContent());
			SessionFactory factory = FactoryProvider.getSessionFactory();
			Session hibernateSession = factory.openSession();
			Transaction hibernateTransaction = hibernateSession.beginTransaction();
			hibernateSession.save(note);
			hibernateTransaction.commit();
			hibernateSession.close();
			response.sendRedirect("index.jsp");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
