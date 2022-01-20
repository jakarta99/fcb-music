package tw.com.fcb.music;

import java.util.List;

public interface MusicService {

	public Music getByCode(String code);
	
	public List<Music> getBySinger(String singerName);
	
}
