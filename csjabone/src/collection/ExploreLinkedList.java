package collection;

import java.util.*;

public class ExploreLinkedList {

    public static void fetchLinkedList(LinkedList<Integer> e) {

        System.out.println("Select the operation for linked list\n1. Middle element of Linked List\n2. Sort Linked List\n3. Add an element in Linked List\n4. Delete an index element in Linked List\n5. Reverse Linked List\n");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        switch(input) {
            case 1 : int elem = e.get(e.size()/2);
                     System.out.println("Middle element is "+elem);
                     break;
            case 2 : Collections.sort(e);
                     break;
            case 3 : int el = in.nextInt();
                     e.add(el);
                     break;
            case 4 : int ele = in.nextInt();
                     e.remove(ele);
                     break;
            default : System.out.println("Enter the valid entry\n");
        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> inLin = new LinkedList<>();
        inLin.add(1);
        inLin.add(2);
        inLin.add(3);
        inLin.add(-4);
        inLin.add(-5);

        System.out.println(inLin);
        fetchLinkedList(inLin);
        System.out.println(inLin);



    }



}
