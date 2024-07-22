package polymorphism;

public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Drama millionDollarBaby = (Drama) Movie.getMovie("D", "Million Dollar Baby");
        millionDollarBaby.watchMovie();
        millionDollarBaby.watchDramaMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Naked Gun");
        if (unknownObject instanceof Comedy comedian){
            comedian.watchMovie();
            comedian.watchComedy();
        }
    }
}
