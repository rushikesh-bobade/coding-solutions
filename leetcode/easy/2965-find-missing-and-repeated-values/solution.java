class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer>set=new HashSet<>();
        int missing=0; int repeated=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])){
                    repeated=grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }
            }
        }

        int k=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!set.contains(k)){
                    missing=k;
                    break;
                }
                k++;
            }

        }
        return new int[]{repeated,missing};
    }
}