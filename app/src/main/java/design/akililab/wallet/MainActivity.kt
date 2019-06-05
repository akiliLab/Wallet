package design.akililab.wallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import design.akililab.wallet.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_layout, MainFragment.newInstance())
                .commitNow()
        }
    }

}
