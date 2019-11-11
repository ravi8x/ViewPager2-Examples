package info.androidhive.viewpager2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Build;
import android.os.Bundle;

import info.androidhive.viewpager2.transformers.CubeInDepthTransformation;
import info.androidhive.viewpager2.transformers.DepthPageTransformer;
import info.androidhive.viewpager2.transformers.GateTransformation;
import info.androidhive.viewpager2.transformers.TossTransformation;
import info.androidhive.viewpager2.transformers.ZoomOutPageTransformer;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private MyPagerAdapter mAdapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.pager);

        mAdapter = new MyPagerAdapter(this, 3);
        viewPager.setAdapter(mAdapter);
        viewPager.setPageTransformer(new CubeInDepthTransformation());
    }
}