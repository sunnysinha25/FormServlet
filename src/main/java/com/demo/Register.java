package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		var name = request.getParameter("name");
		var email = request.getParameter("email");
		var gender = request.getParameter("gender");
		var pl = request.getParameter("prog_lang");
		var terms = request.getParameter("terms");

		PrintWriter out = response.getWriter();

		if (isChecked(terms)) {
			out.append("WELCOME! " + name)
			.append("\nNAME: " + name)
			.append("\nGENDER: " + gender)
			.append("\nEMAIL: " + email)
			.append("\nCOURSE: " + pl)
			.append("\nTERMS AND CONDITIONS ACCEPTED!");

		} 
		else
			out.append("TERMS AND CONDITIONS NOT ACCEPTED!");
	}

	private boolean isChecked(String terms) {
		// TODO Auto-generated method stub
		return terms != null;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
