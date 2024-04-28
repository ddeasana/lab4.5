package lab5;
import java.util.PriorityQueue;
//Invoker

/**class, responsible for creating command object and calling their execution
 *
 */
public class QueueControl {

    private PriorityQueue<HttpRequest> queue;
    private Command command;

    /**class constructor
     *
     * @param queue
     */
    public QueueControl(PriorityQueue<HttpRequest> queue) {
        this.queue = queue;

    }

    /**setting the command
     *
     * @param command
     */
    public void setCommand(Command command){
        this.command = command;
    }

    /**executing command
     *
     * @param request
     */
    public void makeChanges(HttpRequest request){
        command.execute(request, queue);
    }


}
