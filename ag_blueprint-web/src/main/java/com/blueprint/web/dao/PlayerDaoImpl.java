package com.blueprint.web.dao;

import com.blueprint.models.Player;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDaoImpl implements PlayerDao {

    private static List<String> playerTeams;

    {
        playerTeams = new ArrayList<>();
        playerTeams.add("India");
        playerTeams.add("Mumbai");
        playerTeams.add("Deccan Chargers");
    }

    private static List<Player> playersList;

    {
        playersList = new ArrayList<>();
        playersList.add(new Player(1234, "Rohit", "Sharma", "10/11/2016", "India", "Vizag",
                "Andhra", playerTeams, "Right Hand", "Right arm off spin", false, true, 4500, 2100));
        playersList.add(new Player(1234, "Rohit", "Sharma", "10/11/2016", "India", "Vizag",
                "Andhra", playerTeams, "Right Hand", "Right arm off spin", false, true, 4500, 2100));
        playersList.add(new Player(1234, "Rohit", "Sharma", "10/11/2016", "India", "Vizag",
                "Andhra", playerTeams, "Right Hand", "Right arm off spin", false, true, 4500, 2100));
        playersList.add(new Player(1234, "Rohit", "Sharma", "10/11/2016", "India", "Vizag",
                "Andhra", playerTeams, "Right Hand", "Right arm off spin", false, true, 4500, 2100));
        playersList.add(new Player(1234, "Rohit", "Sharma", "10/11/2016", "India", "Vizag",
                "Andhra", playerTeams, "Right Hand", "Right arm off spin", false, true, 4500, 2100));
        playersList.add(new Player(1234, "Rohit", "Sharma", "10/11/2016", "India", "Vizag",
                "Andhra", playerTeams, "Right Hand", "Right arm off spin", false, true, 4500, 2100));
    }

    @Override
    public List<Player> getAllPlayers() {
        return playersList;
    }

    @Override
    public Player getPlayerByName(String playerName) {
        for (Player player : playersList) {
            if (StringUtils.equalsIgnoreCase(player.getPlayerFirstName(), playerName)) {
                return player;
            }
        }

        return null;
    }

    @Override
    public Player savePlayer(Player player) {
        playersList.add(player);
        return player;
    }

    @Override
    public int deletePlayer(int id) {
        for (Player player : playersList) {
            if (id == player.getPlayerId()) {
                return id;
            }
        }
        return 0;
    }

    @Override
    public int deletePlayer(String playerName) {
        for (Player player : playersList) {
            if (StringUtils.equalsIgnoreCase(playerName, player.getPlayerFirstName())) {
                return player.getPlayerId();
            }
        }
        return 0;
    }

    @Override
    public Player updatePlayer(int id, Player player) {
        for (Player p : playersList) {
            if (id == p.getPlayerId()) {
                playersList.remove(p);
                playersList.add(player);

                return player;
            }
        }
        return null;
    }

}
