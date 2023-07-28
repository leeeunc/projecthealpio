
  package com.healpio.service;
  
  import java.util.List;
  
  import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.healpio.vo.ClassVo;
import com.healpio.vo.ExerciseVo;
import com.healpio.vo.LocationVo;

  
  
  @Service 
  public interface BoardService {
  
  public List<ClassVo> getList(Model model);
  
  public List<ExerciseVo> exerciseList(Model model);
  
  public List<LocationVo> provinceList(Model model);
  
  public List<LocationVo> locationList(Model model);
  }
 