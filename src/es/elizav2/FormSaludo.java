package es.elizav2;

import java.net.URL;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
 
public class FormSaludo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        
       
        Bundle bundle = this.getIntent().getExtras();
        
        //https://www.guzmanfotografo.com/moodle/login/token.php?username=USERNAME&password=PASSWORD&service=SERVICESHORTNAME
        
        Log.d(getClass().getName(), "He llega hasta aqui");
		
        String url = "http://www.guzmanfotografo.es/moodle/login/token.php?username=" + bundle.getString("NOMBRE") + "&password=" + bundle.getString("PASS") + "&service=moodle_mobile_app";

        WebServices get = new WebServices(url);
        get.execute();
        
        TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
        txtSaludo.setText("Usuario: " + bundle.getString("NOMBRE") + "Contrase–a: " + bundle.getString("PASS"));
       }
}
