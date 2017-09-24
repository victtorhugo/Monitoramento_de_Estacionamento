package Projeto_final;

import gnu.io.CommPortIdentifier;
import java.util.Enumeration;
import gnu.io.SerialPortEvent;

public class SerialCom
{

  protected String[] portas;
  protected Enumeration listaDePortas;
  
  // construtor
  public SerialCom()
  {

      listaDePortas = CommPortIdentifier.getPortIdentifiers();

  }
  
  public String[] ObterPortas()
  {
      return portas;
  }

  
  //armazenar uma lista das portas seriais do sistema disponíveis para a comunicação

  protected void ListarPortas()
  {
      int i = 0;
      portas = new String[10];
      while (listaDePortas.hasMoreElements()) 
      {
          CommPortIdentifier ips =

          (CommPortIdentifier)listaDePortas.nextElement();

          portas[i] = ips.getName();

          i++;
      }

  }

 //identificar se a porta seleciona existe e está tudo em funcionamento com ela:
  
  public boolean PortaExiste(String COMp)
  {

      String temp;

      boolean e = false;

      while (listaDePortas.hasMoreElements()) 
      {

          CommPortIdentifier ips = (CommPortIdentifier)listaDePortas.nextElement();

          temp = ips.getName();

          if (temp.equals(COMp)== true)
          {

          e = true;
          }
      }

      return e;
   }
  
  
  
  
  

}
