

public class Mylist {
    public static void main(String[] args) {
        Node n1=new Node(1) ;
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

         n2.printLinksList(n1);

         n1 = n1.addFrist(n1,0);
         n1=n1.addLast(n1,5);
         n1.printLinksList(n1);
        System.out.println("---------------------");
        n1=n1.addToIndex(n1,6,3);
        n1.printLinksList(n1);
        n1.getIndex(n1,3);
    }

}
