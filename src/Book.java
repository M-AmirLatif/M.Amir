public class Book extends LIbraryitem{
    private int pagecount;

    public Book(String title,String auther,int year,int pagecount){
        super(title,auther,year, LibrayItemType.BOOK);
        this.pagecount=pagecount;

    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }
}
