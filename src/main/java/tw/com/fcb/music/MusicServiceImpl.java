package tw.com.fcb.music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicServiceImpl implements MusicService {
	
	Map<String, Music> myMusics = new HashMap<String, Music>();
	
	public MusicServiceImpl() {
		
		Music music1 = new Music();
		music1.setCode("A01");
		music1.setName("聽媽媽的話");
		music1.setPrice(300);
		music1.setSingerName("周杰倫");
		
		Music music2 = new Music();
		music2.setCode("A02");
		music2.setName("范特西");
		music2.setPrice(280);
		music2.setSingerName("周杰倫");
		
		Music music3 = new Music();
		music3.setCode("B01");
		music3.setName("姊妹");
		music3.setPrice(360);
		music3.setSingerName("張惠妹");
		
		myMusics.put("A01", music1);
		myMusics.put(music2.getCode(), music2);
		myMusics.put(music3.getCode(), music3);
		
	}
	
	

	@Override
	public Music getByCode(String code) {
		return myMusics.get(code);
	}

	@Override
	public List<Music> getBySinger(String singerName) {
		
		List<Music> result = new ArrayList<Music>();
		System.out.println(myMusics);
		for(String key : myMusics.keySet()) {
			System.out.println("this key is "+key);
			Music thisMusic = myMusics.get(key);
			
			if(thisMusic.getSingerName().equals(singerName)) {
				result.add(thisMusic);
			} else {
				System.out.println("No added, because this singer is "+thisMusic.getSingerName());
			}
			
		}
		
		return result;
		
	}

}
