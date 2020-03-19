package com.example.justgottagetrightouttahere_client.model;

import android.util.Log;

import com.example.justgottagetrightouttahere_client.network.MessageHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class GameMessageHandler implements MessageHandler {

    GameModel model;

    public GameMessageHandler(GameModel model){
        this.model = model;
    }

    /**
     * Handles the message in the game board context
     * TODO
     * @param s
     */
    @Override
    public void handle(String s){
        System.err.println("Handling message < "+s+" >");
        try {
            JSONObject jsonObject = new JSONObject(s);
            Log.e("INFO","Action : "+jsonObject.getString("Action"));

            switch (jsonObject.getString("Action")){
                case "move":
                    movePlayerAction(jsonObject);
                    break;
                case "action":
                    playerActionAction(jsonObject);
                    break;
                case "loadLevel":
                    loadLevel(jsonObject);
                    break;
                default:
                    Log.e("ERROR","Game handler can't handle action "+jsonObject.getString("Action"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    void movePlayerAction(JSONObject jsonObject){
        try {
            int playerId = jsonObject.getInt("Player");
            int posX = jsonObject.getInt("PosX");
            int posY = jsonObject.getInt("PosY");

            model.movePlayer(playerId,posX,posY);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    void playerActionAction(JSONObject jsonObject){
        List<Tile> tilesToChange = new ArrayList<>();
        try {
            JSONArray jsonTilesArray = jsonObject.getJSONArray("Changes");
            int arrayLength = jsonTilesArray.length();
            for(int i = 0; i < arrayLength;++i){
                JSONObject jsonTile = jsonTilesArray.getJSONObject(i);
                tilesToChange.add(new Tile(jsonTile.getInt("xPos"),jsonTile.getInt("yPos"),jsonTile.getInt("value")));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        model.updateTiles(tilesToChange);
    }

    void loadLevel(JSONObject jsonObject){
        try {
            int arrayHeight, arrayWidth;
            int matrix[][] = new int[0][0];

            JSONArray map = jsonObject.getJSONArray("Level");
            arrayHeight = map.length();
            for(int i = 0; i < arrayHeight; ++i){
                JSONArray line = map.getJSONArray(i);
                arrayWidth = line.length();
                if(i == 0){
                    matrix = new int[arrayWidth][arrayHeight];
                }

                for(int j = 0; j < arrayWidth; ++j){
                    matrix[j][i] = line.getInt(j);
                }
            }
            model.loadLevel(matrix);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
