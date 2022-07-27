package com.example.demo.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student {
	
	private final Integer studentId;
	private final String studentName;
}
