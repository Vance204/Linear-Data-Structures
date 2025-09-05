import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        CircularLinkedList myList = new CircularLinkedList();

        int choice;

        while(true) {
            System.out.println("Choose Data Structure:\n1.Stack\n2.Queue\n3.Linked List"
                    + "\n4.Circular Linked List\n5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    // Stack menu loop
                    while (true) {
                        System.out.println("--- Stack Operations ---");
                        System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit Stack Operations");
                        System.out.print("Enter choice: ");
                        int operation = scanner.nextInt();

                        if (operation == 1) {
                            System.out.print("Enter value to push: ");
                            int value = scanner.nextInt();
                            stack.push(value);
                            System.out.println("Pushed " + value + " into stack.\n");

                        } else if (operation == 2) {
                            if (stack.isEmpty()) {
                                System.out.println("Stack is empty, nothing to pop.\n");
                            } else {
                                int popped = stack.pop();
                                System.out.println("Popped: " + popped + "\n");
                            }
                        } else if (operation == 3) {
                            if (stack.isEmpty()) {
                                System.out.println("Stack is empty.\n");
                            } else {
                                System.out.print("Stack contents: ");
                                for (int i = stack.size() - 1; i >= 0; i--) {
                                    System.out.print(stack.get(i) + " ");
                                }
                                System.out.println("\n");
                            }
                        } else if (operation == 4) {
                            System.out.println();
                            break;
                        } else {
                            System.out.println("Invalid choice.\n");
                        }
                    }
                    break;
                case 2:
                    while(true){
                    System.out.println("--- Queue Operations ---");
                    System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit Queue Operations");
                    System.out.print("Enter choice: ");
                    int queueChoice = scanner.nextInt();

                    if(queueChoice == 1){
                        System.out.println("Enter value to enqueue: ");
                        int value = scanner.nextInt();
                     if(queue.offer(value)){
                         System.out.println("Enqueued " + value + " into queue");
                     } else {
                         System.out.println("Failed to enqueue value.");
                     }
                    } else if(queueChoice == 2){
                        Integer remove = queue.poll();
                        if(remove == null){
                            System.out.println("Queue is empty. There is nothing to dequeue.");
                        } else{
                            System.out.println("Dequeued: " + remove);
                        }
                    } else if (queueChoice == 3){
                        if(queue.isEmpty()){
                            System.out.println("Queue is empty. ");
                        } else {
                            System.out.println("Queue conents: " + queue);
                        }
                    } else if(queueChoice == 4){
                        System.out.println();
                        break;
                    }
                   } break;
                case 3:
                    while(true) {
                        System.out.println("--- Linked List Operations ---");
                        System.out.println("1. Insert at end\n2. Delete at beginning\n3. Display\n4. Exit Linked List Operations");
                        System.out.print("Enter choice: ");
                        int linkChoice = scanner.nextInt();

                        if(linkChoice == 1){
                            System.out.println("Enter value to insert: ");
                         int value = scanner.nextInt();
                         linkedList.add(value);
                            System.out.println("Inserted " + value + " at the end of the linked list.");
                        } else if(linkChoice == 2){
                            if (linkedList.isEmpty()){
                                System.out.println("Linked List is empty.");
                            } else{
                                int removed = linkedList.removeFirst();
                                System.out.println("Deleted first element: " + removed);
                            }
                        } else if (linkChoice == 3){
                            if(linkedList.isEmpty()){
                                System.out.println("Linked List is currently empty.");
                            } else{
                                System.out.println("Linked List: " + linkedList );
                            }
                        } else if(linkChoice == 4){
                            break;
                        }else{
                            System.out.println("Invalid input.");
                        }
                    } break;
                case 4:
                    while(true) {
                        System.out.println("--- Circular List Operations ---");
                        System.out.println("1. Insert\n2. Delete\n3. Display\n4. Exit Circular List Operations");
                        System.out.print("Enter choice: ");
                        System.out.println();
                        int circChoice = scanner.nextInt();

                    if(circChoice == 1){
                        System.out.println("Enter the value to insert: ");
                        int value = scanner.nextInt();
                        myList.insert(value);
                        System.out.println("Inserted " + value + " into circular linked list. \n");

                    } else if(circChoice == 2){
                        myList.delete();
                    } else if(circChoice == 3){
                        myList.display();
                    }else if(circChoice == 4){
                            break;
                    }else {
                        System.out.println("Invalid input.");
                    }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
