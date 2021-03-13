public class SongWriter {

    private String firstName;
    private String lastName;
    private Song[] songs;

    public SongWriter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public SongWriter(String firstName, String lastName, Song[] songs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.songs = songs;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    private String getSongWriterFullName () {
        return firstName + " " + lastName;
    }

    private void addNewSong(Song s) {
        songs[songs.length] = s;
    }

}
