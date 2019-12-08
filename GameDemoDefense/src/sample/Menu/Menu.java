package sample.Menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.Menu.Map;

public class Menu {

    public static final int WIDTH = 918, HEIGHT = 515;
    private AnchorPane Pane;
    private Scene Scene;
    private Stage stage;
    private Stage stage1;

    GraphicsContext graphicsContext;

    public Menu(){
        MainMenu();
    }

    public void MainMenu(){
        Pane = new AnchorPane();
        Scene = new Scene(Pane, WIDTH, HEIGHT);

        stage = new Stage();
        stage.setScene(Scene);

        BackGround();
        Button();
        Label();
    }

    private void  BackGround(){
        Image image = new Image("game.png");
        ImageView pic = new ImageView(image);
        Pane.getChildren().add(pic);
    }

    private void Button(){
        createPlay();
        createExit();
    }
    private void MenuButton(Button button, int a, int b){
        button.setLayoutX(a);
        button.setLayoutY(b);
        Pane.getChildren().add(button);
    }
    private void createPlay(){
        Button button1 = new Button("PLAY");
        MenuButton(button1, 64, 100);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Map map = new Map();
                map.newMap(stage);
                stage.close();
            }
        });
    }
    private void createExit(){
        Button button2 = new Button("QUIT");
        MenuButton(button2, 64, 200);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });
    }

    private void Label(){
        Label NameGame = new Label("TOWER DEFENSE");
        NameGame.setLayoutX(250);
        NameGame.setLayoutY(50);
        NameGame.setFont(new Font("Arial", 48));
        Pane.getChildren().add(NameGame);
    }

    public void createMenuGame(Stage menuStage){
        this.stage = menuStage;
        this.stage.hide();
        this.stage.show();
    }

    public Stage getStage() {
        return stage;
    }
}
