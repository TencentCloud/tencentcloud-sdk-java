package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class AbstractClientInitTest {
    private Credential credential;
    private ClientProfile clientProfile;

    @Before
    public void setUp() {
        credential =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
        clientProfile = new ClientProfile();

        HttpProfile httpProfile = new HttpProfile();
        clientProfile.setHttpProfile(httpProfile);
        clientProfile.setSignMethod("HmacSHA256");
    }

    @Test
    public void testAbstractClientWithEndpointVersionCredentialRegion() {
        String endpoint = "example.com";
        String version = "v1";
        String region = "ap-guangzhou";
        AbstractClient client = new AbstractClient(endpoint, version, credential, region) {
        };

        client.setRegion(region);
        client.setClientProfile(clientProfile);
        client.setCredential(credential);
        assertEquals(region, client.getRegion());
        assertNotNull(client.getCredential());
        assertNotNull(client.getClientProfile());

    }


}

