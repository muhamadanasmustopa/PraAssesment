package org.d3if4026.prasassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_segitiga.*
import kotlinx.android.synthetic.main.fragment_segitiga.btn_hasil
import org.d3if4026.prasassesment.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {

    var hasil = 0.0
    var hasilKeliling = 0.0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_persegi_panjang, container, false)
        binding.btnHasil.setOnClickListener {
            var nilaiPanjang = binding.panjang.text.toString().toDouble()
            var nilaiLebar = binding.lebar.text.toString().toDouble()

            hasil = nilaiPanjang * nilaiLebar
             hasilKeliling = nilaiPanjang * nilaiLebar * 2

            binding.hasilJumlahLuas.text = "$hasil"
            binding.hasilJumlahKeliling.text = "$hasilKeliling"

        }


        return binding.root
    }


    override fun onSaveInstanceState(outState: Bundle) {

        outState.putDouble("hasil_key", hasil)
        outState.putDouble("hasilKeliling_key", hasilKeliling)
        super.onSaveInstanceState(outState)


    }


}
