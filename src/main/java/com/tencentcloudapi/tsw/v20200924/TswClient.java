/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tsw.v20200924;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tsw.v20200924.models.*;

public class TswClient extends AbstractClient{
    private static String endpoint = "tsw.tencentcloudapi.com";
    private static String service = "tsw";
    private static String version = "2020-09-24";

    public TswClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TswClient(Credential credential, String region, ClientProfile profile) {
        super(TswClient.endpoint, TswClient.version, credential, region, profile);
    }

    /**
     *获取服务接入信息
     * @param req DescribeAgentShellRequest
     * @return DescribeAgentShellResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentShellResponse DescribeAgentShell(DescribeAgentShellRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentShell", DescribeAgentShellResponse.class);
    }

}
