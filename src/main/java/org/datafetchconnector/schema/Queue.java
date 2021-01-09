package org.datafetchconnector.schema;


import java.util.*;

public class Queue {
    private class Node {
        private Object value;
        private Node next;

        public Node(Object item) {
            this.value = item;
            this.next=null;
        }
    }

    private Node head = null; // first
    private Node tail = null; // last
    private int count = 0;
    private static volatile Queue queueInstance;

    private Queue() {
    }

    public static Queue getInstance() {
        if (queueInstance == null) {
            queueInstance = new Queue();
        }
        return queueInstance;
    }


    public boolean isEmpty(){
        return head == null;
    }


    public void enqueue(Object item){
        Node n = new Node(item);
        if(tail == null){
            head = n;
            tail = n;
            count++;
        }
        else{
            tail.next = n;
            tail = n;
            count++;
        }
    }

    public Object dequeue(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail){
            head = tail = null;
            count --;
            return head.value;
        }

        Node second = head.next;
        Object val = head.value;
        head.next = null;
        head = second;
        count --;
        return val;

    }

    public Integer getSize() {
        return count;
    }

    public List<Object> print() {
        List<Object> queueLists = new ArrayList<>();
//        Integer list [] = new Integer[count];
        Node current = head;
        for (int i = 0; i < count; i++) {

            queueLists.add(current.value);
            current = current.next;

        }
        return queueLists;
    }


}

//public class Queue<Object> {
//    //declaring array list to store and manipulate data
//    //using predefined methods
//    private class Node {
//        private Object value;
//        private Node next;
//
//        public Node(Object item) {
//            this.value = item;
//            this.next=null;
//        }
//    }
//
//    private LinkedList<Object> list= new LinkedList<Object>();
//    int count=0;
//    int head=0;
//    int tail=0;
//
//        private static volatile Queue queueInstance;
//
//    private Queue() {
//    }
//
//    public static Queue getInstance() {
//        if (queueInstance == null) {
//            queueInstance = new Queue();
//        }
//        return queueInstance;
//    }
//
//    public int getSize() {
//        return getInstance().list.size();
//    }
//    //Adds given element to tail of queue
//    public void enqueue (Object element) {
//        if(head==tail) {
//            list.add(head, element);
//          count++;
//            ++tail;
//        }
//
//            list.add(tail, element);
//        count++;
//        ++tail;
//
//    }
//
//    //removes element at queue head
// public Object dequeue() {
//        if(list.isEmpty()) {
//        System.out.println("Queue is empty");
//        return null;
//        }
//
//        Object result = list.remove(0);
//        return result;
//  }
//
//    //returns reference to element at queue head
//    public Object first() {
//        return list.get(head);
//    }
//
//    //returns true if queue is empty
//    public boolean isEmpty() {
//      return list.isEmpty();
//    }
//
//    //returns number of elements in the queue
//
//
//    //returns string representation of queue
//    public String toString() {
//        String result = "";
//        for(int i=0;i<tail;i++)
//            result+=list.get(i)+" ";
//        return result;
//    }
////public List<Object> print() {
////    List<Object> queueLists= new ArrayList<>();
//////        Integer list [] = new Integer[count];
////    Node current = head;
////    for (int i = 0; i < count; i++) {
////
////        queueLists.add(current.value);
////        current = current.next;
////
////    }
////    return queueLists;
////}
//    public List<Object> print() {
//        List<Object> queueLists= new ArrayList<>();
//
//        for(int i=0;i<tail;i++) {
//            queueLists.add(list.get(i));
//        }
//        return queueLists;
//    }
//}
