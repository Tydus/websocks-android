package org.tydus.websocket;

import org.tydus.websocket.R;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;

public class MainActivity extends PreferenceActivity {
	
	CheckBoxPreference switcher;
	EditTextPreference server;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.setTitle("Ninja隧道");
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference);
		
		switcher = (CheckBoxPreference) findPreference("status");
		server = (EditTextPreference) findPreference("server");
		
		switcher.setOnPreferenceChangeListener(new OnPreferenceChangeListener () {

			public boolean onPreferenceChange(Preference preference,
					Object newValue) {
				// TODO Auto-generated method stub
				return true;
			}
			
		});
		
		server.setOnPreferenceChangeListener(new OnPreferenceChangeListener () {

			public boolean onPreferenceChange(Preference preference,
					Object newValue) {
				// TODO Auto-generated method stub
				return true;
			}
			
		});
	}

}
