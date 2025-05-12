import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zad3 {
    public static void main(String[] args) {
        List<Uczestnik> Lista = new ArrayList<>();
        Lista.add(new Uczestnik("Adaś",32,1));
        Lista.add(new Uczestnik("Janja",27,2));
        Lista.add(new Uczestnik("Filip",13,3));
        List<Uczestnik> Lista_L = new LinkedList<>();
        Lista_L.addAll(Lista);
        System.out.println("pełnoletni: ");
        for (Uczestnik u : Lista){
            System.out.println(u);
        }
        System.out.println("niepełnoletni: ");
        for (Uczestnik u : Lista_L){
            if (u.getWiek() < 18){
            System.out.println(u);
        }
        }
    }
}
