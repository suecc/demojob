package com.keytop.dc.demoJob.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
 * Copyright © 2019 ds.Keytop.com.cn. All rights reserved.
 *
 * @Package: com.keytop.dc.demoJob.controller
 * @Description: TODO
 * @author: Sue  
 * @date: 2019年1月18日 下午4:37:31
 * @version: V1.0  
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("/index")
	public String index() {
		
		return "success";
	}
	
}



