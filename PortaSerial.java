package Projeto_final;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPortEvent;
import java.util.Enumeration;
import java.util.Scanner;

public class PortaSerial extends SerialCom
{

	String var="";
	public String LeituraSerial()
	{     

        //Iniciando leitura serial

        SerialComLeitura  leitura = new SerialComLeitura("COM7", 9600, 0);

        leitura.HabilitarLeitura();

        leitura.ObterIdDaPorta();

        leitura.AbrirPorta();
  
        var=leitura.LerDados();

        try{ 

            Thread.sleep(2000);
        

        } catch (InterruptedException ex) {

            System.out.println("Erro na Thread: " + ex);

        }
    
        
        leitura.FecharCom();

        return leitura.StringSerial;
    }
	

 
}
	
	

