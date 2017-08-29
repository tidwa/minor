package com.mta.genseva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity {
EditText Name , Phoneno , HouseNo, Ward, Street , Password ;
    RadioButton want , lend;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Name=(EditText)findViewById(R.id.editText3);
        Phoneno=(EditText)findViewById(R.id.editText4);
        HouseNo=(EditText)findViewById(R.id.editText5);
        Ward=(EditText)findViewById(R.id.ward);
        Street=(EditText)findViewById(R.id.street);
        Password=(EditText)findViewById(R.id.editText7);
        want=(RadioButton)findViewById(R.id.radiobutton1);

        lend=(RadioButton)findViewById(R.id.radiobutton2);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registration();
            }
        });
    }
    public void Registration()
    {
        //String status=" ";
        httpconnection obj=new httpconnection();
        List<BasicNameValuePair> nvps = new ArrayList<BasicNameValuePair>();
        nvps.add(new BasicNameValuePair("Name",Name.getText().toString()));
        nvps.add(new BasicNameValuePair("PhoneNo",Phoneno.getText().toString()));
        nvps.add(new BasicNameValuePair("HouseNo",HouseNo.getText().toString()));
        nvps.add(new BasicNameValuePair("Ward",Ward.getText().toString()));
        nvps.add(new BasicNameValuePair("Street",Street.getText().toString()));
        nvps.add(new BasicNameValuePair("Password", Password.getText().toString()));


        final String result=obj.get_httpvalue("http//192.168.56.1:85/GenSeva/register.php", nvps,getApplicationContext());
        System.out.print(result);

    }
}
