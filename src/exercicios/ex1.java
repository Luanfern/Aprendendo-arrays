package exercicios;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		int v[] = new int [10];
		int contp = 0, somai = 0, i = 0, l = 0;
		for (i = 0; i <= 9; i++) {
			
			l = i + 1;
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + l + " º número " ));
			
			if (v[i] % 2 == 1)
			{
				somai += v[i];
			}
			else 
			{
				contp ++ ;
			}
			
		}
		JOptionPane.showMessageDialog(null, "A soma de números impares é de : "+ somai + "\n E a quantidade de nímeros pares é de : "+  contp);
		

	}

}

