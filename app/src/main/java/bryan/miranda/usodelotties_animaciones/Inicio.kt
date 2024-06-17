package bryan.miranda.usodelotties_animaciones

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imgEnviar = findViewById<LottieAnimationView>(R.id.imgEnviar)
        val btnAnimar = findViewById<Button>(R.id.btnAnimar)

        imgEnviar.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator) {
                //
            }

            override fun onAnimationEnd(p0: Animator) {
                imgEnviar.progress = 0f
            }

            override fun onAnimationCancel(p0: Animator) {
                //
            }

            override fun onAnimationRepeat(p0: Animator) {
               //
            }

        })

        btnAnimar.setOnClickListener {
            imgEnviar.playAnimation()
        }
        imgEnviar.setOnClickListener {
            imgEnviar.playAnimation()
        }
    }


}