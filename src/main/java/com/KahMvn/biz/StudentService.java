package com.KahMvn.biz;

import com.KahMvn.data.StudentData;
import com.KahMvn.ui.models.Student;

public class StudentService {
    public void save(Student student) throws Exception{
        StudentData data = new StudentData();
        data.save(student);
    }
}
