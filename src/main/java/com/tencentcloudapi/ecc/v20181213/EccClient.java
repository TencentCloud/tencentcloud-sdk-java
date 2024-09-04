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
package com.tencentcloudapi.ecc.v20181213;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ecc.v20181213.models.*;

public class EccClient extends AbstractClient{
    private static String endpoint = "ecc.tencentcloudapi.com";
    private static String service = "ecc";
    private static String version = "2018-12-13";
    
    public EccClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EccClient(Credential credential, String region, ClientProfile profile) {
        super(EccClient.endpoint, EccClient.version, credential, region, profile);
    }

    /**
     *https://ecc.tencentcloudapi.com/?Action=CorrectMultiImage
多图像识别批改接口
     * @param req CorrectMultiImageRequest
     * @return CorrectMultiImageResponse
     * @throws TencentCloudSDKException
     */
    public CorrectMultiImageResponse CorrectMultiImage(CorrectMultiImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CorrectMultiImage", CorrectMultiImageResponse.class);
    }

    /**
     *异步任务结果查询接口
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTask", DescribeTaskResponse.class);
    }

    /**
     *纯文本英语作文批改
     * @param req ECCRequest
     * @return ECCResponse
     * @throws TencentCloudSDKException
     */
    public ECCResponse ECC(ECCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ECC", ECCResponse.class);
    }

    /**
     *https://ecc.tencentcloudapi.com/?Action=EHOCR
图像识别批改接口
     * @param req EHOCRRequest
     * @return EHOCRResponse
     * @throws TencentCloudSDKException
     */
    public EHOCRResponse EHOCR(EHOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EHOCR", EHOCRResponse.class);
    }

}
