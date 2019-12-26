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
package com.tencentcloudapi.iotcloud.v20180614;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotcloud.v20180614.models.*;

public class IotcloudClient extends AbstractClient{
    private static String endpoint = "iotcloud.tencentcloudapi.com";
    private static String version = "2018-06-14";

    public IotcloudClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotcloudClient(Credential credential, String region, ClientProfile profile) {
        super(IotcloudClient.endpoint, IotcloudClient.version, credential, region, profile);
    }

    /**
     *本接口（BindDevices）用于网关设备批量绑定子设备
     * @param req BindDevicesRequest
     * @return BindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BindDevicesResponse BindDevices(BindDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindDevicesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CancelTask）用于取消一个未被调度的任务。 
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CancelTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CancelTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建lora类型的设备
     * @param req CreateLoraDeviceRequest
     * @return CreateLoraDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoraDeviceResponse CreateLoraDevice(CreateLoraDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLoraDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLoraDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLoraDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateMultiDevice）用于批量创建物联云设备。
     * @param req CreateMultiDeviceRequest
     * @return CreateMultiDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiDeviceResponse CreateMultiDevice(CreateMultiDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMultiDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMultiDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMultiDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateTask）用于创建一个批量任务。目前此接口可以创建批量更新影子以及批量下发消息的任务 
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTopicPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTopicRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除lora类型的设备
     * @param req DeleteLoraDeviceRequest
     * @return DeleteLoraDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoraDeviceResponse DeleteLoraDevice(DeleteLoraDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoraDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoraDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLoraDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTopicRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceClientKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceClientKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceShadowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceShadow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取lora类型设备的详细信息
     * @param req DescribeLoraDeviceRequest
     * @return DescribeLoraDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoraDeviceResponse DescribeLoraDevice(DescribeLoraDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoraDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoraDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLoraDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeMultiDevTask）用于查询批量创建设备任务的执行状态。
     * @param req DescribeMultiDevTaskRequest
     * @return DescribeMultiDevTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiDevTaskResponse DescribeMultiDevTask(DescribeMultiDevTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMultiDevTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMultiDevTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMultiDevTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeMultiDevices）用于查询批量创建设备的执行结果。
     * @param req DescribeMultiDevicesRequest
     * @return DescribeMultiDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiDevicesResponse DescribeMultiDevices(DescribeMultiDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMultiDevicesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMultiDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMultiDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProducts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTask）用于查询一个已创建任务的详情，任务保留一个月 
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTasks）用于查询已创建的任务列表，任务保留一个月 
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DisableTopicRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableTopicRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<EnableTopicRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableTopicRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *模拟lora类型的设备端向服务器端发送消息
     * @param req PublishAsDeviceRequest
     * @return PublishAsDeviceResponse
     * @throws TencentCloudSDKException
     */
    public PublishAsDeviceResponse PublishAsDevice(PublishAsDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishAsDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PublishAsDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PublishAsDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<PublishMessageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PublishMessage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *服务器端下发消息给lora类型的设备
     * @param req PublishToDeviceRequest
     * @return PublishToDeviceResponse
     * @throws TencentCloudSDKException
     */
    public PublishToDeviceResponse PublishToDevice(PublishToDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishToDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PublishToDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PublishToDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceTopicRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceTopicRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ResetDeviceStateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetDeviceState"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceAvailableStateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateDeviceAvailableState"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceShadowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateDeviceShadow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateTopicPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateTopicPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
