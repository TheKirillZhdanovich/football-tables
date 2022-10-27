package com.zhdanovich.footballtables.services;

import com.zhdanovich.footballtables.championships.Team;
import com.zhdanovich.footballtables.parser.Parser;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class SeriaAService {
    private final String URL = "https://www.sports.ru/seria-a/table/";
    public List<Team> seriaA = new ArrayList<>();

    @PostConstruct
    @Scheduled(cron = "@daily")
    public void fetchData() {
        Parser parser = new Parser(URL);
        seriaA = parser.parseData();
    }

}
