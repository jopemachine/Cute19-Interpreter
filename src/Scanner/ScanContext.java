package Scanner;

import java.io.File;
import java.io.FileNotFoundException;

import Char.*;

public class ScanContext {
	private final CharStream input;
	private StringBuilder builder;
	
	ScanContext(File file) throws FileNotFoundException {
		this.input = CharStream.from(file);
		this.builder = new StringBuilder();
	}
	
	public CharStream getCharStream() {
		return input;
	}
	
	public String getLexime() {
		String str = builder.toString();
		builder.setLength(0);
		return str;
	}
	
	public void append(char ch) {
		builder.append(ch);
	}
}
