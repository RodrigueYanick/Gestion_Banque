import javax.swing.JOptionPane;

public class Calculatrice {
    
    public void methode_arithmetique(String operation){
        try {   
            String nombreOperation = JOptionPane.showInputDialog("Entrez le nombre d'operation a faire");
            int valeur = Integer.parseInt(nombreOperation);
            int value_1 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero 1"));
            for(int i=2; i<=valeur; i++){
                int value_2 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero "+i+" a additioner"));
                if(operation.equals("Addition")){
                    value_1+=value_2;
                }else if(operation.equals("Soustraction")){
                    value_1-=value_2;
                }else if(operation.equals("Division")){
                    value_1/=value_2;
                }else if(operation.equals("Multiplication")){
                    value_1*=value_2;
                }
            }
            JOptionPane.showMessageDialog(null, value_1);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "entrez invalide veuillez entrer un nouveau nombre entier");
        }
    }
    public static void main(String []args){
        Calculatrice test = new Calculatrice();
        JOptionPane.showMessageDialog(null, "Bonjour Mr Rodrigue");
        String[] options = {"Addition", "Soustraction", "Division", "Multiplication", "Quiter"};
        String operation = (String)JOptionPane.showInputDialog(null, "Choisir une option", "Menu", JOptionPane.QUESTION_MESSAGE, null, options, null);
        if(operation == null || operation.equals("Quitter")){
            JOptionPane.showMessageDialog(null, "merci");
        }else{
            test.methode_arithmetique(operation);
        }
    }
}
        // }
        // }else if(operation.equals("Addition")){
        //     String add1 = JOptionPane.showInputDialog("Premier nombre a additionner");
        //     int valeur = Integer.parseInt(add1);
        //     int value_1 = 0;
        //     for(int i=0; i<valeur; i++){
        //         int value_2 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero "+i+1+" a additioner"));
        //         value_1+=value_2;
        //     }
        //     JOptionPane.showMessageDialog(null, value_1);
        // }else if(operation.equals("Soustraction")){
        //     String add1 = JOptionPane.showInputDialog("Premier nombre a additionner");
        //     int valeur = Integer.parseInt(add1);
        //     int value_1 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero "+1+" a additioner"));
        //     for(int i=1; i<valeur; i++){
        //         int value_2 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero "+i+1+" a additioner"));
        //         value_1-=value_2;
        //     }
        //     JOptionPane.showMessageDialog(null, value_1);
        // }else if(operation.equals("Division")){
        //     String add1 = JOptionPane.showInputDialog("Premier nombre a additionner");
        //     int valeur = Integer.parseInt(add1);
        //     int value_1 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero "+1+" a additioner"));
        //     for(int i=1; i<valeur; i++){
        //         int value_2 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero "+i+1+" a additioner"));
        //         value_1/=value_2;
        //     }
        //     JOptionPane.showMessageDialog(null, value_1);
        // }
        // else if(operation.equals("Multiplication")){
        //     String add1 = JOptionPane.showInputDialog("Premier nombre a additionner");
        //     int valeur = Integer.parseInt(add1);
        //     int value_1 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero "+1+" a additioner"));
        //     for(int i=1; i<valeur; i++){
        //         int value_2 = Integer.parseInt(JOptionPane.showInputDialog("entrez la valeur numero "+i+1+" a additioner"));
        //         value_1*=value_2;
        //     }
        //     JOptionPane.showMessageDialog(null, value_1);
        // }



        // String operation = JOptionPane.showInputDialog("quel operation souhaiter vous faire ?");
        // if(operation.length()>0 &&(operation.substring(0, 1).equalsIgnoreCase("a") || operation.charAt(0)=='+') ){
        //     String add2 = JOptionPane.showInputDialog("Deuxieme nombre a additionner");
        //     int resultat = Integer.parseInt(add1) + Integer.parseInt(add2);
        //     JOptionPane.showMessageDialog(null, resultat);
        // }
        // if(operation.length()>0 &&(operation.substring(0, 1).equalsIgnoreCase("s") || operation.charAt(0)=='-') ){
        //     String add1 = JOptionPane.showInputDialog("Premier nombre a additionner");
        //     String add2 = JOptionPane.showInputDialog("Deuxieme nombre a additionner");
        //     int resultat = Integer.parseInt(add1) - Integer.parseInt(add2);
        //     JOptionPane.showMessageDialog(null, resultat);
        // }
        // if(operation.length()>0 &&(operation.substring(0, 1).equalsIgnoreCase("d") || operation.charAt(0)=='/') ){
        //     String add1 = JOptionPane.showInputDialog("Premier nombre a additionner");
        //     String add2 = JOptionPane.showInputDialog("Deuxieme nombre a additionner");
        //     int resultat = Integer.parseInt(add1) / Integer.parseInt(add2);
        //     JOptionPane.showMessageDialog(null, resultat);
        // }
        // if(operation.length()>0 &&(operation.substring(0, 1).equalsIgnoreCase("m") || operation.charAt(0)=='*') ){
        //     String add1 = JOptionPane.showInputDialog("Premier nombre a additionner");
        //     String add2 = JOptionPane.showInputDialog("Deuxieme nombre a additionner");
        //     int resultat = Integer.parseInt(add1) * Integer.parseInt(add2);
        //     JOptionPane.showMessageDialog(null, resultat);
        // }
//     }
// }