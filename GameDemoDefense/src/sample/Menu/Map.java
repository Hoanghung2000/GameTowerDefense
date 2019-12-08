package sample.Menu;

import java.lang.NullPointerException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.Menu.Menu;

public class Map {
    private Stage stage;
    private Stage stageMap;
    public static Pane root = new Pane();
    public static Scene scene = new Scene(root, 840, 448);

    public Pane getRoot() {
        return root;
    }

    public void setRoot(Pane root) {
        this.root = root;
    }

    public Map(){
        viewMap();
    }

    public void viewMap() {
        stageMap = new Stage();
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().addAll(canvas);
        stageMap.setScene(scene);
        drawMap(gc);
    }

    public void newMap(Stage stage1){
            this.stage = stage1;
            this.stage.hide();
            stageMap.show();
            ObjectsCreation();
     }

     private void start(){
        Button button1 = new Button("START");
        button1.setLayoutX(700);
        button1.setLayoutY(150);
        root.getChildren().add(button1);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent){
                Map map = new Map();
                map.newMap(stage);
            }
        });
     }


    public static final String[][] MAP_SPRITES = new String[][] {
            { "024", "024", "003", "047", "047", "047", "004", "024", "024", "024" },
            { "024", "024", "025", "299", "001", "002", "023", "024", "024", "024" },
            { "024", "024", "025", "023", "024", "025", "023", "024", "024", "024" },
            { "003", "047", "048", "023", "024", "025", "023", "024", "024", "024" },
            { "025", "299", "001", "027", "024", "025", "046", "047", "047", "047" },
            { "025", "023", "024", "024", "024", "026", "001", "001", "001", "001" },
            { "025", "023", "024", "024", "024", "024", "024", "024", "024", "024" },
    };

    private void drawMap(GraphicsContext gc)
    {
        for (int i=0; i< MAP_SPRITES.length; i++){
            for (int j=0; j<MAP_SPRITES[i].length; j++){
                gc.drawImage(new Image("file:Source/Default size/" + MAP_SPRITES[i][j] + ".png"), j*64, i*64, 64,64);
            }
        }
    }

    private void ObjectsCreation(){
        StageCreation.creatTowerMenu(root);
    }
}
