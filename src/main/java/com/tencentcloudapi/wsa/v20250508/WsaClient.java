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
package com.tencentcloudapi.wsa.v20250508;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wsa.v20250508.models.*;

public class WsaClient extends AbstractClient{
    private static String endpoint = "wsa.tencentcloudapi.com";
    private static String service = "wsa";
    private static String version = "2025-05-08";

    public WsaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WsaClient(Credential credential, String region, ClientProfile profile) {
        super(WsaClient.endpoint, WsaClient.version, credential, region, profile);
    }

    /**
     *联网搜索API，以json形式向客户提供搜索结果数据，包含不仅限于标题、摘要、内容来源url等信息
     * @param req SearchProRequest
     * @return SearchProResponse
     * @throws TencentCloudSDKException
     */
    public SearchProResponse SearchPro(SearchProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchPro", SearchProResponse.class);
    }

}
