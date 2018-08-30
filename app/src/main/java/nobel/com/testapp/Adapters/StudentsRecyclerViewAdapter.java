package nobel.com.testapp.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import nobel.com.testapp.Model.Student;
import nobel.com.testapp.R;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 8/30/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class StudentsRecyclerViewAdapter extends RecyclerView.Adapter<StudentsRecyclerViewAdapter.ViewHolder> {

    ArrayList<Student> items;

    public StudentsRecyclerViewAdapter(ArrayList<Student> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myItemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student_list_item,null);

        return new ViewHolder(myItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student studentItem = items.get(position);
        holder.studentName.setText(studentItem.getName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        public  final ImageView studentImage; //constant reference on View
        public  final TextView studentName;

        ViewHolder(View view){
            super(view);//call super constructor
            //
            studentImage = view.findViewById(R.id.imageView);
            studentName = view.findViewById(R.id.studentName);
        }
    }

}
