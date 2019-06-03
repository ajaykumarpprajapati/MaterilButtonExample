package india.ajay.materilbuttonexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private var elevatedButton: AppCompatButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView(){
        elevatedButton = findViewById(R.id.elevated_button)
        elevatedButton?.setOnClickListener {

        }
    }
}
