/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX4;

import java.util.Scanner;

/**
 *
 * @author orozi
 */
public class Main {

    public static int rec(int n, int exp) {
        if (exp == 0) {
            return 1;
        }
        return n * rec(n, exp - 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de n:");
        n = leitor.nextInt();
        System.out.println("Digite o valor da potencia");
        int pot = leitor.nextInt();
        System.out.println(rec(n, pot));
    }
}
