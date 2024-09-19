import java.util.Objects;


public class Request {

    /**
     * The type of this request, used by each item in the chain to see if they should or can handle
     * this particular request.
     */
    private final RequestType requestType;

    /**
     * A description of the request.
     */
    private final String requestDescription;

    /**
     * Create a new request of the given type and accompanied description.
     *
     * @param requestType        The type of request
     * @param requestDescription The description of the request
     */
    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }

}

