package com.app.behavior.mediator;

import com.app.behavior.mediator.components.Fan;
import com.app.behavior.mediator.components.FootballPlayer;
import com.app.behavior.mediator.components.GoalKeeper;

import java.util.HashSet;
import java.util.Set;

public class FootballTeam {
    private final Set<FootballPlayer> players=new HashSet<>();
    private GoalKeeper team1GoalKeeper;
    private final Set<Fan> fans=new HashSet<>();

    public Set<FootballPlayer> getPlayers() {
        return players;
    }

    public GoalKeeper getGoalKeeper() {
        return team1GoalKeeper;
    }

    public void setGoalKeeper(GoalKeeper team1GoalKeeper) {
        this.team1GoalKeeper = team1GoalKeeper;
    }

    public Set<Fan> getFans() {
        return fans;
    }
}
