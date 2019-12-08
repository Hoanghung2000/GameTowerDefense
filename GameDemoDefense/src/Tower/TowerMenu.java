package Tower;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import sample.Config;
import sample.GameObject;
import sample.Menu.Map;

public class TowerMenu extends GameObject {
    ImageView towerMenu;
    int tag;

    public TowerMenu(int tag) {
        this.tag = tag;
        setTowerImage(tag);
    }

    public ImageView getTowerMenu() {
        return towerMenu;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public void setTowerMenu(ImageView towerMenu) {
        this.towerMenu = towerMenu;
    }

    public void setTowerImage(int tag){
        if(tag == 1){
            towerMenu = new ImageView(new Image(Config.FILE_NAME[3]));
            towerMenu.setLayoutX(64*10 + 12);
            towerMenu.setLayoutY(0);
        }
        else if(tag == 2){
            towerMenu = new ImageView(new Image(Config.FILE_NAME[1]));
            towerMenu.setLayoutX(64*10 + 12);
            towerMenu.setLayoutY(64 + 12);
        }
        else if(tag == 3){
            towerMenu = new ImageView(new Image(Config.FILE_NAME[2]));
            towerMenu.setLayoutX(64*12 - 12);
            towerMenu.setLayoutY(0);
        }
        else if(tag == 4){
            towerMenu = new ImageView(new Image(Config.FILE_NAME[0]));
            towerMenu.setLayoutX(64*12 - 12);
            towerMenu.setLayoutY(64 + 12);
        }
    }

    public void moveTower(){
        towerMenu.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                MainTower mainTower = new MainTower(getTag());
                mainTower.getTower().setViewOrder(-1);
                mainTower.getTower().setLayoutX(mouseEvent.getSceneX() - 32);
                mainTower.getTower().setLayoutY(mouseEvent.getSceneY() - 32);
                Map.root.getChildren().add(mainTower.getTower());


                mainTower.getTower().setOnMouseDragged(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        mainTower.getTower().setLayoutX(mouseEvent.getSceneX() - 32);
                        mainTower.getTower().setLayoutY(mouseEvent.getSceneY() - 32);
                    }
                });
            }
        });
    }
}
