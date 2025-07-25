package dev;

import com.github.lalyos.jfiglet.FigletFont;

public class JFiglet {
    public static void main(String[] args) {
        try {
            String art = FigletFont.convertOneLine("Hello World!");
            System.out.println(art);
        } catch (Exception e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
