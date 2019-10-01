package exercicios;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		
		
		double q[] = new double [2];
		double p[] = new double [2];
		int i = 0, m = 0;
		double s = 0, f = 0;
		
		for (i = 0; i<= 1; i++) {
			m = i + 1;
			q[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade comprada do " + m + "º item"));
			p[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do " + m + "º item"));
			s += p[i];
			f = s*q[i];
		}
		
		JOptionPane.showMessageDialog(null, "O faturamento total das mercadorias é de: R$" + f);
		
	}
	}
