public class Movie {
    private int id = -1; // By default -1 until set in a database/list
    private String name = "";
    private String length  = "";
    private EMovieCategory category;

    public Movie(String name, String length, EMovieCategory category) {
        this.name = name;
        this.length = length;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public EMovieCategory getCategory() {
        return category;
    }

    public void setCategory(EMovieCategory category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", length='" + this.length + '\'' +
                ", category=" + Utils.movieCategoryToString(this.category) +
                '}';
    }
}
