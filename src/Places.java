import java.util.ArrayList;

public class Places {
    private String name;
    private static char[][] map;
    private static int playerStartingX;
    private static int playerStartingY;
    private static char currentTile = '_';


    public Places(String name, char[][] map, int x, int y) {
        this.name = name;
        this.map = map;
        this.playerStartingX = x;
        this.playerStartingY = y;
    }

    public static char[][] playerMove(char direction) {
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
}
