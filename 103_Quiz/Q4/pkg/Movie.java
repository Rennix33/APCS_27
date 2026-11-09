package pkg;

public class Movie{
    private String name;
    private double rating;
    private int reviews;
    private double revenue;


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

        public void addRating(double a){
            double prevTotal = rating * rewiews;
            double total = prebTotal + a;
            rating++;
            rating = total / rewiews;
            
        }
}