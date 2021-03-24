package be.howest.borobbrecht.memestash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class IndexFragment : Fragment() {

    companion object {
        fun newInstance() = IndexFragment()
    }

    private lateinit var viewModel: IndexViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.index_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IndexViewModel::class.java)
        // TODO: Use the ViewModel
    }

}