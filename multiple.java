import java.util.Scanner;
public class multiple{
    static public void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.print("What number would you like to print the multiples of? ");
        int m = reader.nextInt();
        for (int j = m; j <= 1000; j+=m) System.out.println(j);
    }
}