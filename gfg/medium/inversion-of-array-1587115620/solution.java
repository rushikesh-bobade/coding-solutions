        return count;
    }
    
    static long merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        
        int i = l;
        int j = mid + 1;
        int k = 0;
        long count = 0;
        
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                // arr[i] > arr[j]
                count += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= r) {
            temp[k++] = arr[j++];
        }
        
        for (int x = l; x <= r; x++) {
            arr[x] = temp[x - l];
        }
        
        return count;
    }
}