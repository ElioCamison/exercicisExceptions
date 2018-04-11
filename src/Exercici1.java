/*
* Crea una classe amb un mètode main() que llança un objecte de tipus Exception dins un bloc
«try». Passa al constructor un String qualsevol. Captura l'excepció dins una clàusula «catch» i
imprimeix l'argument String. Afegeix una clàusula «finally» i imprimeix un missatge per assegurar-
te que s'executa.
* */
public class Exercici1 {
    private String paraula = "liceu";

    Exercici1(String paraula) throws Exception{
        this.paraula = paraula;
    }

    public String getParaula() {
        return paraula;
    }

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e){
            System.out.println(e.toString());
        }/* finally {
            System.out.println("hoooola");
        }*/
    }
}
