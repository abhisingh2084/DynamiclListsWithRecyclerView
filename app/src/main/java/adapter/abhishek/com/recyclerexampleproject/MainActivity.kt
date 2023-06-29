package adapter.abhishek.com.recyclerexampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf<Language>(
            Language(R.drawable.php),
            Language(R.drawable.python),
            Language(R.drawable.rprograming),
            Language( R.drawable.angular),
            Language(R.drawable.nodejs),
            Language(R.drawable.cplus),
            Language(R.drawable.net),
            Language( R.drawable.java),
            Language(R.drawable.php)

        )

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = languageAdapter(this, images)
    }
}
