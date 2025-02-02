import java.util.Arrays;

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

    public static ETypeRequest[] getCUDactions() {
        return new ETypeRequest[]{ ETypeRequest.CREATE, ETypeRequest.UPDATE, ETypeRequest.DELETE };
    }

    public static boolean isCudActions(ETypeRequest type) {
        // Instead of doing a || b || c, we do an array.contains to be easier to read and maintain
        return Arrays.asList(Utils.getCUDactions()).contains(type);
    }
}
