public class Song {

    private String name;
    private String artist;
    private int duration;
    private String albumName;
    private Artist myartist;

    private Mydate date;

    public Song(String name, String artist, int duration, String albumName, Artist myartist, Mydate date) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.albumName = albumName;
        this.myartist=myartist;
        this.date=date;
    }

    public Mydate getDate() {
        return date;
    }

    public void setDate(Mydate date) {
        this.date = date;
    }

    public Artist getMyartist() {
        return myartist;
    }

    public void setMyartist(Artist myartist) {
        this.myartist = myartist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }


    public String toString(){
        String Songdisplay = String.format("%s %s %d %s %s %s",name,artist,duration,albumName,myartist,date);
        return Songdisplay;
    }
    public boolean equals(Object obj){
        Song temp = (Song) obj;
        if(this.getName().equalsIgnoreCase(temp.getName())) {
            return true;
        }else return false;
    }
}
