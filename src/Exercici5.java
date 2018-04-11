/*Escriu un bucle «while» que repeteix un bloc de codi fins que no hi ha excepcions.
* */
public class Exercici5 {

    public static void main(String[] args) {
        try {
            while (true){
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
