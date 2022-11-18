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
package com.tencentcloudapi.mna.v20210119;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mna.v20210119.models.*;

public class MnaClient extends AbstractClient{
    private static String endpoint = "mna.tencentcloudapi.com";
    private static String service = "mna";
    private static String version = "2021-01-19";

    public MnaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MnaClient(Credential credential, String region, ClientProfile profile) {
        super(MnaClient.endpoint, MnaClient.version, credential, region, profile);
    }

    /**
     *新建设备记录
     * @param req AddDeviceRequest
     * @return AddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AddDeviceResponse AddDevice(AddDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口设置和更新预置密钥
     * @param req CreateEncryptedKeyRequest
     * @return CreateEncryptedKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateEncryptedKeyResponse CreateEncryptedKey(CreateEncryptedKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEncryptedKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEncryptedKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEncryptedKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移动网络发起Qos加速过程
     * @param req CreateQosRequest
     * @return CreateQosResponse
     * @throws TencentCloudSDKException
     */
    public CreateQosResponse CreateQos(CreateQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateQosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除设备信息
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移动网络停止Qos加速过程
     * @param req DeleteQosRequest
     * @return DeleteQosResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQosResponse DeleteQos(DeleteQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteQosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Qos加速状态
     * @param req DescribeQosRequest
     * @return DescribeQosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQosResponse DescribeQos(DescribeQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过指定设备的ID查找设备详细信息
     * @param req GetDeviceRequest
     * @return GetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceResponse GetDevice(GetDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备信息列表
     * @param req GetDevicesRequest
     * @return GetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicesResponse GetDevices(GetDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定设备Id，指定时间点数据流量使用情况
     * @param req GetFlowStatisticRequest
     * @return GetFlowStatisticResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowStatisticResponse GetFlowStatistic(GetFlowStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFlowStatisticResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFlowStatisticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFlowStatistic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取公钥用于验签
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPublicKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPublicKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPublicKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在用量统计页面下载流量数据
     * @param req GetStatisticDataRequest
     * @return GetStatisticDataResponse
     * @throws TencentCloudSDKException
     */
    public GetStatisticDataResponse GetStatisticData(GetStatisticDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetStatisticDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetStatisticDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetStatisticData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新设备信息
     * @param req UpdateDeviceRequest
     * @return UpdateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceResponse UpdateDevice(UpdateDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
