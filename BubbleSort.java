class Bubble {
     void bubbleSort(int a[]){
         int n=a.length;
         for (int i=0;i<n;i++)
         for(int j=0;j<n-i-1;j++)
         if(a[j]>a[j+1]){
             int temp=a[j];
             a[j]=a[j+1];
             a[j+1]=temp;

         } 
     }
     void printArray(int a[]){
         int n=a.length;
         for(int i=0;i<n;++i)
         System.out.print(a[i]+"");
         System.out.println("Test 1");
     }
     public static void main (String[]args) {
         Bubble ob=new Bubble();
         int a[]={65,37,24,15,22,19,99};
         ob.bubbleSort(a);
         System.out.println("Sorted array");
         ob.printArray(a);
         
     }
    
}
