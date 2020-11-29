package com.alex.pagehelp.service.Impl;

import com.alex.pagehelp.mapper.StudnetMapper;
import com.alex.pagehelp.po.Student;
import com.alex.pagehelp.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    /*注入Mapper接口*/
    @Autowired(required = false)
    private StudnetMapper studnetMapper;

    @Override
    public PageInfo<Student> findByPageService(int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode,pageSize);
        List<Student> all = studnetMapper.findAll();
        return new PageInfo<>(all);
    }

    @Override
    public List<Student> findAll() {
        List<Student> all = studnetMapper.findAll();
        return all;
    }

    @Override
    public Student findOneById(int id) {
        Student student = studnetMapper.findOneById(id);
        return student;
    }

    @Override
    public Student fingOneByName(String name) {
        Student student = studnetMapper.fingOneByName(name);
        return student;
    }

    @Override
    public Student addStudent(Student student) {

      studnetMapper.addStudent(student);


        return student;
    }

    @Override
    public void updateStudent(Student student) {
       studnetMapper.updateStudent(student);

    }

    @Override
    public void  deleteStudentById(int id) {
        studnetMapper.deleteStudentById(id);
    }
}
