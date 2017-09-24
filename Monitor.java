package Projeto_final;

public class Monitor
{
  private boolean controle_monitor=false;
  
  public void seta_controle_monitor()
  {
	  this.controle_monitor=true;
  }
  
  public void reseta_controle_monitor()
  {
	  this.controle_monitor=false;
  }
	
  public boolean retorna_controle_monitor()
  {
	  return  this.controle_monitor;
  }
}
