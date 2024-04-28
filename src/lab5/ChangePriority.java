//package lab5;
//import java.util.PriorityQueue;
//
//
////ConcreteCommand
//public class ChangePriority implements Command{
//
//
//        private int newPriority;
//        private RequestQueue queue;
//
//    public ChangePriority(int newPriority, RequestQueue queue) {
//
//            this.newPriority = newPriority;
//            this.queue = queue;
//    }
//    public void change(int pr){};
//
//    @Override
//    public void execute(HttpRequest request, PriorityQueue<HttpRequest> queue) {
//
//        this.queue.changePriority(request, newPriority, queue);
//    }
//
//}
