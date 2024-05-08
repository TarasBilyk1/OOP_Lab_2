import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть номер завдання від 1 до 5 : ");
        Ex Task = new Ex();
        do {
            int TaskNumber = scan.nextInt();
            /*------------------------ Завдання 1-------------------------*/
            if (TaskNumber == 1) {
                Task.Task1();
            }
            /*------------------------ Завдання 2-------------------------*/
            else if (TaskNumber == 2){
                Task.Task2();
            }
            /*------------------------ Завдання 3-------------------------*/
            else if (TaskNumber == 3) {
                Task.Task3();
            }
            /*------------------------ Завдання 4-------------------------*/
            else if (TaskNumber == 4) {
                Task.Task4();
            }
            /*------------------------ Завдання 5-------------------------*/
            else if (TaskNumber == 5) {
                Task.Task5();
            }
            else {
                System.out.println("Такого завдання не існує ! ");
            }
            System.out.println(" ");
            System.out.println("Щоб завершити програму натисніть (0).Щоб продовжити виберіть завдання від 1 по 5");
            if (TaskNumber == 0) {
                break;
            }
        }while(true);
    }
}