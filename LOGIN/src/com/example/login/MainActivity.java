package com.example.login;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	
private Button btnenviar;
	
protected void onCreate(Bundle savedInstanceState){		
super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.btnenviar=(Button)findViewById(R.id.btnIngresar);
		
	

	}
	
	
	public void btnIngresarOnclick(View v){
		String txtUsuario =((EditText) findViewById(R.id.txtUsuario)).getText().toString();
		String txtpassword =((EditText) findViewById(R.id.txtpassword)).getText().toString();		
		if(txtUsuario.equals("root")&& txtpassword.equals("moviles")){
			
			Intent btnIngresar =new Intent(MainActivity.this,correo.class);
			startActivity (btnIngresar);
		}
		
		else{
			Toast.makeText(getApplicationContext(), "Usuario o Contraseņa Incorrectos", Toast.LENGTH_SHORT).show();
		}
	}
	
		
    /*@Override
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
    }
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
	
