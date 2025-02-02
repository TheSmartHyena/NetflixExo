import java.util.Dictionary;
import java.util.HashMap;

public class Db {
    private HashMap<Integer, Movie> movies = new HashMap<Integer, Movie>();

    public Db() {
        SLogger.getInstance().log("DB initialized");
    }

    public Movie create(Movie movie) {
        movie.setId(this.movies.size());
        this.movies.put(movie.getId(), movie);
        return movie;
    }

    public Movie read(Integer key) {
        return this.movies.get(key);
    }

    public void update(Integer key, Movie movie) {
        this.movies.put(key, movie);
    }

    public void delete(Integer key) {
        this.movies.remove(key);
    }
}
