package peaksoft.repositoryImpl;

import org.springframework.stereotype.Repository;
import peaksoft.entity.Company;
import peaksoft.entity.Course;
import peaksoft.entity.Student;
import peaksoft.repositoryImpl.repository.StudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public void saveStudent(int id, Student student) {
        Company company = manager.find(Company.class,id);
        company.addStudent(student);
        student.setCompany(company);
        manager.persist(student);
    }

    @Override
    public void updateStudent(int id, Student student) {
        Student student1 = manager.find(Student.class,id);
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setEmail(student.getEmail());
        student1.setPhoneNumber(student.getPhoneNumber());
        student1.setStudyFormat(student1.getStudyFormat());
        manager.merge(student1);
    }

    @Override
    public List<Student> getAllStudents(int id) {
        return manager.createQuery("select s from Student s where s.company.id=:id",
                Student.class).setParameter("id",id).getResultList();
    }

    @Override
    public Student getStudentById(int id) {
        return manager.find(Student.class,id);
    }

    @Override
    public void deleteStudentById(int id) {
        Student student = manager.find(Student.class,id);
        student.setCourse(null);
        manager.remove(student);

    }

    @Override
    public void assignStudentToCourse(int studentId, int courseId) {
        Student student = manager.find(Student.class,studentId);
        Course course = manager.find(Course.class,courseId);
        student.setCourse(course);
        course.addStudent(student);
        manager.merge(student);
    }
}
