package com.prashant.mvpdaggerdemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.prashant.mvpdaggerdemo.utils.ConnectivityUtils;
import com.prashant.mvpdaggerdemo.utils.ValidationUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void testInternet() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        boolean isConnected = ConnectivityUtils.isConnectedToInternet(appContext);

        assertEquals(true, isConnected);
    }

    @Test
    public void validateEmail() throws Exception {

        boolean isValid = ValidationUtils.validateEmail("sadfjasdlfj@fks.com");

        assertEquals(true, isValid);
    }
}
