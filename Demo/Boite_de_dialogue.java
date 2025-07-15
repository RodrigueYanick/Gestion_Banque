public class Boite_de_dialogue {
    private String nom;
    private int age;

    public Boite_de_dialogue(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getNom(){
        return nom;
    }

    public int getAge(){
        return age;
    }
}
