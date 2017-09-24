package Projeto_final;

public class Vaga
{
	 private String label;
	 public String Status;
	 private int primeiro_separador;
     private int segundo_separador;
     private String hora_inicio_ocupacao;
     private String hora_fim_ocupacao;
	
	//PortaSerial comunicacao_1= new PortaSerial();
	public Vaga(String label_p,int primeiro_separador_p,int segundo_separador_p)
	{
		this.label=label_p;
		this.primeiro_separador=primeiro_separador_p;
		this.segundo_separador=segundo_separador_p;
	}
	
	public String retorna_status()
	{
		//String[] temp=comunicacao_1.LeituraSerial().split("#");
		if(this.Status.equals("o"))
		{
			  return "VAGA OCUPADA";
		}
		else
		{
			  return "VAGA DESOCUPADA";
		}
	}
	
	 public void seta_hora_ocupada(String hora_p)
	 {
	  	this.hora_inicio_ocupacao=hora_p;
	 }
	 public void seta_hora_desocupada(String hora_p)
	 {
	  	this.hora_fim_ocupacao=hora_p;
	 }
	 public String get_hora_ocupada()
	 {
	  	return this.hora_inicio_ocupacao;
	 }
	 public String get_hora_desocupada()
	 {
	  	return this.hora_fim_ocupacao;
	 }
	 public void seta_status(String status_p)
	 {
		 this.Status=status_p;
	 }
}
