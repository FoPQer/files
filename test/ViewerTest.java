import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ViewerTest {
    @Test
    public void convTestRed(){
        Color color = Color.red;
        Assertions.assertEquals("красный", new Viewer().convToStr(color));
    }

    @Test
    public void convTestBlue(){
        Color color = Color.blue;
        Assertions.assertEquals("синий", new Viewer().convToStr(color));
    }

    @Test
    public void convTestGreen(){
        Color color = Color.GREEN;
        Assertions.assertEquals("зелёный", new Viewer().convToStr(color));
    }

    @Test
    public void convTestBlack(){
        Color color = Color.black;
        Assertions.assertEquals("чёрный", new Viewer().convToStr(color));
    }

    @Test
    public void convTestMagenta(){
        Color color = Color.MAGENTA;
        Assertions.assertEquals("маджента", new Viewer().convToStr(color));
    }

    @Test
    public void convTestYellow(){
        Color color = Color.yellow;
        Assertions.assertEquals("жёлтый", new Viewer().convToStr(color));
    }

    @Test
    public void convTestWhite(){
        Color color = Color.white;
        Assertions.assertEquals("белый", new Viewer().convToStr(color));
    }
}
