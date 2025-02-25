package br.com.projeto.calc3000;

//Eletroportátil herda de Aparelho e implementa TipoAparelho
public class Eletroportatil extends Aparelho implements TipoAparelho {
 public Eletroportatil() {}

 public Eletroportatil(double potencia, double tempo) {
     super(potencia, tempo);
 }

 @Override
 public double calcularCusto() {
     return (getPotencia() * getTempo() / 1000) * PRECO_KWH * 1.1; // Taxa extra de 10% para eletroportáteis
 }

 @Override
 public String getTipo() {
     return "Eletroportátil";
 }
}
