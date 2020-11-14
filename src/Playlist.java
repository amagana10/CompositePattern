import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		for(IComponent i : playlist) {
			i.play();
		}
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		for(IComponent i : playlist) {
			i.setPlaybackSpeed(speed);
		}
	}

	@Override
	public String getName() {
		return this.playlistName;
	}

	public void add(IComponent experimentalSong1) {
		this.playlist.add(experimentalSong1);
	}

  // Your code goes here!


}