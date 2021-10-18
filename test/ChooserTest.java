import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ChooserTest {
    @Test
    public void colorTest(){
        String name = "Dima";
        InputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);
        Scanner scan = new Scanner(System.in);
        Assertions.assertEquals(Color.RED, new Chooser().chooserColor(scan.nextLine()));
    }

    @Test
    public void widthTest(){
        String age = "25";
        InputStream in = new ByteArrayInputStream(age.getBytes());
        System.setIn(in);
        Scanner scan = new Scanner(System.in);
        Assertions.assertEquals(64, new Chooser().chooserWidth(scan.nextInt()));
    }

    @Test
    public void heightTest(){
        String age = "25";
        InputStream in = new ByteArrayInputStream(age.getBytes());
        System.setIn(in);
        Scanner scan = new Scanner(System.in);
        Assertions.assertEquals(890, new Chooser().chooserHeight(scan.nextInt()));
    }

    @Test
    public void depthTest(){
        String age = "25";
        InputStream in = new ByteArrayInputStream(age.getBytes());
        System.setIn(in);
        Scanner scan = new Scanner(System.in);
        Assertions.assertEquals(42, new Chooser().chooserDepth(scan.nextInt()));
    }
}
