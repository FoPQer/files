import java.awt.*;
import java.util.Scanner;

public class Viewer {
    Scanner scan = new Scanner(System.in);

    /**
     * Метод связи с пользователем, он опрашивает пользователя о его имени и возрасте и создаёт
     * для него подходящий диван
     * @return новый объект класса Sofa, то есть класса диван
     */
    public Sofa ask(){
        Chooser sup = new Chooser();
        System.out.println("Введите имя");
        String name = scan.nextLine();
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        String str = convToStr(sup.chooserColor(name));
        return new Sofa(str, sup.chooserWidth(age), sup.chooserDepth(age), sup.chooserHeight(age));
    }

    /**
     * Метод позволяет перевести цвет класса Color в строку с названием данного цвета
     * @param color цвет класса Color
     * @return строка с названием цвета
     */
    public String convToStr(Color color){
        if (color == Color.BLACK)
            return "чёрный";
        if (color == Color.BLUE)
            return "синий";
        if (color == Color.GREEN)
            return "зелёный";
        if (color == Color.RED)
            return "красный";
        if (color == Color.MAGENTA)
            return "маджента";
        if (color == Color.YELLOW)
            return "жёлтый";
        return "белый";
    }

    public static void main(String[] args) {
        System.out.println(new Viewer().ask());
    }
}
