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
package com.tencentcloudapi.facefusion.v20220927;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.facefusion.v20220927.models.*;

public class FacefusionClient extends AbstractClient{
    private static String endpoint = "facefusion.tencentcloudapi.com";
    private static String service = "facefusion";
    private static String version = "2022-09-27";
    
    public FacefusionClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FacefusionClient(Credential credential, String region, ClientProfile profile) {
        super(FacefusionClient.endpoint, FacefusionClient.version, credential, region, profile);
    }

    /**
     *通常通过腾讯云人脸融合的控制台可以查看到素材相关的参数数据，可以满足使用。本接口返回活动的素材数据，包括素材状态等。用于用户通过Api查看素材相关数据，方便使用。
     * @param req DescribeMaterialListRequest
     * @return DescribeMaterialListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaterialListResponse DescribeMaterialList(DescribeMaterialListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMaterialListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMaterialListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMaterialList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于单脸、多脸、选脸融合，上传人脸图片，得到与素材模板融合后的人脸图片。支持为融合结果图添加标识。查看 <a href="https://cloud.tencent.com/document/product/670/38247" target="_blank">融合接入指引</a>。

请求频率限制为20次/秒。
>
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req FuseFaceRequest
     * @return FuseFaceResponse
     * @throws TencentCloudSDKException
     */
    public FuseFaceResponse FuseFace(FuseFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FuseFaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FuseFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FuseFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
