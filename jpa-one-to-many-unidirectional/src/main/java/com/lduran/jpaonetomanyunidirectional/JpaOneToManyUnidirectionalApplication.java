package com.lduran.jpaonetomanyunidirectional;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lduran.jpaonetomanyunidirectional.model.Student;
import com.lduran.jpaonetomanyunidirectional.model.University;
import com.lduran.jpaonetomanyunidirectional.repository.StudentRepository;
import com.lduran.jpaonetomanyunidirectional.repository.UniversityRepository;

@SpringBootApplication
public class JpaOneToManyUnidirectionalApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext cac = SpringApplication.run(JpaOneToManyUnidirectionalApplication.class, args);

		StudentRepository studentRepository = cac.getBean(StudentRepository.class);
		UniversityRepository universityRepository = cac.getBean(UniversityRepository.class);

		Student firstStudent = new Student("1111");
		Student secondStudent = new Student("1122");

		Student thirdStudent = new Student("1133");
		studentRepository.save(thirdStudent);

		List<Student> students = Arrays.asList(firstStudent, secondStudent);

		University university = new University("UCLA", students);
		universityRepository.save(university);

		universityRepository.delete(university);
	}

}
