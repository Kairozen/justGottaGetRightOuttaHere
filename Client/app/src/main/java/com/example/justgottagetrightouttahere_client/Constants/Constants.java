package com.example.justgottagetrightouttahere_client.Constants;

public interface Constants {
    public static final int DEFAULT_SIZE_X = 20;
    public static final int DEFAULT_SIZE_Y = 25;

    public static final int DEFAULT_TILE_SIZE = 64;

    /* NETWORK */
    int BUFFER_CAPACITY = 32768;
    int SERVER_PORT = 1789;
    String SERVER_ADDRESS = "norcisrasp.ddns.net";
    //String SERVER_ADDRESS = "10.0.2.2";



    /*DEBUG*/
    String levelToLoad = "{\"Action\":\"loadLevel\", \"Name\":\"map\", \"Blocks\":[[24,64,24,64,64,64,55,55,55,64,64,64,64,64,64,33,64,64,24,64],[64,64,64,33,64,64,55,55,55,24,64,33,33,64,64,33,64,33,64,24],[64,64,64,64,24,64,55,55,55,64,64,64,64,64,33,64,64,64,33,64],[29,64,64,33,64,64,55,55,55,64,24,0,0,0,0,0,0,0,0,0],[64,64,24,24,64,64,55,55,55,64,24,0,0,0,0,0,0,0,0,0],[64,64,64,64,64,24,55,55,55,64,64,0,0,0,0,45,43,43,44,0],[24,24,33,64,24,64,55,55,55,64,64,0,0,0,0,0,0,0,0,0],[64,64,64,64,64,64,55,55,55,24,64,0,0,0,0,0,0,0,0,0],[64,64,24,64,24,64,55,55,55,64,64,0,0,0,0,0,0,0,0,0],[24,24,64,64,64,33,55,55,55,64,24,0,0,0,0,0,0,0,0,0],[29,55,55,55,55,55,55,55,55,24,64,64,64,64,33,64,64,64,64,64],[64,64,64,33,64,64,55,55,55,64,33,33,24,33,64,64,33,64,24,64],[64,24,64,64,64,64,55,55,55,33,64,64,64,33,64,33,24,64,64,33],[24,64,64,24,64,64,55,55,55,55,55,55,55,55,55,55,55,55,55,55],[64,64,64,64,64,33,55,55,55,55,55,55,55,55,55,55,55,55,55,55],[64,33,64,64,33,64,55,55,55,55,55,55,55,55,55,55,55,55,55,55],[33,64,24,64,64,64,55,55,55,55,55,55,55,55,55,55,55,55,55,55],[64,64,64,64,64,64,55,55,55,64,64,33,64,64,64,64,64,64,64,64],[64,64,24,64,64,64,55,55,55,64,64,64,24,33,64,33,64,24,33,64],[64,64,64,33,64,64,55,55,55,24,64,64,64,64,24,64,64,64,64,33],[64,33,64,64,64,64,55,55,55,64,64,64,24,64,64,64,33,64,33,64],[55,55,55,55,55,55,55,55,55,64,64,64,64,64,64,64,64,33,24,64],[55,55,55,55,55,55,55,55,55,64,24,64,64,33,24,64,64,64,64,33],[55,55,55,55,55,55,55,55,55,64,64,64,24,64,64,64,33,33,24,33],[64,64,64,64,64,33,64,64,64,64,64,24,64,64,33,33,33,64,64,64]],\"Objects\":[{\"xPos\": 2,\"yPos\": 0,\"value\": 67},{\"xPos\": 3,\"yPos\": 0,\"value\": 12},{\"xPos\": 4,\"yPos\": 0,\"value\": 12},{\"xPos\": 5,\"yPos\": 0,\"value\": 50},{\"xPos\": 6,\"yPos\": 0,\"value\": 67},{\"xPos\": 7,\"yPos\": 0,\"value\": 67},{\"xPos\": 8,\"yPos\": 0,\"value\": 67},{\"xPos\": 9,\"yPos\": 0,\"value\": 67},{\"xPos\": 17,\"yPos\": 0,\"value\": 50},{\"xPos\": 19,\"yPos\": 0,\"value\": 6},{\"xPos\": 3,\"yPos\": 1,\"value\": 12},{\"xPos\": 4,\"yPos\": 1,\"value\": 6},{\"xPos\": 5,\"yPos\": 1,\"value\": 50},{\"xPos\": 6,\"yPos\": 1,\"value\": 67},{\"xPos\": 7,\"yPos\": 1,\"value\": 67},{\"xPos\": 8,\"yPos\": 1,\"value\": 67},{\"xPos\": 17,\"yPos\": 1,\"value\": 50},{\"xPos\": 3,\"yPos\": 2,\"value\": 12},{\"xPos\": 4,\"yPos\": 2,\"value\": 12},{\"xPos\": 5,\"yPos\": 2,\"value\": 50},{\"xPos\": 6,\"yPos\": 2,\"value\": 67},{\"xPos\": 7,\"yPos\": 2,\"value\": 67},{\"xPos\": 10,\"yPos\": 2,\"value\": 67},{\"xPos\": 11,\"yPos\": 2,\"value\": 67},{\"xPos\": 15,\"yPos\": 2,\"value\": 67},{\"xPos\": 17,\"yPos\": 2,\"value\": 59},{\"xPos\": 18,\"yPos\": 2,\"value\": 57},{\"xPos\": 19,\"yPos\": 2,\"value\": 57},{\"xPos\": 0,\"yPos\": 3,\"value\": 67},{\"xPos\": 4,\"yPos\": 3,\"value\": 67},{\"xPos\": 5,\"yPos\": 3,\"value\": 50},{\"xPos\": 6,\"yPos\": 3,\"value\": 67},{\"xPos\": 7,\"yPos\": 3,\"value\": 67},{\"xPos\": 8,\"yPos\": 3,\"value\": 67},{\"xPos\": 9,\"yPos\": 3,\"value\": 67},{\"xPos\": 11,\"yPos\": 3,\"value\": 72},{\"xPos\": 12,\"yPos\": 3,\"value\": 72},{\"xPos\": 13,\"yPos\": 3,\"value\": 43},{\"xPos\": 14,\"yPos\": 3,\"value\": 72},{\"xPos\": 15,\"yPos\": 3,\"value\": 43},{\"xPos\": 16,\"yPos\": 3,\"value\": 72},{\"xPos\": 17,\"yPos\": 3,\"value\": 43},{\"xPos\": 18,\"yPos\": 3,\"value\": 72},{\"xPos\": 19,\"yPos\": 3,\"value\": 43},{\"xPos\": 0,\"yPos\": 4,\"value\": 66},{\"xPos\": 1,\"yPos\": 4,\"value\": 66},{\"xPos\": 2,\"yPos\": 4,\"value\": 66},{\"xPos\": 3,\"yPos\": 4,\"value\": 66},{\"xPos\": 4,\"yPos\": 4,\"value\": 66},{\"xPos\": 5,\"yPos\": 4,\"value\": 69},{\"xPos\": 6,\"yPos\": 4,\"value\": 67},{\"xPos\": 7,\"yPos\": 4,\"value\": 67},{\"xPos\": 8,\"yPos\": 4,\"value\": 67},{\"xPos\": 9,\"yPos\": 4,\"value\": 67},{\"xPos\": 11,\"yPos\": 4,\"value\": 72},{\"xPos\": 12,\"yPos\": 4,\"value\": 72},{\"xPos\": 13,\"yPos\": 4,\"value\": 45},{\"xPos\": 14,\"yPos\": 4,\"value\": 52},{\"xPos\": 15,\"yPos\": 4,\"value\": 43},{\"xPos\": 16,\"yPos\": 4,\"value\": 52},{\"xPos\": 17,\"yPos\": 4,\"value\": 44},{\"xPos\": 18,\"yPos\": 4,\"value\": 54},{\"xPos\": 19,\"yPos\": 4,\"value\": 43},{\"xPos\": 0,\"yPos\": 5,\"value\": 67},{\"xPos\": 1,\"yPos\": 5,\"value\": 67},{\"xPos\": 2,\"yPos\": 5,\"value\": 67},{\"xPos\": 3,\"yPos\": 5,\"value\": 67},{\"xPos\": 5,\"yPos\": 5,\"value\": 67},{\"xPos\": 6,\"yPos\": 5,\"value\": 67},{\"xPos\": 7,\"yPos\": 5,\"value\": 67},{\"xPos\": 8,\"yPos\": 5,\"value\": 67},{\"xPos\": 11,\"yPos\": 5,\"value\": 72},{\"xPos\": 12,\"yPos\": 5,\"value\": 72},{\"xPos\": 13,\"yPos\": 5,\"value\": 43},{\"xPos\": 14,\"yPos\": 5,\"value\": 44},{\"xPos\": 15,\"yPos\": 5,\"value\": 4},{\"xPos\": 16,\"yPos\": 5,\"value\": 37},{\"xPos\": 17,\"yPos\": 5,\"value\": 38},{\"xPos\": 18,\"yPos\": 5,\"value\": 4},{\"xPos\": 19,\"yPos\": 5,\"value\": 44},{\"xPos\": 0,\"yPos\": 6,\"value\": 67},{\"xPos\": 2,\"yPos\": 6,\"value\": 67},{\"xPos\": 3,\"yPos\": 6,\"value\": 67},{\"xPos\": 5,\"yPos\": 6,\"value\": 67},{\"xPos\": 6,\"yPos\": 6,\"value\": 67},{\"xPos\": 7,\"yPos\": 6,\"value\": 67},{\"xPos\": 8,\"yPos\": 6,\"value\": 67},{\"xPos\": 11,\"yPos\": 6,\"value\": 72},{\"xPos\": 12,\"yPos\": 6,\"value\": 72},{\"xPos\": 13,\"yPos\": 6,\"value\": 52},{\"xPos\": 14,\"yPos\": 6,\"value\": 53},{\"xPos\": 15,\"yPos\": 6,\"value\": 54},{\"xPos\": 16,\"yPos\": 6,\"value\": 46},{\"xPos\": 17,\"yPos\": 6,\"value\": 47},{\"xPos\": 18,\"yPos\": 6,\"value\": 52},{\"xPos\": 19,\"yPos\": 6,\"value\": 53},{\"xPos\": 3,\"yPos\": 7,\"value\": 14},{\"xPos\": 6,\"yPos\": 7,\"value\": 67},{\"xPos\": 7,\"yPos\": 7,\"value\": 67},{\"xPos\": 8,\"yPos\": 7,\"value\": 67},{\"xPos\": 11,\"yPos\": 7,\"value\": 72},{\"xPos\": 12,\"yPos\": 7,\"value\": 72},{\"xPos\": 13,\"yPos\": 7,\"value\": 72},{\"xPos\": 14,\"yPos\": 7,\"value\": 72},{\"xPos\": 15,\"yPos\": 7,\"value\": 72},{\"xPos\": 16,\"yPos\": 7,\"value\": 72},{\"xPos\": 17,\"yPos\": 7,\"value\": 72},{\"xPos\": 18,\"yPos\": 7,\"value\": 72},{\"xPos\": 19,\"yPos\": 7,\"value\": 72},{\"xPos\": 1,\"yPos\": 8,\"value\": 67},{\"xPos\": 3,\"yPos\": 8,\"value\": 67},{\"xPos\": 6,\"yPos\": 8,\"value\": 67},{\"xPos\": 7,\"yPos\": 8,\"value\": 67},{\"xPos\": 8,\"yPos\": 8,\"value\": 67},{\"xPos\": 11,\"yPos\": 8,\"value\": 72},{\"xPos\": 12,\"yPos\": 8,\"value\": 72},{\"xPos\": 13,\"yPos\": 8,\"value\": 72},{\"xPos\": 14,\"yPos\": 8,\"value\": 72},{\"xPos\": 15,\"yPos\": 8,\"value\": 72},{\"xPos\": 16,\"yPos\": 8,\"value\": 72},{\"xPos\": 17,\"yPos\": 8,\"value\": 72},{\"xPos\": 18,\"yPos\": 8,\"value\": 72},{\"xPos\": 19,\"yPos\": 8,\"value\": 72},{\"xPos\": 0,\"yPos\": 9,\"value\": 57},{\"xPos\": 1,\"yPos\": 9,\"value\": 60},{\"xPos\": 7,\"yPos\": 9,\"value\": 67},{\"xPos\": 8,\"yPos\": 9,\"value\": 67},{\"xPos\": 11,\"yPos\": 9,\"value\": 72},{\"xPos\": 12,\"yPos\": 9,\"value\": 72},{\"xPos\": 13,\"yPos\": 9,\"value\": 72},{\"xPos\": 14,\"yPos\": 9,\"value\": 72},{\"xPos\": 15,\"yPos\": 9,\"value\": 72},{\"xPos\": 16,\"yPos\": 9,\"value\": 72},{\"xPos\": 17,\"yPos\": 9,\"value\": 72},{\"xPos\": 18,\"yPos\": 9,\"value\": 72},{\"xPos\": 19,\"yPos\": 9,\"value\": 72},{\"xPos\": 0,\"yPos\": 10,\"value\": 67},{\"xPos\": 1,\"yPos\": 10,\"value\": 67},{\"xPos\": 2,\"yPos\": 10,\"value\": 2},{\"xPos\": 3,\"yPos\": 10,\"value\": 67},{\"xPos\": 4,\"yPos\": 10,\"value\": 67},{\"xPos\": 5,\"yPos\": 10,\"value\": 67},{\"xPos\": 6,\"yPos\": 10,\"value\": 67},{\"xPos\": 7,\"yPos\": 10,\"value\": 67},{\"xPos\": 8,\"yPos\": 10,\"value\": 67},{\"xPos\": 10,\"yPos\": 10,\"value\": 67},{\"xPos\": 11,\"yPos\": 10,\"value\": 67},{\"xPos\": 12,\"yPos\": 10,\"value\": 67},{\"xPos\": 13,\"yPos\": 10,\"value\": 67},{\"xPos\": 14,\"yPos\": 10,\"value\": 67},{\"xPos\": 16,\"yPos\": 10,\"value\": 2},{\"xPos\": 17,\"yPos\": 10,\"value\": 2},{\"xPos\": 19,\"yPos\": 10,\"value\": 67},{\"xPos\": 0,\"yPos\": 11,\"value\": 66},{\"xPos\": 1,\"yPos\": 11,\"value\": 69},{\"xPos\": 2,\"yPos\": 11,\"value\": 67},{\"xPos\": 3,\"yPos\": 11,\"value\": 67},{\"xPos\": 4,\"yPos\": 11,\"value\": 67},{\"xPos\": 5,\"yPos\": 11,\"value\": 67},{\"xPos\": 6,\"yPos\": 11,\"value\": 67},{\"xPos\": 7,\"yPos\": 11,\"value\": 67},{\"xPos\": 8,\"yPos\": 11,\"value\": 67},{\"xPos\": 12,\"yPos\": 11,\"value\": 67},{\"xPos\": 14,\"yPos\": 11,\"value\": 14},{\"xPos\": 0,\"yPos\": 12,\"value\": 67},{\"xPos\": 1,\"yPos\": 12,\"value\": 67},{\"xPos\": 2,\"yPos\": 12,\"value\": 67},{\"xPos\": 3,\"yPos\": 12,\"value\": 67},{\"xPos\": 4,\"yPos\": 12,\"value\": 67},{\"xPos\": 5,\"yPos\": 12,\"value\": 67},{\"xPos\": 6,\"yPos\": 12,\"value\": 67},{\"xPos\": 7,\"yPos\": 12,\"value\": 67},{\"xPos\": 8,\"yPos\": 12,\"value\": 67},{\"xPos\": 9,\"yPos\": 12,\"value\": 67},{\"xPos\": 10,\"yPos\": 12,\"value\": 67},{\"xPos\": 0,\"yPos\": 13,\"value\": 67},{\"xPos\": 1,\"yPos\": 13,\"value\": 67},{\"xPos\": 2,\"yPos\": 13,\"value\": 67},{\"xPos\": 3,\"yPos\": 13,\"value\": 67},{\"xPos\": 4,\"yPos\": 13,\"value\": 67},{\"xPos\": 5,\"yPos\": 13,\"value\": 67},{\"xPos\": 6,\"yPos\": 13,\"value\": 67},{\"xPos\": 7,\"yPos\": 13,\"value\": 67},{\"xPos\": 8,\"yPos\": 13,\"value\": 67},{\"xPos\": 9,\"yPos\": 13,\"value\": 67},{\"xPos\": 10,\"yPos\": 13,\"value\": 67},{\"xPos\": 11,\"yPos\": 13,\"value\": 67},{\"xPos\": 12,\"yPos\": 13,\"value\": 67},{\"xPos\": 13,\"yPos\": 13,\"value\": 67},{\"xPos\": 14,\"yPos\": 13,\"value\": 67},{\"xPos\": 15,\"yPos\": 13,\"value\": 67},{\"xPos\": 16,\"yPos\": 13,\"value\": 67},{\"xPos\": 17,\"yPos\": 13,\"value\": 67},{\"xPos\": 18,\"yPos\": 13,\"value\": 67},{\"xPos\": 19,\"yPos\": 13,\"value\": 67},{\"xPos\": 0,\"yPos\": 14,\"value\": 67},{\"xPos\": 1,\"yPos\": 14,\"value\": 67},{\"xPos\": 2,\"yPos\": 14,\"value\": 67},{\"xPos\": 3,\"yPos\": 14,\"value\": 67},{\"xPos\": 4,\"yPos\": 14,\"value\": 67},{\"xPos\": 5,\"yPos\": 14,\"value\": 67},{\"xPos\": 6,\"yPos\": 14,\"value\": 67},{\"xPos\": 7,\"yPos\": 14,\"value\": 67},{\"xPos\": 8,\"yPos\": 14,\"value\": 67},{\"xPos\": 9,\"yPos\": 14,\"value\": 67},{\"xPos\": 10,\"yPos\": 14,\"value\": 67},{\"xPos\": 11,\"yPos\": 14,\"value\": 67},{\"xPos\": 12,\"yPos\": 14,\"value\": 67},{\"xPos\": 13,\"yPos\": 14,\"value\": 67},{\"xPos\": 14,\"yPos\": 14,\"value\": 67},{\"xPos\": 15,\"yPos\": 14,\"value\": 67},{\"xPos\": 16,\"yPos\": 14,\"value\": 67},{\"xPos\": 17,\"yPos\": 14,\"value\": 67},{\"xPos\": 18,\"yPos\": 14,\"value\": 67},{\"xPos\": 19,\"yPos\": 14,\"value\": 67},{\"xPos\": 0,\"yPos\": 15,\"value\": 67},{\"xPos\": 1,\"yPos\": 15,\"value\": 67},{\"xPos\": 2,\"yPos\": 15,\"value\": 67},{\"xPos\": 5,\"yPos\": 15,\"value\": 67},{\"xPos\": 6,\"yPos\": 15,\"value\": 67},{\"xPos\": 7,\"yPos\": 15,\"value\": 67},{\"xPos\": 8,\"yPos\": 15,\"value\": 67},{\"xPos\": 9,\"yPos\": 15,\"value\": 67},{\"xPos\": 10,\"yPos\": 15,\"value\": 67},{\"xPos\": 11,\"yPos\": 15,\"value\": 67},{\"xPos\": 12,\"yPos\": 15,\"value\": 67},{\"xPos\": 13,\"yPos\": 15,\"value\": 67},{\"xPos\": 14,\"yPos\": 15,\"value\": 67},{\"xPos\": 15,\"yPos\": 15,\"value\": 67},{\"xPos\": 16,\"yPos\": 15,\"value\": 67},{\"xPos\": 17,\"yPos\": 15,\"value\": 67},{\"xPos\": 18,\"yPos\": 15,\"value\": 67},{\"xPos\": 19,\"yPos\": 15,\"value\": 67},{\"xPos\": 0,\"yPos\": 16,\"value\": 67},{\"xPos\": 4,\"yPos\": 16,\"value\": 67},{\"xPos\": 5,\"yPos\": 16,\"value\": 67},{\"xPos\": 6,\"yPos\": 16,\"value\": 67},{\"xPos\": 7,\"yPos\": 16,\"value\": 67},{\"xPos\": 8,\"yPos\": 16,\"value\": 67},{\"xPos\": 9,\"yPos\": 16,\"value\": 67},{\"xPos\": 10,\"yPos\": 16,\"value\": 67},{\"xPos\": 11,\"yPos\": 16,\"value\": 67},{\"xPos\": 12,\"yPos\": 16,\"value\": 67},{\"xPos\": 13,\"yPos\": 16,\"value\": 67},{\"xPos\": 14,\"yPos\": 16,\"value\": 67},{\"xPos\": 15,\"yPos\": 16,\"value\": 67},{\"xPos\": 16,\"yPos\": 16,\"value\": 67},{\"xPos\": 17,\"yPos\": 16,\"value\": 67},{\"xPos\": 18,\"yPos\": 16,\"value\": 67},{\"xPos\": 19,\"yPos\": 16,\"value\": 67},{\"xPos\": 0,\"yPos\": 17,\"value\": 67},{\"xPos\": 1,\"yPos\": 17,\"value\": 14},{\"xPos\": 5,\"yPos\": 17,\"value\": 41},{\"xPos\": 9,\"yPos\": 17,\"value\": 40},{\"xPos\": 11,\"yPos\": 17,\"value\": 67},{\"xPos\": 12,\"yPos\": 17,\"value\": 67},{\"xPos\": 13,\"yPos\": 17,\"value\": 67},{\"xPos\": 14,\"yPos\": 17,\"value\": 67},{\"xPos\": 15,\"yPos\": 17,\"value\": 67},{\"xPos\": 19,\"yPos\": 17,\"value\": 67},{\"xPos\": 0,\"yPos\": 18,\"value\": 67},{\"xPos\": 3,\"yPos\": 18,\"value\": 67},{\"xPos\": 4,\"yPos\": 18,\"value\": 67},{\"xPos\": 5,\"yPos\": 18,\"value\": 71},{\"xPos\": 8,\"yPos\": 18,\"value\": 67},{\"xPos\": 9,\"yPos\": 18,\"value\": 49},{\"xPos\": 10,\"yPos\": 18,\"value\": 67},{\"xPos\": 11,\"yPos\": 18,\"value\": 3},{\"xPos\": 12,\"yPos\": 18,\"value\": 3},{\"xPos\": 13,\"yPos\": 18,\"value\": 3},{\"xPos\": 17,\"yPos\": 18,\"value\": 67},{\"xPos\": 19,\"yPos\": 18,\"value\": 67},{\"xPos\": 0,\"yPos\": 19,\"value\": 67},{\"xPos\": 1,\"yPos\": 19,\"value\": 67},{\"xPos\": 5,\"yPos\": 19,\"value\": 50},{\"xPos\": 8,\"yPos\": 19,\"value\": 67},{\"xPos\": 9,\"yPos\": 19,\"value\": 49},{\"xPos\": 10,\"yPos\": 19,\"value\": 67},{\"xPos\": 15,\"yPos\": 19,\"value\": 67},{\"xPos\": 16,\"yPos\": 19,\"value\": 67},{\"xPos\": 17,\"yPos\": 19,\"value\": 67},{\"xPos\": 18,\"yPos\": 19,\"value\": 67},{\"xPos\": 19,\"yPos\": 19,\"value\": 67},{\"xPos\": 0,\"yPos\": 20,\"value\": 66},{\"xPos\": 1,\"yPos\": 20,\"value\": 66},{\"xPos\": 2,\"yPos\": 20,\"value\": 66},{\"xPos\": 3,\"yPos\": 20,\"value\": 66},{\"xPos\": 4,\"yPos\": 20,\"value\": 66},{\"xPos\": 5,\"yPos\": 20,\"value\": 69},{\"xPos\": 6,\"yPos\": 20,\"value\": 67},{\"xPos\": 7,\"yPos\": 20,\"value\": 67},{\"xPos\": 8,\"yPos\": 20,\"value\": 67},{\"xPos\": 9,\"yPos\": 20,\"value\": 49},{\"xPos\": 10,\"yPos\": 20,\"value\": 67},{\"xPos\": 11,\"yPos\": 20,\"value\": 10},{\"xPos\": 12,\"yPos\": 20,\"value\": 11},{\"xPos\": 13,\"yPos\": 20,\"value\": 67},{\"xPos\": 14,\"yPos\": 20,\"value\": 67},{\"xPos\": 16,\"yPos\": 20,\"value\": 67},{\"xPos\": 17,\"yPos\": 20,\"value\": 15},{\"xPos\": 18,\"yPos\": 20,\"value\": 67},{\"xPos\": 19,\"yPos\": 20,\"value\": 67},{\"xPos\": 0,\"yPos\": 21,\"value\": 67},{\"xPos\": 1,\"yPos\": 21,\"value\": 67},{\"xPos\": 2,\"yPos\": 21,\"value\": 67},{\"xPos\": 3,\"yPos\": 21,\"value\": 12},{\"xPos\": 4,\"yPos\": 21,\"value\": 12},{\"xPos\": 5,\"yPos\": 21,\"value\": 12},{\"xPos\": 6,\"yPos\": 21,\"value\": 67},{\"xPos\": 7,\"yPos\": 21,\"value\": 67},{\"xPos\": 8,\"yPos\": 21,\"value\": 67},{\"xPos\": 9,\"yPos\": 21,\"value\": 49},{\"xPos\": 10,\"yPos\": 21,\"value\": 67},{\"xPos\": 16,\"yPos\": 21,\"value\": 67},{\"xPos\": 17,\"yPos\": 21,\"value\": 67},{\"xPos\": 18,\"yPos\": 21,\"value\": 67},{\"xPos\": 19,\"yPos\": 21,\"value\": 67},{\"xPos\": 0,\"yPos\": 22,\"value\": 67},{\"xPos\": 1,\"yPos\": 22,\"value\": 67},{\"xPos\": 2,\"yPos\": 22,\"value\": 67},{\"xPos\": 3,\"yPos\": 22,\"value\": 12},{\"xPos\": 4,\"yPos\": 22,\"value\": 12},{\"xPos\": 5,\"yPos\": 22,\"value\": 12},{\"xPos\": 6,\"yPos\": 22,\"value\": 67},{\"xPos\": 7,\"yPos\": 22,\"value\": 67},{\"xPos\": 8,\"yPos\": 22,\"value\": 67},{\"xPos\": 9,\"yPos\": 22,\"value\": 49},{\"xPos\": 11,\"yPos\": 22,\"value\": 10},{\"xPos\": 12,\"yPos\": 22,\"value\": 11},{\"xPos\": 15,\"yPos\": 22,\"value\": 67},{\"xPos\": 16,\"yPos\": 22,\"value\": 67},{\"xPos\": 17,\"yPos\": 22,\"value\": 15},{\"xPos\": 18,\"yPos\": 22,\"value\": 67},{\"xPos\": 0,\"yPos\": 23,\"value\": 67},{\"xPos\": 1,\"yPos\": 23,\"value\": 67},{\"xPos\": 2,\"yPos\": 23,\"value\": 67},{\"xPos\": 3,\"yPos\": 23,\"value\": 12},{\"xPos\": 4,\"yPos\": 23,\"value\": 12},{\"xPos\": 5,\"yPos\": 23,\"value\": 12},{\"xPos\": 6,\"yPos\": 23,\"value\": 67},{\"xPos\": 7,\"yPos\": 23,\"value\": 67},{\"xPos\": 8,\"yPos\": 23,\"value\": 67},{\"xPos\": 9,\"yPos\": 23,\"value\": 49},{\"xPos\": 14,\"yPos\": 23,\"value\": 67},{\"xPos\": 15,\"yPos\": 23,\"value\": 6},{\"xPos\": 16,\"yPos\": 23,\"value\": 67},{\"xPos\": 17,\"yPos\": 23,\"value\": 67},{\"xPos\": 0,\"yPos\": 24,\"value\": 56},{\"xPos\": 1,\"yPos\": 24,\"value\": 57},{\"xPos\": 2,\"yPos\": 24,\"value\": 57},{\"xPos\": 3,\"yPos\": 24,\"value\": 57},{\"xPos\": 4,\"yPos\": 24,\"value\": 57},{\"xPos\": 5,\"yPos\": 24,\"value\": 57},{\"xPos\": 6,\"yPos\": 24,\"value\": 57},{\"xPos\": 7,\"yPos\": 24,\"value\": 57},{\"xPos\": 8,\"yPos\": 24,\"value\": 57},{\"xPos\": 9,\"yPos\": 24,\"value\": 58},{\"xPos\": 19,\"yPos\": 24,\"value\": 67}],\"Players\":[{\"xPos\":1,\"yPos\":2},{\"xPos\":1,\"yPos\":1},{\"xPos\":0,\"yPos\":23},{\"xPos\":0,\"yPos\":21}]}";
    /*When false, does not start network client in gameboard. Debug only*/
    boolean startNetwork = true;
}
