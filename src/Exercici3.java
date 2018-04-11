import java.util.Arrays;

/*
 * 3- Escriu codi que generi i capturi l'excepció ArrayIndexOutOfBoundsException.
 * */

public class Exercici3 {

    public static void main(String[] args) {
        int[] ar = new int[10];

        try{
            for (int i = 0; i < 12; i++) {
                ar[i] = i;
                System.out.println(Arrays.toString(ar));
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
