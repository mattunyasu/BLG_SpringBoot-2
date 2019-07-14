package com.marineroad.springboot.dao;

import java.util.List;

import com.marineroad.springboot.domain.tbl.TestBean;
import com.marineroad.springboot.domain.tbl.TopBean;

public interface TopDao {


  List<TopBean> selectAll();

}