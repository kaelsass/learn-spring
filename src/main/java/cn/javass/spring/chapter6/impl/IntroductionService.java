package cn.javass.spring.chapter6.impl;

import cn.javass.spring.chapter6.service.IIntroductionService;

public class IntroductionService implements IIntroductionService {

	public void induct() {
		System.out.println("=============intruction");
	}

}
