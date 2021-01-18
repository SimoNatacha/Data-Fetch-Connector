package org.datafetchconnector.schema;

public class Node {
    public Object value;
    public Node next;

    public Node(Object item) {
        this.value = item;
        this.next=null;
    }

    public Node insert(Object value) {
        return new Node(value);
    }

    // returning the next member
    public Node getNext() {
        return next;
    }

    // helps with peek
    public Object getData() {
        return this.value;
    }

    public String toString(){
        return this.value.toString();
    }
}
