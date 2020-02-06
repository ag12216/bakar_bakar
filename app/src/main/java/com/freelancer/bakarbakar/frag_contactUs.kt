package com.freelancer.bakarbakar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.Unbinder

/**
 * A simple [Fragment] subclass.
 */
class frag_contactUs : Fragment() {


    private var unbinder: Unbinder?= null

    lateinit var delegate: backToPage

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.frag_contact_us, container, false)
        unbinder = ButterKnife.bind(this,view)
        return view
    }


    override fun onResume() {
        super.onResume()
        delegate.updateTitle("contactus")
    }

    @OnClick(R.id.idSubmitButton)
    internal fun didTapSubmitButton(){
        delegate.backToPage("contact")
    }

    @OnClick(R.id.idFacebook)
    internal fun didTapFacebookButton(){
        delegate.backToPage("about")
    }

    @OnClick(R.id.idGoogle)
    internal fun didTapGoogleButton(){
        delegate.backToPage("review")
    }

    @OnClick(R.id.idInstagram)
    internal fun didTapInstaButton(){
        delegate.backToPage("contact")
    }

    @OnClick(R.id.idTwitter)
    internal fun didTapTwitterButton(){
        delegate.backToPage("review")
    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }


}
