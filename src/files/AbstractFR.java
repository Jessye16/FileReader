package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractFR implements FileReaderInterface{

	File f;
	
	public AbstractFR(String filename){
		f = new File(filename+"txt"); // création nouveau fichier txt
	}
	
	@Override
	public void run(){ // permet l'affichage 
		try{
			FileReader fr = new FileReader(f); //méthode pour lire caractères du fichier créé
			BufferedReader br = new BufferedReader(fr); // méthode pour lire ces caractères ligne par ligne
			try{
				String line = br.readLine(); //lit une ligne
				System.out.println(transform(line)); //selon la classe appliqué, cette ligne sera transformée grâce à la méthode transform()
				while(line!=null){ //tant qu'il y a des lignes à lire, on continue le processus
					line=br.readLine();
					System.out.println(transform(line));
				}
				br.close();
				fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

	@Override
	public abstract String transform(String s);

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}
	
}
