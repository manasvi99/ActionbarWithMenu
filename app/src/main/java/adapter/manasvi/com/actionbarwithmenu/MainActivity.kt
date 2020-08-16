package adapter.manasvi.com.actionbarwithmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.menu1->{
                Toast.makeText(applicationContext,"first menu", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menu2->{
                Toast.makeText(applicationContext,"second menu",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menu3->{
                Toast.makeText(applicationContext,"third menu",Toast.LENGTH_LONG).show()
                return true
            }
            else->super.onOptionsItemSelected(item)
        }
        return true
    }
}
