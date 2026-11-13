package Homework.Homework_04;

class SongNode {
    String songName;
    String artist;
    double duration;
    SongNode next;

    public SongNode(String songName, String artist, double duration) {
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
        this.next = this;
    }
}

public class PlaylistManagement {
    static SongNode head = null;
    static SongNode currentSong = null;

    public static void insertAtBeginning(String songName, String artist, double duration) {
        SongNode newNode = new SongNode(songName, artist, duration);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        SongNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public static void insertAtEnd(String songName, String artist, double duration) {
        SongNode newNode = new SongNode(songName, artist, duration);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        SongNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public static void insertAtPosition(String songName, String artist, double duration, int pos) {
        if (pos <= 1 || head == null) {
            insertAtBeginning(songName, artist, duration);
            return;
        }
        SongNode newNode = new SongNode(songName, artist, duration);
        SongNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void deleteSong(String songName) {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }

        if (head.songName.equalsIgnoreCase(songName)) {
            if (head.next == head) {
                head = null;
                currentSong = null;
            } else {
                SongNode temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            System.out.println("Song deleted: " + songName);
            return;
        }

        SongNode temp = head;
        while (temp.next != head && !temp.next.songName.equalsIgnoreCase(songName)) {
            temp = temp.next;
        }

        if (temp.next == head) {
            System.out.println("Song not found: " + songName);
        } else {
            temp.next = temp.next.next;
            System.out.println("Song deleted: " + songName);
        }
    }

    public static void playNextSong() {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }
        if (currentSong == null) {
            currentSong = head;
        } else {
            currentSong = currentSong.next;
        }
        System.out.println("Playing: " + currentSong.songName + " by " + currentSong.artist + " (" + currentSong.duration + " mins)");
    }

    public static void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }
        SongNode temp = head;
        do {
            System.out.println("Song: " + temp.songName + ", Artist: " + temp.artist + ", Duration: " + temp.duration + " mins");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        insertAtEnd("Believer", "Imagine Dragons", 3.24);
        insertAtEnd("Shape of You", "Ed Sheeran", 3.53);
        insertAtBeginning("Faded", "Alan Walker", 3.32);
        insertAtPosition("Stay", "The Kid LAROI", 2.21, 2);

        System.out.println("Current Playlist:");
        displayPlaylist();

        System.out.println("\nPlaying songs:");
        playNextSong();
        playNextSong();
        playNextSong();

        System.out.println("\nDeleting 'Shape of You':");
        deleteSong("Shape of You");

        System.out.println("\nUpdated Playlist:");
        displayPlaylist();
    }
}
