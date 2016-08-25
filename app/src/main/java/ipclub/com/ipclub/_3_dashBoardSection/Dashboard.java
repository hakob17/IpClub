package ipclub.com.ipclub._3_dashBoardSection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ipclub.com.ipclub.R;
import ipclub.com.ipclub._2_changePasswordSection.ChangePasswordActivity;
import ipclub.com.ipclub._5_docsSection.DocsActivity;
import ipclub.com.ipclub._5_docsSection.DocsContent;
import ipclub.com.ipclub._6_classRoomSection.ClassRoomActivity;
import ipclub.com.ipclub.common.Auth;
import ipclub.com.ipclub._4_vocabularySection.Vocabulary;

public class Dashboard extends AppCompatActivity {

    private Auth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        auth = new Auth(this);
        auth.checkTokenDate();

        initView();

    }

    private void initView(){

    }

    public void logout(){
        finish();
        auth.logout();

    }

    public void goTo(View v){
        Intent show;
        switch (v.getId()){
            case R.id.vocabulary:
                 show = new Intent(this, Vocabulary.class);
                startActivity(show);

                break;
            case  R.id.classRoom:
                show = new Intent(this, ClassRoomActivity.class);
                startActivity(show);

                break;
            case  R.id.docs:
                show = new Intent(this, DocsActivity.class);
                startActivity(show);
                break;
            case R.id.settings:
                show=new Intent(this, ChangePasswordActivity.class);
                startActivity(show);
                finish();
                break;
        }
    }

}
