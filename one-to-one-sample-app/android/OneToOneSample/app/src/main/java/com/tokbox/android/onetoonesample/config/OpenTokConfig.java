package com.tokbox.android.onetoonesample.config;

public class OpenTokConfig {

    // *** Fill the following variables using your own Project info from the OpenTok dashboard  ***
    // ***                      https://dashboard.tokbox.com/projects                           ***
    // Replace with a generated Session ID
    public static final String SESSION_ID = "";
    // Replace with a generated token (from the dashboard or using an OpenTok server SDK)
    public static final String TOKEN = "";
    // Replace with your OpenTok API key
    public static final String API_KEY = "";

    // Subscribe to a stream published by this client. Set to false to subscribe
    // to other clients' streams only.
    public static final boolean SUBSCRIBE_TO_SELF = false;

    // For internal use only. Please do not modify or remove this code.
    public static final String LOGGING_BASE_URL = "https://hlg.tokbox.com/prod/logging/ClientEvent";
    public static final String LOG_ACTION = "one-to-one-sample-app";
    public static final String LOG_VARIATION = "";
    public static final String LOG_CLIENT_VERSION = "android-vsol-1.0.0";

}