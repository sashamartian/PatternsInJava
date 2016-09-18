package main.java.com.patterns.structural.adapter.byInterface;

/**
 * Created by sbt-galushkin-aa on 18.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        AlphaList listAlpha = AlphaListManager.createList();
        BetaList listBeta = new ListAdapter(listAlpha);
        BetaSaveManager.saveList(listBeta);
    }
}
