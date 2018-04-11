/*
  Crea tres sub-classes de la classe «Exception». Escriu una nova classe amb un mètode que les
llanci totes tres, però només empra una sola clàusula «catch» per capturar-les.
 */

class ElioExceptionEx7_1 extends Exception{}
class ElioExceptionEx7_2 extends Exception{}
class ElioExceptionEx7_3 extends Exception{}


public class Exercici7 {

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch ( Exception e){
            System.out.println(e.toString());
        }
    }

}
