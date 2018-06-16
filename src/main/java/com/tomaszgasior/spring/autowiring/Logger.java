package com.tomaszgasior.spring.autowiring;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	public void setConsoleWriter(ConsoleWriter consoleWriter){
		this.consoleWriter = consoleWriter;
	}
	public void setFileWriter(FileWriter fileWriter){
		this.fileWriter = fileWriter;
	}
	
	public void cwrite(String text){
		consoleWriter.write(text);
	}
	public void fwrite(String text){
		fileWriter.write(text);
	}

}
