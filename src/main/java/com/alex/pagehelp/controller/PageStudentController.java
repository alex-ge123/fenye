package com.alex.pagehelp.controller;

import com.alex.pagehelp.po.PageInfos;
import com.alex.pagehelp.po.Student;
import com.alex.pagehelp.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
public class PageStudentController {
    @Autowired(required = false)
    private StudentService studentService;

@ResponseBody
    @RequestMapping(value = "/pagehelper/{pageCode}/{pageSize}",method = RequestMethod.GET)
    //分页
    public PageInfo<Student> findByPage(@PathVariable(value = "pageCode") int pageCode, @PathVariable(value = "pageSize") int pageSize) {
        System.out.println(pageCode+"...."+pageSize);
        PageInfo<Student> byPageService = studentService.findByPageService(pageCode, pageSize);


        return byPageService;
    }

    @ResponseBody
   @RequestMapping(value = "/pagehelper",method = RequestMethod.POST/*,produces = "application/json;charset=utf-8"*/)  //consumes = "application/json;charset=utf-8"
    //分页
    public PageInfo<Student> findByPage2(@PathParam(value = "pageCode")Integer pageCode,@PathParam(value = "pageSize") Integer pageSize) {
        System.out.println(pageCode+"...."+pageSize);
        PageInfo<Student> byPageService = studentService.findByPageService(pageCode, pageSize);
        return byPageService;
    }


    @ResponseBody
    @RequestMapping(value = "/pagehelper3",method = RequestMethod.POST,consumes = "application/json;charset=utf-8")
    public PageInfo<Student> findByPage3(@RequestBody PageInfos pageInfos) {
        System.out.println(pageInfos.getPageCode()+"...."+pageInfos.getPageSize());
        List<Student> list = pageInfos.getList();

        Map<String, Student> map = pageInfos.getMap();
    System.out.println(map);
    System.out.println(pageInfos.getBool());
        for (String key  :map.keySet() ) {
      System.out.println(key);
      System.out.println(map.get(key).getAge());
        }
      for (Student s : list) {
          System.out.println(s);
        }
        char[] cc = pageInfos.getCc();
        for (char c:cc ) {
      System.out.println(c);
        }
        PageInfo<Student> byPageService = studentService.findByPageService(pageInfos.getPageCode(), pageInfos.getPageSize());
        return byPageService;
    }
}
