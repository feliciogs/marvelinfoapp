package fegssp.app.io.marvelinfoapp.util

import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.time.Duration

fun Fragment.toast(message:String, duration:Int= Toast.LENGTH_LONG){
    Toast.makeText(
        requireContext(),
        message,
        duration).show()
}

fun View.show(){
    visibility = View.VISIBLE
}


fun View.hide(){
    visibility = View.INVISIBLE
}

fun String.limitSize(textLimit:Int):String{
    if(this.length > textLimit){
        val firstCharacter = 0
        return "${this.substring(firstCharacter,textLimit)}..."
    }
    return this
}