package view;

import javax.swing.*;

import br.com.projeto.calc3000.Aparelho;
import br.com.projeto.calc3000.Eletrodomestico;
import br.com.projeto.calc3000.Eletroportatil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraEnergia extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField txtPotencia, txtTempo;
    private JComboBox<String> cbTipo;
    private JLabel lblResultado;
    private final static String[] TIPOS = {"Eletrodoméstico", "Eletroportátil"}; // Usando final
    
	public CalculadoraEnergia() {
        setTitle("Calculadora de Consumo Elétrico");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Potência (W):"));
	    txtPotencia = new JTextField();
        add(txtPotencia);

        add(new JLabel("Tempo (h):"));
        txtTempo = new JTextField();
        add(txtTempo);

        add(new JLabel("Tipo:"));
        cbTipo = new JComboBox<>(TIPOS);
        add(cbTipo);

        JButton btnCalcular = new JButton("Calcular");
        add(btnCalcular);

        lblResultado = new JLabel("Custo: R$ 0.00");
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
       	@Override
       	public void actionPerformed(ActionEvent e) {
            calcularCusto();
            }
        });

        setVisible(true);
    }

	private void calcularCusto() {
       try {
            double potencia = Double.parseDouble(txtPotencia.getText());
            double tempo = Double.parseDouble(txtTempo.getText());
            Aparelho aparelho;

            if (cbTipo.getSelectedItem().equals("Eletrodoméstico")) {
                aparelho = new Eletrodomestico(potencia, tempo);
            } else {
                aparelho = new Eletroportatil(potencia, tempo);
            }
            
	        lblResultado.setText(String.format("Custo: R$ %.2f", aparelho.calcularCusto()));
    } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira valores válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
       }

	public static void main(String[] args) {
        new CalculadoraEnergia();
    }
}

