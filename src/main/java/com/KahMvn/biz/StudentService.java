package com.KahMvn.biz;

import com.KahMvn.data.StudentData;
import com.KahMvn.ui.models.Student;

public class StudentService {
    public void save(Student student){
        StudentData data = new StudentData();
        data.save(student);
    }
}
