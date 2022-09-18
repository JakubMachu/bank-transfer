import java.time.LocalDate;

public class Osoba extends MajitelUctu {

    private String jmeno;
    private String prijmeni;
    private int rokNarozeni;


    public Osoba(LocalDate zalozeniUctu, String jmeno, String prijmeni, int rokNarozeni) {
        super(zalozeniUctu);
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }
}
