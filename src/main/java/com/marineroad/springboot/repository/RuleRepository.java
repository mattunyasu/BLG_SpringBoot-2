package com.marineroad.springboot.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.marineroad.springboot.domain.Rule;

@Repository
public interface RuleRepository {
	List<Rule> findAll();
}
