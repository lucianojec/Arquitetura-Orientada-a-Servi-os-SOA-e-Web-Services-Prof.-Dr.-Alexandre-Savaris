package com.exercicio;

import java.io.FileWriter;  
import java.io.File;  
import java.io.IOException;
import java.util.Scanner;  

public class CriaArquivo {
	public static void main(String[] args) {  
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		String numero = s.nextLine();
		
        String textoQueSeraEscrito = numero;  
          
        FileWriter arquivo;  
          
        try {  
        	
        	File diretorio = new File("c:/exercicio"); 
        	if (!diretorio.exists()) {
        	   diretorio.mkdirs(); 
        	} 
        	
            arquivo = new FileWriter(new File("c:/exercicio/Arquivo.txt"));  
            arquivo.write(textoQueSeraEscrito);  
            arquivo.close();  
            
            System.out.println("Abrir programa 'InterpretaArquivo'.");
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
          
    }  
	
}