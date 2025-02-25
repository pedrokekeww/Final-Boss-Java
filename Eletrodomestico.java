package br.com.projeto.calc3000;

//Eletrodoméstico herda de Aparelho e implementa TipoAparelho
public class Eletrodomestico extends Aparelho implements TipoAparelho {
 public Eletrodomestico() {}

 public Eletrodomestico(double potencia, double tempo) {
     super(potencia, tempo);
 }

 @Override
 public double calcularCusto() {
     return (getPotencia() * getTempo() / 1000) * PRECO_KWH;
 }

 @Override
 public String getTipo() {
     return "Eletrodoméstico";
 }
}
