import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {

    public static  Node insert(Node head,int data) {
        Node newnode = new Node(data);
        if (head!=null)
        {   Node cur;
            cur = head;
            while (cur.next!= null)
                cur = cur.next;
            cur.next = newnode;
        }
        else
        {
            head = newnode;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}