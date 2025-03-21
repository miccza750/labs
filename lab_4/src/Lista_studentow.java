import java.util.Scanner;

public class Lista_studentow {
    public static void main(String[] args) {
        Student[] studenci = new Student[100];
        for (int i = 0; i < 100; i++) {
            studenci[i] = new Student();
        }
        while (true){
            System.out.printf("\nwybierz opcję: \n1: edycja jednego studenta  \n2: wyswietlenie jednego studenta \n3: wyswietlenie wszystkich studentów\n4: wyswietlenie studentów z zakresu\n5: wyjśćie\n");
            Scanner sc = new Scanner(System.in);
            int odp = sc.nextInt();
            if (odp == 5){
                System.out.printf("program konczy dzialanie");
                break;
            }
            switch(odp){
                case 1:
                    System.out.printf("\nwybierz opcję: \n1: edycja całości\n2: edycja imienia \n3: edycja nazwiska\n4: edycja roku\n5: edycja kierunku \n6: edycja wieku \n7: edycja indeksu \n8: edycja do domyślnych \n9: wyjscie\n");
                    int odp_case_1 = sc.nextInt();
                    if(odp_case_1 == 8 ){
                        break;
                    }
                    System.out.printf("podaj nr studenta liczac od 0: ");
                    int index = sc.nextInt();
                    switch (odp_case_1) {
                        case 1:
                        studenci[index] = Skaner.createStudent();
                        break;
                        case 2:
                            System.out.printf("podaj imie: ");
                            studenci[index].setImie(sc.next());
                            break;
                        case 3:
                            System.out.printf("podaj nazwisko: ");
                            studenci[index].setNazwisko(sc.next());
                            break;
                        case 4:
                            System.out.printf("podaj rok: ");
                            studenci[index].setRok(sc.nextInt());
                            break;
                        case 5:
                            System.out.printf("podaj kierunek: ");
                            studenci[index].setNazwaSpecjalnosci(sc.next());
                            break;
                        case 6:
                            System.out.printf("podaj wiek: ");
                            studenci[index].setWiek(sc.nextInt());
                            break;
                        case 7:
                            System.out.printf("podaj indeks do zmiany: ");
                            studenci[index].setNr_index(sc.nextInt());
                            break;
                        case 8:
                            studenci[index].reset();
                            break;
                        default:
                            System.out.printf("bład");
                            break;
                    }
                    break;
                case 2:
                    int index_2 = sc.nextInt();
                    System.out.printf("indeks studenta: "+index_2);
                    studenci[index_2].wyswietl();
                    break;
                case 3:
                    for (int i = 0; i < 100; i++) {
                        System.out.printf("\nindeks studenta: "+i+"\n");
                        studenci[i].wyswietl();
                    }
                    break;
                case 4:
                    System.out.printf("podaj poczatek przedzialu: ");
                    int a = sc.nextInt();
                    System.out.printf("podaj koniec przedzialu: ");
                    int b = sc.nextInt();
                    for (int i = a; i < b; i++) {
                        System.out.printf("\nindeks studenta: "+i+"\n");
                        studenci[i].wyswietl();
                    }
                    break;
                default:
                    break;
            }



        }


    }
}
