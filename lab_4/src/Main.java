//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Osoba z1_1 = new Osoba(13,"Ania");
    Osoba z1_2 = new Osoba(20,"Karol");
    Osoba z1_3 = new Osoba(17,"Paweł");

    Student z2_1 = new Student("marek","grzech","robot",3,3);
    Student z2_2 = new Student(z1_1,2);
    Student z2_3 = new Student(z1_2,"informatyk");
    //Student z2_4 = new Student();


    System.out.println(z2_3.getWiek());


    }
}