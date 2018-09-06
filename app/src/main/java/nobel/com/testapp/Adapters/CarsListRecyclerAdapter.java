package nobel.com.testapp.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import nobel.com.testapp.Model.Car;
import nobel.com.testapp.R;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 9/6/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class CarsListRecyclerAdapter extends RecyclerView.Adapter<CarsListRecyclerAdapter.ViewHolder> {

    ArrayList<Car> items;

    OnItemClickListener onImageClickListener;
    OnItemClickListener onItemClickListener;



    public CarsListRecyclerAdapter(ArrayList<Car> items) {
        this.items = items;
    }

    public void setOnImageClickListener(OnItemClickListener onImageClickListener) {
        this.onImageClickListener = onImageClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_car,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Car car= items.get(position);

        holder.name.setText(car.getName());
        holder.carImage.setImageResource(car.getCarImage());
        holder.date.setText(car.getDate());

        if(onImageClickListener!=null){
            holder.carImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onImageClickListener.onClick(position,car);
                }
            });
        }

        if(onItemClickListener!=null)
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onClick(position,car);
                }
            });

    }

    @Override
    public int getItemCount() {
        if(items==null)return 0;
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
      public final TextView name;
      public  final TextView date;
       public final  ImageView carImage;
       public final ImageView makeImage;
       public final CardView cardView;

        ViewHolder(View v){
            super(v);
            name= v.findViewById(R.id.name);
            date= v.findViewById(R.id.date);
            carImage = v.findViewById(R.id.image);
            makeImage = v.findViewById(R.id.make);
            cardView = v.findViewById(R.id.card);
        }
    }

    public static interface OnItemClickListener{
        void onClick(int position,Car car);
    }
}
