import java.util.ArrayList;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
    List<Dom> listaDomow = new ArrayList<>();
    listaDomow.add(new Dom(23));
    listaDomow.add(new Dom(233));
    listaDomow.add(new Dom(213));
    listaDomow.add(new Dom(2123));

    List<Dom> podlista = listaDomow.subList(0, 3);
    podlista.clear();

    }
}
