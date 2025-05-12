import java.util.*;

public class Zad5 {
    public static void main(String[] args) {
        List<Integer> lista_1 = new ArrayList<>(Arrays.asList(2,3,32,1,23));
        List<Integer> lista_2 = new ArrayList<>();
        for (int i = lista_1.size()-1; i !=-1; i--) {
            lista_2.add(lista_1.get(i));
        }
        System.out.println("Oryginalna lista: " + lista_1);
        System.out.println("Odwrotna lista:   " + lista_2);
    }
}
