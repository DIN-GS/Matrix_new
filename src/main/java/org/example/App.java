package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException{
        System.out.println( "New Matrix homework" );
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int[][] mas = new int[n][m];

        for (int i =0; i < mas.length; i++){
            for (int j =0; j < mas[0].length; j++){
                n = Integer.parseInt(reader.readLine());
                mas[i][j] = n;
            }

        }

        transponyvanya(mas);

    }

    public static int[][] transponyvanya(int[][] mas){
        int[][] mas2 = new int[mas[0].length][mas.length];

        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[0].length; j++){
                System.out.print(mas[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mas2.length; i++){
            for (int j = 0; j < mas2[0].length; j++){
                mas2[i][j] = mas[j][i];
            }
        }

        for (int i = 0; i < mas2.length; i++){
            for (int j = 0; j < mas2[0].length; j++){
                System.out.print(mas2[i][j]+ " ");
            }
            System.out.println();
        }

        return mas2;
    }
}
