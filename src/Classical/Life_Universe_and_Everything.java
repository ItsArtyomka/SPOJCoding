package Classical;

import java.util.Scanner;

public class Life_Universe_and_Everything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean answer = false;
        while (!answer){
            int i = scanner.nextInt();
            if (i != 42){
                System.out.println(i);
            } else {
                answer = true;
                break;
            }
        }
    }
}
