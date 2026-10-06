class Solution {
    public int scoreOfParentheses(String s) {
        // int low=0;
        // int high=0;

        // for(int i=0;i<s.length();i++){
        //     // if(s.charAt(i)=='('){
        //     //     low++;
        //     //     high++;
        //     // }else{
        //     //     high++;
        //     // }
        //     //  if(s.charAt(i)=='('){
        //     //     low++;
        //     // }else if(s.charAt(i)==')'){
        //     //     high++;

        //     //     if(low==high){
        //     //         high=2*low;
        //     //      }else{
        //     //     high=;
        //     //      }


        //     if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='(' ){
                
        //         if(high>1){
        //         ans=low*2;
        //         }else{
        //         ans++;
        //         low++;
        //         }

        //     }else{
        //         high++;
        //     }

        //     st.push(s.charAt(i));
        //     }
        // }
        // return high;


        int score = 0;
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                depth++;
            } else {
                depth--;

                // "()" -> 2^depth
                if (s.charAt(i - 1) == '(') {
                    score += 1 << depth;
                }
            }
        }

        return score;
    }
}