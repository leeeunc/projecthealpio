package com.healpio.mapper;

import java.util.List;

import com.healpio.vo.ClassVo;
import com.healpio.vo.ExerciseVo;
import com.healpio.vo.LocationVo;


public interface BoardMapper {


	public List<ClassVo> getList();
	
	public List<ExerciseVo> exerciseList();
	
	public List<LocationVo> provinceList();

	public List<LocationVo> locationList();
}
