package jp.ac.uryukyu.ie.ex4_2.pair02;

public class Walk extends Player{
    public String SetDirection(String direction){
        switch (direction) {
            case "up":
                if (factor[informnum[0][1]][informnum[0][0]-1] != '#') {
                    direction = "left";
                }else {
                    if (factor[informnum[0][1]-1][informnum[0][0]] == '#') {
                        direction ="right";
                    }
                }
                break;
            case "down":
                if (factor[informnum[0][1]][informnum[0][0]+1] != '#') {
                    direction = "right";
                }else {
                    if (factor[informnum[0][1]+1][informnum[0][0]] == '#') {
                        direction = "left";
                    }
                }
                break;
            case "right":
                if (factor[informnum[0][1]-1][informnum[0][0]] != '#') {
                    direction = "up";
                }else{
                    if (factor[informnum[0][1]][informnum[0][0]+1] == '#') {
                        direction = "down";
                    }
                }
                break;
            case "left":
                if (factor[informnum[0][1]+1][informnum[0][0]] != '#') {
                    direction = "down";
                }else {
                    if (factor[informnum[0][1]][informnum[0][0]-1] == '#') {
                        direction = "up";
                    }
                }
                break;
        }
        return direction;
    }
}