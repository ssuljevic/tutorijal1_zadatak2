package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Unesite broj n: ");
        int n;
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();

        for( int i = 1; i <= n; i++ ){
            if( i % sumaCifara(i) == 0)
                System.out.print(i + " ");
        }
    }

    private static int sumaCifara(int broj){
        int suma = 0;
        while( broj > 0 ){
            suma = suma + (broj % 10);
            broj = broj / 10;
        }
        return suma;
    }
}
