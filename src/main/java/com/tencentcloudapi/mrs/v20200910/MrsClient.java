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
package com.tencentcloudapi.mrs.v20200910;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mrs.v20200910.models.*;

public class MrsClient extends AbstractClient{
    private static String endpoint = "mrs.tencentcloudapi.com";
    private static String service = "mrs";
    private static String version = "2020-09-10";

    public MrsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MrsClient(Credential credential, String region, ClientProfile profile) {
        super(MrsClient.endpoint, MrsClient.version, credential, region, profile);
    }

    /**
     *图片分类
     * @param req ImageToClassRequest
     * @return ImageToClassResponse
     * @throws TencentCloudSDKException
     */
    public ImageToClassResponse ImageToClass(ImageToClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageToClassResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImageToClassResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImageToClass");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *图片转结构化对象
     * @param req ImageToObjectRequest
     * @return ImageToObjectResponse
     * @throws TencentCloudSDKException
     */
    public ImageToObjectResponse ImageToObject(ImageToObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageToObjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImageToObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImageToObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文本分类
     * @param req TextToClassRequest
     * @return TextToClassResponse
     * @throws TencentCloudSDKException
     */
    public TextToClassResponse TextToClass(TextToClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextToClassResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TextToClassResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextToClass");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文本转结构化对象
     * @param req TextToObjectRequest
     * @return TextToObjectResponse
     * @throws TencentCloudSDKException
     */
    public TextToObjectResponse TextToObject(TextToObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextToObjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TextToObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextToObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
