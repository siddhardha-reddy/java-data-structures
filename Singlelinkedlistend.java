
/**insert at end **/
import java.util.*;

public class Singlelinkedlistend {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Sll s = new Sll();
        System.out.println("Enter number of nodes for singlelinkedlist");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int data = sc.nextInt();
            s.newlist(data);
        }
        s.printsll();
        sc.close();
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sll {
    Node head, end;

    Sll() {
        this.head = null;
    }

    void newlist(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            end = newnode;
        } else {
            end.next = newnode;
            end = newnode;
        }
    }

    void printsll() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
        } else {
            Node temp = head;
            do {
                System.out.println(temp.data);
                temp = temp.next;
            } while (temp != null);
        }
    }
}