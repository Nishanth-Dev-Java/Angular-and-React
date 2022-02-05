 class MiddleLinked {  // middle element by fast pointer and slow pointer method 
     Node head;
     class Node{
         int data;
         Node next;
         Node(int d){
             data=d;
             next=null;
         }
     }
     void printMid(){
         Node sl_ptr=head;
         Node fs_ptr=head;
         while (fs_ptr!=null && fs_ptr.next!=null){
             fs_ptr=fs_ptr.next.next;
             sl_ptr=sl_ptr.next;
         }
         System.out.println("The middle element is"+ sl_ptr.data +"/n");
     }
     public void push(int new_data){
         Node new_node=new Node(new_data);
         new_node.next=head;
         head=new_node;
     }
     public void printList(){
         Node snode=head;
         while(snode!=null){
             System.out.print(snode.data+">");
             snode=snode.next;
         }
         System.out.println("NULL");
     }
     public static void main(String[]args) {
         MiddleLinked slist= new MiddleLinked();
         for(int i=7;i>0;--i){
             slist.push(i);
             slist.printList();
             slist.printMid();
         }
         
     }
    
}
