/*
 Crea una classe amb dos mètodes: f() i g(). Al mètode g(), llança una excepció d'un nou tipus que
tu mateix defineixes. Al mètode f() crida a g(), captura l'excepció i llança una excepció distinta
(d'un segon tipus que també defineixes tu mateix). Testeja el teu codi dins una funció «main()».
 */

class ElioExceptioEx8_1 extends Exception{}
class ElioExceptioEx8_2 extends Exception{}

public class Exercici8 {

    static int f() throws ElioExceptioEx8_2{
        int f = 0;
        try {
             f = Exercici8.g();
        }catch (ElioExceptioEx8_1 ex8_2){
            throw new ElioExceptioEx8_2();
        }
        return f;
    }

    static int g() throws ElioExceptioEx8_1 {
        throw new ElioExceptioEx8_1();
    }
}
