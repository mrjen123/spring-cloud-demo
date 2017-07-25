/*
 * Project: demo-serviceA
 * 
 * File Created at 2017年7月21日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package org.demo.serviceA.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Type TestController.java
 * @Desc
 * @author chenfj
 * @date 2017年7月21日 下午3:18:51
 * @version
 */
@RestController
public class TestController {
	@RequestMapping("serviceA")
	public String test() {
		return "serviceA";
	}
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年7月21日 chenfj creat
 */