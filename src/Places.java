import java.util.ArrayList;

public class Places {
    private String name;
    private char[][] map;
    private int playerStartingX;
    private int playerStartingY;
    private char currentTile = '_';
    private int mapID;

    public Places(String name, char[][] map, int x, int y, int id) {
        this.name = name;
        this.map = map;
        this.playerStartingX = x;
        this.playerStartingY = y;
        this.mapID = id;
    }

    public char[][] playerMove(char direction) {
        int x = Player.getxCord();
        int y = Player.getyCord();
        int xOld = x;
        int yOld = y;
        switch (direction) {
            case 'n':
                y -= 1;
                break;
            case 's':
                y += 1;
                break;
            case 'w':
                x -= 1;
                break;
            case 'e':
                x += 1;
                break;
            default:
                break;
        }
        map[yOld][xOld] = currentTile;
        currentTile = map[y][x];
        map[y][x] = '@';
        Player.setxCord(x);
        Player.setyCord(y);
        return map;
    }

    public char getCurrentTile() {
        return currentTile;
    }

    public void setCurrentTile(char tile) { currentTile = tile; }

    public int getMapID() {
        return mapID;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (j == (map[0].length - 1)) {
                    temp += map[i][j] + "\n";
                } else {
                    temp += map[i][j];
                }
            }
        }
        return temp + "\n";
    }

    public char[][] getMap() {
        return map;
    }

    public int getPlayerStartingX() {
        return playerStartingX;
    }

    public int getPlayerStartingY() {
        return playerStartingY;
    }

    public void setPlayerStartingX(int playerStartingX) {
        this.playerStartingX = playerStartingX;
    }

    public void setPlayerStartingY(int playerStartingY) {
        this.playerStartingY = playerStartingY;
    }
}
