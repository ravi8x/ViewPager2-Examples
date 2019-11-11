package info.androidhive.viewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyPagerAdapter extends FragmentStateAdapter {
    private int numberOfPages;

    public MyPagerAdapter(FragmentActivity fa, int numberOfPages) {
        super(fa);
        this.numberOfPages = numberOfPages;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new HomeFragment();
    }

    @Override
    public int getItemCount() {
        return numberOfPages;
    }
}
