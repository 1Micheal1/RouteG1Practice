package nobel.com.testapp.Session3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import nobel.com.testapp.R;

public class Splash extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Splash.this,CarsActivity.class);
                i.putExtra("title","Android Course");
                startActivity(i);

                Log.e("splashlifeCycle","starting loginactivity");
                Log.e("splashLifeCycle","calling finish");
//                finish();
            }
        }, 2000);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("splashLifeCycle","onstartCalled");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("splashLifeCycle","onResumeCalled");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("splashLifeCycle","onPaseCalled");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("splashLifeCycle","onStopCalled");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("splashLifeCycle","onDestroyCalled");


    }
}
