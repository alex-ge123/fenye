package com.alex.pagehelp.service;



import com.alex.pagehelp.po.Student;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    public PageInfo<Student> findByPageService(int pageCode, int pageSize);
    public List<Student> findAll();
    public Student findOneById(int id);
    public Student fingOneByName(String name);
    public Student addStudent(Student student) ;
    public void updateStudent(Student student);
    public  void  deleteStudentById(int id);
}
