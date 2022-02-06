class MaxOnes {
    static int R=4,C=4;
    //to find 1st index
    static int first(int arr[], int low,int high){
      if(high>=low){
          int mid= low+(high-low)/2;
          if((mid==0||(arr[mid-1]==0))&&arr[mid]==1)
          return mid;
          else if(arr[mid]==0)
          return first(arr, mid+1, high);
          else
          return first(arr, low, mid-1);

      }  
      return -1;
    }
    static int InMaxOnes(int mat[][]){
        int max_row=0, index,max=-1;
        for(int i=0;i<R;i++){
            index=first(mat[i],0,C-1);
            if(index!=-1&&C-index>max){
                max=C-index;
                max_row=i;
            }
        }
        return max_row;
    }
    public static void main(String args[]) {
        int mat[][]={{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
        System.out.println("Row has max number of 1's  "+ InMaxOnes(mat));
        
    }
    
}
