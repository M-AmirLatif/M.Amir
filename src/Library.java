public class Library {
    LIbraryitem[] libraryItems = new LIbraryitem[70];
    private int index = 0;


    public void addItem(LIbraryitem add_one){
        libraryItems[index++] = add_one;

    }
    public void returnItem(LIbraryitem borrowed1){
        borrowed1.setBorrowed(false);
    }

    public void displayAvailableItems(){
        for(int i=0;i<index;i++){
            if(!libraryItems[i].isBorrowed())
                System.out.println(libraryItems[i]);
        }
    }

    public void displayBorrowedItems(){
        for(int i=0;i<index;i++){
            if(libraryItems[i].isBorrowed())
                System.out.println(libraryItems[i]);
        }
    }
    public void borrowItem(LIbraryitem borrow1){
        borrow1.setBorrowed(true);
    }



}

