package org.scribe.model;


import java.io.InputStream;
import org.scribe.model.OAuthConstants;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;
import org.scribe.builder.api.LiveApi;
import org.scribe.model.Verb;
import org.scribe.model.Response;
import java.lang.String;
import java.util.Scanner;
import org.scribe.model.Verifier;
import java.lang.System;
import org.junit.Test;
import org.scribe.builder.ServiceBuilder;

public class OAuthRequestGenTest {
	/**
	 * Test method for the class org.scribe.model.OAuthRequest
	 */
	

	/**
	 * Test method for the class org.scribe.model.OAuthRequest
	 */
	@Test
	public void testOAuthRequest37() throws Exception {
		String var28 = "https://api.kaixin001.com/users/me.json";
		OAuthRequest var29 = new OAuthRequest(Verb.GET, var28);
		var29.send();
		var29.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		var29.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		var29.addOAuthParameter(OAuthConstants.CALLBACK,
				"http://example/callback");
		var29.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
	}

	/**
	 * Test method for the class org.scribe.model.OAuthRequest
	 */
	@Test
	public void testOAuthRequest38() throws Exception {
		String var32 = "http://api.tumblr.com/v2/user/info";
		OAuthRequest var33 = new OAuthRequest(Verb.GET, var32);
		var33.send();
		var33.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		var33.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		var33.addOAuthParameter(OAuthConstants.CALLBACK,
				"http://example/callback");
		var33.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
	}

	/**
	 * Test method for the class org.scribe.model.OAuthRequest
	 */
	@Test
	public void testOAuthRequest39() throws Exception {
		String var36 = "http://api.flickr.com/services/rest/";
		OAuthRequest var37 = new OAuthRequest(Verb.GET, var36);
		var37.addOAuthParameter(OAuthConstants.TIMESTAMP, "123456");
		var37.addOAuthParameter(OAuthConstants.CONSUMER_KEY, "AS#$^*@&");
		var37.addOAuthParameter(OAuthConstants.CALLBACK,
				"http://example/callback");
		var37.addOAuthParameter(OAuthConstants.SIGNATURE, "OAuth-Signature");
		var37.send();
	}
}