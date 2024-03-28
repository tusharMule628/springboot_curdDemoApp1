package studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootproject.StudentInfo.Entity.StudentInfo;

public interface studentRepo extends JpaRepository<StudentInfo,Integer> {
	

}
