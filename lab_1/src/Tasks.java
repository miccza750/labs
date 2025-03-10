import java.util.Scanner;

public class Tasks {
    public void Task1(){
        System.out.println("Michał, 19");
    }
    public void Task2(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public boolean Task3(int num){
        if (num % 2 ==0){
            return true;
        }
        return false;
    }
    public boolean Task4(int num){
        if(num % 5 == 0 & num % 3 == 0){
            return true;
        }
        return false;
    }
    public double Task5(int num){
        return Math.pow(num, 5);
    }
    public double Task6(int num){
        return Math.sqrt(num);
    }
    public boolean Task7(int a, int b, int c){
        int a1 = Math.min(a,b);
        a1 = Math.min(a,c);
        int c1 = Math.max(a,b);
        c1 = Math.max(a,c);
        if((a*a + a1+a1 == c1*c1) || (b*b + a1+a1 == c1*c1) || (c*c + a1+a1 == c1*c1)){
            System.out.printf("j");
            return true;

        }else{
            return false;
        }

    }
}