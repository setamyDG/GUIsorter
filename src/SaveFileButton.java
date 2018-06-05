import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;

import java.io.File;


public class SaveFileButton extends Button {
    public static File file;
    DirectoryChooser dirChooser = new DirectoryChooser();


    public SaveFileButton(int x, int y, String text, int width, int height, Color textColor, Color textColor2, Pos alignment) {
        super(x, y, text, width, height, textColor, textColor2, alignment);
    }


    public void setFileChooser() {
        dirChooser = new DirectoryChooser();
        try {
            file = dirChooser.showDialog(Main.stage);
            Menu.savePath.setText(file.getAbsolutePath());
        } catch (Exception e) {
        }
    }


    @Override
    public void onClicked() {
        setFileChooser();
    }
}
