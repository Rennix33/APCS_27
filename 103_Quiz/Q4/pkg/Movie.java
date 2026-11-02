package pkg;

public class Movie{
    String name;
    double rating;
    int reviews;
    double revenue;


    public Movie(){
        name = "Avengers";
        rating = 8.0;
        reviews = 33;
        revenue = 623357910;
    }

    public Movie(String n, double r, int rw, double rev){
    name = n;
    rating = r;
    reviews = rw;
    revenue = rev;
    }

    public void movieToString(){
        System.out.println("Movie: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + reviews);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }


        public String getMovieName(){
            return name;
        }

        public double getRevenue(){
            return revenue;
        }

        public double addRating(double a){
            totalRating = rating + rewiews;
            
        }
}