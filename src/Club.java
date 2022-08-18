import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        System.out.println("Jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Czesc "+ name + " ile masz lat?");
        int age = scanner.nextInt();
        if (age >= 21){
            System.out.println("Masz wjazd na klub");
        } else {
            System.out.println("Nie wchodzisz");
        }


    }
}
