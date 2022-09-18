import java.time.LocalDate;

public class Firma extends MajitelUctu{
    String nazev;
    int datumZalozeni;

    public Firma(LocalDate zalozeniUctu, String nazev, int datumZalozeni) {
        super(zalozeniUctu);
        this.nazev = nazev;
        this.datumZalozeni = datumZalozeni;
    }
}

