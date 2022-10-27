package com.zhdanovich.footballtables.parser;

import com.zhdanovich.footballtables.championships.Team;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private final String URL;

    public Parser(String url) {
        URL = url;
    }

    public List<Team> parseData(){
        try {
            Document document = Jsoup.connect(URL).get();

            Elements elements = document.getElementsByTag("tbody");

            String[] dataForTable = elements.get(1).text().split(" ");

            return getTable(prepareTable(dataForTable));
        } catch (IOException e) {
            System.out.println("Ошибка при подключении по данному URL");;
        }
        return null;
    }

    private String[][] prepareTable(String[] data) {
        String[][] table = new String[data.length / 9][9];
        int counter = 0;

        for(int i = 0; i < data.length / 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(counter == data.length - 1) {
                    table[i][j] = data[counter];
                    break;
                }

                if(!isDigit(data[counter]) && !isDigit(data[counter + 1])) {
                    table[i][j] = data[counter] + " " + data[counter + 1];
                    counter += 2;
                } else {
                    table[i][j] = data[counter];
                    counter++;
                }
            }
        }

        return table;
    }

    private List<Team> getTable(String[][] table) {
        List<Team> list = new ArrayList<>();

        for(int i = 0; i < table.length; i++) {
            Team team = new Team();
            team.setPlace(table[i][0]);
            team.setTeam(table[i][1]);
            team.setMatches(table[i][2]);
            team.setWins(table[i][3]);
            team.setDraws(table[i][4]);
            team.setDefeats(table[i][5]);
            team.setScoredGoals(table[i][6]);
            team.setMissedGoals(table[i][7]);
            team.setPoints(table[i][8]);

            list.add(team);
        }

        return list;
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
