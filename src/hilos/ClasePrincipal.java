package hilos;

public class ClasePrincipal {

    public static void main(String[] args) {
        
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();

        //Hilo2
        hilo1.start();
        try{
            hilo1.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Error en el hilo1: " + e);

        }

        //Hilo2
        hilo2.start();
        try{
            hilo2.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Error en el hilo2: " + e);
        }

        //Hilo3
        hilo3.start();
        try{
            hilo3.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Error en el hilo3: " + e);
        }

        //Hilo4
        hilo4.start();
        try{
            hilo4.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Error en el hilo4: " + e);
        }

    }
    
}
