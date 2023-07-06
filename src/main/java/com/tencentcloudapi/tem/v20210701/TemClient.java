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
package com.tencentcloudapi.tem.v20210701;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tem.v20210701.models.*;

public class TemClient extends AbstractClient{
    private static String endpoint = "tem.tencentcloudapi.com";
    private static String service = "tem";
    private static String version = "2021-07-01";
    
    public TemClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TemClient(Credential credential, String region, ClientProfile profile) {
        super(TemClient.endpoint, TemClient.version, credential, region, profile);
    }

    /**
     *创建应用
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建弹性伸缩策略组合
     * @param req CreateApplicationAutoscalerRequest
     * @return CreateApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationAutoscalerResponse CreateApplicationAutoscaler(CreateApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationAutoscalerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationAutoscalerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationAutoscaler");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增访问方式
     * @param req CreateApplicationServiceRequest
     * @return CreateApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationServiceResponse CreateApplicationService(CreateApplicationServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建配置
     * @param req CreateConfigDataRequest
     * @return CreateConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigDataResponse CreateConfigData(CreateConfigDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConfigDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConfigDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConfigData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成Cos临时秘钥
     * @param req CreateCosTokenRequest
     * @return CreateCosTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenResponse CreateCosToken(CreateCosTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCosTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCosTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCosToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建环境
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEnvironmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建日志收集配置
     * @param req CreateLogConfigRequest
     * @return CreateLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogConfigResponse CreateLogConfig(CreateLogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLogConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定云资源
     * @param req CreateResourceRequest
     * @return CreateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceResponse CreateResource(CreateResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *服务删除
  - 停止当前运行服务
  - 删除服务相关资源
  - 删除服务
     * @param req DeleteApplicationRequest
     * @return DeleteApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除应用弹性策略组合
     * @param req DeleteApplicationAutoscalerRequest
     * @return DeleteApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationAutoscalerResponse DeleteApplicationAutoscaler(DeleteApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationAutoscalerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationAutoscalerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplicationAutoscaler");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一条访问方式
     * @param req DeleteApplicationServiceRequest
     * @return DeleteApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationServiceResponse DeleteApplicationService(DeleteApplicationServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplicationService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除 Ingress 规则
     * @param req DeleteIngressRequest
     * @return DeleteIngressResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIngressResponse DeleteIngress(DeleteIngressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIngressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIngressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIngress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *应用部署
     * @param req DeployApplicationRequest
     * @return DeployApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeployApplicationResponse DeployApplication(DeployApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeployApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用弹性策略组合
     * @param req DescribeApplicationAutoscalerListRequest
     * @return DescribeApplicationAutoscalerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationAutoscalerListResponse DescribeApplicationAutoscalerList(DescribeApplicationAutoscalerListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationAutoscalerListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationAutoscalerListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationAutoscalerList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *服务基本信息查看
     * @param req DescribeApplicationInfoRequest
     * @return DescribeApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationInfoResponse DescribeApplicationInfo(DescribeApplicationInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用实例列表
     * @param req DescribeApplicationPodsRequest
     * @return DescribeApplicationPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationPodsResponse DescribeApplicationPods(DescribeApplicationPodsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationPodsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationPodsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationPods");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询应用访问方式列表
     * @param req DescribeApplicationServiceListRequest
     * @return DescribeApplicationServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationServiceListResponse DescribeApplicationServiceList(DescribeApplicationServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationServiceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationServiceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationServiceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取运行服务列表
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *单环境下所有应用状态查看
     * @param req DescribeApplicationsStatusRequest
     * @return DescribeApplicationsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsStatusResponse DescribeApplicationsStatus(DescribeApplicationsStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationsStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationsStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationsStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询配置详情
     * @param req DescribeConfigDataRequest
     * @return DescribeConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigDataResponse DescribeConfigData(DescribeConfigDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询配置列表
     * @param req DescribeConfigDataListRequest
     * @return DescribeConfigDataListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigDataListResponse DescribeConfigDataList(DescribeConfigDataListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigDataListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigDataListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigDataList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分批发布详情
     * @param req DescribeDeployApplicationDetailRequest
     * @return DescribeDeployApplicationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployApplicationDetailResponse DescribeDeployApplicationDetail(DescribeDeployApplicationDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeployApplicationDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeployApplicationDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeployApplicationDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取环境基础信息
     * @param req DescribeEnvironmentRequest
     * @return DescribeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentResponse DescribeEnvironment(DescribeEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取环境状态
     * @param req DescribeEnvironmentStatusRequest
     * @return DescribeEnvironmentStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentStatusResponse DescribeEnvironmentStatus(DescribeEnvironmentStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvironmentStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvironmentStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取环境列表
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvironments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 Ingress 规则
     * @param req DescribeIngressRequest
     * @return DescribeIngressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIngressResponse DescribeIngress(DescribeIngressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIngressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIngressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIngress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 Ingress 规则列表
     * @param req DescribeIngressesRequest
     * @return DescribeIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIngressesResponse DescribeIngresses(DescribeIngressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIngressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIngressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIngresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询日志收集配置详情
     * @param req DescribeLogConfigRequest
     * @return DescribeLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogConfigResponse DescribeLogConfig(DescribeLogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询分页的日志收集配置列表
     * @param req DescribePagedLogConfigListRequest
     * @return DescribePagedLogConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePagedLogConfigListResponse DescribePagedLogConfigList(DescribePagedLogConfigListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePagedLogConfigListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePagedLogConfigListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePagedLogConfigList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询应用关联的 Ingress 规则列表
     * @param req DescribeRelatedIngressesRequest
     * @return DescribeRelatedIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedIngressesResponse DescribeRelatedIngresses(DescribeRelatedIngressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRelatedIngressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRelatedIngressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRelatedIngresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁配置
     * @param req DestroyConfigDataRequest
     * @return DestroyConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public DestroyConfigDataResponse DestroyConfigData(DestroyConfigDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyConfigDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyConfigDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyConfigData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁环境
     * @param req DestroyEnvironmentRequest
     * @return DestroyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DestroyEnvironmentResponse DestroyEnvironment(DestroyEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyEnvironmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁日志收集配置
     * @param req DestroyLogConfigRequest
     * @return DestroyLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DestroyLogConfigResponse DestroyLogConfig(DestroyLogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyLogConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyLogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyLogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关闭应用弹性策略组合
     * @param req DisableApplicationAutoscalerRequest
     * @return DisableApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public DisableApplicationAutoscalerResponse DisableApplicationAutoscaler(DisableApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableApplicationAutoscalerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DisableApplicationAutoscalerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableApplicationAutoscaler");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用应用弹性策略组合
     * @param req EnableApplicationAutoscalerRequest
     * @return EnableApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public EnableApplicationAutoscalerResponse EnableApplicationAutoscaler(EnableApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableApplicationAutoscalerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EnableApplicationAutoscalerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableApplicationAutoscaler");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成应用程序包预签名下载链接
     * @param req GenerateApplicationPackageDownloadUrlRequest
     * @return GenerateApplicationPackageDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateApplicationPackageDownloadUrlResponse GenerateApplicationPackageDownloadUrl(GenerateApplicationPackageDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateApplicationPackageDownloadUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateApplicationPackageDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateApplicationPackageDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改弹性伸缩策略组合
     * @param req ModifyApplicationAutoscalerRequest
     * @return ModifyApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationAutoscalerResponse ModifyApplicationAutoscaler(ModifyApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationAutoscalerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationAutoscalerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationAutoscaler");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用基本信息
     * @param req ModifyApplicationInfoRequest
     * @return ModifyApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationInfoResponse ModifyApplicationInfo(ModifyApplicationInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用实例数量
     * @param req ModifyApplicationReplicasRequest
     * @return ModifyApplicationReplicasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationReplicasResponse ModifyApplicationReplicas(ModifyApplicationReplicasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationReplicasResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationReplicasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationReplicas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改服务访问方式列表
     * @param req ModifyApplicationServiceRequest
     * @return ModifyApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationServiceResponse ModifyApplicationService(ModifyApplicationServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑配置
     * @param req ModifyConfigDataRequest
     * @return ModifyConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigDataResponse ModifyConfigData(ModifyConfigDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyConfigDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyConfigDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyConfigData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑环境
     * @param req ModifyEnvironmentRequest
     * @return ModifyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentResponse ModifyEnvironment(ModifyEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvironmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建或者更新 Ingress 规则
     * @param req ModifyIngressRequest
     * @return ModifyIngressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIngressResponse ModifyIngress(ModifyIngressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIngressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIngressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIngress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑日志收集配置
     * @param req ModifyLogConfigRequest
     * @return ModifyLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogConfigResponse ModifyLogConfig(ModifyLogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *服务重启
     * @param req RestartApplicationRequest
     * @return RestartApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationResponse RestartApplication(RestartApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启应用实例
     * @param req RestartApplicationPodRequest
     * @return RestartApplicationPodResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationPodResponse RestartApplicationPod(RestartApplicationPodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartApplicationPodResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartApplicationPodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartApplicationPod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开始下一批次发布
     * @param req ResumeDeployApplicationRequest
     * @return ResumeDeployApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ResumeDeployApplicationResponse ResumeDeployApplication(ResumeDeployApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeDeployApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeDeployApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeDeployApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *回滚分批发布
     * @param req RevertDeployApplicationRequest
     * @return RevertDeployApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RevertDeployApplicationResponse RevertDeployApplication(RevertDeployApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevertDeployApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RevertDeployApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RevertDeployApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新应用部署版本
     * @param req RollingUpdateApplicationByVersionRequest
     * @return RollingUpdateApplicationByVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollingUpdateApplicationByVersionResponse RollingUpdateApplicationByVersion(RollingUpdateApplicationByVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollingUpdateApplicationByVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RollingUpdateApplicationByVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollingUpdateApplicationByVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *服务停止
     * @param req StopApplicationRequest
     * @return StopApplicationResponse
     * @throws TencentCloudSDKException
     */
    public StopApplicationResponse StopApplication(StopApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
