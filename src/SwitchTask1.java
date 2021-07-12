import java.util.Scanner;

public class SwitchTask1 {

    public static void main(String[] args) {

        //For example, if the day number is 10, it is January,
        // if day number is 32 - February,
        // if day number is 100 - April, etc

        short day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day of choice: ");
        day = scanner.nextShort();

        System.out.println("The day number is: " + day);

        if (day < 0){
            System.out.println("Day cannot be negative.");
        }else if (day > 365){
            System.out.println("Day cannot be more than 365.");
        }else{
            short month = (short)(Math.ceil(day / 30)+1);
            switch (month){
                case 1:
                System.out.println("It is January.");
                break;
                case 2:
                    System.out.println("It is February.");
                    break;
                case 3:
                    System.out.println("It is March.");
                    break;
                case 4:
                    System.out.println("It is April.");
                    break;
                case 5:
                    System.out.println("It is May.");
                    break;
                case 6:
                    System.out.println("It is June.");
                    break;
                case 7:
                    System.out.println("It is July.");
                    break;
                case 8:
                    System.out.println("It is August.");
                    break;
                case 9:
                    System.out.println("It is September.");
                    break;
                case 10:
                    System.out.println("It is October.");
                    break;
                case 11:
                    System.out.println("It is November.");
                    break;
                case 12:
                    System.out.println("It is December.");
                    break;
                default:
                    System.out.println("Dunno whats here....");
            }
        }


    }
}
