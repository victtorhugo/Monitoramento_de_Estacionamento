package Projeto_final;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Main
{

	public static void main (String[] args) 
	{
    Scanner leitura = new Scanner (System.in);	
	PortaSerial comunicacao_1= new PortaSerial();
	GregorianCalendar tempo = new GregorianCalendar();	
	SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'");	
    boolean verificador=false;
	
    Atualizador atualizador_1 = new Atualizador();
	Thread T_atualizador_1 = new Thread(atualizador_1);
	T_atualizador_1.start();
	
	 while(true)	
	 {
		 
	   if(Atualizador.habilitacao_mtm.retorna_controle_monitor()==false)
		 {
		   System.out.print("Digite a opção: ");
		  
		 }
	     String opcao=leitura.next();
		 if (opcao.equalsIgnoreCase("c"))
		 {
			 System.out.print("Digite a vaga: ");
			 opcao=leitura.next();
			 System.out.println();
			
			 if (opcao.equalsIgnoreCase("V1"))
			 {
				 if(Atualizador.vaga_1.retorna_status().equals("VAGA OCUPADA"))
				 {
				   System.out.println(Atualizador.vaga_1.retorna_status()+" desde: "+ Atualizador.vaga_1.get_hora_ocupada());
				 }
				 else
				 {
				   System.out.println(Atualizador.vaga_1.retorna_status()+" desde: "+ Atualizador.vaga_1.get_hora_desocupada());	 
				 }
			 }
			 if (opcao.equalsIgnoreCase("V2"))
			 {
				 if(Atualizador.vaga_2.retorna_status().equals("VAGA OCUPADA"))
				 {
				   System.out.println(Atualizador.vaga_2.retorna_status()+" desde: "+ Atualizador.vaga_2.get_hora_ocupada());
				 }
				 else
				 {
				   System.out.println(Atualizador.vaga_2.retorna_status()+" desde: "+ Atualizador.vaga_2.get_hora_desocupada());	 
				 }
			 }
			 if (opcao.equalsIgnoreCase("V3"))
			 {
				 if(Atualizador.vaga_3.retorna_status().equals("VAGA OCUPADA"))
				 {
				   System.out.println(Atualizador.vaga_3.retorna_status()+" desde: "+ Atualizador.vaga_3.get_hora_ocupada());
				 }
				 else
				 {
				   System.out.println(Atualizador.vaga_3.retorna_status()+" desde: "+ Atualizador.vaga_3.get_hora_desocupada());	 
				 }
			 }
			 
			 if (opcao.equalsIgnoreCase("V4"))
			 {
				 if(Atualizador.vaga_4.retorna_status().equals("VAGA OCUPADA"))
				 {
				   System.out.println(Atualizador.vaga_4.retorna_status()+" desde: "+ Atualizador.vaga_4.get_hora_ocupada());
				 }
				 else
				 {
				   System.out.println(Atualizador.vaga_4.retorna_status()+" desde: "+ Atualizador.vaga_4.get_hora_desocupada());	 
				 }
			 }
			 System.out.println();
		 }
		 
		 if (opcao.equalsIgnoreCase("vl"))
		 {
			 System.out.println();
			 if (Atualizador.vaga_1.retorna_status().equals("VAGA DESOCUPADA"))
			 {
				 System.out.println("VAGA 1 LIVRE DESDE: "+ Atualizador.vaga_1.get_hora_desocupada() );
				 verificador=true;
			 }
			 if (Atualizador.vaga_2.retorna_status().equals("VAGA DESOCUPADA"))
			 {
				 System.out.println("VAGA 2 LIVRE DESDE: "+ Atualizador.vaga_2.get_hora_desocupada() );
				 verificador=true;
			 }
			 if (Atualizador.vaga_3.retorna_status().equals("VAGA DESOCUPADA"))
			 {
				 System.out.println("VAGA 3 LIVRE DESDE: "+ Atualizador.vaga_3.get_hora_desocupada() );
				 verificador=true;
			 }
			 if (Atualizador.vaga_4.retorna_status().equals("VAGA DESOCUPADA"))
			 {
				 System.out.println("VAGA 4 LIVRE DESDE: "+ Atualizador.vaga_4.get_hora_desocupada() );
				 verificador=true;
			 }
			 if (verificador==false)
			 {
				 System.out.println("NENHUMA VAGA LIVRE");
			 }
			 verificador=false;
			 System.out.println();
		 }
		 
		 if (opcao.equalsIgnoreCase("vo"))
		 {
			 System.out.println();
			 if (Atualizador.vaga_1.retorna_status().equals("VAGA OCUPADA"))
			 {
				 System.out.println("VAGA 1 OCUPADA DESDE "+ Atualizador.vaga_1.get_hora_ocupada());
				 verificador=true;
			 }
			 if (Atualizador.vaga_2.retorna_status().equals("VAGA OCUPADA"))
			 {
				 System.out.println("VAGA 2 OCUPADA DESDE "+ Atualizador.vaga_2.get_hora_ocupada());
				 verificador=true;
			 }
			 if (Atualizador.vaga_3.retorna_status().equals("VAGA OCUPADA"))
			 {
				 System.out.println("VAGA 3 OCUPADA DESDE "+ Atualizador.vaga_3.get_hora_ocupada());
				 verificador=true;
			 }
			 if (Atualizador.vaga_4.retorna_status().equals("VAGA OCUPADA"))
			 {
				 System.out.println("VAGA 4 OCUPADA DESDE "+ Atualizador.vaga_4.get_hora_ocupada());
				 verificador=true;
			 }
			 if (verificador==false)
			 {
				 System.out.println("NENHUMA VAGA OCUPADA");
			 }
			 verificador=false;
			 System.out.println();
		 }
		 
		 if(opcao.equalsIgnoreCase("m"))
		 {   
		   System.out.println();
		   System.out.println();
		   System.out.println();
		   System.out.println();
		   System.out.println();
		   System.out.println();
		
	       Atualizador.habilitacao_mtm.seta_controle_monitor();
	      
		 }
		 if(opcao.equalsIgnoreCase("mo"))
		 {
			
		  Atualizador.habilitacao_mtm.reseta_controle_monitor();
		  System.out.println();
	      System.out.println();
	      System.out.println();
	      System.out.println();
	      System.out.println();
	      System.out.println();
			 
		 } 
	 }
	
 }
}

