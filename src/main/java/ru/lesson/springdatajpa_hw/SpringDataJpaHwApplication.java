package ru.lesson.springdatajpa_hw;

import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.lesson.springdatajpa_hw.entity.*;
import ru.lesson.springdatajpa_hw.repository.StudentRepository;
import ru.lesson.springdatajpa_hw.repository.TeacherRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaHwApplication {

    public static void main(String[] args) {
      var context =  SpringApplication.run(SpringDataJpaHwApplication.class, args);
      StudentRepository studentRepository =  context.getBean("studentRepository", StudentRepository.class);
      TeacherRepository teacherRepository = context.getBean("teacherRepository", TeacherRepository.class);





//      Car car1 = new Car("Tesla","К344СК_64RUS");
//      Car car2 = new Car("Priora","К555СК_64RUS");
//      Car car3 = new Car("CuberTrack","D999EN_64RUS");
//
//      List<Car> carsStudets1 = List.of(car1,car2);
//      List<Car> carsStudents2 = List.of(car3);
//      Car car = new Car();
//
////      Student student1 = new Student("Jimmys");
////      Student student2 = new Student("Johns");
//      Student student3 = new Student("Jonh");
//      studentRepository.save(student3);

//      student1.getCars().addAll(carsStudets1);
//      student2.getCars().addAll(carsStudents2);
//      studentRepository.saveAll(List.of(student1,student2,student3));



        Optional<Student> optionalStudent = studentRepository.findById(8l);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            List<Car> cars = student.getCars();
            System.out.println(student);

        }




//        CreditBook creditBook1 = new CreditBook(4,5);
//        CreditBook creditBook2 = new CreditBook(5,3);
//        CreditBook creditBook3 = new CreditBook(4,4);
//
//        Student student1 = new Student("Max2",LocalDate.of(1994,11,1),creditBook1);
//        Student student2 = new Student("Anna3",LocalDate.of(1995,11,2),creditBook2);
//        Student student3 = new Student("Mike1",LocalDate.of(1996,11,3),creditBook3);
//        studentRepository.save(student1);
//        studentRepository.save(student2);
//        studentRepository.save(student3);
//
//        creditBook1.setStudent(student1);
//        creditBook2.setStudent(student2);
//        creditBook3.setStudent(student3);

//
//        Teacher teacher1 = new Teacher("Alex","Russian");
//        Teacher teacher2 = new Teacher("Bob","English");
//        Teacher teacher3 = new Teacher("Jack","Francia");
//
//
//
//

//
//        teacher1.getStudents().addAll(List.of(student1,student2,student3));
//        teacher2.getStudents().addAll(List.of(student1,student3));
//        teacher3.getStudents().addAll(List.of(student1));
//
//
//    teacherRepository.saveAll(List.of(teacher1,teacher2,teacher3));



//       Optional<Student> optionalStudent = studentRepository.findById(1l);
//       if(optionalStudent.isPresent()) {
//         Student student = optionalStudent.get();
//         System.out.println(student);
//       }

    }

}
