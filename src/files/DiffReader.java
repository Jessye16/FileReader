package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DiffReader extends AbstractFR {

	public DiffReader(String filename) {
		super(filename);
	}

	@Override
	public String transform(String s) {
		return s;
	}
	
	public String diff(String file){
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			FileReader fr2 = new FileReader(getF());
			BufferedReader br2 = new BufferedReader(fr2);
			int i=1;
			try{
				String line = br.readLine();
				String line2 = br2.readLine();
				StringBuilder sb = new StringBuilder();
				while(line!=null&&line2!=null){
					if(!line.equals(line2)){
						System.out.println("line "+i+": "+line);
						sb.append("line "+i+": "+line+"\n");
					}
					line=br.readLine();
					line2=br2.readLine();
					i++;
					
				}
				br.close();
				br2.close();
				fr.close();
				br.close();
				return sb.toString();
			}catch(IOException e){
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} throw new RuntimeException();
	}

}
