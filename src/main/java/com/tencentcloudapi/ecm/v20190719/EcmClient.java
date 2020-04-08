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
package com.tencentcloudapi.ecm.v20190719;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ecm.v20190719.models.*;

public class EcmClient extends AbstractClient{
    private static String endpoint = "ecm.tencentcloudapi.com";
    private static String version = "2019-07-19";

    public EcmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EcmClient(Credential credential, String region, ClientProfile profile) {
        super(EcmClient.endpoint, EcmClient.version, credential, region, profile);
    }

    /**
     *创建模块
     * @param req CreateModuleRequest
     * @return CreateModuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateModuleResponse CreateModule(CreateModuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateModuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateModuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateModule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除镜像
     * @param req DeleteImageRequest
     * @return DeleteImageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageResponse DeleteImage(DeleteImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除业务模块
     * @param req DeleteModuleRequest
     * @return DeleteModuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModuleResponse DeleteModule(DeleteModuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteModuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteModuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteModule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取概览页统计的基本数据
     * @param req DescribeBaseOverviewRequest
     * @return DescribeBaseOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseOverviewResponse DescribeBaseOverview(DescribeBaseOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaseOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaseOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBaseOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取带宽硬盘等数据的限制
     * @param req DescribeConfigRequest
     * @return DescribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigResponse DescribeConfig(DescribeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示镜像列表
     * @param req DescribeImageRequest
     * @return DescribeImageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageResponse DescribeImage(DescribeImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取机型配置列表
     * @param req DescribeInstanceTypeConfigRequest
     * @return DescribeInstanceTypeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypeConfigResponse DescribeInstanceTypeConfig(DescribeInstanceTypeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceTypeConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceTypeConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceTypeConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例的相关信息。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过实例id获取当前禁止的操作
     * @param req DescribeInstancesDeniedActionsRequest
     * @return DescribeInstancesDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDeniedActionsResponse DescribeInstancesDeniedActions(DescribeInstancesDeniedActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesDeniedActionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesDeniedActionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstancesDeniedActions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取模块列表
     * @param req DescribeModuleRequest
     * @return DescribeModuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModuleResponse DescribeModule(DescribeModuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeModule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示模块详细信息
     * @param req DescribeModuleDetailRequest
     * @return DescribeModuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModuleDetailResponse DescribeModuleDetail(DescribeModuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModuleDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModuleDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeModuleDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取节点列表
     * @param req DescribeNodeRequest
     * @return DescribeNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeResponse DescribeNode(DescribeNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CPU 内存 硬盘等基础信息峰值数据
     * @param req DescribePeakBaseOverviewRequest
     * @return DescribePeakBaseOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakBaseOverviewResponse DescribePeakBaseOverview(DescribePeakBaseOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePeakBaseOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePeakBaseOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePeakBaseOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取网络峰值数据
     * @param req DescribePeakNetworkOverviewRequest
     * @return DescribePeakNetworkOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakNetworkOverviewResponse DescribePeakNetworkOverview(DescribePeakNetworkOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePeakNetworkOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePeakNetworkOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePeakNetworkOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从CVM产品导入镜像到ECM
     * @param req ImportImageRequest
     * @return ImportImageResponse
     * @throws TencentCloudSDKException
     */
    public ImportImageResponse ImportImage(ImportImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportImageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImportImageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImportImage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例的属性。
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstancesAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ModifyModuleImage
     * @param req ModifyModuleImageRequest
     * @return ModifyModuleImageResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleImageResponse ModifyModuleImage(ModifyModuleImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModuleImageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModuleImageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyModuleImage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改模块名称
     * @param req ModifyModuleNameRequest
     * @return ModifyModuleNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleNameResponse ModifyModuleName(ModifyModuleNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModuleNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModuleNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyModuleName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改模块默认带宽上限
     * @param req ModifyModuleNetworkRequest
     * @return ModifyModuleNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleNetworkResponse ModifyModuleNetwork(ModifyModuleNetworkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModuleNetworkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModuleNetworkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyModuleNetwork"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *只有状态为RUNNING的实例才可以进行此操作；接口调用成功时，实例会进入REBOOTING状态；重启实例成功时，实例会进入RUNNING状态；支持强制重启，强制重启的效果等同于关闭物理计算机的电源开关再重新启动。强制重启可能会导致数据丢失或文件系统损坏，请仅在服务器不能正常重启时使用。
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebootInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RebootInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RebootInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重装实例，若指定了ImageId参数，则使用指定的镜像重装；否则按照当前实例使用的镜像进行重装；若未指定密码，则密码通过站内信形式随后发送。
     * @param req ResetInstancesRequest
     * @return ResetInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesResponse ResetInstances(ResetInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置实例的最大带宽上限。
     * @param req ResetInstancesMaxBandwidthRequest
     * @return ResetInstancesMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesMaxBandwidthResponse ResetInstancesMaxBandwidth(ResetInstancesMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesMaxBandwidthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesMaxBandwidthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetInstancesMaxBandwidth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁实例
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TerminateInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
