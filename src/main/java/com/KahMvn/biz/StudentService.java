package com.KahMvn.biz;

import com.KahMvn.data.StudentData;
import com.KahMvn.ui.models.Student;

import java.util.List;

public class StudentService {
    public void save(Student student) throws Exception{
        StudentData data = new StudentData();
        data.save(student);
    }

    public List<Student> getAll() throws Exception {
        StudentData data = new StudentData();
        return data.getAll();

    }


    public void delete(Integer id)throws Exception{
        StudentData data = new StudentData();
        data.delete(id);
    }


}
