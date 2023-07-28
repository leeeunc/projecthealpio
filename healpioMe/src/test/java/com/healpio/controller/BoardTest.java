package com.healpio.controller;

import static org.junit.Assume.assumeNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.healpio.mapper.BoardMapper;
import com.healpio.vo.ClassVo;
import com.healpio.vo.ExerciseVo;
import com.healpio.vo.LocationVo;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardTest {

	@Autowired
	BoardMapper boardMapper;
	
	@Test
	public void test() {
		
		assumeNotNull(boardMapper);
		List<ClassVo> list = boardMapper.getList();
		
		list.forEach(board ->{
			log.info("ClassVO====================");
			log.info(board.getClass_no());
			log.info(board.getLocation_no());
			log.info(board.getMember_no());
			log.info(board.getClass_title());
			log.info(board.getClass_content());
			log.info(board.getClass_introduce());
			log.info(board.getClass_regdate());
			log.info(board.getTeacher_content());
			log.info(board.getClass_attach());
			log.info(board.getClass_maxcount());
			log.info(board.getClass_price());
		});
		
		
	}
	
	@Test
	public void exerciseTest() {
		assumeNotNull(boardMapper);
		
		List<ExerciseVo> list = boardMapper.exerciseList();
		list.forEach(exercise ->{
			log.info(exercise.getExercise_name());
		});
	}
	
	@Test
	public void provinceListTest() {
		assumeNotNull(boardMapper);
		
		List<LocationVo> list = boardMapper.provinceList();
		
		list.forEach(location ->{
			log.info(location.getProvince());

		});

		
	}
	
	@Test
	public void locationListTest() {
		assumeNotNull(boardMapper);
		
		List<LocationVo> list = boardMapper.locationList();
		
		list.forEach(location ->{
			log.info(location.getLocation_no());
			log.info(location.getProvince());
			log.info(location.getCity());
			log.info(location.getDistrict());
			log.info(location.getNeighborhood());
			
		});
	}
	
}
