public class FMovie {
    public static Movie createMovie(String name, String length, EMovieCategory category) {
        return new Movie(name, length ,category);
    }
}
