package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie("The little women", "amazing movie");
        System.out.println("New movie was added to DB " + movieService.add(movie));
        System.out.println("Requested movie form DB is: " + movieService.get(1L));
    }
}
