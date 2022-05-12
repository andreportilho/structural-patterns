package br.com.cod3r.flyweight.musicPlayer.musicFlyweigth;

public class MusicFlyweight {

    private final String name;

    private final String artist;

    private final Integer DurationInSeconds;

    public MusicFlyweight(String name, String artist, Integer durationInSeconds) {
        this.name = name;
        this.artist = artist;
        DurationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return "MusicFlyweight{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", DurationInSeconds=" + DurationInSeconds +
                '}';
    }
}
