package exercicios;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		int v[] = new int [10];
		int contp = 0, somai = 0, i = 0, l = 0;
		for (i = 0; i <= 9; i++) {
			
			l = i + 1;
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + l + " � n�mero " ));
			
			if (v[i] % 2 == 1)
			{
				somai += v[i];
			}
			else 
			{
				contp ++ ;
			}
			
		}
		JOptionPane.showMessageDialog(null, "A soma de n�meros impares � de : "+ somai + "\n E a quantidade de n�meros pares � de : "+  contp);
		

	}

}

