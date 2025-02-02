public class Utils {
    public static String movieCategoryToString(EMovieCategory category) {
        return switch(category) {
            case EMovieCategory.ACTION -> "Action";
            case EMovieCategory.HORROR -> "Horreur";
            case EMovieCategory.SCIFI -> "Science-fiction";
        };
    }

    public static String userRoleToString(EUserRole role) {
        return switch(role) {
            case EUserRole.USER -> "Utilisateur";
            case EUserRole.ADMIN -> "Administrateur";
        };
    }
}
