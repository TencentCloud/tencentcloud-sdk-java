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
package com.tencentcloudapi.facefusion.v20181201;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.facefusion.v20181201.models.*;

public class FacefusionClient extends AbstractClient{
    private static String endpoint = "facefusion.tencentcloudapi.com";
    private static String service = "facefusion";
    private static String version = "2018-12-01";

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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaterialList", DescribeMaterialListResponse.class);
    }

    /**
     *本接口用于人脸融合，用户上传人脸图片，获取与模板融合后的人脸图片。未发布的活动请求频率限制为1次/秒，已发布的活动请求频率限制50次/秒。如有需要提高活动的请求频率限制，请在控制台中申请。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req FaceFusionRequest
     * @return FaceFusionResponse
     * @throws TencentCloudSDKException
     */
    public FaceFusionResponse FaceFusion(FaceFusionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FaceFusion", FaceFusionResponse.class);
    }

    /**
     *本接口用于单脸、多脸融合，用户上传人脸图片，获取与模板融合后的人脸图片。查看 <a href="https://cloud.tencent.com/document/product/670/38247" target="_blank">选脸融合接入指引</a>。

未发布的活动请求频率限制为1次/秒，已发布的活动请求频率限制50次/秒。如有需要提高活动的请求频率限制，请在控制台中申请。
>
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req FuseFaceRequest
     * @return FuseFaceResponse
     * @throws TencentCloudSDKException
     */
    public FuseFaceResponse FuseFace(FuseFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FuseFace", FuseFaceResponse.class);
    }

}
