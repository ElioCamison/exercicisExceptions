/*
* Crea la teva pròpia classe d'excepció generant una subclasse de la classe «Exception». Escriu un
constructor per aquesta classe que accepti un String i l'emmagatzemi internament. Escriu un mètode
per imprimir el missatge. Crea una clàusula «try-catch» per provar que la classe que has programat
funciona correctament
* */
 class ElioException extends Exception {
     public String str;

     ElioException(String str){
         this.str = str;
     }
      String printMsg(){
         return str;
     }
}

class Exercici4{

     public static void main(String[] args) {

         try {
             throw new ElioException("Hola");
         } catch (ElioException e){
             System.out.println(e.printMsg());
         }
    }





}
