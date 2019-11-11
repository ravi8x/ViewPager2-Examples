package info.androidhive.viewpager2.transformers;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

public class FadeOutTransformation implements ViewPager2.PageTransformer{
    @Override
    public void transformPage(View page, float position) {

        page.setTranslationX(-position*page.getWidth());

        page.setAlpha(1-Math.abs(position));


    }
}