package com.tencentcloudapi.common;

import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import okhttp3.Authenticator;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

/**
 * Unit tests for the proxy authentication setup in {@link AbstractClient}.
 *
 * <p>Regression coverage for the okhttp 3.x -> 4.x upgrade: okhttp 4's
 * {@code Credentials.basic(username, password)} rejects a null password with an NPE,
 * so {@code AbstractClient.trySetProxy} now falls back to an empty password when the
 * profile only configures a proxy username.
 */
public class AbstractClientProxyAuthTest {

    /**
     * Minimal concrete subclass: AbstractClient declares no abstract methods, so an empty
     * subclass is enough to instantiate it. The constructor performs no network I/O.
     */
    private static final class TestClient extends AbstractClient {
        TestClient(ClientProfile profile) {
            super("cvm.tencentcloudapi.com", "2017-03-12",
                    new Credential("secret-id", "secret-key"), "ap-guangzhou", profile);
        }
    }

    private static ClientProfile proxyProfile(String username, String password) {
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setProxyHost("127.0.0.1");
        httpProfile.setProxyPort(8080);
        if (username != null) {
            httpProfile.setProxyUsername(username);
        }
        if (password != null) {
            httpProfile.setProxyPassword(password);
        }
        ClientProfile profile = new ClientProfile();
        profile.setHttpProfile(httpProfile);
        return profile;
    }

    private static OkHttpClient extractOkHttpClient(AbstractClient client) throws Exception {
        Field connField = AbstractClient.class.getDeclaredField("httpConnection");
        connField.setAccessible(true);
        HttpConnection conn = (HttpConnection) connField.get(client);
        Field clientField = HttpConnection.class.getDeclaredField("client");
        clientField.setAccessible(true);
        return (OkHttpClient) clientField.get(conn);
    }

    private static Response fakeProxyChallenge() {
        Request request = new Request.Builder()
                .url("https://cvm.tencentcloudapi.com/")
                .build();
        return new Response.Builder()
                .request(request)
                .protocol(Protocol.HTTP_1_1)
                .code(407)
                .message("Proxy Authentication Required")
                .build();
    }

    /**
     * The core regression: with only a proxy username configured (password is null), the
     * authenticator must not throw on okhttp 4, and must send an empty password.
     * base64("user:") = "dXNlcjo=".
     */
    @Test
    public void nullProxyPasswordFallsBackToEmpty() throws Exception {
        OkHttpClient ok = extractOkHttpClient(new TestClient(proxyProfile("user", null)));
        Authenticator authenticator = ok.proxyAuthenticator();
        Request authenticated = authenticator.authenticate(null, fakeProxyChallenge());
        assertEquals("Basic dXNlcjo=", authenticated.header("Proxy-Authorization"));
    }

    /**
     * A configured password must be passed through unchanged.
     * base64("user:pass") = "dXNlcjpwYXNz".
     */
    @Test
    public void configuredProxyPasswordIsUsed() throws Exception {
        OkHttpClient ok = extractOkHttpClient(new TestClient(proxyProfile("user", "pass")));
        Authenticator authenticator = ok.proxyAuthenticator();
        Request authenticated = authenticator.authenticate(null, fakeProxyChallenge());
        assertEquals("Basic dXNlcjpwYXNz", authenticated.header("Proxy-Authorization"));
    }

    /**
     * Proxy host configured but no username: no authenticator should be installed
     * (okhttp default is Authenticator.NONE).
     */
    @Test
    public void proxyWithoutUsernameKeepsDefaultAuthenticator() throws Exception {
        OkHttpClient ok = extractOkHttpClient(new TestClient(proxyProfile(null, "pass")));
        assertSame(Authenticator.NONE, ok.proxyAuthenticator());
    }

    /**
     * No proxy configured at all: neither proxy nor authenticator should be installed.
     */
    @Test
    public void noProxyKeepsDefaults() throws Exception {
        OkHttpClient ok = extractOkHttpClient(new TestClient(new ClientProfile()));
        assertSame(Authenticator.NONE, ok.proxyAuthenticator());
        assertNull(ok.proxy());
    }
}
