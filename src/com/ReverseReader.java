package com;



public class ReverseReader extends TxtReader {
	
	public ReverseReader(String filename){
		super(filename);
	}
	
	@Override
	public String transform(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++){
			sb.append(s.charAt(s.length()-1-i));
		}
		return sb.toString();
	}
	
	
	
}
