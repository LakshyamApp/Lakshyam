package com.santhi.lakshyam.onbording.ui

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.ramotion.paperonboarding.PaperOnboardingFragment
import com.ramotion.paperonboarding.PaperOnboardingPage
import com.santhi.lakshyam.R


class PaperOnBordingActivity : AppCompatActivity() {
    private var fragmentManager: FragmentManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper_on_bording)
        fragmentManager = supportFragmentManager

        // new instance is created and data is took from an
        // array list known as getDataonborading
        val paperOnboardingFragment = PaperOnboardingFragment.newInstance(
            dataforOnboarding
        )
        val fragmentTransaction = fragmentManager!!.beginTransaction()

        // fragmentTransaction method is used
        // do all the transactions or changes
        // between different fragments
        fragmentTransaction.add(R.id.frame_layout, paperOnboardingFragment)

        // all the changes are committed
        fragmentTransaction.commit()
    }

    private val dataforOnboarding: ArrayList<PaperOnboardingPage>
        private get() {

            // the first string is to show the main title ,
            // second is to show the message below the
            // title, then color of background is passed ,
            // then the image to show on the screen is passed
            // and at last icon to navigate from one screen to other
            val source = PaperOnboardingPage(
                "Join clubs",
                "Expand your network and knowledge base by joining vibrant clubs",
                Color.parseColor("#ffffff"),
                R.drawable.welcome1,
                R.drawable.pearchat
            )
            val source1 = PaperOnboardingPage(
                "Personalized Mentorship",
                "Access Mentorship from Google and Amazon Experts Through Live Chats",
                Color.parseColor("#22eaaa"),
                R.drawable.welcome2,
                R.drawable.expertsicon
            )
            val source2 = PaperOnboardingPage(
                "Earn Rewards",
                "Get rewards by submitting boring assignments",
                Color.parseColor("#ee5a5a"),
                R.drawable.welcome3,
                R.drawable.reward
            )

            // array list is used to store
            // data of onbaording screen
            val elements = ArrayList<PaperOnboardingPage>()

            // all the sources(data to show on screens)
            // are added to array list
            elements.add(source)
            elements.add(source1)
            elements.add(source2)
            return elements
        }
}
