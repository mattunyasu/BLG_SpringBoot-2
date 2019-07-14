/*
package com.marineroad.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marineroad.springboot.domain.tbl.TestBean;
import com.marineroad.springboot.service.TestService;


@Controller
public class TestController {
   @Autowired
   private TestService testService;

  @RequestMapping("/test")
  @ResponseBody
  public String home() {
      String returnStr = "";
      List<TestBean> list = testService.selectAll();
      for (TestBean testBean : list) {
          returnStr += "id  :" + testBean.getId() + " ";
          returnStr += "name:" + testBean.getDescription() + "<br>";
      }
      return returnStr;
  }



}
*/