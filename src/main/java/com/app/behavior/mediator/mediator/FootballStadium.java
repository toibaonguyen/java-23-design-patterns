package com.app.behavior.mediator.mediator;

import com.app.behavior.mediator.Event;
import com.app.behavior.mediator.FootballTeam;
import com.app.behavior.mediator.components.Actor;
import com.app.behavior.mediator.components.Fan;
import com.app.behavior.mediator.components.FootballPlayer;
import com.app.behavior.mediator.components.GoalKeeper;
import org.jetbrains.annotations.NotNull;

//Mediator implementation
public class FootballStadium implements Stadium{

    private final FootballTeam team1;
    private final FootballTeam team2;
    private FootballTeam lastScoredTeam;
    public FootballStadium()
    {
        team1=new FootballTeam();
        team2=new FootballTeam();
    }

    public void addTeam1FootballPlayers(@NotNull FootballPlayer player)
    {
        player.setStadium(this);
        team1.getPlayers().add(player);
    }

    public void addTeam2FootballPlayers(@NotNull FootballPlayer player)
    {
        player.setStadium(this);
        team2.getPlayers().add(player);
    }

    public void removeTeam1FootballPlayer(@NotNull FootballPlayer player)
    {
        player.setStadium(null);
        team1.getPlayers().remove(player);
    }

    public void removeTeam2FootballPlayer(@NotNull FootballPlayer player)
    {
        player.setStadium(null);
        team2.getPlayers().remove(player);
    }

    public void setTeam1GoalKeeper(@NotNull GoalKeeper goalKeeper)
    {
        goalKeeper.setStadium(this);
        team1.setGoalKeeper(goalKeeper);
    }

    public void removeTeam1GoalKeeper()
    {
        team1.getGoalKeeper().setStadium(null);
        team1.setGoalKeeper(null);
    }

    public void setTeam2GoalKeeper(@NotNull GoalKeeper goalKeeper)
    {
        goalKeeper.setStadium(this);
        team2.setGoalKeeper(goalKeeper);
    }

    public void removeTeam2GoalKeeper()
    {
        team2.getGoalKeeper().setStadium(null);
        team2.setGoalKeeper(null);
    }

    public void addTeam1Fan(@NotNull Fan fan)
    {
        fan.setStadium(this);
        team1.getFans().add(fan);
    }

    public void removeTeam1Fan(@NotNull Fan fan)
    {
        fan.setStadium(null);
        team1.getFans().remove(fan);
    }

    public void addTeam2Fan(@NotNull Fan fan)
    {
        fan.setStadium(this);
        team2.getFans().add(fan);
    }

    public void removeTeam2Fan(Fan fan)
    {
        fan.setStadium(null);
        team2.getFans().remove(fan);
    }
    @Override
    public void notify(Actor actor, Event event) {
        if(actor instanceof FootballPlayer && event==Event.SHOOT)
        {
            footballPlayerShootEventHandler((FootballPlayer) actor);
        }
        if(actor instanceof GoalKeeper && event==Event.CATCH_FAIL)
        {
            goalKeeperCatchFailEventHandler((GoalKeeper) actor);
        }
        if(actor instanceof Fan&&event==Event.CHEER)
        {
            fanCheerEventHandler((Fan) actor);
        }
    }

    private void footballPlayerShootEventHandler(FootballPlayer footballPlayer)
    {
        if(team1.getPlayers().contains(footballPlayer))
        {
            team2.getGoalKeeper().catchTheBall();

        }
        else if(team2.getPlayers().contains(footballPlayer))
        {
            team1.getGoalKeeper().catchTheBall();
        }
    }

    private void goalKeeperCatchFailEventHandler(GoalKeeper goalKeeper)
    {
        if(goalKeeper==team1.getGoalKeeper())
        {
            lastScoredTeam=team2;
            team2.getFans().forEach(Fan::feelsExcited);
            team2.getPlayers().forEach(FootballPlayer::feelGood);
            goalKeeper.feelDown();
            team1.getPlayers().forEach(FootballPlayer::feelDown);
        }
        else if(goalKeeper==team2.getGoalKeeper())
        {
            lastScoredTeam=team1;
            team1.getFans().forEach(Fan::feelsExcited);
            team1.getPlayers().forEach(FootballPlayer::feelGood);
            goalKeeper.feelDown();
            team2.getPlayers().forEach(FootballPlayer::feelDown);
        }
    }

    private void fanCheerEventHandler(Fan fan)
    {
        if(team1.getFans().contains(fan))
        {
            if (lastScoredTeam == team1) {
                team1.getPlayers().forEach(FootballPlayer::feelVeryGood);
                team1.getGoalKeeper().feelVeryGood();
            } else {
                team1.getPlayers().forEach(FootballPlayer::feelGood);
                team1.getGoalKeeper().feelGood();
            }
        }
        else if(team2.getFans().contains(fan))
        {
            if (lastScoredTeam == team2) {
                team2.getPlayers().forEach(FootballPlayer::feelVeryGood);
                team2.getGoalKeeper().feelVeryGood();
            } else {
                team2.getPlayers().forEach(FootballPlayer::feelGood);
                team2.getGoalKeeper().feelGood();
            }
        }
    }
}
