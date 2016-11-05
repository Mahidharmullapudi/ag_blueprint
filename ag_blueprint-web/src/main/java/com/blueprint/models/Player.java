/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blueprint.models;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author agamull
 */
public class Player implements Serializable {

    private int playerId;
    private String playerFirstName;
    private String playerLastName;
    private String playerDob;
    private String playerCountry;
    private String playerCity;
    private String playerState;
    private List<String> playerTeams;
    private String playerBattingStyle;
    private String playerBowlingStyle;
    private boolean playerWicketKeeper;
    private boolean playerCaptain;
    private int odiRuns;
    private int testRuns;

    public Player() {

    }

    public Player(int playerId, String playerFirstName, String playerLastName, String playerDob, String playerCountry, String playerCity, String playerState, List<String> playerTeams, String playerBattingStyle, String playerBowlingStyle, boolean playerWicketKeeper, boolean playerCaptain, int odiRuns, int testRuns) {
        this.playerId = playerId;
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerDob = playerDob;
        this.playerCountry = playerCountry;
        this.playerCity = playerCity;
        this.playerState = playerState;
        this.playerTeams = playerTeams;
        this.playerBattingStyle = playerBattingStyle;
        this.playerBowlingStyle = playerBowlingStyle;
        this.playerWicketKeeper = playerWicketKeeper;
        this.playerCaptain = playerCaptain;
        this.odiRuns = odiRuns;
        this.testRuns = testRuns;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getPlayerDob() {
        return playerDob;
    }

    public void setPlayerDob(String playerDob) {
        this.playerDob = playerDob;
    }

    public String getPlayerCountry() {
        return playerCountry;
    }

    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }

    public String getPlayerCity() {
        return playerCity;
    }

    public void setPlayerCity(String playerCity) {
        this.playerCity = playerCity;
    }

    public String getPlayerState() {
        return playerState;
    }

    public void setPlayerState(String playerState) {
        this.playerState = playerState;
    }

    public List<String> getPlayerTeams() {
        return playerTeams;
    }

    public void setPlayerTeams(List<String> playerTeams) {
        this.playerTeams = playerTeams;
    }

    public String getPlayerBattingStyle() {
        return playerBattingStyle;
    }

    public void setPlayerBattingStyle(String playerBattingStyle) {
        this.playerBattingStyle = playerBattingStyle;
    }

    public String getPlayerBowlingStyle() {
        return playerBowlingStyle;
    }

    public void setPlayerBowlingStyle(String playerBowlingStyle) {
        this.playerBowlingStyle = playerBowlingStyle;
    }

    public boolean isPlayerWicketKeeper() {
        return playerWicketKeeper;
    }

    public void setPlayerWicketKeeper(boolean playerWicketKeeper) {
        this.playerWicketKeeper = playerWicketKeeper;
    }

    public boolean isPlayerCaptain() {
        return playerCaptain;
    }

    public void setPlayerCaptain(boolean playerCaptain) {
        this.playerCaptain = playerCaptain;
    }

    public int getOdiRuns() {
        return odiRuns;
    }

    public void setOdiRuns(int odiRuns) {
        this.odiRuns = odiRuns;
    }

    public int getTestRuns() {
        return testRuns;
    }

    public void setTestRuns(int testRuns) {
        this.testRuns = testRuns;
    }

}
