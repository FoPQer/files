import java.awt.*;

public class Chooser {

    /**
     * Метод подбирает цвет по имени пользователя, в зависимости от первой буквы:
     * a, f, k, p, u, z чёрный цвет
     * b, g, l, q, v синий цвет
     * c, h, m, r, w зелёный цвет
     * d, i, n, s, x красный цвет
     * e, j, o, t, y цвет маджента
     * любой другой символ -- жёлтый
     * @param name это имя пользователя
     * @return возвращает цвет дивана как класс Color
     */
    Color chooserColor(String name){
        return switch (name.charAt(0)) {
            case 'a', 'f', 'k', 'p', 'u', 'z', 'A', 'F', 'K', 'P', 'U', 'Z' -> Color.BLACK;
            case 'b', 'g', 'l', 'q', 'v', 'B', 'G', 'L', 'Q', 'V' -> Color.BLUE;
            case 'c', 'h', 'm', 'r', 'w', 'C', 'H', 'M', 'R', 'W' -> Color.GREEN;
            case 'd', 'i', 'n', 's', 'x', 'D', 'I', 'N', 'S', 'X' -> Color.RED;
            case 'e', 'j', 'o', 't', 'y', 'E', 'J', 'O', 'T', 'Y' -> Color.MAGENTA;
            default -> Color.YELLOW;
        };
    }

    /**
     * Метод подбирает длину дивана в зависимости от возраста пользователя по формуле дл = (возр % 9)*7+15
     * @param age возраст пользователя
     * @return длину дивана типа int
     */
    public int chooserWidth(int age) {
        return (age % 9) * 7 + 15;
    }

    /**
     * Метод подбирает высоту дивана в зависимости от возраста пользователя по формуле выс = (возр % 4)*27+15
     * @param age возраст пользователя
     * @return высота дивана типа int
     */
    public int chooserDepth(int age) {
        return (age % 4) * 27 + 15;
    }

    /**
     * Метод подбирает высоту дивана в зависимости от возраста пользователя по формуле шир = (возр % 34)*35+15
     * @param age возраст пользователя
     * @return ширина дивана типа int
     */
    public int chooserHeight(int age){
        return (age % 34) * 35 + 15;
    }
}
