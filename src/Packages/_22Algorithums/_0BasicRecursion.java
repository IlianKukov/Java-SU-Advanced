package Packages._22Algorithums;
import java.util.Scanner;
public class _0BasicRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(pow(5,1));
        System.out.println(pow(2,5));

    }
    private static int pow(int num, int power){
        if (power == 1) { return num; }

        return num * pow(num, power - 1);
    }
}
//check tail recursion