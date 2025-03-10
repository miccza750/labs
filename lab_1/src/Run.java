
import java.util.Scanner;
public class Run {
    public void RunTasks(){
        int a, b, c;
        Tasks tasks = new Tasks();
        Scanner input = new Scanner(System.in);
        System.out.println("LAB 1");
        System.out.println("Wybierz nr. zadania od 1 do 7: ");
        int task = input.nextInt();
        switch(task){
            case 1:
                tasks.Task1();
                break;
            case 2:
                tasks.Task2();
                break;
            case 3:
                System.out.println("liczba :");
                a = input.nextInt();
                tasks.Task3(a);
                break;
            case 4:
                System.out.println("liczba: ");
                a = input.nextInt();
                System.out.print(tasks.Task4(a));
                tasks.Task4(a);
                break;
            case 5:
                System.out.println("liczba: ");
                a = input.nextInt();
                tasks.Task5(a);
                break;
            case 6:
                System.out.println("liczba: ");
                a = input.nextInt();
                tasks.Task6(a);
                break;
            case 7:
                System.out.println("pierwsza liczba: ");

                a = input.nextInt();

                System.out.println("druga liczba: ");
                b = input.nextInt();

                System.out.println("trzecia liczba: ");
                c = input.nextInt();
                tasks.Task7(a, b, c);
                break;
            default:
                System.out.println("błąd");
                break;
        }
    }
}

