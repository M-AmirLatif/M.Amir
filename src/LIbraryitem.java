public class LIbraryitem {

    private String title;
    private String auther;
    private int year;
    private boolean isBorrowed;
    private LibrayItemType itemtype;

    public LIbraryitem(String title, String auther, int year, LibrayItemType itemtype) {
        this.title = title;
        this.auther = auther;
        this.year = year;
        this.itemtype = itemtype;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibrayItemType getItemtype() {
        return itemtype;
    }

    public void setItemtype(LibrayItemType itemtype) {
        this.itemtype = itemtype;

    }

    @Override

    public String toString(){

        return String.format("%s %s %d %s %s",title,auther,year,isBorrowed,itemtype);
    }
}
