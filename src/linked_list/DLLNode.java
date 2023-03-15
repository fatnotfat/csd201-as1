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
public class DLLNode <T> {
    T info;
    DLLNode <T> next;
    DLLNode <T> previous;
    public DLLNode() {
        next = null;
        previous = null;
    }
    // tạo 1 phần tử cuối
    public DLLNode(T el) {
        info = el;
        next = null;
        previous = null;
        
    }
    // tạo phần tử trước afterEle
    public DLLNode(T el, DLLNode<T> previousEle, DLLNode<T> afterEle) {
        info = el;
        previous = previousEle;
        next = afterEle;
    }
}
