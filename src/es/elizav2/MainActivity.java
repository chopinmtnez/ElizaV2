package es.elizav2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

	public class MainActivity extends Activity {
		 
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        
	        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
	        final EditText txtPass = (EditText)findViewById(R.id.TxtPass);
	        final Button btnEntrar = (Button)findViewById(R.id.BtnEntrar);
	        
	        //Click
	        btnEntrar.setOnClickListener(new OnClickListener(){
	        	@Override
	        	public void onClick(View v){
	        		Intent intent = new Intent(MainActivity.this,FormSaludo.class);
	        		Bundle b = new Bundle();
	        		b.putString("NOMBRE", txtNombre.getText().toString());
	        		b.putString("PASS", txtPass.getText().toString());
	        		intent.putExtras(b);
	        		startActivity(intent);
	        	}
	        });
	    }
	 
	}
