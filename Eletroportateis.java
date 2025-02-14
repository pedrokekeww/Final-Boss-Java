package Projeto;
public class Eletroportateis extends Eletronico {
 public double tempo; 	// Em horas
	public double energia;
	Eletroportateis(String nome, String modelo, double potencia, double tempo){
		super(nome, modelo, potencia);
		this.tempo = tempo;
	}
      
	@Override
	public void calcEnergia() {
		energia = (potencia/1000) * tempo;
	}
        @Override
	public double calcEnergia7() {
		return energia * 7;
	}
        @Override
	public double calcEnergia30() {
		return energia * 30;
	}
       @Override
	public double calcEnergia365() {
		return energia * 365;
	}
}


}
