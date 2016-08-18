package com.broduck.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.broduck.model.SkeletonVo;

@Controller
@RequestMapping(value = "/skeleton/*")
public class SkeletonController {

	private static final Logger logger = LoggerFactory.getLogger(SkeletonController.class);
	
	@RequestMapping("hello")
	public void hello() {
		
		logger.info("hello called");
		
	}
	
	@RequestMapping("sendParam")
	public void sendParam(@ModelAttribute("param") String param) {
		
		logger.info("sendParam called");
		
	}
	
	@RequestMapping("jsonTest")
	public @ResponseBody SkeletonVo jsonTest() {
		SkeletonVo vo = new SkeletonVo();
		vo.setInteger(123);
		vo.setString("유덕형");
		
		return vo;
	}
	
	@RequestMapping(value = "ajaxTest", method = RequestMethod.GET)
	public void ajaxTest() {
		
		logger.info("ajaxTest GET");
	}
	
	@RequestMapping(value = "readAjaxTest", method = RequestMethod.POST)
	public @ResponseBody SkeletonVo readAjaxTest(@RequestBody SkeletonVo vo) {
		SkeletonVo skeletonVo = new SkeletonVo();
		
		skeletonVo.setInteger(vo.getInteger());
		skeletonVo.setString(vo.getString());
		
		return skeletonVo;
	}
}
