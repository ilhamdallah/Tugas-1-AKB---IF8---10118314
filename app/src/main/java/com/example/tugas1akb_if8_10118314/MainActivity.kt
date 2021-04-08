package com.example.tugas1akb_if8_10118314

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener {
    /*
    NIM             : 10118314
    Nama            : Moch Rivally Ilham Bintang
    Kelas           : IF8
    Matakuliah      : Aplikasi Komputasi Bergerak

    6 april 2021 : Membuat aktivity home sebagai tampilan utama dari aplikasi
    6 april 2021 : Mengganti warna primer, mengganti background semua fragment
    6 april 2021 : Merombak ulang activity home, di refactor untuk mengubah nama agar mempermudah dan merombak struktru fragment serta buttom navigation
    6 april 2021 : Menyusun ulang project dan merombak ulang file didalamnya, menghapus drawable file dan layout yang tidak dibutuhkan serta merapikan codingan

     */
    private var navViewHome: BottomNavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navViewHome = findViewById(R.id.nav_view)
        setupBottomNavigation(savedInstanceState)
    }

    fun buka_map(view: View?) {
        val map = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.google.co.id/maps/place/Parit+Baru,+Selakau,+Kabupaten+Sambas,+Kalimantan+Barat+79452/@1.0633209,108.9726288,19z/data=!3m1!4b1!4m5!3m4!1s0x31e37b6816391639:0x4687cc312983636f!8m2!3d1.0634925!4d108.973002")
        )
        startActivity(map)
    }

    fun buka_ig(view: View?) {
        val instagram = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.instagram.com/atmaiqbal_/")
        )
        startActivity(instagram)
    }

    fun buka_blog(view: View?) {
        val blog = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://ksatrialegidia.wordpress.com")
        )
        startActivity(blog)
    }

    fun buka_email(view: View?) {
        val blog =
            Intent(Intent.ACTION_VIEW, Uri.parse("mailto:iqbalatma@gmail.com"))
        startActivity(blog)
    }

    fun buka_dialog(view: View?) {
        val dialogFragment = DialogFragment()
        dialogFragment.show(supportFragmentManager, "DialogFragment")
    }

    private fun setupBottomNavigation(savedInstanceState: Bundle?) {
        val onNavigationItemSelectedListener =
            label@ BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
                val fragment: Fragment
                when (item.itemId) {
                    R.id.home_menu -> {
                        fragment = HomeFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.container_layout,
                                fragment,
                                fragment.javaClass.simpleName
                            )
                            .commit()
                        return@label true
                    }
                    R.id.account_menu -> {
                        fragment = AccountFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.container_layout,
                                fragment,
                                fragment.javaClass.simpleName
                            )
                            .commit()
                        return@label true
                    }
                    R.id.gallery_menu -> {
                        fragment = GalleryFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.container_layout,
                                fragment,
                                fragment.javaClass.simpleName
                            )
                            .commit()
                        return@label true
                    }
                    R.id.daily_menu -> {
                        fragment = DailyFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.container_layout,
                                fragment,
                                fragment.javaClass.simpleName
                            )
                            .commit()
                        return@label true
                    }
                    R.id.music_menu -> {
                        fragment = MusicFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.container_layout,
                                fragment,
                                fragment.javaClass.simpleName
                            )
                            .commit()
                        return@label true
                    }
                }
                false
            }
        navViewHome!!.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        if (savedInstanceState == null) {
            navViewHome!!.selectedItemId = R.id.home_menu
        }
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        return false
    }
}