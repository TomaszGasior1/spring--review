package com.tomaszgasior.spring.autowiring;

public class Logger {
	
	private Writer consoleWriter;
	private Writer fileWriter;
	
	public void setConsoleWriter(Writer consoleWriter){
		this.consoleWriter = consoleWriter;
	}
	public void setFileWriter(Writer fileWriter){
		this.fileWriter = fileWriter;
	}
	
	public void cwrite(String text){
		consoleWriter.write(text);
	}
	public void fwrite(String text){
		fileWriter.write(text);
	}

}
