public class Main {
    public static void main(String[] args) {

        // We initialize our fake database with some data
        Db dao = SDb.getInstance();
        dao.create(FMovie.createMovie("The Texas Chain Saw Massacre", "83 minutes", EMovieCategory.HORROR));
        dao.create(FMovie.createMovie("Interstellar", "169 minutes", EMovieCategory.SCIFI));
        dao.create(FMovie.createMovie("John Wick", "101 minutes", EMovieCategory.ACTION));


    }
}