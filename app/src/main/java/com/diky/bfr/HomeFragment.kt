package com.diky.bfr

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private lateinit var dataList: ArrayList<Data>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Inisialisasi ArrayList
        dataList = ArrayList()

        // Menambahkan data ke dalam ArrayList
        dataList.add(Data("AntMan", R.drawable.java, "Pada umumnya Java dipakai untuk aplikasi di smartphone, aplikasi desktop, dan pengembangan situs."))
        dataList.add(Data("Image 2", R.drawable.python,"Bahasa pemrograman yang satu ini sudah berkembang sejak tahun 1980-an dan hingga kini masih banyak dibutuhkan oleh para programer, terutama untuk melakukan coding secara dinamis."))
        dataList.add(Data("Captain America", R.drawable.javascript,"ada juga bahasa pemrograman yakni JavaScript yang cukup populer digunakan untuk mengelola website. Saking populernya, hampir 97% situs di seluruh dunia menggunakan bahasa pemrograman JavaScript."))
        dataList.add(Data("doctor Streng", R.drawable.html, "HTML (HyperText Markup Language) adalah sebuah bahasa pemrograman markup yang digunakan untuk membuat halaman web, sehingga dapat menampilkan berbagai informasi yang dibutuhkan di dalam sebuah browser internet"))
        dataList.add(Data("Gamora", R.drawable.php,"PHP atau PHP Hypertext Preprocessor adalah bahasa pemrograman yang juga banyak digunakan saat ini. PHP sering dipakai untuk membuat website yang dinamis, meskipun tidak menutup kemungkinan digunakan juga untuk pemakaian yang lain. PHP biasanya berjalan pada sistem operasi Linux, tapi juga bisa dijalankan dengan hosting di Windows."))
        dataList.add(Data("Gamora", R.drawable.asp,"Active Server Pages atau ASP adalah salah satu bahasa pemrograman website untuk menciptakan halaman website yang dinamis."))
        dataList.add(Data("Gamora", R.drawable.css,"CSS atau Cascading Style Sheets adalah bahasa stylesheet yang digunakan untuk mengatur tampilan dokumen yang ditulis dalam bahasa markup."))
        dataList.add(Data("Gamora", R.drawable.perl,"Perl adalah bahasa pemrograman mesin dengan sistem operasi Unix, seperti SunOS, Linux, BSD, dan HP-UX."))
        dataList.add(Data("Gamora", R.drawable.xml,"Extensible Markup Language atau disebut juga XML adalah bahasa markup serbaguna yang direkomendasikan oleh World Wide Web Consortium (W3C) untuk mendeskripsikan berbagai macam data."))
        dataList.add(Data("Gamora", R.drawable.wml,"Wireless Markup Language atau disingkat WML adalah bahasa pemrograman yang digunakan dalam aplikasi berbasis XML (Extensible Markup Language)."))


        // Menambahkan adapter ke RecyclerView
        adapter = MyAdapter(dataList)
        recyclerView.adapter = adapter

        return view
    }
    companion object{
        val INTENT_PARCELABLE = "OBJECK INTENT"
    }
}
