package com.alex.pagehelp;

import com.alex.pagehelp.po.Student;
import com.alex.pagehelp.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FenyeApplicationTests {
@Autowired(required = false)
private StudentService studentService;
    @Test
    void contextLoads() {
        PageInfo<Student> byPageService = studentService.findByPageService(4, 8);
    System.out.println(byPageService.getPageNum());
    System.out.println(byPageService.getList());
    for (Student s : byPageService.getList()) {
      System.out.println(s);
    }
    }
    @Test
    void contextLoads2() {
        List<Student> all = studentService.findAll();
        for (Student s :all ) {
      System.out.println(s);
        }

    }

}
