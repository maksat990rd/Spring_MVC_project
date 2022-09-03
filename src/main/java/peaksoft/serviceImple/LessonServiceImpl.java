package peaksoft.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.entity.Lesson;
import peaksoft.repositoryImpl.repository.LessonRepository;
import peaksoft.serviceImple.service.LessonService;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class LessonServiceImpl implements LessonService {
    private final LessonRepository repository;

    @Autowired
    public LessonServiceImpl(LessonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveLesson(int courseId, Lesson lesson) {
        repository.saveLesson(courseId, lesson);
    }

    @Override
    public void updateLesson(int id, Lesson lesson) {
        repository.updateLesson(id, lesson);
    }

    @Override
    public List<Lesson> getAllLessons(int id) {
        return repository.getAllLessons(id);
    }

    @Override
    public Lesson getLessonById(int id) {
        return repository.getLessonById(id);
    }

    @Override
    public void deleteLessonById(int id) {
        repository.deleteLessonById(id);
    }
}
