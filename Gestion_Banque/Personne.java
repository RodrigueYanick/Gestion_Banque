package Gestion_Banque;
    
public class Personne {

    String firstName;
    String lastName;
    int age;

    public Personne(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void affiche(){

        System.out.println("Mr "+firstName+" "+lastName+" vous avez "+age+"ans");
    }

    public String toString(String firstName, String lastName, int age){
        return "Mr "+firstName+" "+lastName+" vous avez "+age+"ans";
    }
}
