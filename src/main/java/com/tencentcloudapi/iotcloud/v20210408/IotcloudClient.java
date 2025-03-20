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
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchUpdateFirmware", BatchUpdateFirmwareResponse.class);
    }

    /**
     *本接口（BindDevices）用于网关设备批量绑定子设备
     * @param req BindDevicesRequest
     * @return BindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BindDevicesResponse BindDevices(BindDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDevices", BindDevicesResponse.class);
    }

    /**
     *取消设备升级任务
     * @param req CancelDeviceFirmwareTaskRequest
     * @return CancelDeviceFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelDeviceFirmwareTaskResponse CancelDeviceFirmwareTask(CancelDeviceFirmwareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelDeviceFirmwareTask", CancelDeviceFirmwareTaskResponse.class);
    }

    /**
     *本接口（CreateDevice）用于新建一个物联网通信设备。 
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDevice", CreateDeviceResponse.class);
    }

    /**
     *本接口（CreateMultiDevicesTask）用于创建产品级别的批量创建设备任务
     * @param req CreateMultiDevicesTaskRequest
     * @return CreateMultiDevicesTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiDevicesTaskResponse CreateMultiDevicesTask(CreateMultiDevicesTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMultiDevicesTask", CreateMultiDevicesTaskResponse.class);
    }

    /**
     *创建私有CA证书
     * @param req CreatePrivateCARequest
     * @return CreatePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateCAResponse CreatePrivateCA(CreatePrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateCA", CreatePrivateCAResponse.class);
    }

    /**
     *本接口（CreateProduct）用于创建一个新的物联网通信产品
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProduct", CreateProductResponse.class);
    }

    /**
     *本接口（CreateTaskFileUrl）用于获取产品级任务文件上传链接
     * @param req CreateTaskFileUrlRequest
     * @return CreateTaskFileUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFileUrlResponse CreateTaskFileUrl(CreateTaskFileUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFileUrl", CreateTaskFileUrlResponse.class);
    }

    /**
     *本接口（CreateTopicPolicy）用于创建一个Topic
     * @param req CreateTopicPolicyRequest
     * @return CreateTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicPolicyResponse CreateTopicPolicy(CreateTopicPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopicPolicy", CreateTopicPolicyResponse.class);
    }

    /**
     *本接口（CreateTopicRule）用于创建一个规则
     * @param req CreateTopicRuleRequest
     * @return CreateTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicRuleResponse CreateTopicRule(CreateTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopicRule", CreateTopicRuleResponse.class);
    }

    /**
     *本接口（DeleteDevice）用于删除物联网通信设备。 
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevice", DeleteDeviceResponse.class);
    }

    /**
     *本接口（DeleteDeviceResource）用于删除设备资源
     * @param req DeleteDeviceResourceRequest
     * @return DeleteDeviceResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResourceResponse DeleteDeviceResource(DeleteDeviceResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeviceResource", DeleteDeviceResourceResponse.class);
    }

    /**
     *本接口（DeleteDeviceShadow）用于删除设备影子
     * @param req DeleteDeviceShadowRequest
     * @return DeleteDeviceShadowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceShadowResponse DeleteDeviceShadow(DeleteDeviceShadowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeviceShadow", DeleteDeviceShadowResponse.class);
    }

    /**
     *删除私有CA证书
     * @param req DeletePrivateCARequest
     * @return DeletePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateCAResponse DeletePrivateCA(DeletePrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateCA", DeletePrivateCAResponse.class);
    }

    /**
     *本接口（DeleteProduct）用于删除一个物联网通信产品
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProduct", DeleteProductResponse.class);
    }

    /**
     *删除产品的私有CA证书
     * @param req DeleteProductPrivateCARequest
     * @return DeleteProductPrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductPrivateCAResponse DeleteProductPrivateCA(DeleteProductPrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProductPrivateCA", DeleteProductPrivateCAResponse.class);
    }

    /**
     *本接口（DeleteTopicRule）用于删除规则
     * @param req DeleteTopicRuleRequest
     * @return DeleteTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicRuleResponse DeleteTopicRule(DeleteTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopicRule", DeleteTopicRuleResponse.class);
    }

    /**
     *本接口（DescribeDevice）用于查看设备信息
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevice", DescribeDeviceResponse.class);
    }

    /**
     *获取证书认证类型设备的私钥，刚生成或者重置设备后仅可调用一次
     * @param req DescribeDeviceClientKeyRequest
     * @return DescribeDeviceClientKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceClientKeyResponse DescribeDeviceClientKey(DescribeDeviceClientKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceClientKey", DescribeDeviceClientKeyResponse.class);
    }

    /**
     *本接口（DescribeDeviceResource）用于查询设备资源详情。 
     * @param req DescribeDeviceResourceRequest
     * @return DescribeDeviceResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResourceResponse DescribeDeviceResource(DescribeDeviceResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceResource", DescribeDeviceResourceResponse.class);
    }

    /**
     *本接口（DescribeDeviceResources）用于查询设备资源列表。 
     * @param req DescribeDeviceResourcesRequest
     * @return DescribeDeviceResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResourcesResponse DescribeDeviceResources(DescribeDeviceResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceResources", DescribeDeviceResourcesResponse.class);
    }

    /**
     *本接口（DescribeDeviceShadow）用于查询虚拟设备信息。
     * @param req DescribeDeviceShadowRequest
     * @return DescribeDeviceShadowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceShadowResponse DescribeDeviceShadow(DescribeDeviceShadowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceShadow", DescribeDeviceShadowResponse.class);
    }

    /**
     *本接口（DescribeDevices）用于查询物联网通信设备的设备列表。
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevices", DescribeDevicesResponse.class);
    }

    /**
     *查询固件信息
     * @param req DescribeFirmwareRequest
     * @return DescribeFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareResponse DescribeFirmware(DescribeFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmware", DescribeFirmwareResponse.class);
    }

    /**
     *查询固件升级任务详情
     * @param req DescribeFirmwareTaskRequest
     * @return DescribeFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskResponse DescribeFirmwareTask(DescribeFirmwareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTask", DescribeFirmwareTaskResponse.class);
    }

    /**
     *查询固件升级任务的设备列表
     * @param req DescribeFirmwareTaskDevicesRequest
     * @return DescribeFirmwareTaskDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskDevicesResponse DescribeFirmwareTaskDevices(DescribeFirmwareTaskDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTaskDevices", DescribeFirmwareTaskDevicesResponse.class);
    }

    /**
     *查询固件升级任务状态分布
     * @param req DescribeFirmwareTaskDistributionRequest
     * @return DescribeFirmwareTaskDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskDistributionResponse DescribeFirmwareTaskDistribution(DescribeFirmwareTaskDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTaskDistribution", DescribeFirmwareTaskDistributionResponse.class);
    }

    /**
     *查询固件升级任务统计信息
     * @param req DescribeFirmwareTaskStatisticsRequest
     * @return DescribeFirmwareTaskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskStatisticsResponse DescribeFirmwareTaskStatistics(DescribeFirmwareTaskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTaskStatistics", DescribeFirmwareTaskStatisticsResponse.class);
    }

    /**
     *查询固件升级任务列表
     * @param req DescribeFirmwareTasksRequest
     * @return DescribeFirmwareTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTasksResponse DescribeFirmwareTasks(DescribeFirmwareTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTasks", DescribeFirmwareTasksResponse.class);
    }

    /**
     *本接口（DescribeGatewayBindDevices）用于获取网关绑定的子设备列表
     * @param req DescribeGatewayBindDevicesRequest
     * @return DescribeGatewayBindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayBindDevicesResponse DescribeGatewayBindDevices(DescribeGatewayBindDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayBindDevices", DescribeGatewayBindDevicesResponse.class);
    }

    /**
     *查询私有化CA信息
     * @param req DescribePrivateCARequest
     * @return DescribePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCAResponse DescribePrivateCA(DescribePrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateCA", DescribePrivateCAResponse.class);
    }

    /**
     *查询私有CA绑定的产品列表
     * @param req DescribePrivateCABindedProductsRequest
     * @return DescribePrivateCABindedProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCABindedProductsResponse DescribePrivateCABindedProducts(DescribePrivateCABindedProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateCABindedProducts", DescribePrivateCABindedProductsResponse.class);
    }

    /**
     *查询私有CA证书列表
     * @param req DescribePrivateCAsRequest
     * @return DescribePrivateCAsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCAsResponse DescribePrivateCAs(DescribePrivateCAsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateCAs", DescribePrivateCAsResponse.class);
    }

    /**
     *本接口（DescribeProduct）用于查看产品详情
     * @param req DescribeProductRequest
     * @return DescribeProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResponse DescribeProduct(DescribeProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProduct", DescribeProductResponse.class);
    }

    /**
     *查询产品绑定的CA证书
     * @param req DescribeProductCARequest
     * @return DescribeProductCAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductCAResponse DescribeProductCA(DescribeProductCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductCA", DescribeProductCAResponse.class);
    }

    /**
     *本接口（DescribeProductResource）用于查询产品资源详情。 
     * @param req DescribeProductResourceRequest
     * @return DescribeProductResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResourceResponse DescribeProductResource(DescribeProductResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductResource", DescribeProductResourceResponse.class);
    }

    /**
     *本接口（DescribeProductResources）用于查询产品资源列表。
     * @param req DescribeProductResourcesRequest
     * @return DescribeProductResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResourcesResponse DescribeProductResources(DescribeProductResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductResources", DescribeProductResourcesResponse.class);
    }

    /**
     *本接口（DescribeProductTask）用于查看产品级别的任务信息
     * @param req DescribeProductTaskRequest
     * @return DescribeProductTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductTaskResponse DescribeProductTask(DescribeProductTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductTask", DescribeProductTaskResponse.class);
    }

    /**
     *本接口（DescribeProductTasks）用于查看产品级别的任务列表
     * @param req DescribeProductTasksRequest
     * @return DescribeProductTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductTasksResponse DescribeProductTasks(DescribeProductTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductTasks", DescribeProductTasksResponse.class);
    }

    /**
     *本接口（DescribeProducts）用于列出产品列表。
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProducts", DescribeProductsResponse.class);
    }

    /**
     *查询推送资源任务统计信息
     * @param req DescribePushResourceTaskStatisticsRequest
     * @return DescribePushResourceTaskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushResourceTaskStatisticsResponse DescribePushResourceTaskStatistics(DescribePushResourceTaskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePushResourceTaskStatistics", DescribePushResourceTaskStatisticsResponse.class);
    }

    /**
     *查询资源推送任务列表
     * @param req DescribeResourceTasksRequest
     * @return DescribeResourceTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTasksResponse DescribeResourceTasks(DescribeResourceTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTasks", DescribeResourceTasksResponse.class);
    }

    /**
     *本接口（DisableTopicRule）用于禁用规则
     * @param req DisableTopicRuleRequest
     * @return DisableTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DisableTopicRuleResponse DisableTopicRule(DisableTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableTopicRule", DisableTopicRuleResponse.class);
    }

    /**
     *本接口（DownloadDeviceResource）用于下载设备资源
     * @param req DownloadDeviceResourceRequest
     * @return DownloadDeviceResourceResponse
     * @throws TencentCloudSDKException
     */
    public DownloadDeviceResourceResponse DownloadDeviceResource(DownloadDeviceResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadDeviceResource", DownloadDeviceResourceResponse.class);
    }

    /**
     *编辑固件信息
     * @param req EditFirmwareRequest
     * @return EditFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public EditFirmwareResponse EditFirmware(EditFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditFirmware", EditFirmwareResponse.class);
    }

    /**
     *本接口（EnableTopicRule）用于启用规则
     * @param req EnableTopicRuleRequest
     * @return EnableTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableTopicRuleResponse EnableTopicRule(EnableTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableTopicRule", EnableTopicRuleResponse.class);
    }

    /**
     *本接口（GetAllVersion）用于获取所有的版本列表
     * @param req GetAllVersionRequest
     * @return GetAllVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetAllVersionResponse GetAllVersion(GetAllVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAllVersion", GetAllVersionResponse.class);
    }

    /**
     *本接口（GetCOSURL）用于获取固件存储在COS的URL
     * @param req GetCOSURLRequest
     * @return GetCOSURLResponse
     * @throws TencentCloudSDKException
     */
    public GetCOSURLResponse GetCOSURL(GetCOSURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCOSURL", GetCOSURLResponse.class);
    }

    /**
     *本接口（GetUserResourceInfo）用于查询用户资源使用信息。
     * @param req GetUserResourceInfoRequest
     * @return GetUserResourceInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetUserResourceInfoResponse GetUserResourceInfo(GetUserResourceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUserResourceInfo", GetUserResourceInfoResponse.class);
    }

    /**
     *本接口（ListFirmwares）用于获取固件列表
     * @param req ListFirmwaresRequest
     * @return ListFirmwaresResponse
     * @throws TencentCloudSDKException
     */
    public ListFirmwaresResponse ListFirmwares(ListFirmwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFirmwares", ListFirmwaresResponse.class);
    }

    /**
     *本接口（ListLog）用于查看日志信息
     * @param req ListLogRequest
     * @return ListLogResponse
     * @throws TencentCloudSDKException
     */
    public ListLogResponse ListLog(ListLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLog", ListLogResponse.class);
    }

    /**
     *获取日志内容列表
     * @param req ListLogPayloadRequest
     * @return ListLogPayloadResponse
     * @throws TencentCloudSDKException
     */
    public ListLogPayloadResponse ListLogPayload(ListLogPayloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLogPayload", ListLogPayloadResponse.class);
    }

    /**
     *获取设备上报的日志
     * @param req ListSDKLogRequest
     * @return ListSDKLogResponse
     * @throws TencentCloudSDKException
     */
    public ListSDKLogResponse ListSDKLog(ListSDKLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSDKLog", ListSDKLogResponse.class);
    }

    /**
     *本接口（ListTopicRules）用于分页获取规则列表
     * @param req ListTopicRulesRequest
     * @return ListTopicRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListTopicRulesResponse ListTopicRules(ListTopicRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTopicRules", ListTopicRulesResponse.class);
    }

    /**
     *发布广播消息
     * @param req PublishBroadcastMessageRequest
     * @return PublishBroadcastMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishBroadcastMessageResponse PublishBroadcastMessage(PublishBroadcastMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishBroadcastMessage", PublishBroadcastMessageResponse.class);
    }

    /**
     *本接口（PublishMessage）用于向某个主题发消息。 
     * @param req PublishMessageRequest
     * @return PublishMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishMessageResponse PublishMessage(PublishMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishMessage", PublishMessageResponse.class);
    }

    /**
     *发布RRPC消息
     * @param req PublishRRPCMessageRequest
     * @return PublishRRPCMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishRRPCMessageResponse PublishRRPCMessage(PublishRRPCMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishRRPCMessage", PublishRRPCMessageResponse.class);
    }

    /**
     *本接口（ReplaceTopicRule）用于修改替换规则 
     * @param req ReplaceTopicRuleRequest
     * @return ReplaceTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceTopicRuleResponse ReplaceTopicRule(ReplaceTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceTopicRule", ReplaceTopicRuleResponse.class);
    }

    /**
     *重置设备的连接状态
     * @param req ResetDeviceStateRequest
     * @return ResetDeviceStateResponse
     * @throws TencentCloudSDKException
     */
    public ResetDeviceStateResponse ResetDeviceState(ResetDeviceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDeviceState", ResetDeviceStateResponse.class);
    }

    /**
     *重试设备升级任务
     * @param req RetryDeviceFirmwareTaskRequest
     * @return RetryDeviceFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public RetryDeviceFirmwareTaskResponse RetryDeviceFirmwareTask(RetryDeviceFirmwareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryDeviceFirmwareTask", RetryDeviceFirmwareTaskResponse.class);
    }

    /**
     *批量设置产品禁用状态
     * @param req SetProductsForbiddenStatusRequest
     * @return SetProductsForbiddenStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetProductsForbiddenStatusResponse SetProductsForbiddenStatus(SetProductsForbiddenStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetProductsForbiddenStatus", SetProductsForbiddenStatusResponse.class);
    }

    /**
     *本接口（UnbindDevices）用于网关设备批量解绑子设备
     * @param req UnbindDevicesRequest
     * @return UnbindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDevicesResponse UnbindDevices(UnbindDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindDevices", UnbindDevicesResponse.class);
    }

    /**
     *启用或者禁用设备 
     * @param req UpdateDeviceAvailableStateRequest
     * @return UpdateDeviceAvailableStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceAvailableStateResponse UpdateDeviceAvailableState(UpdateDeviceAvailableStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceAvailableState", UpdateDeviceAvailableStateResponse.class);
    }

    /**
     *设置设备上报的日志级别
     * @param req UpdateDeviceLogLevelRequest
     * @return UpdateDeviceLogLevelResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceLogLevelResponse UpdateDeviceLogLevel(UpdateDeviceLogLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceLogLevel", UpdateDeviceLogLevelResponse.class);
    }

    /**
     *本接口（UpdateDevicePSK）用于更新设备的PSK
     * @param req UpdateDevicePSKRequest
     * @return UpdateDevicePSKResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDevicePSKResponse UpdateDevicePSK(UpdateDevicePSKRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDevicePSK", UpdateDevicePSKResponse.class);
    }

    /**
     *本接口（UpdateDeviceShadow）用于更新虚拟设备信息。
     * @param req UpdateDeviceShadowRequest
     * @return UpdateDeviceShadowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceShadowResponse UpdateDeviceShadow(UpdateDeviceShadowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceShadow", UpdateDeviceShadowResponse.class);
    }

    /**
     *批量启用或者禁用设备 
     * @param req UpdateDevicesEnableStateRequest
     * @return UpdateDevicesEnableStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDevicesEnableStateResponse UpdateDevicesEnableState(UpdateDevicesEnableStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDevicesEnableState", UpdateDevicesEnableStateResponse.class);
    }

    /**
     *本接口（UpdateOtaTask）当固件升级大任务处于没有在全部成功的状态时，可修改为取消状态，取消部分或全部设备的升级;或其它允许的可修改的状态
     * @param req UpdateOtaTaskStatusRequest
     * @return UpdateOtaTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOtaTaskStatusResponse UpdateOtaTaskStatus(UpdateOtaTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOtaTaskStatus", UpdateOtaTaskStatusResponse.class);
    }

    /**
     *更新私有CA证书
     * @param req UpdatePrivateCARequest
     * @return UpdatePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrivateCAResponse UpdatePrivateCA(UpdatePrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrivateCA", UpdatePrivateCAResponse.class);
    }

    /**
     *更新产品动态注册的配置
     * @param req UpdateProductDynamicRegisterRequest
     * @return UpdateProductDynamicRegisterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProductDynamicRegisterResponse UpdateProductDynamicRegister(UpdateProductDynamicRegisterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProductDynamicRegister", UpdateProductDynamicRegisterResponse.class);
    }

    /**
     *更新产品的私有CA
     * @param req UpdateProductPrivateCARequest
     * @return UpdateProductPrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProductPrivateCAResponse UpdateProductPrivateCA(UpdateProductPrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProductPrivateCA", UpdateProductPrivateCAResponse.class);
    }

    /**
     *本接口（UpdateTopicPolicy）用于更新Topic信息
     * @param req UpdateTopicPolicyRequest
     * @return UpdateTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTopicPolicyResponse UpdateTopicPolicy(UpdateTopicPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTopicPolicy", UpdateTopicPolicyResponse.class);
    }

    /**
     *本接口（UploadFirmware）用于上传设备固件信息
     * @param req UploadFirmwareRequest
     * @return UploadFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public UploadFirmwareResponse UploadFirmware(UploadFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFirmware", UploadFirmwareResponse.class);
    }

}
