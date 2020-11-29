package com.alex.pagehelp.mapper;


import com.alex.pagehelp.po.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudnetMapper {
    public List<Student> findAll();
    public Student findOneById(int id);
    public Student fingOneByName(String name);
    public void  addStudent(Student student) ;
    public void updateStudent(Student student);
    public  void deleteStudentById(int id);
    public List <Student> findByPageService();


}
