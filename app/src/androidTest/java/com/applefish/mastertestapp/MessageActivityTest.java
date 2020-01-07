package com.applefish.mastertestapp;
import android.annotation.TargetApi;
        import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

        import junit.framework.Assert;

@TargetApi(8)
public class MessageActivityTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public MessageActivityTest() {
        super(MessageActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testHelloWorld() throws Exception {
//        Assert.assertTrue(solo.searchText("Hello world!"));
    }
    public void testCreatWaterMark() throws Exception {
//        // check that we have the right activity
//        solo.assertCurrentActivity("wrong activity", LoginActivity.class);
//
//        // Click a button which will start a new Activity
//        // Here we use the ID of the string to find the right button
//        solo.clickOnButton(solo
//                .getString(com.applefish.mastertestapp.R.id.button));
        // assert that the current activity is the SimpleListActivity.class
        solo.assertCurrentActivity("wrong activity", MessageActivity.class);

//        EditText phoneNr=(EditText) solo.getView(com.applefish.mastertestapp.R.id.phoneNr);
//        EditText message=(EditText) solo.getView(com.applefish.mastertestapp.R.id.message);
        EditText phoneNr=(EditText) solo.getEditText(0);
        EditText message=(EditText) solo.getEditText(1);
        solo.enterText(phoneNr,"12345");
        solo.enterText(message,"ABC");

        solo.clickOnButton("Send");
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}