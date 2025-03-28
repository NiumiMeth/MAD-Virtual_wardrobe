import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.madwardrobe.R

class TuteVideo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tutevideo)  // Replace with your layout file


        val videoView = findViewById<VideoView>(R.id.videoView)

        // Path to the video file in the raw folder
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.tutevideo)

        // Set the video URI to the VideoView
        videoView.setVideoURI(videoUri)

        // Start the video when it's prepared
        videoView.setOnPreparedListener {
            videoView.start()  // Start video playback
        }

        // Handle errors (if any)
        videoView.setOnErrorListener { mp, what, extra ->
            false  // Default error handling
        }
    }
}
