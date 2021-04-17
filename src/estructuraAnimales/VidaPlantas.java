package estructuraAnimales;

/**
 *
 * @author Mariano
 */
public class VidaPlantas extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                VidaPlantas.sleep(1000);
            }catch (InterruptedException ex) {
            System.out.println("Excepcion en "+ex);
        }
        }       
    }   
}