public class Date {
    private int day;
    private String month;
    private int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int date) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        String display = String.format("%d/%s/%d",day,month,year);
        return display;
    }
    public Date Recent (Date D1, Date D2)
    {
        if(D1.getYear()>D2.getYear())
        {
            return D1;
        }
        else if(D2.getMonth().compareTo(D1.getMonth()) > 0)
        {
            return D1;
        }
        else if(D1.getDate() > D2.getDate())
        {
            return D1;
        }
        else return D2;
    }

}
