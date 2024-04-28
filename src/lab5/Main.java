package lab5;


import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int newPriority = 1;
        HttpRequest request1 = new HttpRequest("lab.com" , 1);
        HttpRequest request2 = new HttpRequest("lab2.com" , 2);
        HttpRequest request3 = new HttpRequest("lab3.com" , 1);
        HttpRequest request4 = new HttpRequest("lab4.com" , 1);

        PriorityQueue<HttpRequest> newqueue = new PriorityQueue<>();

        RequestQueue receiver = new RequestQueue();

        Command removeRequest = new RemoveRequest(receiver);
        Command addRequest = new AddRequest(receiver);
        QueueControl control = new QueueControl(newqueue);
//add 4 requests to the queue
        control.setCommand(addRequest);
        control.makeChanges(request1);

        control.setCommand(addRequest);
        control.makeChanges(request2);

        control.setCommand(addRequest);
        control.makeChanges(request3);

        control.setCommand(addRequest);
        control.makeChanges(request4);
//remove first one
        control.setCommand(removeRequest);
        control.makeChanges(request3);

        request2.setPriority(3);

        while(!newqueue.isEmpty()){
            System.out.println(newqueue.poll());
        }


    }
}
