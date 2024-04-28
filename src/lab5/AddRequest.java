package lab5;
import java.util.PriorityQueue;


//ConcreteCommand

/**Concrete command to add requests
 *
 */
public class AddRequest implements  Command{
    private RequestQueue queue;

    /**class constructor
     *
     * @param queue
     */
    public AddRequest(RequestQueue queue) {
        this.queue = queue;
    }

    /**Override of interface execute function
     *
     * @param request
     * @param queue
     */
    @Override
    public void execute(HttpRequest request, PriorityQueue<HttpRequest> queue) {
       this.queue.addRequest(request,queue);

    }
}
