package peaksoft.repositoryImpl.repository;

import peaksoft.entity.Instructor;

import java.util.List;

public interface InstructorRepository {
    void saveInstructor(int id,Instructor instructor);
    void updateInstructor(int id,Instructor instructor);
    List<Instructor> getAllInstructors(int courseId);
    void deleteInstructorById(int id);
    void assignInstructorToCourse(int instId, int courseId);
    Instructor getInstructorById(int id);
}
