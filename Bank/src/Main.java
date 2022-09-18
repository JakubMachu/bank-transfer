public class Main {
    public static void main(String[] args) {
        Banka bank = new Banka();
        bank.vypisZustatek();

        bank.vypisZustatek();

        bank.odchoziPlatba();

        for (int i = 0; i < bank.getUcty().length; i++) {
            System.out.println(bank.getUcty()[i]);

        }

    }
}
