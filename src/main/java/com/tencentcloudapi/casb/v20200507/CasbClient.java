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
package com.tencentcloudapi.casb.v20200507;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.casb.v20200507.models.*;

public class CasbClient extends AbstractClient{
    private static String endpoint = "casb.tencentcloudapi.com";
    private static String service = "casb";
    private static String version = "2020-05-07";

    public CasbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CasbClient(Credential credential, String region, ClientProfile profile) {
        super(CasbClient.endpoint, CasbClient.version, credential, region, profile);
    }

    /**
     *同region下 根据用户输入的CasbId,MetaDataId 复制策略到DstCasbId,MetaDataId中。
场景1：
相同CasbId，不同MetadataId 下策略复制
场景2：
不同Casbid,不同MetaDataId 下策略复制
场景3:
相同CasbId,相同MetaDataId 且 DatabaseName不同 策略复制

     * @param req CopyCryptoColumnPolicyRequest
     * @return CopyCryptoColumnPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CopyCryptoColumnPolicyResponse CopyCryptoColumnPolicy(CopyCryptoColumnPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyCryptoColumnPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopyCryptoColumnPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyCryptoColumnPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
