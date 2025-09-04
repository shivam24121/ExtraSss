class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        int n=arr.length;
        Arrays.sort(arr);
        for(int x=0;x<n-2;x++){
            int temp=target-arr[x];
            int i=x+1,j=n-1;
            while(i<j){
                int sum=arr[i]+arr[j];
                if(sum==temp)return true;
                else if(sum>temp){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return false;
        
    }
}
