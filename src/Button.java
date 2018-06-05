import javafx.geometry.Pos;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public abstract class Button extends Window {
    public Color backgroundColor = null;
    public Color textColor;
    public Color textColor2;
    public double opacity = 1.5d;
    public double gaussianBlur = 0.0d;
    public Pos alignment;
    public int width, height;
    public StackPane stackPane;
    public Rectangle background;
    public Text textComponent;
    public String text;


    public Button(int x, int y, String text, int width, int height, Color textColor, Color textColor2, Pos alignment) {
        super(x, y);
        this.alignment=alignment;
        this.textColor2=textColor2;
        this.textColor=textColor;
        this.width = width;
        this.height = height;
        this.text = text;
        stackPane = new StackPane();
        position = new Dc(x, y);
        style();
        createButton();
        applyStyle();

        background.setFill(Color.GRAY);
        Menu.buttons.add(this);
    }

    public void createButton() {

        textComponent = new Text(text);
        background = new Rectangle(width, height);
        stackPane.setLayoutX(position.x());
        stackPane.setLayoutY(position.y());
        stackPane.setOnMouseClicked(event -> {
            onClicked();
        });
        stackPane.setOnMouseEntered(event -> {
            mouseEnter();
        });
        stackPane.setOnMouseExited(event -> {
            mouseExit();
        });
        stackPane.getChildren().addAll(background, textComponent);
    }

    private void applyStyle() {
        textComponent.setFill(textColor);
        background.setOpacity(opacity);
        background.setEffect(new GaussianBlur(gaussianBlur));
        stackPane.setAlignment(alignment);

    }

    public void mouseEnter() {
        background.setFill((Color.LIGHTGRAY));
        textComponent.setFill(textColor2);
    }

    public void mouseExit() {
        background.setFill(Color.GRAY);
        textComponent.setFill(textColor);
    }

    public  StackPane stackPane() {
        return stackPane;
    }
    public void onClicked(){
    }

    public void style(){
    }
}

