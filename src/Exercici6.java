/*
Escriu una classe amb un mètode que llença una excepció del tipus que has creat a l'exercici 4,
sense capturar-la. Observa què diu el compilador/IDE
 */



public class Exercici6 {

    public static void main(String[] args) {
        //exerciciSis("Hola");
    }

    static String exerciciSis(String ex6) throws ElioException {
        throw new ElioException("Exerici6");
    }

}
