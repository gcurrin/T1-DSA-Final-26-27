public class RainwaterFinal {
    public static int rainFall(int[] map){
        int water = 0;
        int maxHeight = 1;
        for(int h = 1; h <= maxHeight; h++){
            int lWall = -1;
            for(int ind = 0; ind < map.length; ind++){
                if(map[ind] > maxHeight){
                    maxHeight = map[ind];
                }
                if(map[ind] >= h){
                    if(lWall >= 0) {
                        water += ind - lWall - 1;
                    }
                    lWall = ind;
                }
            }
        }
        return water;
    }
}