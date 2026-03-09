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
package com.tencentcloudapi.cetcd.v20220325;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cetcd.v20220325.models.*;

public class CetcdClient extends AbstractClient{
    private static String endpoint = "cetcd.tencentcloudapi.com";
    private static String service = "cetcd";
    private static String version = "2022-03-25";

    public CetcdClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CetcdClient(Credential credential, String region, ClientProfile profile) {
        super(CetcdClient.endpoint, CetcdClient.version, credential, region, profile);
    }

    /**
     *创建etcd实例
     * @param req CreateEtcdInstanceRequest
     * @return CreateEtcdInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateEtcdInstanceResponse CreateEtcdInstance(CreateEtcdInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEtcdInstance", CreateEtcdInstanceResponse.class);
    }

    /**
     *创建etcd快照
     * @param req CreateEtcdSnapshotRequest
     * @return CreateEtcdSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateEtcdSnapshotResponse CreateEtcdSnapshot(CreateEtcdSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEtcdSnapshot", CreateEtcdSnapshotResponse.class);
    }

    /**
     *创建etcd快照策略
     * @param req CreateEtcdSnapshotPolicyRequest
     * @return CreateEtcdSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateEtcdSnapshotPolicyResponse CreateEtcdSnapshotPolicy(CreateEtcdSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEtcdSnapshotPolicy", CreateEtcdSnapshotPolicyResponse.class);
    }

    /**
     *查看etcd可用版本
     * @param req DescribeEtcdAvailableVersionsRequest
     * @return DescribeEtcdAvailableVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdAvailableVersionsResponse DescribeEtcdAvailableVersions(DescribeEtcdAvailableVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdAvailableVersions", DescribeEtcdAvailableVersionsResponse.class);
    }

    /**
     *查看etcd集群创建进度
     * @param req DescribeEtcdCreatingProgressRequest
     * @return DescribeEtcdCreatingProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdCreatingProgressResponse DescribeEtcdCreatingProgress(DescribeEtcdCreatingProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdCreatingProgress", DescribeEtcdCreatingProgressResponse.class);
    }

    /**
     *查询etcd访问凭证
     * @param req DescribeEtcdCredentialsRequest
     * @return DescribeEtcdCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdCredentialsResponse DescribeEtcdCredentials(DescribeEtcdCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdCredentials", DescribeEtcdCredentialsResponse.class);
    }

    /**
     *查询etcd实例列表
     * @param req DescribeEtcdInstancesRequest
     * @return DescribeEtcdInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdInstancesResponse DescribeEtcdInstances(DescribeEtcdInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdInstances", DescribeEtcdInstancesResponse.class);
    }

    /**
     *查看etcd集群配额
     * @param req DescribeEtcdQuotaRequest
     * @return DescribeEtcdQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdQuotaResponse DescribeEtcdQuota(DescribeEtcdQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdQuota", DescribeEtcdQuotaResponse.class);
    }

    /**
     *查看etcd支持地域
     * @param req DescribeEtcdRegionsRequest
     * @return DescribeEtcdRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdRegionsResponse DescribeEtcdRegions(DescribeEtcdRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdRegions", DescribeEtcdRegionsResponse.class);
    }

    /**
     *查看etcd快照策略
     * @param req DescribeEtcdSnapshotPoliciesRequest
     * @return DescribeEtcdSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdSnapshotPoliciesResponse DescribeEtcdSnapshotPolicies(DescribeEtcdSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdSnapshotPolicies", DescribeEtcdSnapshotPoliciesResponse.class);
    }

    /**
     *查看etcd快照列表
     * @param req DescribeEtcdSnapshotsRequest
     * @return DescribeEtcdSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdSnapshotsResponse DescribeEtcdSnapshots(DescribeEtcdSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdSnapshots", DescribeEtcdSnapshotsResponse.class);
    }

    /**
     *查看etcd相关tasks
     * @param req DescribeEtcdTasksRequest
     * @return DescribeEtcdTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtcdTasksResponse DescribeEtcdTasks(DescribeEtcdTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtcdTasks", DescribeEtcdTasksResponse.class);
    }

    /**
     *获取etcd集群的gRPC方法列表
     * @param req DescribeRPCMethodListRequest
     * @return DescribeRPCMethodListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRPCMethodListResponse DescribeRPCMethodList(DescribeRPCMethodListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRPCMethodList", DescribeRPCMethodListResponse.class);
    }

    /**
     *关闭etcd实例删除保护
     * @param req DisableEtcdInstanceDeletionProtectionRequest
     * @return DisableEtcdInstanceDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DisableEtcdInstanceDeletionProtectionResponse DisableEtcdInstanceDeletionProtection(DisableEtcdInstanceDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableEtcdInstanceDeletionProtection", DisableEtcdInstanceDeletionProtectionResponse.class);
    }

    /**
     *启用etcd实例删除保护
     * @param req EnableEtcdInstanceDeletionProtectionRequest
     * @return EnableEtcdInstanceDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public EnableEtcdInstanceDeletionProtectionResponse EnableEtcdInstanceDeletionProtection(EnableEtcdInstanceDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableEtcdInstanceDeletionProtection", EnableEtcdInstanceDeletionProtectionResponse.class);
    }

    /**
     *修改etcd实例属性
     * @param req ModifyEtcdAttributeRequest
     * @return ModifyEtcdAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEtcdAttributeResponse ModifyEtcdAttribute(ModifyEtcdAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEtcdAttribute", ModifyEtcdAttributeResponse.class);
    }

    /**
     *修改etcd实例配置
     * @param req ModifyEtcdConfigurationRequest
     * @return ModifyEtcdConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEtcdConfigurationResponse ModifyEtcdConfiguration(ModifyEtcdConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEtcdConfiguration", ModifyEtcdConfigurationResponse.class);
    }

    /**
     *修改etcd快照策略
     * @param req ModifyEtcdSnapshotPolicyRequest
     * @return ModifyEtcdSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEtcdSnapshotPolicyResponse ModifyEtcdSnapshotPolicy(ModifyEtcdSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEtcdSnapshotPolicy", ModifyEtcdSnapshotPolicyResponse.class);
    }

    /**
     *扩容etcd实例
     * @param req ResizeEtcdInstanceRequest
     * @return ResizeEtcdInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResizeEtcdInstanceResponse ResizeEtcdInstance(ResizeEtcdInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeEtcdInstance", ResizeEtcdInstanceResponse.class);
    }

    /**
     *升级etcd实例
     * @param req UpgradeEtcdInstanceRequest
     * @return UpgradeEtcdInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeEtcdInstanceResponse UpgradeEtcdInstance(UpgradeEtcdInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeEtcdInstance", UpgradeEtcdInstanceResponse.class);
    }

}
