import javafx.geometry.Pos;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Menu {

    public static LinkedList<Button> buttons = new LinkedList<>();
    public static TextField loadPath = new TextField();
    public static TextField savePath = new TextField();
    public static List<ProgressBar> progressBars = new ArrayList<ProgressBar>();


    public static void buttonsInitialize() {
        Button chosefilebutton = new ChooseFileButton(900, 150, "LOAD FILES PATH", 150, 50, Color.BLACK, Color.GRAY, Pos.CENTER);
        Button saveFileButton = new SaveFileButton(900, 250, "SAVE FILES PATH", 150, 50, Color.BLACK, Color.GRAY, Pos.CENTER);
        Button startButton = new StartButton(900, 350, "START", 150, 50, Color.BLACK, Color.GRAY, Pos.CENTER);
        Main.addWindows(chosefilebutton.stackPane(), saveFileButton.stackPane(), startButton.stackPane());
    }


    public static void backgroundInitialize() {
        ImageView imgView = LLibrary.getImageView("src/resources/Wallpaper.jpg");
        imgView.setFitWidth(1920);
        imgView.setFitHeight(1080);
        Main.addWindows(imgView);
    }


    public static void TextFieldInitialize() {
        loadPath.setLayoutX(230);
        loadPath.setLayoutY(150);
        loadPath.setMinSize(600, 50);

        savePath.setLayoutX(230);
        savePath.setLayoutY(250);
        savePath.setMinSize(600, 50);

        Main.addWindows(savePath, loadPath);
    }


    public static void ProgressBarInitialize() {
        int size = 550;
        for (int i = 0; i<4; i++)
        {
            progressBars.add(new ProgressBar());
        }
        for (ProgressBar p : progressBars)
        {
            p.setLayoutX(250);
            p.setLayoutY(size);
            p.setMinSize(300, 30);
            p.setProgress(0d);
            size+=100;
        }
        Main.addWindows(progressBars.get(0), progressBars.get(1), progressBars.get(2), progressBars.get(3));
    }

}

