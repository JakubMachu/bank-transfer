import java.util.Scanner;

public class BankovniUcet {
    private int cisloUctu;
    private String typUctu;
    private long aktualniZustatek;
    private MajitelUctu vlastnik;

    public BankovniUcet(int cisloUctu, String typUctu, long aktualniZustatek, MajitelUctu vlastnik) {
        this.cisloUctu = cisloUctu;
        this.typUctu = typUctu;
        this.aktualniZustatek = aktualniZustatek;
        this.vlastnik = vlastnik;
    }

    public void setCisloUctu(int cisloUctu) {
        this.cisloUctu = cisloUctu;
    }

    public void setTypUctu(String typUctu) {
        this.typUctu = typUctu;
    }

    public void setAktualniZustatek(long aktualniZustatek) {
        this.aktualniZustatek = aktualniZustatek;
    }

    public void setVlastnik(MajitelUctu vlastnik) {
        this.vlastnik = vlastnik;
    }

    public int getCisloUctu() {
        return cisloUctu;
    }

    public String getTypUctu() {
        return typUctu;
    }

    public long getAktualniZustatek() {
        return aktualniZustatek;
    }

    public MajitelUctu getVlastnik() {
        return vlastnik;
    }


    public boolean dostatekPenez(int castka) {
        return castka <= aktualniZustatek;


    }

    @Override
    public String toString() {
        return "BankovniUcet{" +
                "cisloUctu=" + cisloUctu +
                ", typUctu='" + typUctu + '\'' +
                ", aktualniZustatek=" + aktualniZustatek +
                ", vlastnik=" + vlastnik +
                '}';
    }
}


