package com.example.CourseTracker.components;

import com.example.CourseTracker.models.Booking;
import com.example.CourseTracker.models.Course;
import com.example.CourseTracker.models.Customer;
import com.example.CourseTracker.repositories.BookingRepository;
import com.example.CourseTracker.repositories.CourseRepository;
import com.example.CourseTracker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Course java = new Course("Intro to Java", "edinburgh", 4);
        courseRepository.save(java);

        Course ruby = new Course("Intro to Ruby", "glasgow", 3);
        courseRepository.save(ruby);

        Customer steve = new Customer("Steve", "linlithgow", 35);
        customerRepository.save(steve);

        Customer hetty = new Customer("Hetty", "glasgow", 52);
        customerRepository.save(hetty);

        Booking booking1 = new Booking("13-06-18", java, steve);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01-02-19", ruby, hetty);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("01-02-19", ruby, steve);
        bookingRepository.save(booking3);
    }

}