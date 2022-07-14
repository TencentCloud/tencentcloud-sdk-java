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
package com.tencentcloudapi.iotvideo.v20211125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotvideo.v20211125.models.*;

public class IotvideoClient extends AbstractClient{
    private static String endpoint = "iotvideo.tencentcloudapi.com";
    private static String service = "iotvideo";
    private static String version = "2021-11-25";

    public IotvideoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotvideoClient(Credential credential, String region, ClientProfile profile) {
        super(IotvideoClient.endpoint, IotvideoClient.version, credential, region, profile);
    }

    /**
     *异步调用设备行为
     * @param req CallDeviceActionAsyncRequest
     * @return CallDeviceActionAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CallDeviceActionAsyncResponse CallDeviceActionAsync(CallDeviceActionAsyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CallDeviceActionAsyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CallDeviceActionAsyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CallDeviceActionAsync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步调用设备行为
     * @param req CallDeviceActionSyncRequest
     * @return CallDeviceActionSyncResponse
     * @throws TencentCloudSDKException
     */
    public CallDeviceActionSyncResponse CallDeviceActionSync(CallDeviceActionSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CallDeviceActionSyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CallDeviceActionSyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CallDeviceActionSync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建产品
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备数据统计
     * @param req DescribeDeviceDataStatsRequest
     * @return DescribeDeviceDataStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataStatsResponse DescribeDeviceDataStats(DescribeDeviceDataStatsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceDataStatsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceDataStatsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceDataStats");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备消息数量统计
     * @param req DescribeMessageDataStatsRequest
     * @return DescribeMessageDataStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageDataStatsResponse DescribeMessageDataStats(DescribeMessageDataStatsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMessageDataStatsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMessageDataStatsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMessageDataStats");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备的绑定签名
     * @param req GenSingleDeviceSignatureOfPublicRequest
     * @return GenSingleDeviceSignatureOfPublicResponse
     * @throws TencentCloudSDKException
     */
    public GenSingleDeviceSignatureOfPublicResponse GenSingleDeviceSignatureOfPublic(GenSingleDeviceSignatureOfPublicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenSingleDeviceSignatureOfPublicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenSingleDeviceSignatureOfPublicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenSingleDeviceSignatureOfPublic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
