public class Utils {
    public static String movieCategoryToString(EMovieCategory category) {
        return switch(category) {
            case EMovieCategory.ACTION -> "Action";
            case EMovieCategory.HORROR -> "Horreur";
            case EMovieCategory.SCIFI -> "Science-fiction";
        };
    }
}
