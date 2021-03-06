﻿using SimpleJSON;
using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class GameSceneManager : MonoBehaviour
{
    public GameObject loadingBox;

    private bool goToGameListScene;
	private bool goToLobbyScene;
	private bool goToGameScene;

    private bool isLoadingMap;
    void Start() {
		goToGameListScene = false;
		goToLobbyScene = false;
		goToGameScene = false;
        isLoadingMap = false;
    }

	void Update()
    {
        if (goToGameListScene) {
			goToGameListScene = false;
			SceneManager.LoadScene("GameList");
		}
		if(goToLobbyScene) {
			goToLobbyScene = false;
			SceneManager.LoadScene("Lobby");
		}
		if(goToGameScene) {
            RefreshLoadingBox();
            goToGameScene = false;
			SceneManager.LoadScene("GameBoard");
		}
	}
	public void ToGameListScene() {
		goToGameListScene = true;
	}
    public void ToLobbyScene() {
		goToLobbyScene = true;
	}

	public void ToLobbyScene(int gameId, int playerId, int[] playersRoles, string map) {
		GameLobbyData.GameId = gameId;
		GameLobbyData.PlayerId = playerId;
		GameLobbyData.PlayersRoles = playersRoles;
		GameLobbyData.MapName = map;
		GameLobbyData.CreatedGame = false;
		goToLobbyScene = true;
	}

	public void ToLobbyScene(int gameId, int[] playersRoles, string[] mapList) {
		GameLobbyData.GameId = gameId;
		GameLobbyData.MapList = mapList;
		GameLobbyData.PlayersRoles = playersRoles;
		GameLobbyData.CreatedGame = true;
		GameLobbyData.PlayerId = 0;
		goToLobbyScene = true;
	}

	public void ToGameboardScene(JSONArray blocks, JSONArray objects, JSONArray players, string levelName) {
		GameLobbyData.BlocksJson = blocks;
		GameLobbyData.ObjectsJson = objects;
		GameLobbyData.PlayersJson = players;
		GameLobbyData.LevelName = levelName;
		goToGameScene = true;
	}

    public void SetLoadingBoxActive(bool active)
    {
        isLoadingMap = active;
    }
    public void RefreshLoadingBox()
    {
        if (isLoadingMap && loadingBox != null)
        {
            loadingBox.SetActive(true);
        }
        else if (loadingBox != null)
        {
            loadingBox.SetActive(false);
        }
    }
}
