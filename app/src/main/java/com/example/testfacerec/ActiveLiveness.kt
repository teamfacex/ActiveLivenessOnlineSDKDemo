package com.example.testfacerec

import android.Manifest
import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import io.facex.liveness.Liveness
import io.facex.liveness.LivenessListener

class ActiveLiveness : AppCompatActivity(), LivenessListener {
    private lateinit var liveness: Liveness

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active_liveness)
        liveness = Liveness(this, R.id.main_holder)
        var start = this.findViewById<Button>(R.id.start)
        start.setOnClickListener {
            /*While before starting sdk function every time need to check storage & camera functions*/
            onCheckPermission()
        }
    }

    fun onCheckPermission() {
        Dexter.withActivity(this).withPermissions(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE).withListener(object : MultiplePermissionsListener {
            override fun onPermissionsChecked(p0: MultiplePermissionsReport?) {
                if (p0?.areAllPermissionsGranted()!!) {
                    liveness.Eyes = true
                    liveness.Smile = true
                    liveness.startLiveness()
                } else {
                    onCheckPermission();
                }
            }

            override fun onPermissionRationaleShouldBeShown(p0: MutableList<PermissionRequest>?, p1: PermissionToken?) {
            }

        }).check()
    }

    override fun livenessSuccess(p0: Boolean?, p1: Bitmap?) {
        var iv = findViewById<ImageView>(R.id.output)

        iv.setImageBitmap(p1)
    }


    override fun livenessError(p0: Boolean?, p1: String?) {
        Toast.makeText(this, p1, Toast.LENGTH_LONG)
    }
}



