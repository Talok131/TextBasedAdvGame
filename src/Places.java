public class Places {
    private String name;
    private char[][] map;
    private int playerStartingX;
    private int playerStartingY;
    public Places(String name, char[][] map, int x, int y){
        this.name = name;
        this.map = map;
        this.playerStartingX = x;
        this.playerStartingY = y;
    }
    public char[][] playerMove(char direction){
        int x = Player.getxCord();
        int y = Player.getyCord();
        int xOld = x;
        int yOld = y;
        switch (direction){
            case 'n' :
                y -= 1;
                break;
            case 's' :
                y += 1;
                break;
            case 'w' :
                x -= 1;
                break;
            case 'e' :
                x += 1;
                break;
            default :
                break;
        }
        map[yOld][xOld] = LowerDeck.lowerDeck[yOld][xOld];
        map[y][x] = '@';
        Player.setxCord(x);
        Player.setyCord(y);
        return map;

    }
    public String toString(){
        String temp = "";
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++){
                if (j == 9){
                    temp += map[i][j] + "\n";
                } else {
                    temp += map[i][j];
                }
            }
        }
        return temp + "\n";
    }
}
