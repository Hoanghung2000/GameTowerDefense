package Tower;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.Config;
import sample.GameObject;
import sample.Menu.Map;

public class MainTower extends GameObject {
    ImageView tower;
    int tag;
    public MainTower(int tag){
        setTowerImage(tag);
    }

    public ImageView getTower() {
        return tower;
    }

    public void setTower(ImageView tower) {
        this.tower = tower;
    }

    public void setTowerImage(int tag){
        if(tag == 1){
            tower = new ImageView(new Image(Config.FILE_NAME[3]));
        }
        else if(tag == 2){
            tower = new ImageView(new Image(Config.FILE_NAME[1]));
        }
        else if(tag == 3){
            tower = new ImageView(new Image(Config.FILE_NAME[2]));
        }
        else if(tag == 4){
            tower = new ImageView(new Image(Config.FILE_NAME[0]));
        }
    }
}
