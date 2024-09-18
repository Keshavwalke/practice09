package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sample2 {


    public static void main(String[] args) {

        Deque<String> dq=new ArrayDeque<>();
        dq.addFirst("hello");
        dq.offerFirst("world");
        dq.addLast("hey");
        dq.offerLast("wow");


        System.out.println(dq);
        System.out.println("first element is :"+ dq.peekFirst());
        System.out.println("get first element is: "+ dq.getFirst());
        System.out.println("get last is " + dq.peekLast());
        System.out.println("getting last element: "+ dq.getLast() );

        dq.removeFirst();
        dq.pollFirst();
        dq.removeLast();
        dq.pollLast();



    }
}
