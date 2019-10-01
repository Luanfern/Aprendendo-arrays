package exercicios;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		double vnum[] = new double [100];
		double md = 0, acum = 0;
		int qtd = 0, i = 0, l = 0;
		for (i = 0; i <= 99; i++) {
			l = i + 1;
			vnum[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + l + "º número "));
			acum += vnum[i];
		}
		md = acum / 100;
		for( i = 0; i <= 99; i++)
		{
			if (vnum[i] > md)
			{
				qtd ++;
			}
		}
			
			JOptionPane.showMessageDialog(null, "A média é : "+ md + "\n A quantidade de valores acima da média é : "+ qtd);

	}

}
