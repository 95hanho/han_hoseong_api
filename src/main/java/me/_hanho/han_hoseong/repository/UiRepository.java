package me._hanho.han_hoseong.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me._hanho.han_hoseong.mapper.UiMapper;
import me._hanho.han_hoseong.model.Background;

@Repository
public class UiRepository {
	
	@Autowired
	private UiMapper uiMapper;
	
	public Background get_bgInfo() {
		return uiMapper.get_bgInfo();
	}

	public void set_bgInfo(Background background) {
		uiMapper.set_bgInfo(background);
	}



}
