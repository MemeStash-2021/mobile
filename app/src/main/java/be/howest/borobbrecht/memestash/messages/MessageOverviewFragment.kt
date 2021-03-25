package be.howest.borobbrecht.memestash.messages

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.howest.borobbrecht.memestash.R

class MessageOverviewFragment : Fragment() {

    companion object {
        fun newInstance() = MessageOverviewFragment()
    }

    private lateinit var viewModel: MessageOverviewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.message_overview_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MessageOverviewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}