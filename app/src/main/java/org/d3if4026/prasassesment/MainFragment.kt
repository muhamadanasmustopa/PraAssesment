package org.d3if4026.prasassesment


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4026.prasassesment.databinding.FragmentMainBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)

        binding.btnSegitiga.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_segitigaFragment)
        }
        binding.btnPersegiPanjang.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_persegiPanjangFragment)
        }
        return binding.root
    }


}
