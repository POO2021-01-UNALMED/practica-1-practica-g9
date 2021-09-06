package uiMain;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class Controller {
    int count = 0;
    @FXML
    public ImageView Image;
    @FXML
    public Label Devs;

    @FXML
    private void CambiarDevs(MouseEvent event){
        if (count == Main.Developers.size()){
            count = 0;
        }
        Devs.setText(Main.Developers.get(count));
        count ++;
    }
}

