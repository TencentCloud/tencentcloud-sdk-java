package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import org.junit.Before;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

import java.util.HashMap;

class Client extends AbstractClient {
    public Client(String endpoint, String version, Credential credential, String region) {
        super(endpoint, version, credential, region);
    }

    public Client(String endpoint, String version, Credential credential, String region, ClientProfile profile) {
        super(endpoint, version, credential, region, profile);
    }
}

public class AbstractClientInternalRequestTest {
    private Credential credential;
    private ClientProfile clientProfile;
    private String endpoint = "example.com";
    private String version = "v1";
    private String region = "ap-guangzhou";

    @Before
    public void setUp() {
        credential =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"), "123e4567-e89b-12d3-a456-426614174000");
        clientProfile = new ClientProfile();
    }

    @Test
    public void testAbstractInternalRequest() throws Exception {
        clientProfile.setBackupEndpoint("example.com");
        Client client = new Client(endpoint, version, credential, region, clientProfile);
        AbstractModel req = new AbstractModel() {
            @Override
            protected void toMap(HashMap<String, String> map, String prefix) {
            }
        };
        String actionName = "ActionName";

        Client client1 = PowerMockito.spy(client);
        PowerMockito.doReturn(null).when(client1, "internalRequestRaw", req, actionName);
        try {
            Whitebox.invokeMethod(client1, "internalRequest", req, actionName);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

