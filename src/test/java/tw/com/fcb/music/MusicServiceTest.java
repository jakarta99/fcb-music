package tw.com.fcb.music;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class MusicServiceTest {

	@Test
	void testGetByCode() {
		MusicService service = new MusicServiceImpl();
		Music music = service.getByCode("A01");
		
		assertEquals("聽媽媽的話", music.getName());
	}

	@Test
	void testGetBySinger() {
		MusicService service = new MusicServiceImpl();
		List<Music> musics = service.getBySinger("周杰倫");
		
		assertEquals(2, musics.size());
	}

}
