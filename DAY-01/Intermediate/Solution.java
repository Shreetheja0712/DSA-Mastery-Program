class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        for(int pass=0;pass<arr.length;pass++){
            for(int j=0;j<arr.length-pass-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
                }
            }
        }
    }
}