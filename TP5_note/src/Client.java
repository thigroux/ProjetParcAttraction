public class Client extends Thread {
    private int nb_client;
    private Billetterie b;
    private Attraction a1;
    private Attraction a2;
    
    public Client(int nbClient, Billetterie b, Attraction a1, Attraction a2){
        this.nb_client = nbClient;
        this.b = b;
        this.a1=a1;
        this.a2=a2;
    }
    
    public void aller_attraction(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
       
    public void run() {
        b.vendre_tickets(6, this);
        aller_attraction();
        a1.faire_attraction();
        aller_attraction();
        a2.faire_attraction();
    }
}