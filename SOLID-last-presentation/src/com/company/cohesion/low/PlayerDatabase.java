package com.company.cohesion.low;
/*When a class is designed to do many different tasks rather than focus on a single specialized task,
        this class is said to be a "low cohesive" class. Low cohesive classes are said to be badly designed, as it requires a lot of work at
        creating, maintaining and updating them.*/

//Java - Example of a low cohesion class

class PlayerDatabase
{
    public void connectDatabase(){
        //connecting to database.
    }
    public void printAllPlayersInfo(){
        //printing all the players' information.
    }
    public void printSinglePlayerInfo() {
        //printing a single player information.
    }
    public void printRankings() {
        //printing the players current rankings.
    }
    public void printEvents() {
        //printing the events of game
    }
    public void closeDatabase() {
        //closing the database connection.
    }
}