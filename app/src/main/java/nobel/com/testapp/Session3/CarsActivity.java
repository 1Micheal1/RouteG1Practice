package nobel.com.testapp.Session3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

import nobel.com.testapp.Adapters.CarsListRecyclerAdapter;
import nobel.com.testapp.Model.Car;
import nobel.com.testapp.R;

public class CarsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    CarsListRecyclerAdapter adapter;
    ArrayList<Car> carsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
        AddCars();
        recyclerView=findViewById(R.id.recyclerView);

        layoutManager= new LinearLayoutManager(this);
        adapter=new CarsListRecyclerAdapter(carsList);
        adapter.setOnImageClickListener(new CarsListRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position, Car car) {
                Toast.makeText(CarsActivity.this, car.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        adapter.setOnItemClickListener(new CarsListRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position, Car car) {

                Toast.makeText(CarsActivity.this, "parent View Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }

    void AddCars(){
        carsList= new ArrayList<>();
        carsList.add(new Car("jeep","1/2/2019",R.drawable.car,R.drawable.car));
        carsList.add(new Car("ferrari","1/2/2019",R.drawable.car,R.drawable.car));
        carsList.add(new Car("crysler","1/2/2019",R.drawable.car,R.drawable.car));
        carsList.add(new Car("128","1/2/2019",R.drawable.car,R.drawable.car));
        carsList.add(new Car("fiat","1/2/2019",R.drawable.car,R.drawable.car));
        carsList.add(new Car("crysler","1/2/2019",R.drawable.car,R.drawable.car));
    }
}
