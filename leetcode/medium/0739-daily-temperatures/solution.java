class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int ans[]=new int[temperatures.length];
        
        for(int i=0;i<temperatures.length;i++){
            int count=1;
            int j=i+1;
            while(j!=temperatures.length && temperatures[i]>=temperatures[j]){
                j++;
                count++;
            }
            if(j!=temperatures.length){
                ans[i]=count;
            }
        }

        return ans;
    }
}