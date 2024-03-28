package iut.bad;

public class Humain implements Consommation {
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

    @Override
    public void manger() {

    }

    @Override
    public void boire() {

    }

    public void ami(Humain humain, int duree) {
        System.out.println(this.nom + " est maintenant ami avec " + humain.nom + " depuis " + duree + " jours.");
    }

    public void ami(Humain humain) {
        ami(humain, 100);
    }
}
