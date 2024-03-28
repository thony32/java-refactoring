package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain() {
    }

    @Override
    public String toString() {
        return nom + " " + prenom + ", " + age + " ans";
    }

    public void details() {
        System.out.println(nom + " " + prenom + ", " + age + " ans");
    }

    public void manger() {
        System.out.println("Je mange");
    }

    public void boire() {
        System.out.println("Je bois");
    }
}
