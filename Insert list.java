{
    Node head;
    class Node{
        int data;
        Node next;
        Node (int d){
            data=d;next=null;
        } 
    }
    public void push(int new_data){
    Node new_node= new Node(new_data);
    new_node.next=head;
    head=new_node;
}
//to append  at last
public void append(int new_data){
    Node new_node= new Node(new_data);
    if (head==null){
        head=new Node(new_data);
        return;
    }
    new_node.next=null;
    Node last=head;
    while(last.next!=null)
    last=last.next;
    last.next=new_node;
    return;
}
//print the list
public void printList(){
    Node lnode=head;
    while(lnode!=null){
        System.out.print(lnode.data+"");
        lnode=lnode.next;
    }
}

 public static void main(String []args) {
     InsertList ilist=new InsertList();
     ilist.append(9);
    ilist.push(6);
    ilist.push(1);
    ilist.append(11);
    System.out.println("Linked list");
    ilist.printList();

}    
}
