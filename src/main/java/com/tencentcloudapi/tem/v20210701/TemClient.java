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
     *生成Cos临时秘钥
     * @param req CreateCosTokenRequest
     * @return CreateCosTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenResponse CreateCosToken(CreateCosTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCosTokenResponse> rsp = null;
        String rspStr = "";
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
     *绑定云资源
     * @param req CreateResourceRequest
     * @return CreateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceResponse CreateResource(CreateResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourceResponse> rsp = null;
        String rspStr = "";
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
     *删除 Ingress 规则
     * @param req DeleteIngressRequest
     * @return DeleteIngressResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIngressResponse DeleteIngress(DeleteIngressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIngressResponse> rsp = null;
        String rspStr = "";
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
     *获取应用实例列表
     * @param req DescribeApplicationPodsRequest
     * @return DescribeApplicationPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationPodsResponse DescribeApplicationPods(DescribeApplicationPodsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationPodsResponse> rsp = null;
        String rspStr = "";
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
     *获取分批发布详情
     * @param req DescribeDeployApplicationDetailRequest
     * @return DescribeDeployApplicationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployApplicationDetailResponse DescribeDeployApplicationDetail(DescribeDeployApplicationDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeployApplicationDetailResponse> rsp = null;
        String rspStr = "";
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
     *获取租户环境列表
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentsResponse> rsp = null;
        String rspStr = "";
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
     *查询应用关联的 Ingress 规则列表
     * @param req DescribeRelatedIngressesRequest
     * @return DescribeRelatedIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedIngressesResponse DescribeRelatedIngresses(DescribeRelatedIngressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRelatedIngressesResponse> rsp = null;
        String rspStr = "";
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
     *生成应用程序包预签名下载链接
     * @param req GenerateApplicationPackageDownloadUrlRequest
     * @return GenerateApplicationPackageDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateApplicationPackageDownloadUrlResponse GenerateApplicationPackageDownloadUrl(GenerateApplicationPackageDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateApplicationPackageDownloadUrlResponse> rsp = null;
        String rspStr = "";
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
     *修改应用基本信息
     * @param req ModifyApplicationInfoRequest
     * @return ModifyApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationInfoResponse ModifyApplicationInfo(ModifyApplicationInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationInfoResponse> rsp = null;
        String rspStr = "";
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
     *编辑环境
     * @param req ModifyEnvironmentRequest
     * @return ModifyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentResponse ModifyEnvironment(ModifyEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvironmentResponse> rsp = null;
        String rspStr = "";
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
     *服务重启
     * @param req RestartApplicationRequest
     * @return RestartApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationResponse RestartApplication(RestartApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartApplicationResponse> rsp = null;
        String rspStr = "";
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
