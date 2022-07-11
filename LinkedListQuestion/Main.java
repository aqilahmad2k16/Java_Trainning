package LinkedListQuestion;

import java.util.Scanner;

public class Main {
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            if(size == 0){
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = tail = temp;
                size++;
            }else{
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
                size++;
            }
        }
    }


    public static class Node{
        int data;
        Node next;
    }

    public static void displayLinkedList(LinkedList list){
        Node temp = list.head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();

        System.out.println(list.size);

        if(list.size > 0){
            System.out.println(list.tail.data);
        }
    }

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the linkedlist");
        String str = scan.nextLine();
        LinkedList list = new LinkedList();
        while(str.equals("quit") == false){
            if(str.startsWith("addLast")){
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }

            str = scan.nextLine();
        }
        displayLinkedList(list);
    }

}

