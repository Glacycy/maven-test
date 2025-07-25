package dev;

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
    }
}
