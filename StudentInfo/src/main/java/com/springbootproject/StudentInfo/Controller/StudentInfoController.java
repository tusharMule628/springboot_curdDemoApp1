package com.springbootproject.StudentInfo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbootproject.StudentInfo.Entity.StudentInfo;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentInfoController {
	@Autowired
	studentRepository.studentRepo repo;
	@GetMapping("/students")//to get all students information use localhost:8080/students
	public List getAllStudents(){
		List<StudentInfo> students=repo.findAll();
		return students;
	}
	@GetMapping("student/{id}")//to get student info by id i.e. rollno 1,2,3,etc  use localhost:8080/students/1(id)
	public StudentInfo studentById(@PathVariable int id)
	{
		StudentInfo student=repo.findById(id).get();
		return student;
	}
	@PostMapping("/student/add")
	public void createNewStudent(@RequestBody StudentInfo student)
	{
		repo.save(student);
	}

	@PutMapping("/student/update/{id}")
	public StudentInfo updateStudent(@PathVariable int id){
		StudentInfo student=repo.findById(id).get();
		student.setStudentName("Sumit");
		student.setStudentAddress("Mumbai");
		student.setStudentPhoneNo("987654321");
		repo.save(student);
		return student;
	}
	@DeleteMapping("/student/delete/{id}")
	public void removeStudent(@PathVariable int id)
	{
		StudentInfo student=repo.findById(id).get();
				repo.delete(student);

	}

}
