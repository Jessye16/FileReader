package com;


public class RevReader extends TxtReader{
	
	public RevReader(String filename){
		super(filename);
	}
	
	@Override
	public String transform(String s){ //Je m'appelle -> elleppa'm eJ
		String[] buff = s.split(" ");
		for(String st : buff){
			StringBuilder sb = new StringBuilder();
			sb.append(st.charAt(0));
			for(int i=1; i<st.length(); i++){
				sb.append(st.charAt(st.length()-1-i));
			}
			st = sb.toString();
		}
		String st2="";
		for(int i=0; i<buff.length; i++){
			if(i!=buff.length-1)
				st2+=buff[i]+" ";
			else
				st2+=buff[i];
		}
		return st2;
	}
	

}
