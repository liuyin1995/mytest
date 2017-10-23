package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller注解：用于标记普通的java类，作为控制器
@Controller
public class HelloController {
	
	// ModelAndView:模型和视图，用于设置响应的模型数据，用于设置响应的视图
	// @RequestMapping注解：配置请求的url
	@RequestMapping("/hello.do")
	public ModelAndView hello(){
		// 1.创建ModelAndView对象
		ModelAndView mav = new ModelAndView();
		
		// 2.设置响应的模型数据
		// addObject方法：设置响应的模型数据
		// attributeName参数：模型的名称（hello）
		// attributeValue参数：模型数据
		mav.addObject("hello", "springmvc!!!");
		
		// 3.设置响应的视图
		// setViewName方法：设置响应的视图
		// 参数：视图名称（jsp页面物理路径）
		mav.setViewName("/WEB-INF/jsp/hello.jsp");
		return mav;
	}

}