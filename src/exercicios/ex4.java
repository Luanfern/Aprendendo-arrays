package exercicios;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		int vnum[] = new int [9];
		int l = 0;
		int x = 5;
		
		
		 for (  int i = 0; i <= 10; i++)
		 {  
			 
			 l = i + 1;
			 vnum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + l + " º Número : "));
			 
		    int n =  vnum[i] ;
		    for (int y = i; y < i; i--) {
			n = n *  (  n  - 1) ; }
		    

		  System.out.println( vnum[i] +" != " + n);

		 }
	}
}
