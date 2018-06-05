//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class LLibrary {
    private static double screenHeight;
    private static double screenWidth;

    public LLibrary() {
    }

    private static void updateScreenResolution() {
        screenWidth = Screen.getPrimary().getBounds().getWidth();
        screenHeight = Screen.getPrimary().getBounds().getHeight();
    }

    public static double getScreenWidth() {
        updateScreenResolution();
        return screenWidth;
    }

    public static double getScreenHeight() {
        updateScreenResolution();
        return screenHeight;
    }

    public static ImageView getImageView(String path) {
        File f = new File(path);
        Image img = new Image(f.toURI().toString());
        return new ImageView(img);
    }
}
