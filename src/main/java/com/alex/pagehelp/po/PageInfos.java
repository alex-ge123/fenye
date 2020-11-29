package com.alex.pagehelp.po;






import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
public class PageInfos implements Serializable
{
   private Integer pageSize;
   private Integer   pageCode;
   private List<Student>  list =new ArrayList<>();
   private  char [] cc;
   private Map<String,Student> map= new HashMap<>();
   //private Map<String,Student> params = new HashMap<String,Student>();
}
