
  package com.healpio.service;
  
  import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.healpio.mapper.BoardMapper;
import com.healpio.vo.ClassVo;
import com.healpio.vo.ExerciseVo;
import com.healpio.vo.LocationVo;

  

  @Service 
  public class BoardSerivceImpl implements BoardService{

	  
	 @Autowired
	 private BoardMapper boardMapper;
	  
	 @Override
	 public List<ClassVo> getList(Model model){
		 
		  List<ClassVo> list = boardMapper.getList();
		  model.addAttribute("list", list);
		  
		  return null;
	  }
	 
	 @Override
	 public List<ExerciseVo> exerciseList(Model model){
		 List<ExerciseVo> list = boardMapper.exerciseList();
		 
		 model.addAttribute("exerciseList", list);

		 //			int totalCnt = boardMapper.getTotalCnt(cri);
//			PageDto pageDto = new PageDto(cri, totalCnt);
//			
//			model.addAttribute("list", list);
//			model.addAttribute("totalCnt", totalCnt);
//			model.addAttribute("pageDto", pageDto);
//		 
		 
		 return null;
	 }
	 
	 
	 @Override
	 public List<LocationVo> provinceList(Model model){
		 List<LocationVo> list = boardMapper.provinceList();
		 
		 model.addAttribute("provinceList", list);
		 
		 return null;
	 }
	 
	 @Override
	 public List<LocationVo> locationList(Model model){
		 List<LocationVo> list = boardMapper.provinceList();
		 
		 model.addAttribute("locationList", list);
		 
		 return null;
	 }
	 
  }
 