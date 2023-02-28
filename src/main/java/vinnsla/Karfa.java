package vinnsla;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;

public class Karfa extends Matsedill {
    //þetta gerir að heildarVerd er 0 þegar það er created
    private static IntegerProperty heildarVerd = new SimpleIntegerProperty(0);

    public Karfa() {
    }

    public Integer reiknaHeildarverd() {
        int h = 0;
        for (int i = 0; i < veitingar.size(); i++) {
            h += veitingar.get(i).getVerd().getValue();
        }
        heildarVerd.set(h);
        return heildarVerd.getValue();
    }

    public ObservableList<Veitingar> eydaVeitingum() {
        veitingar.removeAll(veitingar);
        setheildarverd(0);
        return veitingar;
    }

    public void setheildarverd(int heildarVerd) {
        this.heildarVerd.set(heildarVerd);
    }

    public IntegerProperty heildarVerdProperty() {
        return heildarVerd;
    }


    public static void main(String[] args) {
        Karfa karfa = new Karfa();
        karfa.setjaGogn();


        int totalCost = karfa.reiknaHeildarverd();
        System.out.println("Heildar verð total: " + totalCost + "and" + heildarVerd);
    }
}



