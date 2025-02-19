public class LinkedList {
        public static void main(String[] args) {
            int arr[] = {2, 3, 4, 6, 7, 8};

            Node head = createLinkedList(arr);
            System.out.print("Original Linked List: ");
            printLinkedList(head);

            head = removeHead(head);
            System.out.print("After Removing Head: ");
            printLinkedList(head);

            head = removeTail(head);
            System.out.print("After Removing Tail: ");
            printLinkedList(head);
        }

        public static Node createLinkedList(int arr[]) {
            if (arr.length == 0) return null;
            Node head = new Node(arr[0]);
            Node mover = head;
            for (int i = 1; i < arr.length; i++) {
                Node newNode = new Node(arr[i]);
                mover.next = newNode;
                mover = newNode;
            }
            return head;
        }

        public static Node removeHead(Node head) {
            if (head == null) return null;
            return head.next;
        }

        public static Node removeTail(Node head) {
            if (head == null || head.next == null) return null;
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }

        public static void printLinkedList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
