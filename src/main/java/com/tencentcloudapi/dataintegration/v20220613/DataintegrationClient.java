/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dataintegration.v20220613;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dataintegration.v20220613.models.*;

public class DataintegrationClient extends AbstractClient{
    private static String endpoint = "dataintegration.tencentcloudapi.com";
    private static String service = "dataintegration";
    private static String version = "2022-06-13";
    
    public DataintegrationClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DataintegrationClient(Credential credential, String region, ClientProfile profile) {
        super(DataintegrationClient.endpoint, DataintegrationClient.version, credential, region, profile);
    }

    /**
     *使用SDK将数据上报到DIP
     * @param req SendMessageRequest
     * @return SendMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendMessageResponse SendMessage(SendMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendMessageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SendMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
