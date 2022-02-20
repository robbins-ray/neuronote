package app.neuronote;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class Notifications extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_notifications_preferences, rootKey);
    }
}