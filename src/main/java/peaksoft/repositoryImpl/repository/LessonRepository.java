package peaksoft.repositoryImpl.repository;

import peaksoft.entity.Lesson;

import java.util.List;

public interface LessonRepository {

    void saveLesson(int courseId,Lesson lesson);

    void updateLesson(int id,Lesson lesson);

    List<Lesson> getAllLessons(int id);

    Lesson getLessonById(int id);

    void deleteLessonById(int id);
}
