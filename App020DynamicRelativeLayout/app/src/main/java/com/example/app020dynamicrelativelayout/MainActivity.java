package com.example.app020dynamicrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    TextView tvInfo,tvUserName,tvPassword;
    EditText etUserName ,etPassword;
    Button btnSignIn;
    int  idTvInfo = 1 , idTvUserName = 2 , idTvPassword = 3;
    int idEtUserName = 4 , idEtPassword = 5;

    RelativeLayout.LayoutParams paramsRelativeLayout;

    RelativeLayout.LayoutParams paramsTvInfo;
    RelativeLayout.LayoutParams paramsTvUserName;
    RelativeLayout.LayoutParams paramsTvPassword;

    RelativeLayout.LayoutParams paramsEtUsername;
    RelativeLayout.LayoutParams paramsEtPassword;

    RelativeLayout.LayoutParams paramsBtnSignIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializes();

        createRelativeLayout();

        createTvInfo();
        createTvUserName();
        createTvPassword();

        createEtUserName();
        createEtPassword();

        createBtnSignIn();

        addViewsRelativeLayout();

        setContentView(relativeLayout);


    }

    private void initializes() {

        relativeLayout = new RelativeLayout(this);

        tvInfo = new TextView(this);
        tvUserName = new TextView(this);
        tvPassword = new TextView(this);

        etUserName = new EditText(this);
        etPassword = new EditText(this);

        btnSignIn = new Button(this);
    }



    private void createRelativeLayout() {

        paramsRelativeLayout = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        relativeLayout.setLayoutParams(paramsRelativeLayout);

    }

    private void createTvInfo() {

        paramsTvInfo = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT , RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        paramsTvInfo.addRule(RelativeLayout.CENTER_HORIZONTAL);

        tvInfo.setText("Lütfen oturum açınız");
        tvInfo.setPadding(20,150,20,20);
        tvInfo.setTextSize(30);
        tvInfo.setId(idTvInfo);

    }

    private void createTvUserName() {

        paramsTvUserName = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT , RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        paramsTvUserName.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        paramsTvUserName.addRule(RelativeLayout.BELOW,idTvInfo);

        tvUserName.setText("Kullanıcı adı :");
        tvUserName.setPadding(40,80,20,20);
        tvUserName.setTextSize(22);
        tvUserName.setId(idTvUserName);

    }

    private void createTvPassword() {

        paramsTvPassword = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT , RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        paramsTvPassword.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        paramsTvPassword.addRule(RelativeLayout.BELOW,idTvUserName);

        tvPassword.setText("Parola :");
        tvPassword.setPadding(180,10,20,20);
        tvPassword.setTextSize(22);
        tvPassword.setId(idTvPassword);

    }

    private void createEtUserName() {

        paramsEtUsername = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT , RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        paramsEtUsername.addRule(RelativeLayout.RIGHT_OF,idTvUserName);
        paramsEtUsername.addRule(RelativeLayout.BELOW,idTvInfo);

        etUserName.setPadding(40,100,20,20);

        etUserName.setId(idEtUserName);



    }

    private void createEtPassword() {

        paramsEtPassword = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT , RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        paramsEtPassword.addRule(RelativeLayout.RIGHT_OF,idTvPassword);
        paramsEtPassword.addRule(RelativeLayout.BELOW,idEtUserName);



        etPassword.setPadding(40,10,20,20);

        etPassword.setId(idEtPassword);


    }

    private void createBtnSignIn() {

        paramsBtnSignIn = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT , RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        paramsBtnSignIn.addRule(RelativeLayout.BELOW,idEtPassword);
        paramsBtnSignIn.addRule(RelativeLayout.CENTER_HORIZONTAL);

        btnSignIn.setText("Oturum Aç");


    }



    private void addViewsRelativeLayout() {

        relativeLayout.addView(tvInfo , paramsTvInfo);
        relativeLayout.addView(tvUserName , paramsTvUserName);
        relativeLayout.addView(tvPassword , paramsTvPassword);

        relativeLayout.addView(etUserName , paramsEtUsername);
        relativeLayout.addView(etPassword , paramsEtPassword);

        relativeLayout.addView(btnSignIn , paramsBtnSignIn);


    }
}