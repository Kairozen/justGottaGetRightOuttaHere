﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CrossSceneAudioSource : MonoBehaviour
{
    private static CrossSceneAudioSource Instance = null;
    public static CrossSceneAudioSource instance { get { return instance; } }

    
    private void Awake()
    {
        if (Instance != null && Instance != this)
        {
            Destroy(this.gameObject);
            return;
        }
        else
        {
            Instance = this;
        }
        DontDestroyOnLoad(this.gameObject);
    }

    public void PlayClip(AudioClip audioClip)
    {
        AudioSource source = GetComponent<AudioSource>();
        if(source == null)
        {
            Debug.LogError("No cross scene audio source was found!");
            source = new AudioSource();
            return;
        }
        source.clip = audioClip;
        source.Play();
    }
}
