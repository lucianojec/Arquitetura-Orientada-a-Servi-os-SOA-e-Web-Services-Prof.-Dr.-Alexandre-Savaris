package com.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApresentaResultado {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("c:/exercicio/Resultado.txt"));
			while(br.ready()){
				String numero = br.readLine();
				System.out.println("O resultado da operação é: " + numero);
			}
			br.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}
}