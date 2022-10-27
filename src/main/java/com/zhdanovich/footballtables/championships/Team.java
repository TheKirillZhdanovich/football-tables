package com.zhdanovich.footballtables.championships;

import lombok.Data;

@Data
public class Team {
    private String place;
    private String team;
    private String matches;
    private String wins;
    private String draws;
    private String defeats;
    private String ScoredGoals;
    private String MissedGoals;
    private String points;
}
