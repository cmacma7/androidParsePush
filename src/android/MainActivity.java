package org.apache.cordova.core;import org.apache.cordova.*;import android.app.Activity;import android.os.Bundle;import com.parse.Parse;import com.parse.ParseInstallation;import com.parse.PushService;public class MainActivity extends DroidGap{	@Override	public void onCreate(Bundle savedInstanceState) {		super.onCreate(savedInstanceState);		Parse.initialize(this, "hagjJqINpGMihPhkIdP6OoIO7MFaT8PuMrLynbt5", "26I7kNgRDXOcajqCeGKzPGKTRKvoZ82fdBXT8XjC");		PushService.setDefaultPushCallback(this, MainActivity.class);		PushService.subscribe(this, "MainActivity", MainActivity.class);		ParseInstallation.getCurrentInstallation().saveInBackground();	}}