import java.time.LocalDate;
import java.util.Scanner;

public class Banka {

    private BankovniUcet[] ucty = new BankovniUcet[3];

    public Banka() {
        ucty[0] = new BankovniUcet(263656, "Osobni", 15000, new Osoba(LocalDate.of(2008, 1, 6), "Jakub", "Machu", 1994));
        ucty[1] = new BankovniUcet(121314, "Firemni", 50000, new Firma(LocalDate.of(2006, 3, 12), "Agrofert", 2006));
        ucty[2] = new BankovniUcet(987456, "Sporici", 100000, new Osoba(LocalDate.of(2009, 6, 8), "Julie", "Novakova", 1985));

    }

    public void vypisZustatek() {
        long a = 0;
        for (int i = 0; i < ucty.length; i++) {
            a += ucty[i].getAktualniZustatek();


        }
        System.out.println("Konecny zustatek: " + a);


    }

    public BankovniUcet[] getUcty() {
        return ucty;
    }


    void odchoziPlatba() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kolik chcete odeslat?");
        int castka = scanner.nextInt();
        System.out.println("Z ktereho uctu? (263656, 121314, 987456): ");
        int cisloUctu = scanner.nextInt();
        int indexOf = najdiUcet(cisloUctu);


        if (ucty[indexOf].dostatekPenez(castka)) {
            ucty[indexOf].setAktualniZustatek(ucty[indexOf].getAktualniZustatek() - castka);
            prichoziPlatba(castka);
            System.out.println("Vas aktualni zustatek je: " + ucty[indexOf].getAktualniZustatek());
        } else {
            System.out.println("Nedostatek financi.");
        }

    }

    void prichoziPlatba(int platba) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucet na ktery pripsat penize. (263656, 121314, 987456): ");
        int cisloUctu = scanner.nextInt();
        int indexOf = najdiUcet(cisloUctu);
        ucty[indexOf].setAktualniZustatek(ucty[indexOf].getAktualniZustatek() + platba);


    }

    public int najdiUcet(int cisloUctu) {
        int indexOf = 0;
        for (int i = 0; i < ucty.length; i++) {
            if (cisloUctu == ucty[i].getCisloUctu()) {
                indexOf = i;
                return indexOf;

            }

        }


        return indexOf;
    }
}
