public class Ejercicio4 {
    public static void main(String[] args){
        boolean resultado = parImpar( 6);
        System.out.println("¿el numero es par?" + resultado);
    }
    public static boolean parImpar(int numero){
         if(numero % 2 == 0 ){
             return true;
         }else{
             return false;
         }
    }

}
