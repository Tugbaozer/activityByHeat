import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.println("Activity suggestion according to the temperature value you have given . ");
        System.out.print("Enter the heat: ");
        heat = inp.nextInt();

        if (heat <= 5){
            System.out.println("You can go to ski. ");
        } else if (heat >= 5 && heat <= 10) {
            System.out.println("You can go to the cinema.");
        } else if (heat >= 10 && heat <= 15) {
            System.out.println("You can go to the cinema and go to the picnic.");
        } else if (heat >= 15 && heat <= 25) {
            System.out.println("You can go to the picnic.");
        }else {
            System.out.println("You can go to the swim. ");

        }
    }
}