package lab5;
import java.util.PriorityQueue;

//interface command

/**interface for a command, containing an execute function
 *
 */
public interface Command {
    void execute(HttpRequest request, PriorityQueue<HttpRequest> queue);

}
