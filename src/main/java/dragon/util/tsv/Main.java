package dragon.util.tsv;

import dragon.game.data.QuestData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var filePath = "D:/server/genshin_beta/resource/4.0/txt/QuestData.txt";
        try {
            var q = new TsvParser(new BufferedReader(new FileReader(filePath))).parse(QuestData.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}