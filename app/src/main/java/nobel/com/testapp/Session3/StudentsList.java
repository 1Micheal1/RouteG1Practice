package nobel.com.testapp.Session3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import nobel.com.testapp.Adapters.StudentsRecyclerViewAdapter;
import nobel.com.testapp.Model.Student;
import nobel.com.testapp.R;

public class StudentsList extends AppCompatActivity {

    RecyclerView studentsRecyclerView;
    ArrayList<Student> allStudents;
    StudentsRecyclerViewAdapter adapter;
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);
        studentsRecyclerView = findViewById(R.id.studentsRecyclerView);
        CreateStudentData();

        adapter=new StudentsRecyclerViewAdapter(allStudents);
        studentsRecyclerView.setAdapter(adapter);
        layoutManager =new LinearLayoutManager(this);
        studentsRecyclerView.setLayoutManager(layoutManager);



    }

    public void CreateStudentData(){
        allStudents=new ArrayList<>();
        for(int i=0;i<20;i++)
            allStudents.add(new Student("name "+i,""));
    }
}
