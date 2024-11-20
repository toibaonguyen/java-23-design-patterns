package com.app.behavior.mediator;

import com.app.behavior.mediator.components.Fan;
import com.app.behavior.mediator.components.FootballPlayer;
import com.app.behavior.mediator.components.GoalKeeper;
import com.app.behavior.mediator.mediator.FootballStadium;
import com.app.behavior.mediator.mediator.Stadium;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        //Mediator implementation
        FootballStadium footballStadium=new FootballStadium();

        FootballPlayer footballPlayer1=new FootballPlayer("CR7");
        FootballPlayer footballPlayer2=new FootballPlayer("Marcelo");
        FootballPlayer footballPlayer3=new FootballPlayer("M10");
        FootballPlayer footballPlayer4=new FootballPlayer("Neymar");

        Fan fan1=new Fan("Madrid Nista 1");
        Fan fan2=new Fan("Madrid Nista 2");
        Fan fan3=new Fan("Culer 1");
        Fan fan4=new Fan("Culer 2");

        GoalKeeper goalKeeper1 = new GoalKeeper("Courtois");
        GoalKeeper goalKeeper2 = new GoalKeeper("Ter Stegen");

        //Register Component to Mediator
        footballStadium.addTeam1FootballPlayers(footballPlayer1);
        footballStadium.addTeam1FootballPlayers(footballPlayer2);
        footballStadium.addTeam2FootballPlayers(footballPlayer3);
        footballStadium.addTeam2FootballPlayers(footballPlayer4);
        footballStadium.addTeam1Fan(fan1);
        footballStadium.addTeam1Fan(fan2);
        footballStadium.addTeam2Fan(fan3);
        footballStadium.addTeam2Fan(fan4);
        footballStadium.setTeam1GoalKeeper(goalKeeper1);
        footballStadium.setTeam2GoalKeeper(goalKeeper2);
        System.out.println();
        System.out.println("======> it's Real Madrid's turn! <======");
        footballPlayer1.shoot();
        System.out.println();
        System.out.println("======> it's Barcelona's turn! <======");
        footballPlayer3.shoot();
        System.out.println();
        System.out.println("======> it's Real Madrid's turn! <======");
        fan1.cheer();
        System.out.println();
        System.out.println("======> it's Barcelona's turn! <======");
        footballPlayer4.shoot();


    }
}
