package org.lanqiao.controller;

import java.util.Date;
import java.util.List;

import org.lanqiao.entity.User;
import org.lanqiao.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@Autowired
	UserServiceImpl usi;
	
	@RequestMapping("index")
	public String indexshow(){
		return "index";
		
	}
	@RequestMapping("reg")
	public String reg(User user){
		int ret = usi.insertPart(user);
		String userName = user.getUserName();
		return "redirect:infoshow";
	}
	
	@RequestMapping("infoshow")
	public String infoshow(Model model){
		List<User> list=usi.getAllInfo();
		model.addAttribute("user",list);
		return "infoshow";
		
	}
	@RequestMapping("checkusername")
	@ResponseBody
	public String checkusername(String username){
		int ret = usi.checkusername(username);
		System.out.println(ret);
		if(ret==1){
			return "false";
		}else{
			return "OK";
		}
		
	}
}
