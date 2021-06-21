package com.example.testfacerec;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//public class MainActivity extends AppCompatActivity implements onFaceRecognition {
public class MainActivity extends AppCompatActivity {

 /*   Button new_user, search;
    List<Users> usersList = new ArrayList<>();
    FaceRecongintion faceRecongintion;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   /*     new_user = findViewById(R.id.new_user);
        search = findViewById(R.id.search);

        faceRecongintion = new FaceRecongintion(this, R.id.main_view, this);


        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermission(0);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermission(1);
            }
        });

    }

    private void checkPermission(int type) {
        Dexter.withActivity(MainActivity.this)
                .withPermissions(
                        Manifest.permission.CAMERA,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                ).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport report) {
                if (report.areAllPermissionsGranted()) {
                    final List<String> vectors = new ArrayList<>();
                    for (int i = 0; i < usersList.size(); i++) {
                        final String[] vector = {usersList.get(i).getVector()};
                        vectors.add(vector[0]);
                    }
                    if (type == 0) {
                        faceRecongintion.FaceRegistrtion();
                    }if (type==1){
                        for (int i = 0; i < usersList.size(); i++) {
                            final String[] vector = {usersList.get(i).getVector()};
                            vectors.add(vector[0]);
                        }
                        faceRecongintion.setVectors(vectors);
                        faceRecongintion.FaceSearch();
                    }

                } else {
                    checkPermission(type);
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {

            }
        }).check();
    }

    @Override
    public void onSuccess(String vector, Bitmap bitmap) {
        String user_photo = convertBitmapToBase64(bitmap);


//        Log.e("vector", vector);

        Users users = new Users();
        Users user1 = new Users();
        users.setName("Bachu mahesh" + bitmap.toString());
        users.setEmpid("emp1");
        user1.setEmpid("emp1");
        user1.setUserphoto(user_photo);
        user1.setVector(vector);
        users.setImage_url("empty");
        users.setDirty("false");
        usersList.add(users);
        Toast.makeText(MainActivity.this, "onReg success" , Toast.LENGTH_LONG);
    }

    @Override
    public void onError(String s) {
        Toast.makeText(MainActivity.this, "onReg Error" + s, Toast.LENGTH_LONG);
    }

    @Override
    public void onSearchSuccess(int i, String s, Bitmap bitmap) {
        Toast.makeText(MainActivity.this, "onSearchSuccess " + i, Toast.LENGTH_LONG);
    }

    @Override
    public void onSearchError(String s) {
        Toast.makeText(MainActivity.this, "onSearchError " + s, Toast.LENGTH_LONG);
    }

    private String convertBitmapToBase64(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return Base64.encodeToString(byteArray, Base64.DEFAULT);
    }
*/
}