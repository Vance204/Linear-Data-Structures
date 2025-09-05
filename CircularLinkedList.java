public class CircularLinkedList {
    Node head = null;
    Node tail = null;


        public void insert(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else{
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
        public void delete(){
             if (head == null){
                 System.out.println("Circular list is empty, nothing to delete.");
                 return;
             }
             if(head == tail){
                 head = null;
                 tail = null;
             } else{
                 head = head.next;
                 tail.next = head;
             }
                System.out.println("Deleted node...");
                System.out.println();
            }
            public void display() {
                if (head == null) {
                    System.out.println("Circular list is empty.");
                    System.out.println();
                    return;
                }

                Node current = head;
                do {
                    System.out.print(current.data + " ");
                    current = current.next;
                } while (current != head);   // stop when back at start

                System.out.println();
            }
    }

