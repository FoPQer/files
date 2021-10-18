import java.awt.*;

public class Sofa {
    String color;
    int width;
    int height;
    int depth;

    public Sofa() {
        this.depth = 0;
        this.color = "white";
        this.height = 0;
        this.width = 0;
    }

    public Sofa(String color, int width, int height, int depth) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Я диван цвета " + color + " размера " + height + "см на " + width + "см на " + depth + "см";
    }
}
