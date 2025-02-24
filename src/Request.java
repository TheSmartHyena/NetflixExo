import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Request {
    private ETypeRequest type;
    private String date;
    private User user;
    private Movie movie;
    private Integer target;

    private String conclusion = "";
    private boolean status = false;

    private Request(RequestBuilder builder) {
        this.type = builder.type;
        this.movie = builder.movie;
        this.target = builder.target;
        this.user = builder.user;
        this.date = builder.date;
    }

    public ETypeRequest getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    public Integer getTarget() {
        return target;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getConclusion() {
        return this.conclusion;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type=" + type +
                ", date='" + date + '\'' +
                ", user=" + user.toString() +
                ", movie=" + movie.toString() +
                ", target=" + target +
                ", status=" + status +
                ", conclusion=" + conclusion +
                '}';
    }

    // ConcreteBuilder
    public static class RequestBuilder {
        private ETypeRequest type;
        private String date;
        private User user;
        private Movie movie;
        private Integer target;

        public RequestBuilder() {
            this.date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date());
        }

        public RequestBuilder setType(ETypeRequest type) {
            this.type = type;
            return this;
        }

        public RequestBuilder setUser(User user) {
            this.user = user;
            return this;
        }

        public RequestBuilder setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public RequestBuilder setTarget(Integer target) {
            this.target = target;
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }
}
