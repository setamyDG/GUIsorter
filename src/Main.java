//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class Main extends Application {
    public static Stage stage;
    public static Scene scene;
    public static Pane root;

    public Main() {
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void addWindows(Node... parents) {
        for(int i = 0; i < parents.length; ++i) {
            root.getChildren().add(parents[i]);
        }

    }

    public void start(Stage primaryStage) throws Exception {
        root = new Pane();
        root.setPrefWidth(1920);
        root.setPrefWidth(1080);
        this.stageSettings(primaryStage);
        Menu.backgroundInitialize();
        Menu.TextFieldInitialize();
        Menu.ProgressBarInitialize();
        Menu.buttonsInitialize();
    }

    private void stageSettings(Stage primaryStage) {
        stage = primaryStage;
        primaryStage.setTitle("GUI SORTER");
        scene = new Scene(root, LLibrary.getScreenWidth(), LLibrary.getScreenHeight());
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest((event) -> {
            Platform.exit();
            System.exit(0);
        });
        primaryStage.show();
    }
}
