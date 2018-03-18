

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by yashas on 19/3/18.
 */

public class Assignment {
    final String BASE_URL = "https://developer.android.com/guide/components/intents-common.html";
    final String UTM_SOURCE = "utm_source";
    final String UTM_MEDIUM = "utm_medium";
    final String UTM_CAMPAIGN = "utm_campaign";
    private String source = "udacity";
    private String medium = "course";
    private String campaign = "android_basics#Phone";

    public URL buildUrl() {
        Uri buildUri = Uri.parse(BASE_URL).buildUpon()
                .appendQueryParameter(UTM_SOURCE, source)
                .appendQueryParameter(UTM_MEDIUM, medium)
                .appendQueryParameter(UTM_CAMPAIGN, campaign)
                .build();
        URL url = null;
        try {
            url = new URL(buildUri.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}

