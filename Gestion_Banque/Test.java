package Gestion_Banque;

public class Test {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Paule", "Penda", 19);
        Personne personne2 = new Personne("Inona", "Pemboura", 19);
        personne1.affiche();
        String person = personne2.toString("Inona", "Pemboura", 19);
        System.out.println(person);
    }
}
