public class FRequest {
    public static Request createRequestCreate(Movie movie, User user) {
        return new Request.RequestBuilder().setType(ETypeRequest.CREATE).setMovie(movie).setUser(user).build();
    }

    public static Request createRequestUpdate(Movie movie, User user) {
        return new Request.RequestBuilder().setType(ETypeRequest.UPDATE).setMovie(movie).setUser(user).build();
    }

    public static Request createRequestDelete(Integer target, User user) {
        return new Request.RequestBuilder().setType(ETypeRequest.DELETE).setTarget(target).setUser(user).build();
    }
}
