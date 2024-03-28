package iut.bad;

public class Main {
    public static void main(String[] args) {
        Homme homme = new Homme("Jean", "Dupont", 30);
        Femme femme = new Femme("Marie", "Curie", 28);

        homme.ami(femme);
    }
}