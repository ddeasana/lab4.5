package lab5;

/**class for a http request, containing such fields as int priority and string url
 *
 */
public class HttpRequest implements Comparable<HttpRequest>{

    private String url;
    private int priority;

    /**constructor
     *
     * @param url
     * @param priority
     */
    public HttpRequest(String url, int priority) {
        this.url = url;
        this.priority = priority;
    }

    /**getter for a priority
     *
     * @return
     */
    public int getPriority() {
        return priority;
    }

    /**setter for a priority
     *
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**realization of comparable interface, made for a PriorityQueue
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(HttpRequest o) {
        if (this.priority == o.priority){return 0;}
        if(this.priority > o.priority){return 1;}
        return -1;
    }

    /**toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", priority=" + priority +
                '}';
    }
}
