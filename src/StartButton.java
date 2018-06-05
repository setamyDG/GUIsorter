//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javafx.geometry.Pos;
import javafx.scene.paint.Color;

public class StartButton extends Button {
    public StartButton(int x, int y, String text, int width, int height, Color textColor, Color textColor2, Pos alignment) {
        super(x, y, text, width, height, textColor, textColor2, alignment);
    }

    public void onClicked() {
        Sorter sortingTask = new Sorter();
        sortingTask.createThreads();
        sortingTask.startThreads();
    }
}
