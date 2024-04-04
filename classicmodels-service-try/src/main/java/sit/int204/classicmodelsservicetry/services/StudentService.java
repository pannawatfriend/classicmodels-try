package sit.int204.classicmodelsservicetry.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import sit.int204.classicmodelsservicetry.modles.Student;

@Service
public class StudentService {
//    @Autowired
//    private StudentRepository repository;

    public Student calGrade(Student student){
        if (student.getScore() > 100 || student.getScore() < 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Invalid Scolre (" + student.getScore()+") !!!");
        }
        return student.calculateGrade();
    }
}
