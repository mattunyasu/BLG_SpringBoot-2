package com.marineroad.springboot.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marineroad.springboot.service.TopService;

/**
* Thymeleaf 基本編
*
* @param mav
* ModelAndViewクラス
* @return
*/

@Controller
public class BaseController {
	   @Autowired
	private TopService topService ;
  	@RequestMapping("/toppage")
	public ModelAndView index(ModelAndView mav) {
        mav.addObject("list", topService.findAll());
		// 使用するビューを設定
		mav.setViewName("toppage"); // (3)
		return mav;
	}
}
