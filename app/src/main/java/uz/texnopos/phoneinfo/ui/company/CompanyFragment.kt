package uz.texnopos.phoneinfo.ui.company

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_company.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import uz.texnopos.phoneinfo.Adapter
import uz.texnopos.phoneinfo.R
import uz.texnopos.phoneinfo.database.MyDao
import uz.texnopos.phoneinfo.database.MyDatabase

class CompanyFragment(private val type: Int) : Fragment(R.layout.fragment_company) {

    private lateinit var dao: MyDao
    private var mAdapter = Adapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = mAdapter
        dao = MyDatabase.getInstance(requireContext()).phonesDao()

        when (type) {
            1 -> {
                CoroutineScope(Dispatchers.Main).launch {
                    mAdapter.models = withContext(Dispatchers.IO) {
                        dao.getSortPhones(type)
                    }
                }
            }
            2 -> {
                CoroutineScope(Dispatchers.Main).launch {
                    mAdapter.models = withContext(Dispatchers.IO) {
                        dao.getSortPhones(type)
                    }
                }
            }
            3 -> {
                CoroutineScope(Dispatchers.Main).launch {
                    mAdapter.models = withContext(Dispatchers.IO) {
                        dao.getSortPhones(type)
                    }
                }
            }
        }
    }
}