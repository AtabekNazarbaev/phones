package uz.texnopos.phoneinfo.ui.home
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_home.*
import uz.texnopos.phoneinfo.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager.adapter = HomeViewPagerAdapter(this)

        // Bind tabs and viewpager
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when(position) {
                0->  tab.text = "Redmi"
                1->  tab.text = "Samsung"
                2->  tab.text = "iPhone"
            }
        }.attach()
    }
}