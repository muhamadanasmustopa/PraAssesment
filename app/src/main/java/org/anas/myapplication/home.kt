package org.anas.myapplication


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import org.anas.myapplication.databinding.ActivityMainBinding
import org.anas.myapplication.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class home : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home, container,false)

        binding.buttonLogin.setOnClickListener {
            it.findNavController().navigate(R.id.action_home2_to_dashboard)
        }
        binding.buttonRegist.setOnClickListener {
            it.findNavController().navigate(R.id.action_home2_to_register)
        }

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater.inflate(R.menu.menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController())||super.onOptionsItemSelected(item)
    }
}
