package lab5;

import java.util.PriorityQueue;

//ConcreteCommand

/**Concrete realization of command interface, removing requests
 *
 */
public class RemoveRequest implements Command{

    private RequestQueue queue;

    /**class conctructor
     *
     * @param queue
     */
    public RemoveRequest( RequestQueue queue) {

        this.queue = queue;
    }

    /**override of base function execute
     *
     * @param request
     * @param queue
     */
    @Override
    public void execute(HttpRequest request, PriorityQueue<HttpRequest> queue) {
       this.queue.removeRequest(request,queue);
    }
}
