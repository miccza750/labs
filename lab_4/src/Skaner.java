import java.util.Scanner;

public class Skaner {
    public static Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Student nowy_student = new Student();
        System.out.printf("podaj wiek: ");
        int wiek = sc.nextInt();
        nowy_student.setWiek(wiek);
        System.out.printf("podaj rok: ");
        int rok = sc.nextInt();
        nowy_student.setRok(rok);
        System.out.printf("podaj index: ");
        int index = sc.nextInt();
        nowy_student.setNr_index(index);
        System.out.printf("podaj nazwisko: ");
        String nazwisko = sc.next();
        nowy_student.setNazwisko(nazwisko);
        System.out.printf("podaj nazwaSpecjalnosci: ");
        String nazwaSpecjalnosci = sc.next();
        nowy_student.setNazwaSpecjalnosci(nazwaSpecjalnosci);
        System.out.printf("podaj imie: ");
        String imie = sc.next();
        nowy_student.setImie(imie);
        return nowy_student;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student nowy_student = new Student();
        System.out.printf("podaj wiek: ");
        int wiek = sc.nextInt();
        nowy_student.setWiek(wiek);
        System.out.printf("podaj rok: ");
        int rok = sc.nextInt();
        nowy_student.setRok(rok);
        System.out.printf("podaj index: ");
        int index = sc.nextInt();
        nowy_student.setNr_index(index);
        System.out.printf("podaj nazwisko: ");
        String nazwisko = sc.next();
        nowy_student.setNazwisko(nazwisko);
        System.out.printf("podaj nazwaSpecjalnosci: ");
        String nazwaSpecjalnosci = sc.next();
        nowy_student.setNazwaSpecjalnosci(nazwaSpecjalnosci);
        System.out.printf("podaj imie: ");
        String imie = sc.next();
        nowy_student.setImie(imie);
    }
}
