package com.marineroad.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marineroad.springboot.domain.*;
@Controller 
public class ThymeleafController {

	/**
* Thymeleaf 基本編
*
* @param mav
* ModelAndViewクラス テンプレートで利用するデータ類とビューに関する情報をまとめて管理するクラス
* @return
*/
	@RequestMapping("/thdemo")
	public ModelAndView index(ModelAndView mav) {

		mav.addObject("msg", "コントローラーからテンプレートに値を渡す"); // (2)
		DataObject obj = new DataObject(123, "マリンロード", "https://www.marineroad.com/");
		mav.addObject("object", obj);

		// 使用するビューを設定
		mav.setViewName("thdemo"); // (3)

		return mav;
	}

}