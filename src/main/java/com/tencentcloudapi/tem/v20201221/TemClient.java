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
package com.tencentcloudapi.tem.v20201221;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tem.v20201221.models.*;

public class TemClient extends AbstractClient{
    private static String endpoint = "tem.tencentcloudapi.com";
    private static String service = "tem";
    private static String version = "2020-12-21";
    
    public TemClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TemClient(Credential credential, String region, ClientProfile profile) {
        super(TemClient.endpoint, TemClient.version, credential, region, profile);
    }

    /**
     *生成Cos临时秘钥
     * @param req CreateCosTokenRequest
     * @return CreateCosTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenResponse CreateCosToken(CreateCosTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosToken", CreateCosTokenResponse.class);
    }

    /**
     *生成Cos临时秘钥
     * @param req CreateCosTokenV2Request
     * @return CreateCosTokenV2Response
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenV2Response CreateCosTokenV2(CreateCosTokenV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosTokenV2", CreateCosTokenV2Response.class);
    }

    /**
     *创建环境
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNamespace", CreateNamespaceResponse.class);
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
     *创建服务
     * @param req CreateServiceV2Request
     * @return CreateServiceV2Response
     * @throws TencentCloudSDKException
     */
    public CreateServiceV2Response CreateServiceV2(CreateServiceV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceV2", CreateServiceV2Response.class);
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
     *服务部署
     * @param req DeployServiceV2Request
     * @return DeployServiceV2Response
     * @throws TencentCloudSDKException
     */
    public DeployServiceV2Response DeployServiceV2(DeployServiceV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployServiceV2", DeployServiceV2Response.class);
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
     *获取租户环境列表
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNamespaces", DescribeNamespacesResponse.class);
    }

    /**
     *查询服务关联的 Ingress 规则列表
     * @param req DescribeRelatedIngressesRequest
     * @return DescribeRelatedIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedIngressesResponse DescribeRelatedIngresses(DescribeRelatedIngressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRelatedIngresses", DescribeRelatedIngressesResponse.class);
    }

    /**
     *获取服务下面运行pod列表
     * @param req DescribeServiceRunPodListV2Request
     * @return DescribeServiceRunPodListV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeServiceRunPodListV2Response DescribeServiceRunPodListV2(DescribeServiceRunPodListV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceRunPodListV2", DescribeServiceRunPodListV2Response.class);
    }

    /**
     *生成包预签名下载链接
     * @param req GenerateDownloadUrlRequest
     * @return GenerateDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDownloadUrlResponse GenerateDownloadUrl(GenerateDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateDownloadUrl", GenerateDownloadUrlResponse.class);
    }

    /**
     *创建或者更新 Ingress 规则
     * @param req ModifyIngressRequest
     * @return ModifyIngressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIngressResponse ModifyIngress(ModifyIngressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIngress", ModifyIngressResponse.class);
    }

    /**
     *编辑环境
     * @param req ModifyNamespaceRequest
     * @return ModifyNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNamespaceResponse ModifyNamespace(ModifyNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNamespace", ModifyNamespaceResponse.class);
    }

    /**
     *修改服务基本信息
     * @param req ModifyServiceInfoRequest
     * @return ModifyServiceInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceInfoResponse ModifyServiceInfo(ModifyServiceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceInfo", ModifyServiceInfoResponse.class);
    }

    /**
     *重启实例
     * @param req RestartServiceRunPodRequest
     * @return RestartServiceRunPodResponse
     * @throws TencentCloudSDKException
     */
    public RestartServiceRunPodResponse RestartServiceRunPod(RestartServiceRunPodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartServiceRunPod", RestartServiceRunPodResponse.class);
    }

}
