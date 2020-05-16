package arb.test.alertdialog

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        alertDialog 1
        alertDialog_1.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("AlertDialog 1")
                .setMessage("Do you want to leave?")
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,"No",Toast.LENGTH_SHORT).show()
                })
                .create()
                .show()

        }

//        alertDialog 2
        alertDialog_2.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Color AlertDialog 2")
                .setItems(R.array.data_name , DialogInterface.OnClickListener { dialog, which ->
                    when(which){

                        0 -> alertDialog_2.setTextColor(Color.RED)
                        1 -> alertDialog_2.setTextColor(Color.GREEN)
                        2 -> alertDialog_2.setTextColor(Color.BLUE)

                    }
                })
                .create()
                .show()

        }

//        alertDialog 3
        alertDialog_3.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("AlertDialog 3")
                .setView(R.layout.custom_alert)
                .setPositiveButton("Login", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,"Login...",Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()
                })
                .create()
                .show()
        }
    }
}
