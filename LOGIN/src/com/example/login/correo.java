package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class correo extends ActionBarActivity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correo);              
        
        Button btnenviar = (Button) findViewById(R.id.enviar);
        
        btnenviar.setOnClickListener(new OnClickListener() {                      
						@Override
						public void onClick(View v) {
							
							

							EditText txtcorreo = (EditText) findViewById(R.id.correo);
							EditText txtasunto = (EditText) findViewById(R.id.txtasunto);
					        EditText txtmensaje1 = (EditText) findViewById(R.id.txtmensaje1);					        
					        
					        
					       
                            Intent itSend = new Intent(android.content.Intent.ACTION_SEND);
                            
                            
                            itSend.setType("plain/text");
                            
                           
                            itSend.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ txtcorreo.getText().toString()});                            
                            itSend.putExtra(android.content.Intent.EXTRA_SUBJECT, txtasunto.getText().toString());
                            itSend.putExtra(android.content.Intent.EXTRA_TEXT, txtmensaje1.getText());
                            
                            
                            startActivity(itSend);

						}
                });
	}}