package com.marineroad.springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marineroad.springboot.domain.Rule;
import com.marineroad.springboot.repository.RuleRepository;

@Service
public class TopService {
	 @Autowired
	private RuleRepository ruleRepository;

	@Transactional
	public List<Rule> findAll() {
		return ruleRepository.findAll();
	}
}
