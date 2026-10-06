class Solution {
    public int minAddToMakeValid(String s) {
        
        int low=0;
        int incomplete=0;

        for(int i=0;i<s.length();i++){

                if(s.charAt(i)=='('){
                    low++;
                }else{
                    if(low>0){
                    low--;
                    }else{
                    incomplete++;
                    }
            
                }
        }

        return low+incomplete ;
    }
}