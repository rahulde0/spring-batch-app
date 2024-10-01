package com.deor.batchapp.config;

import org.springframework.batch.item.ItemProcessor;

import com.deor.batchapp.student.Student;

public class StudentProcessor implements ItemProcessor<Student, Student>{

	@Override
	public Student process(Student student) throws Exception {
		// All Business Logic goes here
		student.setId(null);
		return student;
	}

}
