package exercicios;

import javax.swing.JOptionPane;

public class ex3_2 {

	public static void main(String[] args) {
		int vnum[] = new int[5];
		int min = 0,max = 0;
		int pma = 0, pme = 0;
		int i = 0, l = 0;
		
		for(i = 0; i < vnum.length; i++) {
			
			l = i + 1;
			vnum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + l + " � n�mero " ));
			
			if (i == 0) {
				
				min = vnum[i];
				max = vnum[i];
			}
			
			if(vnum[i] > max) {
				
				max = vnum[i];
				pma = i + 1;
			}
			
			if(vnum[i] < max) {
				
				min = vnum[i];
				pme = i + 1;
			}
	}
		
		JOptionPane.showMessageDialog(null, "O maior n�mero � : " + max + "na posi��o : " + pma + "\n O menor n�mero � : "+ min + " na posi��o : " + pme);

}
}
