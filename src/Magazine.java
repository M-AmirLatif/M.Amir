public class Magazine extends LIbraryitem{
    private int issueNo;

    public Magazine(String title,String auther,int year,int issueNo){
        super(title,auther,year, LibrayItemType.MAGAZINE);
        this.issueNo=issueNo;

    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }
}
