package com.zhdanovich.footballtables.championships;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Team {
    private String place;
    private String team;
    private String matches;
    private String wins;
    private String draws;
    private String defeats;
    private String scoredGoals;
    private String missedGoals;
    private String points;

    public Team(String place, String team, String matches, String wins,
                String draws, String defeats, String scoredGoals, String missedGoals, String points) {
        this.place = place;
        this.team = team;
        this.matches = matches;
        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
        this.scoredGoals = scoredGoals;
        this.missedGoals = missedGoals;
        this.points = points;
    }
}
