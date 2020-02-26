package org.d3if4026.prasassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4026.prasassesment.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_segitiga, container, false)

        binding.btnHasil.setOnClickListener {
            var alas = binding.alas.text.toString().toDouble()
            var tinggi = binding.tinggi.text.toString().toDouble()

            var hasilLuas = 0.5 * alas * tinggi
            var hasilKeliling = alas * 3

            binding.hasiluas.text = "$hasilLuas"
            binding.hasilKeliling.text = "$hasilKeliling"


        }
        return binding.root

    }


}
