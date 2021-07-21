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
package com.tencentcloudapi.iotcloud.v20210408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotcloud.v20210408.models.*;

public class IotcloudClient extends AbstractClient{
    private static String endpoint = "iotcloud.tencentcloudapi.com";
    private static String service = "iotcloud";
    private static String version = "2021-04-08";

    public IotcloudClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotcloudClient(Credential credential, String region, ClientProfile profile) {
        super(IotcloudClient.endpoint, IotcloudClient.version, credential, region, profile);
    }

    /**
     *本接口（CreateDevice）用于新建一个物联网通信设备。 
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建私有CA证书
     * @param req CreatePrivateCARequest
     * @return CreatePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateCAResponse CreatePrivateCA(CreatePrivateCARequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrivateCAResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrivateCAResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrivateCA");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteDevice）用于删除物联网通信设备。 
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
     *删除私有CA证书
     * @param req DeletePrivateCARequest
     * @return DeletePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateCAResponse DeletePrivateCA(DeletePrivateCARequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrivateCAResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrivateCAResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrivateCA");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteProduct）用于删除一个物联网通信产品
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDevice）用于查看设备信息
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDevices）用于查询物联网通信设备的设备列表。 
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询私有化CA信息
     * @param req DescribePrivateCARequest
     * @return DescribePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCAResponse DescribePrivateCA(DescribePrivateCARequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivateCAResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivateCAResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivateCA");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询私有CA绑定的产品列表
     * @param req DescribePrivateCABindedProductsRequest
     * @return DescribePrivateCABindedProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCABindedProductsResponse DescribePrivateCABindedProducts(DescribePrivateCABindedProductsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivateCABindedProductsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivateCABindedProductsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivateCABindedProducts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询私有CA证书列表
     * @param req DescribePrivateCAsRequest
     * @return DescribePrivateCAsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCAsResponse DescribePrivateCAs(DescribePrivateCAsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivateCAsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivateCAsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivateCAs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProduct）用于查看产品详情
     * @param req DescribeProductRequest
     * @return DescribeProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResponse DescribeProduct(DescribeProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询产品绑定的CA证书
     * @param req DescribeProductCARequest
     * @return DescribeProductCAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductCAResponse DescribeProductCA(DescribeProductCARequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductCAResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductCAResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductCA");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置设备上报的日志级别  
     * @param req UpdateDeviceLogLevelRequest
     * @return UpdateDeviceLogLevelResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceLogLevelResponse UpdateDeviceLogLevel(UpdateDeviceLogLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDeviceLogLevelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceLogLevelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDeviceLogLevel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量启用或者禁用设备 
     * @param req UpdateDevicesEnableStateRequest
     * @return UpdateDevicesEnableStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDevicesEnableStateResponse UpdateDevicesEnableState(UpdateDevicesEnableStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDevicesEnableStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDevicesEnableStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDevicesEnableState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新私有CA证书
     * @param req UpdatePrivateCARequest
     * @return UpdatePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrivateCAResponse UpdatePrivateCA(UpdatePrivateCARequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePrivateCAResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePrivateCAResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePrivateCA");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
