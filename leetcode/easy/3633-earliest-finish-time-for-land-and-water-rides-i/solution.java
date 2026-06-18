class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;

        for(int i=0;i<landStartTime.length;i++){
            int t=landStartTime[i];
            t=t+landDuration[i];

            for(int j=0;j<waterStartTime.length;j++){
                int m=Integer.MAX_VALUE;

                if(t>waterStartTime[j]){
                m=t+waterDuration[j];
                }else{
                m=waterStartTime[j]+waterDuration[j];
                }
                min=Math.min(min,m);
            }

        }

         for(int i=0;i<waterStartTime.length;i++){
            int t=waterStartTime[i];
            t=t+waterDuration[i];

            for(int j=0;j<landStartTime.length;j++){
                int m=Integer.MAX_VALUE;
                if(t>landStartTime[j]){
                m=t+landDuration[j];
                }else{
                m=landStartTime[j]+landDuration[j];
                }
                min=Math.min(min,m);
                

            }

        }
        return min;
    }
}