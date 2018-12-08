public class ResponsableBilletterie extends Thread {
    private Billetterie b;
    private final int ticketsRech = 20;

    public ResponsableBilletterie(Billetterie b) {
        //Permet d'arrêter la boucle infinie lorsqu'il n'y a plus de client
        this.setDaemon(true);
        this.b = b;
    }
    
    public void run() {
        //Boucle infinie
        while (true) {
            b.recharger(ticketsRech);
        }
    }
}