package com.kihtenko.javaee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kihtenko.javaee.command.Command;
import com.kihtenko.javaee.command.CommandHelper;
import com.kihtenko.javaee.command.exception.CommandException;

@WebServlet( "/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String COMMAND_NAME = "command";
       
	private final CommandHelper commandHelper = new CommandHelper();
	
    public Controller() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String commandName = null;
		Command command = null;
		String page = null;
		
		try{
			commandName = request.getParameter(COMMAND_NAME);
			command = commandHelper.getCommand(commandName);
			page = command.execute(request);			
		}catch(CommandException e){
			// logging
			page = PageName.ERROR_PAGE;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		if (dispatcher != null){
			dispatcher.forward(request, response);
		}else{
			// to do
		}
		
	}

}
