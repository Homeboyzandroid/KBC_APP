package loise.liveo.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.Twitter;
import io.fabric.sdk.android.Fabric;
import loise.kbc.navigationviewpagerliveo.R;


public class TwitterApplication extends AppCompatActivity {
    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "CtXW8KLLGFfQTqWlrdoK7oUbR";
    private static final String TWITTER_SECRET = "xq0mHEOlOpBVfr1uyvehFF1dt05YIAPxCHav0diBfr99QuBXrL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.activity_timeline_kbc);


    }





}
