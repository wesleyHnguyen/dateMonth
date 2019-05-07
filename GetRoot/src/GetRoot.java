import java.util.Scanner;

public class GetRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first param (a): ");
        double a = scanner.nextDouble() ;
        System.out.print("Enter the second param (b): ");
        double b = scanner.nextDouble() ;
        System.out.print("Enter the third param (c): ");
        double c = scanner.nextDouble() ;


        QuadricEquation quadric = new QuadricEquation(a, b, c);

        if (quadric.getDiscriminant() > 0){
            System.out.println("The equation has two roots: " + quadric.getRoot1() + " and " + quadric.getRoot2());
        }else if(quadric.getDiscriminant() == 0){
            System.out.println("The equation has one root: " + quadric.getRoot1());
        }else System.out.println("The equation has no real root.");
    }
}
