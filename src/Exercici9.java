/*
 Repeteix l'exercici anterior, però dins la clàusula «catch», llança una RuntimeException.
 */

import javax.management.RuntimeErrorException;

class ElioExceptioEx9_1 extends Exception{}
class ElioExceptioEx9_2 extends Exception{}

public class Exercici9 {

    public static void main(String[] args) {
        try {
            Exercici9.f();
        }catch (ElioExceptioEx9_2 ex){
            System.out.println(ex.toString());
        } catch (RuntimeException e){
            System.out.println(e.toString());
        }
    }

    static int f() throws ElioExceptioEx9_2{
        int f = 0;
        try {
            f = Exercici9.g();
        }catch (ElioExceptioEx9_1 ex8_2){
            throw new RuntimeException();
        }
        return f;
    }

    static int g() throws ElioExceptioEx9_1 {
        throw new ElioExceptioEx9_1();
    }

}
