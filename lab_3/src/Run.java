import java.util.Scanner;

public class Run {
    public void RunTasks(){
        int a, b, c;
        Tasks tasks = new Tasks();
        Scanner input = new Scanner(System.in);
        System.out.println("Lab 3");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n5. Zadanie 6\n5. Zadanie 7\n");
        System.out.println("Wybierz które zadanie rozwiązać.");
        int task = input.nextInt();
        switch(task){
            case 1:
                tasks.Tasks1();
                break;
            case 2:
                tasks.Tasks2();
                break;
            case 3:
                tasks.Tasks3();
                break;
            case 4:
                tasks.Tasks4();
                break;
            case 5:
                tasks.Tasks5();
                break;
            case 6:
                tasks.Tasks6();
                break;
            case 7:
                tasks.Tasks7();
                break;
            default:
                break;
        }
    }
}