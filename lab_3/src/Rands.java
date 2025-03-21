import java.util.Random;
public class Rands
{
    public static int[] RandVal (int a, int b, int ilosc){
        Random rand1 = new Random();
        int[] val = new int[ilosc];
        for (int i = 0; i < ilosc;i++) {
            val[i] = rand1.nextInt(b-a+1)+a;
        }
        return val;
    }
}
