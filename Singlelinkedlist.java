import java.util.*;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.next = null;
        this.data = data;
    }
}

class Sll {
    Node head;

    Sll() {
        head = null;
    }

    void sll(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    void printsll() {
        Node p = head;
        if (p == null) {
            System.out.println("linked list is empty");
        } else {
            while (p != null) {
                System.out.println(p.data);
                p = p.next;

            }
        }
    }

}

class Singlelinkedlist {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Sll s = new Sll();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int p = sc.nextInt();
            s.sll(p);
        }
        s.printsll();
        sc.close();
    }
}