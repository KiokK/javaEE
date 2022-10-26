package com.kihtenko.javaee.command;

import com.kihtenko.javaee.command.exception.CommandException;

import javax.servlet.http.HttpServletRequest;

public interface Command {
	String execute(HttpServletRequest request) throws CommandException;
}
