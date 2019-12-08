package sample;

import Tower.MainTower;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.Menu.Map;
import sample.Menu.Menu;
import java.lang.NullPointerException;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Menu menu = new Menu();
        stage = menu.getStage();
        stage.setTitle("Tower Defense");
        Map map = new Map();
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}