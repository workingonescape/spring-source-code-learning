package com.reece.service.impl;

import com.reece.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author: jingyun
 * @since: 2021/7/8 01:07
 */

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public void hello() {

		System.out.println("hello spring");
	}
}
