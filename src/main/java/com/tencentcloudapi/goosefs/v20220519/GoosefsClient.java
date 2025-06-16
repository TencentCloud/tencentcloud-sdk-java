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
package com.tencentcloudapi.goosefs.v20220519;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.goosefs.v20220519.models.*;

public class GoosefsClient extends AbstractClient{
    private static String endpoint = "goosefs.tencentcloudapi.com";
    private static String service = "goosefs";
    private static String version = "2022-05-19";
    
    public GoosefsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GoosefsClient(Credential credential, String region, ClientProfile profile) {
        super(GoosefsClient.endpoint, GoosefsClient.version, credential, region, profile);
    }

    /**
     *为客户端节点添加跨vpc或子网访问能力
     * @param req AddCrossVpcSubnetSupportForClientNodeRequest
     * @return AddCrossVpcSubnetSupportForClientNodeResponse
     * @throws TencentCloudSDKException
     */
    public AddCrossVpcSubnetSupportForClientNodeResponse AddCrossVpcSubnetSupportForClientNode(AddCrossVpcSubnetSupportForClientNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCrossVpcSubnetSupportForClientNode", AddCrossVpcSubnetSupportForClientNodeResponse.class);
    }

    /**
     *为文件系统关联Bucket
     * @param req AttachFileSystemBucketRequest
     * @return AttachFileSystemBucketResponse
     * @throws TencentCloudSDKException
     */
    public AttachFileSystemBucketResponse AttachFileSystemBucket(AttachFileSystemBucketRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachFileSystemBucket", AttachFileSystemBucketResponse.class);
    }

    /**
     *批量添加客户端节点
     * @param req BatchAddClientNodesRequest
     * @return BatchAddClientNodesResponse
     * @throws TencentCloudSDKException
     */
    public BatchAddClientNodesResponse BatchAddClientNodes(BatchAddClientNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchAddClientNodes", BatchAddClientNodesResponse.class);
    }

    /**
     *批量删除客户端节点
     * @param req BatchDeleteClientNodesRequest
     * @return BatchDeleteClientNodesResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteClientNodesResponse BatchDeleteClientNodes(BatchDeleteClientNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteClientNodes", BatchDeleteClientNodesResponse.class);
    }

    /**
     *生成客户端的挂载命令
     * @param req BuildClientNodeMountCommandRequest
     * @return BuildClientNodeMountCommandResponse
     * @throws TencentCloudSDKException
     */
    public BuildClientNodeMountCommandResponse BuildClientNodeMountCommand(BuildClientNodeMountCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BuildClientNodeMountCommand", BuildClientNodeMountCommandResponse.class);
    }

    /**
     *创建数据流通任务,包括从将文件系统的数据上传到存储桶下, 以及从存储桶下载到文件系统里。
     * @param req CreateDataRepositoryTaskRequest
     * @return CreateDataRepositoryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataRepositoryTaskResponse CreateDataRepositoryTask(CreateDataRepositoryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataRepositoryTask", CreateDataRepositoryTaskResponse.class);
    }

    /**
     *创建文件系统
     * @param req CreateFileSystemRequest
     * @return CreateFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileSystemResponse CreateFileSystem(CreateFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileSystem", CreateFileSystemResponse.class);
    }

    /**
     *创建Fileset
     * @param req CreateFilesetRequest
     * @return CreateFilesetResponse
     * @throws TencentCloudSDKException
     */
    public CreateFilesetResponse CreateFileset(CreateFilesetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileset", CreateFilesetResponse.class);
    }

    /**
     *为客户端节点删除跨vpc子网访问能力
     * @param req DeleteCrossVpcSubnetSupportForClientNodeRequest
     * @return DeleteCrossVpcSubnetSupportForClientNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCrossVpcSubnetSupportForClientNodeResponse DeleteCrossVpcSubnetSupportForClientNode(DeleteCrossVpcSubnetSupportForClientNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCrossVpcSubnetSupportForClientNode", DeleteCrossVpcSubnetSupportForClientNodeResponse.class);
    }

    /**
     *删除文件系统
     * @param req DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileSystemResponse DeleteFileSystem(DeleteFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFileSystem", DeleteFileSystemResponse.class);
    }

    /**
     *删除Fileset
     * @param req DeleteFilesetRequest
     * @return DeleteFilesetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFilesetResponse DeleteFileset(DeleteFilesetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFileset", DeleteFilesetResponse.class);
    }

    /**
     *列出集群中所有的客户端节点
     * @param req DescribeClientNodesRequest
     * @return DescribeClientNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientNodesResponse DescribeClientNodes(DescribeClientNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientNodes", DescribeClientNodesResponse.class);
    }

    /**
     *查询GooseFS集群客户端凭证
     * @param req DescribeClusterClientTokenRequest
     * @return DescribeClusterClientTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterClientTokenResponse DescribeClusterClientToken(DescribeClusterClientTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterClientToken", DescribeClusterClientTokenResponse.class);
    }

    /**
     *查询GooseFS集群角色凭证
     * @param req DescribeClusterRoleTokenRequest
     * @return DescribeClusterRoleTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRoleTokenResponse DescribeClusterRoleToken(DescribeClusterRoleTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterRoleToken", DescribeClusterRoleTokenResponse.class);
    }

    /**
     *接口废弃

查询GooseFS集群角色
     * @param req DescribeClusterRolesRequest
     * @return DescribeClusterRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRolesResponse DescribeClusterRoles(DescribeClusterRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterRoles", DescribeClusterRolesResponse.class);
    }

    /**
     *获取数据流通任务实时状态，用作客户端控制
     * @param req DescribeDataRepositoryTaskStatusRequest
     * @return DescribeDataRepositoryTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataRepositoryTaskStatusResponse DescribeDataRepositoryTaskStatus(DescribeDataRepositoryTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataRepositoryTaskStatus", DescribeDataRepositoryTaskStatusResponse.class);
    }

    /**
     *罗列文件系统关联的Bucket映射
     * @param req DescribeFileSystemBucketsRequest
     * @return DescribeFileSystemBucketsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemBucketsResponse DescribeFileSystemBuckets(DescribeFileSystemBucketsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileSystemBuckets", DescribeFileSystemBucketsResponse.class);
    }

    /**
     *列出所有的文件系统
     * @param req DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemsResponse DescribeFileSystems(DescribeFileSystemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileSystems", DescribeFileSystemsResponse.class);
    }

    /**
     *查询Fileset通用配置
     * @param req DescribeFilesetGeneralConfigRequest
     * @return DescribeFilesetGeneralConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFilesetGeneralConfigResponse DescribeFilesetGeneralConfig(DescribeFilesetGeneralConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFilesetGeneralConfig", DescribeFilesetGeneralConfigResponse.class);
    }

    /**
     *查询Fileset列表
     * @param req DescribeFilesetsRequest
     * @return DescribeFilesetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFilesetsResponse DescribeFilesets(DescribeFilesetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFilesets", DescribeFilesetsResponse.class);
    }

    /**
     *解绑文件系统与Bucket的映射
     * @param req DetachFileSystemBucketRequest
     * @return DetachFileSystemBucketResponse
     * @throws TencentCloudSDKException
     */
    public DetachFileSystemBucketResponse DetachFileSystemBucket(DetachFileSystemBucketRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachFileSystemBucket", DetachFileSystemBucketResponse.class);
    }

    /**
     *扩展文件系统容量
     * @param req ExpandCapacityRequest
     * @return ExpandCapacityResponse
     * @throws TencentCloudSDKException
     */
    public ExpandCapacityResponse ExpandCapacity(ExpandCapacityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExpandCapacity", ExpandCapacityResponse.class);
    }

    /**
     *修改数据流动带宽
     * @param req ModifyDataRepositoryBandwidthRequest
     * @return ModifyDataRepositoryBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataRepositoryBandwidthResponse ModifyDataRepositoryBandwidth(ModifyDataRepositoryBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataRepositoryBandwidth", ModifyDataRepositoryBandwidthResponse.class);
    }

    /**
     *查询客户端节点跨vpc子网访问能力
     * @param req QueryCrossVpcSubnetSupportForClientNodeRequest
     * @return QueryCrossVpcSubnetSupportForClientNodeResponse
     * @throws TencentCloudSDKException
     */
    public QueryCrossVpcSubnetSupportForClientNodeResponse QueryCrossVpcSubnetSupportForClientNode(QueryCrossVpcSubnetSupportForClientNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCrossVpcSubnetSupportForClientNode", QueryCrossVpcSubnetSupportForClientNodeResponse.class);
    }

    /**
     *查询数据流动带宽
     * @param req QueryDataRepositoryBandwidthRequest
     * @return QueryDataRepositoryBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public QueryDataRepositoryBandwidthResponse QueryDataRepositoryBandwidth(QueryDataRepositoryBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryDataRepositoryBandwidth", QueryDataRepositoryBandwidthResponse.class);
    }

    /**
     *修改FIleset
     * @param req UpdateFilesetRequest
     * @return UpdateFilesetResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFilesetResponse UpdateFileset(UpdateFilesetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFileset", UpdateFilesetResponse.class);
    }

    /**
     *修改Fileset通用配置
     * @param req UpdateFilesetGeneralConfigRequest
     * @return UpdateFilesetGeneralConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFilesetGeneralConfigResponse UpdateFilesetGeneralConfig(UpdateFilesetGeneralConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFilesetGeneralConfig", UpdateFilesetGeneralConfigResponse.class);
    }

}
