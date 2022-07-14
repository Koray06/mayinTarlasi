package mayınTarlasi;

import java.util.Scanner;

public class MayinTarlasiMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Satir sayisi : ");
        int a = input.nextInt();
        System.out.print("Sutun sayisi : ");
        int b = input.nextInt();
        String[][] alan = mayinTarlasi .mayinTarlasiAlani(a, b);
        String[][] bosAlan = mayinTarlasi .bosAlan(a, b);
        mayinTarlasi .print(bosAlan);

//        MineSweeper.print(alan);

        mayinTarlasi .check(alan, bosAlan, a, b);
		
	}

}
