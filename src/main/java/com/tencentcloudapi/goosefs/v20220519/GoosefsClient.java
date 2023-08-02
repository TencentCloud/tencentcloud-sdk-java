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
        JsonResponseModel<AddCrossVpcSubnetSupportForClientNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddCrossVpcSubnetSupportForClientNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCrossVpcSubnetSupportForClientNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为文件系统关联Bucket
     * @param req AttachFileSystemBucketRequest
     * @return AttachFileSystemBucketResponse
     * @throws TencentCloudSDKException
     */
    public AttachFileSystemBucketResponse AttachFileSystemBucket(AttachFileSystemBucketRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachFileSystemBucketResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AttachFileSystemBucketResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachFileSystemBucket");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量添加客户端节点
     * @param req BatchAddClientNodesRequest
     * @return BatchAddClientNodesResponse
     * @throws TencentCloudSDKException
     */
    public BatchAddClientNodesResponse BatchAddClientNodes(BatchAddClientNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchAddClientNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchAddClientNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchAddClientNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除客户端节点
     * @param req BatchDeleteClientNodesRequest
     * @return BatchDeleteClientNodesResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteClientNodesResponse BatchDeleteClientNodes(BatchDeleteClientNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteClientNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteClientNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteClientNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建数据流通任务,包括从将文件系统的数据上传到存储桶下, 以及从存储桶下载到文件系统里。
     * @param req CreateDataRepositoryTaskRequest
     * @return CreateDataRepositoryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataRepositoryTaskResponse CreateDataRepositoryTask(CreateDataRepositoryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDataRepositoryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDataRepositoryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDataRepositoryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建文件系统
     * @param req CreateFileSystemRequest
     * @return CreateFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileSystemResponse CreateFileSystem(CreateFileSystemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFileSystemResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFileSystemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFileSystem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为客户端节点删除跨vpc子网访问能力
     * @param req DeleteCrossVpcSubnetSupportForClientNodeRequest
     * @return DeleteCrossVpcSubnetSupportForClientNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCrossVpcSubnetSupportForClientNodeResponse DeleteCrossVpcSubnetSupportForClientNode(DeleteCrossVpcSubnetSupportForClientNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCrossVpcSubnetSupportForClientNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCrossVpcSubnetSupportForClientNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCrossVpcSubnetSupportForClientNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除文件系统
     * @param req DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileSystemResponse DeleteFileSystem(DeleteFileSystemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFileSystemResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFileSystemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFileSystem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出集群中所有的客户端节点
     * @param req DescribeClientNodesRequest
     * @return DescribeClientNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientNodesResponse DescribeClientNodes(DescribeClientNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClientNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClientNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClientNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询GooseFS集群客户端凭证
     * @param req DescribeClusterClientTokenRequest
     * @return DescribeClusterClientTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterClientTokenResponse DescribeClusterClientToken(DescribeClusterClientTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterClientTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterClientTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterClientToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询GooseFS集群角色凭证
     * @param req DescribeClusterRoleTokenRequest
     * @return DescribeClusterRoleTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRoleTokenResponse DescribeClusterRoleToken(DescribeClusterRoleTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterRoleTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterRoleTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterRoleToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询GooseFS集群角色
     * @param req DescribeClusterRolesRequest
     * @return DescribeClusterRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRolesResponse DescribeClusterRoles(DescribeClusterRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据流通任务实时状态，用作客户端控制
     * @param req DescribeDataRepositoryTaskStatusRequest
     * @return DescribeDataRepositoryTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataRepositoryTaskStatusResponse DescribeDataRepositoryTaskStatus(DescribeDataRepositoryTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataRepositoryTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataRepositoryTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataRepositoryTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *罗列文件系统关联的Bucket映射
     * @param req DescribeFileSystemBucketsRequest
     * @return DescribeFileSystemBucketsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemBucketsResponse DescribeFileSystemBuckets(DescribeFileSystemBucketsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileSystemBucketsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileSystemBucketsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileSystemBuckets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出所有的文件系统
     * @param req DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemsResponse DescribeFileSystems(DescribeFileSystemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileSystemsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileSystemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileSystems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑文件系统与Bucket的映射
     * @param req DetachFileSystemBucketRequest
     * @return DetachFileSystemBucketResponse
     * @throws TencentCloudSDKException
     */
    public DetachFileSystemBucketResponse DetachFileSystemBucket(DetachFileSystemBucketRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachFileSystemBucketResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DetachFileSystemBucketResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachFileSystemBucket");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *扩展文件系统容量
     * @param req ExpandCapacityRequest
     * @return ExpandCapacityResponse
     * @throws TencentCloudSDKException
     */
    public ExpandCapacityResponse ExpandCapacity(ExpandCapacityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExpandCapacityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExpandCapacityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExpandCapacity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改数据流动带宽
     * @param req ModifyDataRepositoryBandwidthRequest
     * @return ModifyDataRepositoryBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataRepositoryBandwidthResponse ModifyDataRepositoryBandwidth(ModifyDataRepositoryBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDataRepositoryBandwidthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDataRepositoryBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDataRepositoryBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询客户端节点跨vpc子网访问能力
     * @param req QueryCrossVpcSubnetSupportForClientNodeRequest
     * @return QueryCrossVpcSubnetSupportForClientNodeResponse
     * @throws TencentCloudSDKException
     */
    public QueryCrossVpcSubnetSupportForClientNodeResponse QueryCrossVpcSubnetSupportForClientNode(QueryCrossVpcSubnetSupportForClientNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCrossVpcSubnetSupportForClientNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCrossVpcSubnetSupportForClientNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCrossVpcSubnetSupportForClientNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询数据流动带宽
     * @param req QueryDataRepositoryBandwidthRequest
     * @return QueryDataRepositoryBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public QueryDataRepositoryBandwidthResponse QueryDataRepositoryBandwidth(QueryDataRepositoryBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryDataRepositoryBandwidthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryDataRepositoryBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryDataRepositoryBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
