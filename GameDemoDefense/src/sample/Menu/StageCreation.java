package sample.Menu;

import Tower.TowerMenu;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class StageCreation {
    public static ArrayList<TowerMenu> towerMenus = new ArrayList<TowerMenu>();

    public  static void creatTowerMenu(Pane root){
        for(int i = 0; i < 4; i++){
            towerMenus.add(new TowerMenu(1));
            towerMenus.add(new TowerMenu(2));
            towerMenus.add(new TowerMenu(3));
            towerMenus.add(new TowerMenu(4));
        }
        for(int i = 0; i < towerMenus.size(); i++){
            root.getChildren().add(towerMenus.get(i).getTowerMenu());
            towerMenus.get(i).moveTower();
        }
    }
}
