package lab5;

import java.util.PriorityQueue;


//Receiver

/**class that has a real functionality and knows hoa to execute a command
 *
 */
public class RequestQueue {
    /**function for adding the request
     *
     * @param request
     * @param queue
     */
    public void addRequest(HttpRequest request, PriorityQueue<HttpRequest> queue){

        queue.add(request);
        System.out.println("Request added");

    }

    /**func for removing request
     *
     * @param request
     * @param queue
     */
    public void removeRequest(HttpRequest request, PriorityQueue<HttpRequest> queue){
        queue.remove(request);
        System.out.println("Request removed");
    }

//    public void changePriority(HttpRequest request, int priority, PriorityQueue<HttpRequest> queue){
//        request.setPriority(priority);
//        System.out.println("Priority changed");
//    }

}
