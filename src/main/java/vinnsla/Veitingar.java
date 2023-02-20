package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Veitingar {

    private StringProperty heiti = new SimpleStringProperty();
    private IntegerProperty verd = new SimpleIntegerProperty();


    public Veitingar(String heiti, int verd) {
        this.heiti.set(heiti);
        this.verd.set(verd);

    }

    public String toString() {
        return heiti.get() + "verð:" + verd.get();
    }

    public static void main(String[] args) {

    }
}
