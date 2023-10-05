public class Artist {

    private String name;
    private String nationality;
    private float rating;

    public Artist(String name, String nationality, float rating) {
        this.name = name;
        this.nationality = nationality;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String toString(){
        String Adisplay = String.format("%s %s %f",name,nationality,rating);
        return Adisplay;
    }
}
