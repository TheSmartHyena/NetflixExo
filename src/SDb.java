public class SDb {
    private static Db instance;

    private SDb() {
    }

    public static Db getInstance() {
        if(instance == null) {
            instance = new Db();
        }

        return instance;
    }
}
