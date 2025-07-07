/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplication", CreateApplicationResponse.class);
    }

    /**
     *创建弹性伸缩策略组合
     * @param req CreateApplicationAutoscalerRequest
     * @return CreateApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationAutoscalerResponse CreateApplicationAutoscaler(CreateApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationAutoscaler", CreateApplicationAutoscalerResponse.class);
    }

    /**
     *新增访问方式
     * @param req CreateApplicationServiceRequest
     * @return CreateApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationServiceResponse CreateApplicationService(CreateApplicationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationService", CreateApplicationServiceResponse.class);
    }

    /**
     *创建配置
     * @param req CreateConfigDataRequest
     * @return CreateConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigDataResponse CreateConfigData(CreateConfigDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigData", CreateConfigDataResponse.class);
    }

    /**
     *生成Cos临时密钥
     * @param req CreateCosTokenRequest
     * @return CreateCosTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenResponse CreateCosToken(CreateCosTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosToken", CreateCosTokenResponse.class);
    }

    /**
     *创建环境
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnvironment", CreateEnvironmentResponse.class);
    }

    /**
     *创建日志收集配置
     * @param req CreateLogConfigRequest
     * @return CreateLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogConfigResponse CreateLogConfig(CreateLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogConfig", CreateLogConfigResponse.class);
    }

    /**
     *绑定云资源
     * @param req CreateResourceRequest
     * @return CreateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceResponse CreateResource(CreateResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResource", CreateResourceResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplication", DeleteApplicationResponse.class);
    }

    /**
     *删除应用弹性策略组合
     * @param req DeleteApplicationAutoscalerRequest
     * @return DeleteApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationAutoscalerResponse DeleteApplicationAutoscaler(DeleteApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationAutoscaler", DeleteApplicationAutoscalerResponse.class);
    }

    /**
     *删除一条访问方式
     * @param req DeleteApplicationServiceRequest
     * @return DeleteApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationServiceResponse DeleteApplicationService(DeleteApplicationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationService", DeleteApplicationServiceResponse.class);
    }

    /**
     *删除 Ingress 规则
     * @param req DeleteIngressRequest
     * @return DeleteIngressResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIngressResponse DeleteIngress(DeleteIngressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIngress", DeleteIngressResponse.class);
    }

    /**
     *应用部署
     * @param req DeployApplicationRequest
     * @return DeployApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeployApplicationResponse DeployApplication(DeployApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployApplication", DeployApplicationResponse.class);
    }

    /**
     *获取应用弹性策略组合
     * @param req DescribeApplicationAutoscalerListRequest
     * @return DescribeApplicationAutoscalerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationAutoscalerListResponse DescribeApplicationAutoscalerList(DescribeApplicationAutoscalerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationAutoscalerList", DescribeApplicationAutoscalerListResponse.class);
    }

    /**
     *服务基本信息查看
     * @param req DescribeApplicationInfoRequest
     * @return DescribeApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationInfoResponse DescribeApplicationInfo(DescribeApplicationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationInfo", DescribeApplicationInfoResponse.class);
    }

    /**
     *获取应用实例列表
     * @param req DescribeApplicationPodsRequest
     * @return DescribeApplicationPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationPodsResponse DescribeApplicationPods(DescribeApplicationPodsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationPods", DescribeApplicationPodsResponse.class);
    }

    /**
     *查询应用访问方式列表
     * @param req DescribeApplicationServiceListRequest
     * @return DescribeApplicationServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationServiceListResponse DescribeApplicationServiceList(DescribeApplicationServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationServiceList", DescribeApplicationServiceListResponse.class);
    }

    /**
     *获取运行服务列表
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplications", DescribeApplicationsResponse.class);
    }

    /**
     *单环境下所有应用状态查看
     * @param req DescribeApplicationsStatusRequest
     * @return DescribeApplicationsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsStatusResponse DescribeApplicationsStatus(DescribeApplicationsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationsStatus", DescribeApplicationsStatusResponse.class);
    }

    /**
     *查询配置详情
     * @param req DescribeConfigDataRequest
     * @return DescribeConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigDataResponse DescribeConfigData(DescribeConfigDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigData", DescribeConfigDataResponse.class);
    }

    /**
     *查询配置列表
     * @param req DescribeConfigDataListRequest
     * @return DescribeConfigDataListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigDataListResponse DescribeConfigDataList(DescribeConfigDataListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigDataList", DescribeConfigDataListResponse.class);
    }

    /**
     *获取分批发布详情
     * @param req DescribeDeployApplicationDetailRequest
     * @return DescribeDeployApplicationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployApplicationDetailResponse DescribeDeployApplicationDetail(DescribeDeployApplicationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployApplicationDetail", DescribeDeployApplicationDetailResponse.class);
    }

    /**
     *获取环境基础信息
     * @param req DescribeEnvironmentRequest
     * @return DescribeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentResponse DescribeEnvironment(DescribeEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironment", DescribeEnvironmentResponse.class);
    }

    /**
     *获取环境状态
     * @param req DescribeEnvironmentStatusRequest
     * @return DescribeEnvironmentStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentStatusResponse DescribeEnvironmentStatus(DescribeEnvironmentStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironmentStatus", DescribeEnvironmentStatusResponse.class);
    }

    /**
     *获取环境列表
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *查询 Ingress 规则
     * @param req DescribeIngressRequest
     * @return DescribeIngressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIngressResponse DescribeIngress(DescribeIngressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIngress", DescribeIngressResponse.class);
    }

    /**
     *查询 Ingress 规则列表
     * @param req DescribeIngressesRequest
     * @return DescribeIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIngressesResponse DescribeIngresses(DescribeIngressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIngresses", DescribeIngressesResponse.class);
    }

    /**
     *查询日志收集配置详情
     * @param req DescribeLogConfigRequest
     * @return DescribeLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogConfigResponse DescribeLogConfig(DescribeLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogConfig", DescribeLogConfigResponse.class);
    }

    /**
     *查询分页的日志收集配置列表
     * @param req DescribePagedLogConfigListRequest
     * @return DescribePagedLogConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePagedLogConfigListResponse DescribePagedLogConfigList(DescribePagedLogConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePagedLogConfigList", DescribePagedLogConfigListResponse.class);
    }

    /**
     *查询应用关联的 Ingress 规则列表
     * @param req DescribeRelatedIngressesRequest
     * @return DescribeRelatedIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedIngressesResponse DescribeRelatedIngresses(DescribeRelatedIngressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRelatedIngresses", DescribeRelatedIngressesResponse.class);
    }

    /**
     *销毁配置
     * @param req DestroyConfigDataRequest
     * @return DestroyConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public DestroyConfigDataResponse DestroyConfigData(DestroyConfigDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyConfigData", DestroyConfigDataResponse.class);
    }

    /**
     *销毁环境
     * @param req DestroyEnvironmentRequest
     * @return DestroyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DestroyEnvironmentResponse DestroyEnvironment(DestroyEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyEnvironment", DestroyEnvironmentResponse.class);
    }

    /**
     *销毁日志收集配置
     * @param req DestroyLogConfigRequest
     * @return DestroyLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DestroyLogConfigResponse DestroyLogConfig(DestroyLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyLogConfig", DestroyLogConfigResponse.class);
    }

    /**
     *关闭应用弹性策略组合
     * @param req DisableApplicationAutoscalerRequest
     * @return DisableApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public DisableApplicationAutoscalerResponse DisableApplicationAutoscaler(DisableApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableApplicationAutoscaler", DisableApplicationAutoscalerResponse.class);
    }

    /**
     *启用应用弹性策略组合
     * @param req EnableApplicationAutoscalerRequest
     * @return EnableApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public EnableApplicationAutoscalerResponse EnableApplicationAutoscaler(EnableApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableApplicationAutoscaler", EnableApplicationAutoscalerResponse.class);
    }

    /**
     *生成应用程序包预签名下载链接
     * @param req GenerateApplicationPackageDownloadUrlRequest
     * @return GenerateApplicationPackageDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateApplicationPackageDownloadUrlResponse GenerateApplicationPackageDownloadUrl(GenerateApplicationPackageDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateApplicationPackageDownloadUrl", GenerateApplicationPackageDownloadUrlResponse.class);
    }

    /**
     *修改弹性伸缩策略组合
     * @param req ModifyApplicationAutoscalerRequest
     * @return ModifyApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationAutoscalerResponse ModifyApplicationAutoscaler(ModifyApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationAutoscaler", ModifyApplicationAutoscalerResponse.class);
    }

    /**
     *修改应用基本信息
     * @param req ModifyApplicationInfoRequest
     * @return ModifyApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationInfoResponse ModifyApplicationInfo(ModifyApplicationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationInfo", ModifyApplicationInfoResponse.class);
    }

    /**
     *修改应用实例数量
     * @param req ModifyApplicationReplicasRequest
     * @return ModifyApplicationReplicasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationReplicasResponse ModifyApplicationReplicas(ModifyApplicationReplicasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationReplicas", ModifyApplicationReplicasResponse.class);
    }

    /**
     *修改服务访问方式列表
     * @param req ModifyApplicationServiceRequest
     * @return ModifyApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationServiceResponse ModifyApplicationService(ModifyApplicationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationService", ModifyApplicationServiceResponse.class);
    }

    /**
     *编辑配置
     * @param req ModifyConfigDataRequest
     * @return ModifyConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigDataResponse ModifyConfigData(ModifyConfigDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConfigData", ModifyConfigDataResponse.class);
    }

    /**
     *编辑环境
     * @param req ModifyEnvironmentRequest
     * @return ModifyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentResponse ModifyEnvironment(ModifyEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnvironment", ModifyEnvironmentResponse.class);
    }

    /**
     *修改网关的转发配置
     * @param req ModifyGatewayIngressRequest
     * @return ModifyGatewayIngressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatewayIngressResponse ModifyGatewayIngress(ModifyGatewayIngressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGatewayIngress", ModifyGatewayIngressResponse.class);
    }

    /**
     *此接口没有被使用了

创建或者更新 Ingress 规则
     * @param req ModifyIngressRequest
     * @return ModifyIngressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIngressResponse ModifyIngress(ModifyIngressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIngress", ModifyIngressResponse.class);
    }

    /**
     *编辑日志收集配置
     * @param req ModifyLogConfigRequest
     * @return ModifyLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogConfigResponse ModifyLogConfig(ModifyLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogConfig", ModifyLogConfigResponse.class);
    }

    /**
     *服务重启
     * @param req RestartApplicationRequest
     * @return RestartApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationResponse RestartApplication(RestartApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartApplication", RestartApplicationResponse.class);
    }

    /**
     *重启应用实例
     * @param req RestartApplicationPodRequest
     * @return RestartApplicationPodResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationPodResponse RestartApplicationPod(RestartApplicationPodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartApplicationPod", RestartApplicationPodResponse.class);
    }

    /**
     *开始下一批次发布
     * @param req ResumeDeployApplicationRequest
     * @return ResumeDeployApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ResumeDeployApplicationResponse ResumeDeployApplication(ResumeDeployApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeDeployApplication", ResumeDeployApplicationResponse.class);
    }

    /**
     *回滚分批发布
     * @param req RevertDeployApplicationRequest
     * @return RevertDeployApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RevertDeployApplicationResponse RevertDeployApplication(RevertDeployApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevertDeployApplication", RevertDeployApplicationResponse.class);
    }

    /**
     *更新应用部署版本
     * @param req RollingUpdateApplicationByVersionRequest
     * @return RollingUpdateApplicationByVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollingUpdateApplicationByVersionResponse RollingUpdateApplicationByVersion(RollingUpdateApplicationByVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollingUpdateApplicationByVersion", RollingUpdateApplicationByVersionResponse.class);
    }

    /**
     *服务停止
     * @param req StopApplicationRequest
     * @return StopApplicationResponse
     * @throws TencentCloudSDKException
     */
    public StopApplicationResponse StopApplication(StopApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopApplication", StopApplicationResponse.class);
    }

}
