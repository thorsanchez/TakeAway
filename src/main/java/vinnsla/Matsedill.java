package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Matsedill {
    protected ObservableList<Veitingar> veitingar = FXCollections.observableArrayList();

    public Matsedill() {
    }

    public void setjaGogn() {
        veitingar.add(new Veitingar("brauðstangir", 2999));
        veitingar.add(new Veitingar("Margarita Pizza", 1999));

    }

    public ObservableList<Veitingar> getVeitingar() {
        return veitingar;
    }

    public void setVeitingar(ObservableList<Veitingar> veitingar) {
        this.veitingar = veitingar;
    }


}
