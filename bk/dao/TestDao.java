package com.marineroad.springboot.dao;

import java.util.List;

import com.marineroad.springboot.domain.tbl.TestBean;

public interface TestDao {


  List<TestBean> selectAll();

}