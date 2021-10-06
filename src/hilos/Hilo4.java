package hilos;

public class Hilo4 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <=5; i++){

            System.out.print("K");
            //Colocamos un salto en la útima letra para separar cada formación de GEEK
            System.out.println("");

            try{
                Hilo4.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
                System.out.println("Error en la clase Hilo4: " + e);
            }

        }
    }
    
}
