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
package com.tencentcloudapi.irp.v20220324;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.irp.v20220324.models.*;

public class IrpClient extends AbstractClient{
    private static String endpoint = "irp.tencentcloudapi.com";
    private static String service = "irp";
    private static String version = "2022-03-24";
    
    public IrpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IrpClient(Credential credential, String region, ClientProfile profile) {
        super(IrpClient.endpoint, IrpClient.version, credential, region, profile);
    }

    /**
     *获取推荐结果
     * @param req RecommendContentRequest
     * @return RecommendContentResponse
     * @throws TencentCloudSDKException
     */
    public RecommendContentResponse RecommendContent(RecommendContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecommendContentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RecommendContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecommendContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上报行为
     * @param req ReportActionRequest
     * @return ReportActionResponse
     * @throws TencentCloudSDKException
     */
    public ReportActionResponse ReportAction(ReportActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReportActionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ReportActionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReportAction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上报物料
     * @param req ReportMaterialRequest
     * @return ReportMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ReportMaterialResponse ReportMaterial(ReportMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReportMaterialResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ReportMaterialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReportMaterial");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上报用户画像
     * @param req ReportPortraitRequest
     * @return ReportPortraitResponse
     * @throws TencentCloudSDKException
     */
    public ReportPortraitResponse ReportPortrait(ReportPortraitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReportPortraitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ReportPortraitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReportPortrait");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
