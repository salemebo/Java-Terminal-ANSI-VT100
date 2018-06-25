package org.terminal.ansi.display;

public enum Colour {
	Black(30),
	Red(31),
	Green(32),
	Yellow(33),
	Blue(34),
	Magenta(35),
	Cyan(36),
	White(37),
	
	Default(39),
	
	Gray(90),
	RedLight(91),
	GreenLight(92),
	YellowLight(93),
	BlueLight(94),
	MagentaLight(95),
	CyanLight(96),
	GrayLight(97);
	
	private int code;
	private int codebg;
	private Colour(int code) {
		this.code = code;
		this.codebg = code+10;
	}
	
	public int getCode() {
		return code;
	}
	
	public int getCodebg() {
		return codebg;
	}
	
	@Override
	public String toString() {
		return color();
	}
	
	
	public String color() {
		return "\u001B["+code+'m';
	}
	
	public String colorbg() {
		return "\u001B["+codebg+'m';
	}
}