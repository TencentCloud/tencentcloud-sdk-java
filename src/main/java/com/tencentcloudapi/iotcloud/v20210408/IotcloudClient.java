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
     *本接口（BatchUpdateFirmware）用于批量更新设备固件 
     * @param req BatchUpdateFirmwareRequest
     * @return BatchUpdateFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public BatchUpdateFirmwareResponse BatchUpdateFirmware(BatchUpdateFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchUpdateFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchUpdateFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchUpdateFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（BindDevices）用于网关设备批量绑定子设备 
     * @param req BindDevicesRequest
     * @return BindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BindDevicesResponse BindDevices(BindDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消设备升级任务
     * @param req CancelDeviceFirmwareTaskRequest
     * @return CancelDeviceFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelDeviceFirmwareTaskResponse CancelDeviceFirmwareTask(CancelDeviceFirmwareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelDeviceFirmwareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelDeviceFirmwareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelDeviceFirmwareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
     *本接口（CreateMultiDevicesTask）用于创建产品级别的批量创建设备任务
     * @param req CreateMultiDevicesTaskRequest
     * @return CreateMultiDevicesTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiDevicesTaskResponse CreateMultiDevicesTask(CreateMultiDevicesTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMultiDevicesTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMultiDevicesTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMultiDevicesTask");
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
     *本接口（CreateProduct）用于创建一个新的物联网通信产品 
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
     *本接口（CreateTaskFileUrl）用于获取产品级任务文件上传链接
     * @param req CreateTaskFileUrlRequest
     * @return CreateTaskFileUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFileUrlResponse CreateTaskFileUrl(CreateTaskFileUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskFileUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskFileUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTaskFileUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateTopicPolicy）用于创建一个Topic 
     * @param req CreateTopicPolicyRequest
     * @return CreateTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicPolicyResponse CreateTopicPolicy(CreateTopicPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTopicPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateTopicRule）用于创建一个规则 
     * @param req CreateTopicRuleRequest
     * @return CreateTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicRuleResponse CreateTopicRule(CreateTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTopicRule");
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
     *本接口（DeleteDeviceResource）用于删除设备资源
     * @param req DeleteDeviceResourceRequest
     * @return DeleteDeviceResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResourceResponse DeleteDeviceResource(DeleteDeviceResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDeviceResource");
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
     *删除产品的私有CA证书
     * @param req DeleteProductPrivateCARequest
     * @return DeleteProductPrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductPrivateCAResponse DeleteProductPrivateCA(DeleteProductPrivateCARequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProductPrivateCAResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProductPrivateCAResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProductPrivateCA");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteTopicRule）用于删除规则
     * @param req DeleteTopicRuleRequest
     * @return DeleteTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicRuleResponse DeleteTopicRule(DeleteTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTopicRule");
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
     *获取证书认证类型设备的私钥，刚生成或者重置设备后仅可调用一次 
     * @param req DescribeDeviceClientKeyRequest
     * @return DescribeDeviceClientKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceClientKeyResponse DescribeDeviceClientKey(DescribeDeviceClientKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceClientKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceClientKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceClientKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDeviceResource）用于查询设备资源详情。 
     * @param req DescribeDeviceResourceRequest
     * @return DescribeDeviceResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResourceResponse DescribeDeviceResource(DescribeDeviceResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDeviceResources）用于查询设备资源列表。 
     * @param req DescribeDeviceResourcesRequest
     * @return DescribeDeviceResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResourcesResponse DescribeDeviceResources(DescribeDeviceResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDeviceShadow）用于查询虚拟设备信息。 
     * @param req DescribeDeviceShadowRequest
     * @return DescribeDeviceShadowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceShadowResponse DescribeDeviceShadow(DescribeDeviceShadowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceShadowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceShadowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceShadow");
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
     *查询固件信息
     * @param req DescribeFirmwareRequest
     * @return DescribeFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareResponse DescribeFirmware(DescribeFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询固件升级任务详情
     * @param req DescribeFirmwareTaskRequest
     * @return DescribeFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskResponse DescribeFirmwareTask(DescribeFirmwareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询固件升级任务的设备列表
     * @param req DescribeFirmwareTaskDevicesRequest
     * @return DescribeFirmwareTaskDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskDevicesResponse DescribeFirmwareTaskDevices(DescribeFirmwareTaskDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTaskDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询固件升级任务状态分布
     * @param req DescribeFirmwareTaskDistributionRequest
     * @return DescribeFirmwareTaskDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskDistributionResponse DescribeFirmwareTaskDistribution(DescribeFirmwareTaskDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskDistributionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTaskDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询固件升级任务统计信息
     * @param req DescribeFirmwareTaskStatisticsRequest
     * @return DescribeFirmwareTaskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskStatisticsResponse DescribeFirmwareTaskStatistics(DescribeFirmwareTaskStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTaskStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询固件升级任务列表
     * @param req DescribeFirmwareTasksRequest
     * @return DescribeFirmwareTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTasksResponse DescribeFirmwareTasks(DescribeFirmwareTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGatewayBindDevices）用于获取网关绑定的子设备列表 
     * @param req DescribeGatewayBindDevicesRequest
     * @return DescribeGatewayBindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayBindDevicesResponse DescribeGatewayBindDevices(DescribeGatewayBindDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayBindDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayBindDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayBindDevices");
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
     *本接口（DescribeProductResource）用于查询产品资源详情。 
     * @param req DescribeProductResourceRequest
     * @return DescribeProductResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResourceResponse DescribeProductResource(DescribeProductResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProductResources）用于查询产品资源列表。 
     * @param req DescribeProductResourcesRequest
     * @return DescribeProductResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResourcesResponse DescribeProductResources(DescribeProductResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProductTask）用于查看产品级别的任务信息
     * @param req DescribeProductTaskRequest
     * @return DescribeProductTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductTaskResponse DescribeProductTask(DescribeProductTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProductTasks）用于查看产品级别的任务列表
     * @param req DescribeProductTasksRequest
     * @return DescribeProductTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductTasksResponse DescribeProductTasks(DescribeProductTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProducts）用于列出产品列表。 
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProducts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询推送资源任务统计信息
     * @param req DescribePushResourceTaskStatisticsRequest
     * @return DescribePushResourceTaskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushResourceTaskStatisticsResponse DescribePushResourceTaskStatistics(DescribePushResourceTaskStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePushResourceTaskStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePushResourceTaskStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePushResourceTaskStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资源推送任务列表
     * @param req DescribeResourceTasksRequest
     * @return DescribeResourceTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTasksResponse DescribeResourceTasks(DescribeResourceTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisableTopicRule）用于禁用规则
     * @param req DisableTopicRuleRequest
     * @return DisableTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DisableTopicRuleResponse DisableTopicRule(DisableTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DownloadDeviceResource）用于下载设备资源
     * @param req DownloadDeviceResourceRequest
     * @return DownloadDeviceResourceResponse
     * @throws TencentCloudSDKException
     */
    public DownloadDeviceResourceResponse DownloadDeviceResource(DownloadDeviceResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadDeviceResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadDeviceResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadDeviceResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑固件信息
     * @param req EditFirmwareRequest
     * @return EditFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public EditFirmwareResponse EditFirmware(EditFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EditFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（EnableTopicRule）用于启用规则 
     * @param req EnableTopicRuleRequest
     * @return EnableTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableTopicRuleResponse EnableTopicRule(EnableTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetAllVersion）用于获取所有的版本列表 
     * @param req GetAllVersionRequest
     * @return GetAllVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetAllVersionResponse GetAllVersion(GetAllVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAllVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAllVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAllVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetCOSURL）用于获取固件存储在COS的URL 
     * @param req GetCOSURLRequest
     * @return GetCOSURLResponse
     * @throws TencentCloudSDKException
     */
    public GetCOSURLResponse GetCOSURL(GetCOSURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCOSURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCOSURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCOSURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetUserResourceInfo）用于查询用户资源使用信息。
     * @param req GetUserResourceInfoRequest
     * @return GetUserResourceInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetUserResourceInfoResponse GetUserResourceInfo(GetUserResourceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUserResourceInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUserResourceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUserResourceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListFirmwares）用于获取固件列表 
     * @param req ListFirmwaresRequest
     * @return ListFirmwaresResponse
     * @throws TencentCloudSDKException
     */
    public ListFirmwaresResponse ListFirmwares(ListFirmwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListFirmwaresResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListFirmwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListFirmwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListLog）用于查看日志信息 
     * @param req ListLogRequest
     * @return ListLogResponse
     * @throws TencentCloudSDKException
     */
    public ListLogResponse ListLog(ListLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取日志内容列表
     * @param req ListLogPayloadRequest
     * @return ListLogPayloadResponse
     * @throws TencentCloudSDKException
     */
    public ListLogPayloadResponse ListLogPayload(ListLogPayloadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListLogPayloadResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListLogPayloadResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListLogPayload");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备上报的日志
     * @param req ListSDKLogRequest
     * @return ListSDKLogResponse
     * @throws TencentCloudSDKException
     */
    public ListSDKLogResponse ListSDKLog(ListSDKLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListSDKLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListSDKLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListSDKLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListTopicRules）用于分页获取规则列表
     * @param req ListTopicRulesRequest
     * @return ListTopicRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListTopicRulesResponse ListTopicRules(ListTopicRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTopicRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopicRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTopicRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发布广播消息
     * @param req PublishBroadcastMessageRequest
     * @return PublishBroadcastMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishBroadcastMessageResponse PublishBroadcastMessage(PublishBroadcastMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishBroadcastMessageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishBroadcastMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishBroadcastMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（PublishMessage）用于向某个主题发消息。 
     * @param req PublishMessageRequest
     * @return PublishMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishMessageResponse PublishMessage(PublishMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishMessageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发布RRPC消息
     * @param req PublishRRPCMessageRequest
     * @return PublishRRPCMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishRRPCMessageResponse PublishRRPCMessage(PublishRRPCMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishRRPCMessageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishRRPCMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishRRPCMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceTopicRule）用于修改替换规则 
     * @param req ReplaceTopicRuleRequest
     * @return ReplaceTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceTopicRuleResponse ReplaceTopicRule(ReplaceTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置设备的连接状态 
     * @param req ResetDeviceStateRequest
     * @return ResetDeviceStateResponse
     * @throws TencentCloudSDKException
     */
    public ResetDeviceStateResponse ResetDeviceState(ResetDeviceStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetDeviceStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetDeviceStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetDeviceState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重试设备升级任务
     * @param req RetryDeviceFirmwareTaskRequest
     * @return RetryDeviceFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public RetryDeviceFirmwareTaskResponse RetryDeviceFirmwareTask(RetryDeviceFirmwareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RetryDeviceFirmwareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RetryDeviceFirmwareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RetryDeviceFirmwareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量设置产品禁用状态
     * @param req SetProductsForbiddenStatusRequest
     * @return SetProductsForbiddenStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetProductsForbiddenStatusResponse SetProductsForbiddenStatus(SetProductsForbiddenStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetProductsForbiddenStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetProductsForbiddenStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetProductsForbiddenStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnbindDevices）用于网关设备批量解绑子设备 
     * @param req UnbindDevicesRequest
     * @return UnbindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDevicesResponse UnbindDevices(UnbindDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用或者禁用设备 
     * @param req UpdateDeviceAvailableStateRequest
     * @return UpdateDeviceAvailableStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceAvailableStateResponse UpdateDeviceAvailableState(UpdateDeviceAvailableStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDeviceAvailableStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceAvailableStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDeviceAvailableState");
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
     *本接口（UpdateDevicePSK）用于更新设备的PSK 
     * @param req UpdateDevicePSKRequest
     * @return UpdateDevicePSKResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDevicePSKResponse UpdateDevicePSK(UpdateDevicePSKRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDevicePSKResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDevicePSKResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDevicePSK");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateDeviceShadow）用于更新虚拟设备信息。
     * @param req UpdateDeviceShadowRequest
     * @return UpdateDeviceShadowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceShadowResponse UpdateDeviceShadow(UpdateDeviceShadowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDeviceShadowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceShadowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDeviceShadow");
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

    /**
     *更新产品动态注册的配置 
     * @param req UpdateProductDynamicRegisterRequest
     * @return UpdateProductDynamicRegisterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProductDynamicRegisterResponse UpdateProductDynamicRegister(UpdateProductDynamicRegisterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateProductDynamicRegisterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateProductDynamicRegisterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateProductDynamicRegister");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新产品的私有CA
     * @param req UpdateProductPrivateCARequest
     * @return UpdateProductPrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProductPrivateCAResponse UpdateProductPrivateCA(UpdateProductPrivateCARequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateProductPrivateCAResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateProductPrivateCAResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateProductPrivateCA");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateTopicPolicy）用于更新Topic信息
     * @param req UpdateTopicPolicyRequest
     * @return UpdateTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTopicPolicyResponse UpdateTopicPolicy(UpdateTopicPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateTopicPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateTopicPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateTopicPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UploadFirmware）用于上传设备固件信息 
     * @param req UploadFirmwareRequest
     * @return UploadFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public UploadFirmwareResponse UploadFirmware(UploadFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
