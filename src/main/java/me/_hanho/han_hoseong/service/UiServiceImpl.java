package me._hanho.han_hoseong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me._hanho.han_hoseong.model.Background;
import me._hanho.han_hoseong.repository.UiRepository;

@Service
public class UiServiceImpl implements UiService {
	
	@Autowired
	private UiRepository uiDAO;


	@Override
	public Background get_bgInfo() {
		return uiDAO.get_bgInfo();
	}
	
	@Override
	public void set_bgInfo(Background background) {
		uiDAO.set_bgInfo(background);
	}


}
