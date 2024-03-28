package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain() {
    }

    public void details() {
        System.out.println(nom + " " + prenom + ", " + age + " ans");
    }
}
