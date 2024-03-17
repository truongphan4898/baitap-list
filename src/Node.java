public  class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }


    public void printLinksList(Node head) {
        if (head == null) {
            System.out.print("list is empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("=>");

                } else {
                    System.out.println();
                }
            }
        }

    }

    public Node addFrist(Node head, int value) {
        Node node = new Node(value);
        if (head != null) {
            node.next = head;
        }
        return node;

    }

    public Node addLast(Node head, int value) {
        Node node = new Node(value);
        if (head == null) {
            return node;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
       return head;
    }
    public Node addToIndex(Node head, int value, int index){
        if(index==0){
            return addFrist(head,value);
        }
        else {
            Node node=new Node(value);
            Node curNode=head;
            int count=0;
            while (curNode !=null){
                count++;
                if(count==index){
                    node.next=curNode.next;
                    curNode.next=node;
                    break;
                }
                    curNode=curNode.next;
            }
        }
        return head;
    }
    public Node getIndex(Node head,int index){
        if (head==null){
            System.out.println("list is empty");

        }
       Node temp=head;
        int count =0;
            while (temp!=null){
                if(count==index){
                    System.out.println(temp.value);;
                }
                count++;
                temp=temp.next;
            }
            return head;

    }
}

