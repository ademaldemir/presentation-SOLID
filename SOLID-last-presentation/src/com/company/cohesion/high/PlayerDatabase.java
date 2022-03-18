package com.company.cohesion.high;

class PlayerDatabase
{
    ConnectDatabase connectD= new ConnectDatabase();
    PrintAllPlayersInfo allPlayer= new PrintAllPlayersInfo();
    PrintRankings rankings = new PrintRankings();
    CloseDatabase closeD= new CloseDatabase();
    PrintSinglePlayerInfo singlePlayer = new PrintSinglePlayerInfo();
}
