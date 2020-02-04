package com.freelancer.bakarbakar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.OnItemSelected
import com.freelancer.bakarbakar.Login.frag_HomeScreen
import com.freelancer.bakarbakar.Login.frag_podCast
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreen : AppCompatActivity(),BottomNavigationView.OnNavigationItemSelectedListener,backToPage {

    @BindView(R.id.idBottomNavigation) lateinit var bottomNavigation: BottomNavigationView
    @BindView(R.id.idheaderView) lateinit var headerNavigation: View
    @BindView(R.id.container) lateinit var container: FrameLayout
    @BindView(R.id.idHeaderTextView) lateinit var headerTextView: TextView

    lateinit var menuButton: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        ButterKnife.bind(this)

        menuButton = headerNavigation.findViewById(R.id.idHambergur)
        bottomNavigation.itemIconTintList = null
        bottomNavigation.setOnNavigationItemSelectedListener(this)
        createStartScreen()

    }

    private fun createStartScreen(){
        val homeScreen = frag_HomeScreen()
        loadFragment(homeScreen)
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {

        headerNavigation.visibility = View.VISIBLE
        headerTextView.visibility = View.GONE

        when(p0.itemId){

            R.id.idHome->{
                createStartScreen()
            }

            R.id.idWifi->{
                val playBack = frag_playBack()
                loadFragment(playBack)
            }

            R.id.idGallery->{
                headerNavigation.visibility = View.INVISIBLE
                headerTextView.visibility = View.VISIBLE
                headerTextView.text = "Subcategory"

                val subCategoryScreen = frag_SubCategory()
                loadFragment(subCategoryScreen)

            }

            R.id.idMusic->{
                val screen1 = frag_Screen1()
                screen1.delegate = this
                loadFragment(screen1)
            }

            R.id.idNotes->{
                headerNavigation.visibility = View.INVISIBLE
                headerTextView.visibility = View.VISIBLE
                headerTextView.text = "Contact us"

                val contactus = frag_contactUs()
                contactus.delegate = this
                loadFragment(contactus)

            }
        }

        return true
    }


    override fun backToPage(str: String) {
        when(str){
            "music"->{
                val podCastCalendar = frag_podCast()
                loadFragment(podCastCalendar)
            }

            "contact"->{
                headerNavigation.visibility = View.INVISIBLE
                headerTextView.visibility = View.VISIBLE
                headerTextView.text = "Locate us"

                val locateus = frag_locateUs()
                loadFragment(locateus)
            }

            "about"->{

                val about = frag_abouUs()
                loadFragment(about)
            }

            "review"->{
                headerNavigation.visibility = View.INVISIBLE
                headerTextView.visibility = View.VISIBLE
                headerTextView.text = "Reviews"

                val review = frag_reviewS()
                loadFragment(review)
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(container.id, fragment)
//        transaction.addToBackStack(null)
        transaction.commit()
    }


}
