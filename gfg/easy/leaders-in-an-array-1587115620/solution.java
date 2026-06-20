class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int maxSoFar = arr[n - 1];
        
        result.add(maxSoFar);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                maxSoFar = arr[i];
                result.add(arr[i]);
            }
        }
        
        Collections.reverse(result);
        return result;
    }
}