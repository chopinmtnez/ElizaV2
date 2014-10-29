package es.elizav2;

import java.net.URL;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;


class WebServices extends AsyncTask<Void, String, String> {

	private String url;
	
	public WebServices(String url){
		this.url=url;
	}
    @Override
    protected String doInBackground(Void... params) {
    	
        HttpClient Client = new DefaultHttpClient();
            try
            {
                        // Create Request to server and get response
                          HttpGet httpget = new HttpGet(url);
                         ResponseHandler<String> responseHandler = new BasicResponseHandler();
                         String SetServerString = Client.execute(httpget, responseHandler);
                         
                      
                          // Show response on activity 
                     	Log.d(getClass().getName(), "Todo OK" + SetServerString);
                     	
                        return SetServerString;


            }
    		catch(Exception ex)
    		{
    			Log.d(getClass().getName(), "FAIL1: " +ex);
    		}
           return null;
    }
}