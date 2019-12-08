package sample;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class GameObject  extends Pane {
    public ImageView ObjectImage;

    public ImageView getObjectImage() {
        return ObjectImage;
    }

    public void setObjectImage(ImageView objectImage) {
        ObjectImage = objectImage;
    }

}
