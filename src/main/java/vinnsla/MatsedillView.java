package vinnsla;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;

public class MatsedillView extends ListView<Veitingar> {
    private Matsedill matsedill;

    public MatsedillView() {


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("matsedill-view.fxml"));
        fxmlLoader.setRoot(this);// rótin á viðmótstrénu sett hér
        fxmlLoader.setController(this); // controllerinn settur hér en ekki í .fxml skránni

        matsedill = new Matsedill(); //local hlut
        matsedill.setjaGogn(); // setja gogn i local hlut
        setItems(matsedill.getVeitingar()); //tengja gögnin (þurfti bæta "<Veitingar>" við extends Listview) annars error

    }

    //AI
    public Matsedill getMatsedill() {
        return matsedill;
    }
}


