
public class Song implements IComponent {
	public String songName;
	public String artist;

	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing the song: "+
		this.songName + " at "+speed+"x speed");
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String getName() {
		return songName;
	}
	public String getArtist() {
		return artist;
	}
	
	// Your code goes here!
	
}