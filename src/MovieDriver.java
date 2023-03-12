public class MovieDriver {
    public static void main(String[] args) {
        // create 3 Movie objects
        Movie movie1 = new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 142, 9.3);
        Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola", 1972, 175, 9.2);
        Movie movie3 = new Movie("The Dark Knight", "Christopher Nolan", 2008, 152, 9.0);

        // set values for each movie
        movie1.setDuration(110);
        movie2.setRating(9.5);
        movie3.setReleaseYear(2009);

        // display all fields for each movie
        System.out.println("Movie 1:");
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("Director: " + movie1.getDirector());
        System.out.println("Release Year: " + movie1.getReleaseYear());
        System.out.println("Duration: " + movie1.getDuration() + " minutes");
        System.out.println("Rating: " + movie1.getRating());
        System.out.println("Is long movie? " + movie1.isLongMovie());
        System.out.println("Is highly rated? " + movie1.isHighlyRated());

        System.out.println("********************************************** \n");

        System.out.println("Movie 2:");
        System.out.println("Title: " + movie2.getTitle());
        System.out.println("Director: " + movie2.getDirector());
        System.out.println("Release Year: " + movie2.getReleaseYear());
        System.out.println("Duration: " + movie2.getDuration() + " minutes");
        System.out.println("Rating: " + movie2.getRating());
        System.out.println("Is long movie? " + movie2.isLongMovie());
        System.out.println("Is highly rated? " + movie2.isHighlyRated());

        System.out.println("********************************************** \n");

        System.out.println("Movie 3:");
        System.out.println("Title: " + movie3.getTitle());
        System.out.println("Director: " + movie3.getDirector());
        System.out.println("Release Year: " + movie3.getReleaseYear());
        System.out.println("Duration: " + movie3.getDuration() + " minutes");
        System.out.println("Rating: " + movie3.getRating());
        System.out.println("Is long movie? " + movie3.isLongMovie());
        System.out.println("Is highly rated? " + movie3.isHighlyRated());

    }
}
