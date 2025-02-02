public class Main {
    public static void main(String[] args) {
        // We initialize our fake database with some data
        Db dao = SDb.getInstance();
        dao.create(FMovie.createMovie("The Texas Chain Saw Massacre", "83 minutes", EMovieCategory.HORROR));
        dao.create(FMovie.createMovie("Interstellar", "169 minutes", EMovieCategory.SCIFI));
        dao.create(FMovie.createMovie("John Wick", "101 minutes", EMovieCategory.ACTION));

        // We create two user
        User client = FUser.createUser("Joe", EUserRole.USER);
        client.signin();

        User admin = FUser.createUser("Bob", EUserRole.ADMIN);

        // We create our chain
        ChainLogged chainLogged = new ChainLogged(); // login check
    }
}