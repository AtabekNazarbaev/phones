package uz.texnopos.phoneinfo.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.texnopos.phoneinfo.ui.company.CompanyFragment

class HomeViewPagerAdapter(private val fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return CompanyFragment(position+1)
    }

}