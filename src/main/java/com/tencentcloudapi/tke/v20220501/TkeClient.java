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
package com.tencentcloudapi.tke.v20220501;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tke.v20220501.models.*;

public class TkeClient extends AbstractClient{
    private static String endpoint = "tke.tencentcloudapi.com";
    private static String service = "tke";
    private static String version = "2022-05-01";
    
    public TkeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TkeClient(Credential credential, String region, ClientProfile profile) {
        super(TkeClient.endpoint, TkeClient.version, credential, region, profile);
    }

    /**
     *创建健康检测策略
     * @param req CreateHealthCheckPolicyRequest
     * @return CreateHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateHealthCheckPolicyResponse CreateHealthCheckPolicy(CreateHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHealthCheckPolicy", CreateHealthCheckPolicyResponse.class);
    }

    /**
     *创建 TKE 节点池
     * @param req CreateNodePoolRequest
     * @return CreateNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateNodePoolResponse CreateNodePool(CreateNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNodePool", CreateNodePoolResponse.class);
    }

    /**
     *删除健康检测策略
     * @param req DeleteHealthCheckPolicyRequest
     * @return DeleteHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHealthCheckPolicyResponse DeleteHealthCheckPolicy(DeleteHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHealthCheckPolicy", DeleteHealthCheckPolicyResponse.class);
    }

    /**
     *删除 TKE 节点池
     * @param req DeleteNodePoolRequest
     * @return DeleteNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodePoolResponse DeleteNodePool(DeleteNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNodePool", DeleteNodePoolResponse.class);
    }

    /**
     *查询集群下节点实例信息
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstances", DescribeClusterInstancesResponse.class);
    }

    /**
     *查询健康检测策略
     * @param req DescribeHealthCheckPoliciesRequest
     * @return DescribeHealthCheckPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckPoliciesResponse DescribeHealthCheckPolicies(DescribeHealthCheckPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckPolicies", DescribeHealthCheckPoliciesResponse.class);
    }

    /**
     *查询健康检测策略绑定关系
     * @param req DescribeHealthCheckPolicyBindingsRequest
     * @return DescribeHealthCheckPolicyBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckPolicyBindingsResponse DescribeHealthCheckPolicyBindings(DescribeHealthCheckPolicyBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckPolicyBindings", DescribeHealthCheckPolicyBindingsResponse.class);
    }

    /**
     *查询健康检测策略模板
     * @param req DescribeHealthCheckTemplateRequest
     * @return DescribeHealthCheckTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckTemplateResponse DescribeHealthCheckTemplate(DescribeHealthCheckTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckTemplate", DescribeHealthCheckTemplateResponse.class);
    }

    /**
     *查询 TKE 节点池列表
     * @param req DescribeNodePoolsRequest
     * @return DescribeNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodePoolsResponse DescribeNodePools(DescribeNodePoolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodePools", DescribeNodePoolsResponse.class);
    }

    /**
     *修改健康检测策略
     * @param req ModifyHealthCheckPolicyRequest
     * @return ModifyHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHealthCheckPolicyResponse ModifyHealthCheckPolicy(ModifyHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHealthCheckPolicy", ModifyHealthCheckPolicyResponse.class);
    }

    /**
     *更新 TKE 节点池
     * @param req ModifyNodePoolRequest
     * @return ModifyNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolResponse ModifyNodePool(ModifyNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodePool", ModifyNodePoolResponse.class);
    }

}
