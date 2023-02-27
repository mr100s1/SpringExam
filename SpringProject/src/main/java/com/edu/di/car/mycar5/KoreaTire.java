package com.edu.di.car.mycar5;

//-----------------------------------------------------------------------------------------------------------
//스프링을 통한 의존성 주입 - 스프링 설정 파일(XML)에서 속성 주입
//-----------------------------------------------------------------------------------------------------------
public class KoreaTire implements Tire {

	@Override
	public String getBrand() {

		return "한국에서 만든 타이어";
	}

}
