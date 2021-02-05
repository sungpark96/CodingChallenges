package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    MiddleOfTheLinkedList list = new MiddleOfTheLinkedList();

    @Test
    void positiveTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);

        SinglyNode temp = MiddleOfTheLinkedList.middleNode(list.head);
        List<Integer> test = new ArrayList<>();
        while(temp!=null){
            test.add(temp.val);
            temp= temp.next;
        }
        assertEquals(List.of(3,4,5),test);
    }

    @Test
    void negativeTest() {
        list.insertAtHead(10);
        list.insertAtTail(9);
        list.insertAtTail(8);
        list.insertAtTail(7);
        list.insertAtTail(6);
        list.insertAtTail(5);

        SinglyNode temp = MiddleOfTheLinkedList.middleNode(list.head);
        List<Integer> test = new ArrayList<>();
        while(temp!=null){
            test.add(temp.val);
            temp= temp.next;
        }
        assertNotEquals(List.of(8,7,6,5),test);
    }

}