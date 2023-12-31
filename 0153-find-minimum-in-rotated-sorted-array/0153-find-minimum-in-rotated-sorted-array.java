class Solution {
    public int findMin(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;

        // Check if array is sorted or not
        if(arr[start] <= arr[end] ) {
            return arr[start];
        }

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] > arr[mid+1]) {
                return arr[mid+1];
            } 

            else if(arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }

            // Discrading the sorted part
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } 
            
            else {
                end = mid - 1;
            }


        }

        return -1;
    }
}