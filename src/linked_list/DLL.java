/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author HAU NUONG MO HANH
 */
public class DLL <T> {
    protected DLLNode<T> head, tail;

    public DLL() {
        head = tail = null;
    }
    //getter setter

    public DLLNode<T> getHead() {
        return head;
    }

    public void setHead(DLLNode<T> head) {
        this.head = head;
    }

    public DLLNode<T> getTail() {
        return tail;
    }

    public void setTail(DLLNode<T> tail) {
        this.tail = tail;
    }

    // Check empty list
    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(T el) {
        if (!DLL.this.isEmpty()) {
            tail = head;
            head = new DLLNode<T>(el);
        } else {
            head.previous = new DLLNode<T>(el);
            head.previous.next = head;
            head = head.previous;
        }
    }

    // add element to tail
    public void addToTail(T el) {
        DLLNode<T> newNode = new DLLNode<T>(el);

        //if list is empty, head and tail points to newNode  
        if (this.isEmpty()) {
            head = tail = newNode;
            //head's previous will be null  
            head.previous = null;
            //tail's next will be null  
            tail.next = null;
        } else {
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;
            //newNode->previous set to tail  
            newNode.previous = tail;
            //newNode becomes new tail  
            tail = newNode;
        }
    }

    // delete the head
    public T deleteFromHead() {
        T el = null;
        if (this.isEmpty()) {
            return el;
        } else {
            head = head.next;
            head.previous = null;
        }
        return null;
    }

    // delete the tail
    public T deleteFromTail() {
        T el = null;
        if (this.isEmpty()) {
            return el;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        return null;
    }

    public void delete(T el) {
        if (head == tail && head.info.equals(el)) {
            head = tail = null;
        } else if (el.equals(head.info)) {
            this.deleteFromHead();
        } else if (el.equals(tail.info)) {
            this.deleteFromTail();
        } else {
            DLLNode<T> pred;
            DLLNode<T> tmp;
            pred = head;
            tmp = head.next;       
            while (tmp != tail) {              
                if (tmp.info.equals(el)) {
                    pred.next = tmp.next;
                    tmp = tmp.next;
                    tmp.previous = pred;
                }
                if (tmp != tail){
                    pred = pred.next;
                    tmp = tmp.next;
                }
            }
        }
    }

    // Print the list
    public void printAll() {
        for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next) {
            System.out.println(tmp.info);
        }
    }

    //Checking whether the element is in the list
    public boolean isInList(T el) {
        DLLNode<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        return tmp != null;
    }
}
