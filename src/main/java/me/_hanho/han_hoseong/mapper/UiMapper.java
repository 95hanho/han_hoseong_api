package me._hanho.han_hoseong.mapper;

import org.apache.ibatis.annotations.Mapper;

import me._hanho.han_hoseong.model.Background;

@Mapper
public interface UiMapper {
	
	Background get_bgInfo();

	void set_bgInfo(Background background);

}
