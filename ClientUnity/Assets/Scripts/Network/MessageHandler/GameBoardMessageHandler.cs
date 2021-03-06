﻿using UnityEngine;
using SimpleJSON;

public class GameBoardMessageHandler : MonoBehaviour, IMessageHandler
{
    public GameModel model;
	public GameSceneManager gameSceneManager;

    public void Handle(string JSONString)
    {
        ActionJson action = JsonUtility.FromJson<ActionJson>(JSONString);
        Debug.Log("Action recieved : " + action.Action);
        switch (action.Action)
        {
			/*case "loadLevel":
                var loadLevelJson = JSON.Parse(JSONString);
                JSONArray blocks = loadLevelJson["Blocks"].AsArray;
                JSONArray objects = loadLevelJson["Objects"].AsArray;
                JSONArray players = loadLevelJson["Players"].AsArray;
                string levelName = loadLevelJson["Name"];
                model.LoadLevel(blocks, players, objects, levelName);
                break;*/
			case "returnToLobby":
				if (gameSceneManager != null)
					gameSceneManager.ToLobbyScene();
				break;
            case "move":
                var moveJson = JSON.Parse(JSONString);
                model.MovePlayer(moveJson["Player"], moveJson["PosX"], moveJson["PosY"], moveJson["Direction"]);
                model.UpdateObjects(moveJson["Changes"].AsArray);
                break;
            case "action":
                var updateLevelJson = JSON.Parse(JSONString);
                JSONArray updates = updateLevelJson["Changes"].AsArray;
                model.UpdateObjects(updates);
                model.MovePlayer(updateLevelJson["Player"], updateLevelJson["PosX"], updateLevelJson["PosY"], updateLevelJson["Direction"]);
                break;
            case "win":
                model.gameWon = true;
                break;
            case "sendPing":
                var pingJson = JSON.Parse(JSONString);
                model.CreatePing(pingJson["PosX"], pingJson["PosY"]);
                break;
            case "gameReady":
                model.CanUnlockScene = true;
                break;
            default:
                Debug.LogError("Can't handle this action : " + action.Action);
                break;
        }
    }
}
