package com.xsonsui.maxball.model;

import java.io.Serializable;

/**
 * Created by alim on 9/12/14.
 */
public class GameUpdate implements Serializable{
    private int scoreRed;
    private int scoreBlue;
    private int gameState;
    private Ball ball;
    private Player[] players;

    public GameUpdate(Game game) {
        this.players = game.players.values().toArray(new Player[game.players.size()]);
        this.ball = game.ball;
        this.scoreRed = game.scoreRed;
        this.scoreBlue = game.scoreBlue;
        this.gameState = game.gameState;
    }

    public void updateGame(Game game) {
        game.gameState = gameState;
        game.scoreBlue = scoreBlue;
        game.scoreRed = scoreRed;
        game.ball = ball;
        ball.force = new Vector2f();
        game.players.clear();
        for(Player p: players) {
            p.force = new Vector2f();
            game.players.put(p.name, p);
        }
    }
}
