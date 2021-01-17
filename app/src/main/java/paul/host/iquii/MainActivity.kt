package paul.host.iquii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import paul.host.iquii.ui.Navigation
import paul.host.iquii.ui.image.ImageFragment
import paul.host.iquii.ui.main.MainFragment

class MainActivity : AppCompatActivity(), Navigation {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    override fun goToImageFragment(url: String) {
        if (!supportFragmentManager.fragments.contains(ImageFragment.instance))
            supportFragmentManager.beginTransaction()
                .add(R.id.container, ImageFragment.getInstance(url))
                .commit()
        else ImageFragment.getInstance(url)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.fragments.contains(ImageFragment.instance))
            supportFragmentManager.beginTransaction()
                .remove(ImageFragment.instance)
                .commit()
        else super.onBackPressed()
    }
}