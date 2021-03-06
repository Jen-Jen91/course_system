package com.example.CourseTracker.repositories.CourseRepository;

import com.example.CourseTracker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> getAllCoursesWithRating(int rating);

    List<Course> getAllCoursesForCustomer(Long customerId);

    List<Course> getAllCoursesWithTown(String town);
}
