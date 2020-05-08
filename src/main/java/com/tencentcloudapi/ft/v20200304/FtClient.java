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
package com.tencentcloudapi.ft.v20200304;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ft.v20200304.models.*;

public class FtClient extends AbstractClient{
    private static String endpoint = "ft.tencentcloudapi.com";
    private static String version = "2020-03-04";

    public FtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FtClient(Credential credential, String region, ClientProfile profile) {
        super(FtClient.endpoint, FtClient.version, credential, region, profile);
    }

    /**
     *用户上传一张人脸图片，基于人脸编辑与生成算法，输出一张人脸变老或变年轻的图片，支持实现人脸不同年龄的变化。
     * @param req ChangeAgePicRequest
     * @return ChangeAgePicResponse
     * @throws TencentCloudSDKException
     */
    public ChangeAgePicResponse ChangeAgePic(ChangeAgePicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeAgePicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeAgePicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ChangeAgePic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户上传一张人脸图片，基于人脸编辑与生成算法，输出一张人脸性别转换的图片。男变女可实现美颜、淡妆、加刘海和长发的效果；女变男可实现加胡须、变短发的效果。 
     * @param req SwapGenderPicRequest
     * @return SwapGenderPicResponse
     * @throws TencentCloudSDKException
     */
    public SwapGenderPicResponse SwapGenderPic(SwapGenderPicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwapGenderPicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SwapGenderPicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SwapGenderPic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
