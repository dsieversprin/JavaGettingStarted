import java.util.Date;

public class Song {

    private String title;
    private Date releaseDate;
    private SongWriter[] songWriters;

    public Song(String title, Date releaseDate, SongWriter[] songWriters) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.songWriters = songWriters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public SongWriter[] getSongWriters() {
        return songWriters;
    }

    public void setSongWriters(SongWriter[] songWriters) {
        this.songWriters = songWriters;
    }
}
