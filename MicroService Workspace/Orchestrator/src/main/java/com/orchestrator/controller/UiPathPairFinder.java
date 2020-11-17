package com.orchestrator.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.orchestrator.service.FindPairs;

@RestController
public class UiPathPairFinder 
{
	
	@GetMapping("/getPair/{list}/{sum}")
	public List<Float> tt(@PathVariable String list, @PathVariable String sum) {
		FindPairs fp = new FindPairs();
		return fp.getPair(list, sum);
	}

}
