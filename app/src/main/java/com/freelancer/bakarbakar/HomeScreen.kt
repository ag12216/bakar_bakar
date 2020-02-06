package com.freelancer.bakarbakar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.OnItemSelected
import com.freelancer.bakarbakar.Login.frag_HomeScreen
import com.freelancer.bakarbakar.Login.frag_podCast
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreen : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener,
    backToPage ,View.OnClickListener{

    @BindView(R.id.idBottomNavigation)
    lateinit var bottomNavigation: BottomNavigationView
    @BindView(R.id.idheaderView)
    lateinit var headerNavigation: View
    @BindView(R.id.container)
    lateinit var container: FrameLayout
    @BindView(R.id.idHeaderTextView)
    lateinit var headerTextView: TextView
    @BindView(R.id.idBackImageButton)
    lateinit var backButton: ImageButton
    //@BindView(R.id.idNestedScrollView) lateinit var nestedScrollView: ScrollView

    lateinit var menuButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        ButterKnife.bind(this)

        menuButton = headerNavigation.findViewById(R.id.idHambergur)
        bottomNavigation.itemIconTintList = null
        menuButton.setOnClickListener(this)
        bottomNavigation.setOnNavigationItemSelectedListener(this)
        createStartScreen()

    }

    private fun createStartScreen() {
        val homeScreen = frag_HomeScreen()
        homeScreen.delegate = this
        loadFragment(homeScreen)
    }

    @OnClick(R.id.idBackImageButton)
    internal fun didTapBackButton() {
        val fm = this.supportFragmentManager

        fm.popBackStack()
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {

        headerNavigation.visibility = View.VISIBLE
        headerTextView.visibility = View.GONE
        backButton.visibility = View.GONE

        when (p0.itemId) {

            R.id.idHome -> {
                createStartScreen()
            }

            R.id.idWifi -> {
                val playBack = frag_playBack()
                loadFragment(playBack)
            }

            R.id.idGallery -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.VISIBLE
                backButton.visibility = View.GONE
                headerTextView.text = "Subcategory"

                val subCategoryScreen = frag_SubCategory()
                subCategoryScreen.delegate = this
                loadFragment(subCategoryScreen)

            }

            R.id.idMusic -> {
                val screen1 = frag_Screen1()
                screen1.delegate = this
                loadFragment(screen1)
            }

            R.id.idNotes -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.VISIBLE
                backButton.visibility = View.VISIBLE
                headerTextView.text = "Contact us"

                val contactus = frag_contactUs()
                contactus.delegate = this
                loadFragment(contactus)

            }
        }

        return true
    }

    override fun updateTitle(str: String) {
        when (str) {

            "locateus" -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.VISIBLE
                backButton.visibility = View.VISIBLE
                headerTextView.text = "Locate us"
            }

            "review" -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.GONE
                backButton.visibility = View.GONE
            }

            "aboutus" -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.VISIBLE
                backButton.visibility = View.VISIBLE
                headerTextView.text = "About us"
            }

            "contactus" -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.VISIBLE
                backButton.visibility = View.VISIBLE
                headerTextView.text = "Contact us"
            }

            "music"->{
                headerNavigation.visibility = View.VISIBLE
                headerTextView.visibility = View.GONE
                backButton.visibility = View.GONE
            }

            "subcategory"->{
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.VISIBLE
                backButton.visibility = View.GONE
                headerTextView.text = "Subcategory"
            }

            "dashboard"->{
                headerNavigation.visibility = View.VISIBLE
                headerTextView.visibility = View.GONE
                backButton.visibility = View.GONE
            }
        }
    }

    override fun backToPage(str: String) {
        when (str) {
            "music" -> {
                val podCastCalendar = frag_podCast()
                podCastCalendar.delegate = this
                loadFragment(podCastCalendar)
            }

            "contact" -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.VISIBLE
                backButton.visibility = View.VISIBLE
                headerTextView.text = "Locate us"

                val locateus = frag_locateUs()
                locateus.delegate = this
                loadFragment(locateus)
            }

            "about" -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.VISIBLE
                backButton.visibility = View.VISIBLE
                headerTextView.text = "About us"
                val about = frag_abouUs()
                about.delegate = this
                loadFragment(about)
            }

            "review" -> {
                headerNavigation.visibility = View.GONE
                headerTextView.visibility = View.GONE
                backButton.visibility = View.GONE
                headerTextView.text = "Reviews"

                val review = frag_reviewS()
                review.delegate = this
                loadFragment(review)
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(container.id, fragment, "previous")
//        transaction.add(fragment,"previous")
        transaction.addToBackStack("previous")
        transaction.commit()
    }

    override fun onClick(v: View?) {
        if(v!!.id == menuButton.id){
            headerNavigation.visibility = View.GONE
            headerTextView.visibility = View.VISIBLE
            backButton.visibility = View.GONE
            headerTextView.text = "Subcategory"

            val subCategoryScreen = frag_SubCategory()
            subCategoryScreen.delegate = this
            loadFragment(subCategoryScreen)
        }
    }


}
