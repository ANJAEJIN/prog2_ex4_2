package jp.ac.uryukyu.ie.ex4_2.pair02;

import java.io.*;

public class Main {
    public static void main(String[] args){
        File inFile = new File("/Users/jaejinan/IdeaProjects/prog2_ex4_2nd/doc", "map.txt");
        Maze maze = new Maze();
        Walk player = new Walk();
        maze.printMaze(inFile);

        int count = 0;
        String direction = "up";
        while(!player.judge()) {
            direction = player.SetDirection(direction);
            player.move(direction);
            player.printPlayer();
            System.out.println();
            count++;
        }
        System.out.println("finish. you escape the maze in "+count+" times.");
    }
}