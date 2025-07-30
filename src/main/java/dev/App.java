package dev;

import java.util.ResourceBundle;
import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            String art = FigletFont.convertOneLine("Hello World!");
            System.out.println(art);
        } catch (Exception e) {
            System.err.println("Erreur: " + e.getMessage());
        }

        String titre = ResourceBundle.getBundle("application").getString("titre");
        String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);

        String environnement = ResourceBundle.getBundle("application").getString("environnement");
        System.out.println("Environnement : " + environnement);
    }
}
