package Projeto_final;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Atualizador implements Runnable
{
  Scanner leitura = new Scanner (System.in);	
  static PortaSerial comunicacao_1= new PortaSerial();
  static Vaga  vaga_1= new Vaga("V1",0,1);
  static Vaga  vaga_2= new Vaga("V2",2,3);
  static Vaga  vaga_3= new Vaga("V3",4,5);
  static Vaga  vaga_4= new Vaga("V4",6,7);
  //static GregorianCalendar tempo = new GregorianCalendar();
  SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'");	
  private int controle_ocupacao_hora_1=2;
  private int controle_ocupacao_hora_2=2;
  private int controle_ocupacao_hora_3=2;
  private int controle_ocupacao_hora_4=2;
  private boolean entrada_unica_tempo_inicial=true;
  static boolean controle=false;
  static Monitor habilitacao_mtm=new Monitor();
  boolean temp;
  boolean verificador;
  public void run()
  {
	  String[]  leitura_controle = new  String[9];
	  leitura_controle[1]="d";
	  leitura_controle[3]="d";
	  leitura_controle[5]="d";
	  leitura_controle[7]="d";
	  while(true)
	  {
	
	   if(temp==true)
		{
		  System.out.println(); 
	      System.out.println(); 
		}	
      GregorianCalendar tempo = new GregorianCalendar();  
	  leitura_controle=comunicacao_1.LeituraSerial().split("#");
	  temp=habilitacao_mtm.retorna_controle_monitor();
	  
	  // Coleta da data e hora inicial INICIO
	 if(entrada_unica_tempo_inicial==true) 
	 {
		  if (leitura_controle[1].equals("o"))
		  {  
			vaga_1.seta_hora_ocupada(formatador.format(tempo.getTime())); 
		  }
		  else
		  { 
		    vaga_1.seta_hora_desocupada(formatador.format(tempo.getTime()));
		  }
		  
		  if (leitura_controle[3].equals("o"))
		  {  
			vaga_2.seta_hora_ocupada(formatador.format(tempo.getTime())); 
		  }
		  else
		  { 
		    vaga_2.seta_hora_desocupada(formatador.format(tempo.getTime()));
		  }
		  
		  if (leitura_controle[5].equals("o"))
		  {  
			vaga_3.seta_hora_ocupada(formatador.format(tempo.getTime())); 
		  }
		  else
		  { 
		    vaga_3.seta_hora_desocupada(formatador.format(tempo.getTime()));
		  }
		  if (leitura_controle[7].equals("o"))
		  {  
			vaga_4.seta_hora_ocupada(formatador.format(tempo.getTime())); 
		  }
		  else
		  { 
		    vaga_4.seta_hora_desocupada(formatador.format(tempo.getTime()));
		  }
		  entrada_unica_tempo_inicial=false;
	}
	  
	  
	// Coleta da data e hora inicial FIM
	  
	  
	  // Vaga_1
	  
	  if (leitura_controle[1].equals("o"))
	  {  
		 vaga_1.seta_status("o");
		 if (controle_ocupacao_hora_1==0)
		 {
			vaga_1.seta_hora_ocupada(formatador.format(tempo.getTime())); 
			
		 }
		 controle_ocupacao_hora_1=1;
		
	  }
	  else
	  {   verificador=true;
		  if(temp==true)
			 {
				 System.out.println("-VAGA 1 LIVRE-"); 
			 }
		 if(controle_ocupacao_hora_1==1)
		 {
			vaga_1.seta_hora_desocupada(formatador.format(tempo.getTime()));
		 }
		
		 vaga_1.seta_status("d");
		 controle_ocupacao_hora_1=0;
	  }
	  // Vaga_2
	  if (leitura_controle[3].equals("o"))
	  {  
	
		 vaga_2.seta_status("o");
		 if (controle_ocupacao_hora_2==0)
		 {
			vaga_2.seta_hora_ocupada(formatador.format(tempo.getTime())); 
		 }
		 controle_ocupacao_hora_2=1;
	  }
	  else
	  { 
		 verificador=true;
		 if(temp==true)
			 {
				 System.out.println("-VAGA 2 LIVRE-"); 
			 }
		 if(controle_ocupacao_hora_2==1)
		 {
			vaga_2.seta_hora_desocupada(formatador.format(tempo.getTime()));
		 }
		 vaga_2.seta_status("d");
		 controle_ocupacao_hora_2=0;
	  }
	  // Vaga_3
	  if (leitura_controle[5].equals("o"))
	  {  

		 vaga_3.seta_status("o");
		 if (controle_ocupacao_hora_3==0)
		 {
			vaga_3.seta_hora_ocupada(formatador.format(tempo.getTime())); 
		 }
		 controle_ocupacao_hora_3=1;
		 
	  }
	  else
	  {
		 verificador=true;
		 if(temp==true)
		 {
			 System.out.println("-VAGA 3 LIVRE-"); 
		 }
		 if(controle_ocupacao_hora_3==1)
		 {
			vaga_3.seta_hora_desocupada(formatador.format(tempo.getTime()));
		 }
		 vaga_3.seta_status("d");
		 controle_ocupacao_hora_3=0;
	  }
	  // Vaga_4
	  if (leitura_controle[7].equals("o"))
	  {  
	
		 vaga_4.seta_status("o");
		 if (controle_ocupacao_hora_4==0)
		 {
			vaga_4.seta_hora_ocupada(formatador.format(tempo.getTime())); 
		 }
		 controle_ocupacao_hora_4=1;
		 
	  }
	  else
	  {
		  verificador=true;
		  if(temp==true)
			 {
				 System.out.println("-VAGA 4 LIVRE-"); 
			 }
		 if(controle_ocupacao_hora_4==1)
			 {
				vaga_4.seta_hora_desocupada(formatador.format(tempo.getTime()));
			 }
		 vaga_4.seta_status("d");
		 controle_ocupacao_hora_4=0;
	  }
	  if (verificador==false)
		 {   
		  if(temp==true)
		  {
			 System.out.println("NENHUMA VAGA LIVRE");
		  }
		 }
	  verificador=false;
	  if(temp==true)
		 {
			 System.out.println(); 
			 System.out.println(); 
		 }
	  
	  
	  }
	 
	   
  }
  

  
}
