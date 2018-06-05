import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class ChooseFileButton extends Button {
    public static BlockingQueue<File> files;
    FileChooser fileChooser;


    public ChooseFileButton(int x, int y, String text, int width, int height, Color textColor, Color textColor2, Pos alignment) {
        super(x, y, text, width, height, textColor, textColor2, alignment);
        files = new LinkedBlockingQueue<File>();
        fileChooser = new FileChooser();
    }


    public void setFileChooser(FileChooser fileChooser) {
        this.fileChooser = fileChooser;
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        List<File> filesTemp = fileChooser.showOpenMultipleDialog(Main.stage);
        if (filesTemp != null) {
            files.addAll(filesTemp);
            String path = filesTemp.get(0).getAbsolutePath();
            String name = filesTemp.get(0).getName();
            Menu.loadPath.setText(path.replace(name, ""));
        } else Menu.loadPath.setText("");
    }


    @Override
    public void onClicked() {
        setFileChooser(fileChooser);
    }
}
