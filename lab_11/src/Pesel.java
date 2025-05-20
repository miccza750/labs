public class Pesel {
    String dzien;
    String rok;
    String miesiac;
    String plec;
    String p;
    String k;
    boolean po_2000;
    int realny_miesiac;
    public Pesel(String pesel) {
        this.rok = pesel.substring(0,2);
        this.miesiac = pesel.substring(2,4);
        this.dzien = pesel.substring(4,6);
        this.p = pesel.substring(6,10);
        this.k = pesel.substring(10,11);
        int a = Integer.valueOf(p.substring(0,1));
        if(a % 2 == 0){
            this.plec = "k";
        }
        else{
            this.plec = "m";
        }
        int t = Integer.valueOf(miesiac);
        if(t>12){
            this.realny_miesiac = t - 20;
            this.po_2000 = true;

        }
        else{
            this.realny_miesiac = t;
            this.po_2000 = false;
        }
    }
    public String To_Data(){
        String mies = "";
        if(realny_miesiac<10){
            mies+="0";
        }
        mies += String.valueOf(realny_miesiac);
        if(po_2000){
            return ("20"+rok+"-"+mies+"-"+dzien);
        }
        return ("19"+rok+"-"+mies+"-"+dzien);
    }
}
