package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Get,Set 할 필요 없이 어노테이션만 붙여준다.

@Getter
@Setter
@ToString
public class UserDto {
	private String name;
	private int age;
	
}
