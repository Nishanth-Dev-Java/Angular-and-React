class Selection {
     void sort(int a[]){
         int n=a.length;
         for (int i=0;i<n-1;i++){
         int min_idx = i;

         for(int j=i+1;j<n ;j++)
         if(a[j]< a [min_idx])
         min_idx=j;

         int temp=a[min_idx];
         a[min_idx]=a[i];
         a[i]=temp;
         }
        }

         void printArray(int a[]){
            int n=a.length;
            for(int i=0;i<n;++i)
            System.out.print(a[i]+"");
            System.out.println();
        }


        public static void main (String[]args) {
            Selection  ob=new Selection();
            int a[]={44,24,64,20,32,77};
            ob.sort(a);
            System.out.println("Sorted array");
            ob.printArray(a);
            
        }
       
   }

