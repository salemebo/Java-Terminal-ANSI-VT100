package org.terminal.console.log.impl;

import org.terminal.console.log.Level;

public class Message implements org.terminal.console.log.api.Message {

	private Level level;
	private Class<?> classname;
	private String title;
	private String message;


	public Message(Level level, String message) {
		this.level = level;
		this.message = message;
	}
	
	public Message(Level level, String title, String message) {
		this.level = level;
		this.title = title;
		this.message = message;
	}
	
	public Message(Level level, Class<?> classname, String message) {
		this.level = level;
		this.classname = classname;
		this.message = message;
	}
	
	public Message(Level level, Class<?> classname, String title, String message) {
		this.level = level;
		this.classname = classname;
		this.title = title;
		this.message = message;
	}
	
	@Override
	public Level getLevel() {
		return level;
	}

	@Override
	public Class<?> getClassname() {
		return classname;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		StringBuilder log = new StringBuilder();
		log.append("[ " + level.toString() + " ] ");
		if (classname != null)
			log.append("[ " + classname.getSimpleName() + " ] ");
		if (title != null)
			log.append("[ " + title + " ]");
		String line = log.toString();
		return line + " " + message.replace("\n", "\n" + line + " ");
	}

}
