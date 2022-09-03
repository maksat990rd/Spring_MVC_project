package peaksoft.serviceImple.service;

import peaksoft.entity.Lesson;

import java.util.List;

public interface LessonService {
    void saveLesson(int courseId, Lesson lesson);

    void updateLesson(int id,Lesson lesson);

    List<Lesson> getAllLessons(int id);

    Lesson getLessonById(int id);

    void deleteLessonById(int id);
}
