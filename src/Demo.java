import java.sql.SQLOutput;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Song S1 = new Song("Ali","Imran",5,"vidSong",new Artist("Umer","pakitsani",5),new Mydate(3,10,2002));
        Song S2 = new Song("Arslan","Me",4,"vidSong1",new Artist("Umer1","pakitsani1",3),new Mydate(3,11,2002));
        Song S3 = new Song("Arslani","He",7,"vidSong2",new Artist("Umer2","pakitsani2",4),new Mydate(3,22,2002));
        Song S4 = new Song("Qasim","She",9,"vidSong3",new Artist("Umer3","pakitsani3",7),new Mydate(3,12,2002));
        Song S5 = new Song("You","It",4,"vidSong4",new Artist("Umer4","pakitsani4",1),new Mydate(3,4,2002));

        System.out.println(S3);

        System.out.println(S1.equals(S2));

        Song list[] = new Song[5];
        list[0] = S1;
        list[1] = S2;
        list[2] = S3;
        list[3] = S4;
        list[4] = S5;

        for(int i = 0; i<5; i++){
            System.out.println(list[i]);
        }
    Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        String artist = sc.nextLine();
        int duration = sc.nextInt();
        String albumName = sc.nextLine();
        String myArtist = sc.nextLine();
        String myDate = sc.nextLine();
        

    }
}
