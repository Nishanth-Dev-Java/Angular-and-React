
class Sort{
 
     void  sort(int a[] ) {
        int i,j,v;
 
        for(i=1;i<a.length;i++){
 
            v=a[i];
 
            j=i-1;
 
            while(a[j-1]>v&&j>0){
 
                a[j]=a[j-1];
 
                j=j-1;
 
            }
 
            a[j+1]=v;
        }    
 
    }
 
 
    static void printArray(int a[]){
 
        for(int i=0;i<a.length;++i)
 
        System.out.print(a[i] +"");
 
        System.out.println();
 
    }
 
 
    public static void main(String args[]) {
 
        int a[]={8,2,1,4};
 
        Sort ob= new Sort();
 
        ob.sort(a);
 
        printArray(a),
 
    }
 
}
