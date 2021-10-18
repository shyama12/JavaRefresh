import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); // does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); // does not exist

        play(playList);
    }

    public static void play(LinkedList<Song> playList) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int choice = 0;
        boolean goingForward = true;
        ListIterator<Song> playListIterator = playList.listIterator();
        printMenu();
        while(!quit) {
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("In case 0");
                    quit = true;
                    break;
                case 1:
                    System.out.println("In case 1");
                  if (!goingForward){
                      if (playListIterator.hasNext()){
                          playListIterator.next();
                      }
                      goingForward=true;
                  }
                  if (playListIterator.hasNext()) {
                      System.out.println("Currently playing " + playListIterator.next());

                  }else{
                      System.out.println("End of list");
                      goingForward = false;
                  }
                    break;
                case 2:
                    System.out.println("In case 2");
                    if (goingForward){
                        if (playListIterator.hasPrevious()){
                            playListIterator.previous();
                        }
                        goingForward=false;
                    }
                    if (playListIterator.hasPrevious()) {
                        System.out.println("Currently playing " + playListIterator.previous());

                    }else{
                        System.out.println("Start of list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    System.out.println("In case 3");
                    if (goingForward) {
                        if (playListIterator.hasPrevious()) {
                            playListIterator.previous();
                            System.out.println("Currently playing " + playListIterator.next());
                        }else{
                            System.out.println("Start of list");
                        }
                    }else{
                        if (playListIterator.hasNext()) {
                            playListIterator.next();
                            System.out.println("Currently playing " + playListIterator.previous());
                        }else{
                            System.out.println("End of list");
                        }
                    }

                    break;
                case 4:
                    System.out.println("In case 4");
                    playListIterator.remove();
                    break;

                case 5:
                    for (Song s: playList) {
                        System.out.println(s);
                    }
                    break;

                case 6:
                    printMenu();
                    break;
            }
        }


        scanner.close();

    }

    public static void printMenu() {
        System.out.println("Press\n"
                +"\t\t0-to quit"
                + "\t\t1-to go to next song"
                + "\t\t2-to go to previous song"
                + "\t\t3-to replay current song"
                + "\t\t4-to remove current song"
                + "\t\t5-to display songs in the play list"
                + "\t\t6-to print actions menu");
    }
}
