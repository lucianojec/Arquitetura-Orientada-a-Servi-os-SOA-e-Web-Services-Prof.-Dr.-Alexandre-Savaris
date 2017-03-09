package com.exercicio;

import java.io.*;
import java.util.Scanner;

public class InterpretaArquivo {
	
	
	static double resultado; 
	public static void main(String[] args) {
		String numero = null;
		
		try{
	         BufferedReader br = new BufferedReader(new FileReader("c:/exercicio/Arquivo.txt"));
	         while(br.ready()){
	            numero = br.readLine();
	            System.out.println("O n�mero que cont�m no arquivo �: " + numero);
	         }
	         br.close();
	      }catch(IOException ioe){
	         ioe.printStackTrace();
	      }
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Escolha uma das op��es que deseja: \n 01: Somar \n 02: Subtrair \n 03: Multiplicar  \n 04: Dividir: \n Op��o escolhida: ");
		int num3= sc.nextInt();
		
		
		System.out.println ("Digite o n�mero que deseja realizar a opera��o: ");
		double num1=sc.nextDouble();
		
		double num2= Integer.parseInt(numero);
	
		
		switch (num3)
		{
		case 1:
			resultado = num1+num2;
			break;
		case 2:
			resultado = num1-num2;
			break;
		case 3:
			resultado = num1*num2;
			break;
		case 4:
			resultado = num1/num2;
			break;
		}
		
		FileWriter arquivo;
		 try {  
	            arquivo = new FileWriter(new File("c:/exercicio/Resultado.txt"));  
	            arquivo.write(Double.toString(resultado));  
	            arquivo.close();  
	            
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        } 
		
		System.out.println("Abra o programa 'ApresentaResultado' para ver o resultado");
	}

}
