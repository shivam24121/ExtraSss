class Compute {
    boolean find4Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        for(int a=0;a<n-3;a++){
            for(int b=a+1;b<n-2;b++){
                int temp=X-(A[a]+A[b]);
                int i=b+1,j=n-1;
                while(i<j){
                    int sum=A[i]+A[j];
                    if(sum==temp)return true;
                    else if(sum<temp){
                        i++;
                    }
                    else{
                        j--;
                    }
                }
                
            }
        }
        return false;
    }
}
