package hilos;

public class Hilo1 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <=5; i++){

            //System.out.print("G");
            //Al ser la primera letra de la palabra
            //podemos colocar el contador aquí
            System.out.print(i + ": G");

            try{
                Hilo1.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
                System.out.println("Error en la clase Hilo1: " + e);
            }

        }
    }
    
}
