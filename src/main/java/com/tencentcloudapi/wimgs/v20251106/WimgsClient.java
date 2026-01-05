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
package com.tencentcloudapi.wimgs.v20251106;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wimgs.v20251106.models.*;

public class WimgsClient extends AbstractClient{
    private static String endpoint = "wimgs.tencentcloudapi.com";
    private static String service = "wimgs";
    private static String version = "2025-11-06";

    public WimgsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WimgsClient(Credential credential, String region, ClientProfile profile) {
        super(WimgsClient.endpoint, WimgsClient.version, credential, region, profile);
    }

    /**
     *文搜图接口，本服务将针对您输入的搜索关键词，检索并以JSON形式返回相关图片的标题、宽高、缩略图、内容来源url等信息。
     * @param req SearchByTextRequest
     * @return SearchByTextResponse
     * @throws TencentCloudSDKException
     */
    public SearchByTextResponse SearchByText(SearchByTextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchByText", SearchByTextResponse.class);
    }

}
