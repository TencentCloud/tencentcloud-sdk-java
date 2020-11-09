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
package com.tencentcloudapi.tcaplusdb.v20190823;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcaplusdb.v20190823.models.*;

public class TcaplusdbClient extends AbstractClient{
    private static String endpoint = "tcaplusdb.tencentcloudapi.com";
    private static String service = "tcaplusdb";
    private static String version = "2019-08-23";

    public TcaplusdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcaplusdbClient(Credential credential, String region, ClientProfile profile) {
        super(TcaplusdbClient.endpoint, TcaplusdbClient.version, credential, region, profile);
    }

    /**
     *根据给定的表信息，清除表数据。
     * @param req ClearTablesRequest
     * @return ClearTablesResponse
     * @throws TencentCloudSDKException
     */
    public ClearTablesResponse ClearTables(ClearTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ClearTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ClearTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *选中目标表格，上传并校验改表文件，返回是否允许修改表格结构的结果。
     * @param req CompareIdlFilesRequest
     * @return CompareIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public CompareIdlFilesResponse CompareIdlFiles(CompareIdlFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompareIdlFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CompareIdlFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CompareIdlFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户创建备份任务
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建TcaplusDB集群
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在TcaplusDB集群下创建表格组
     * @param req CreateTableGroupRequest
     * @return CreateTableGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTableGroupResponse CreateTableGroup(CreateTableGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTableGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTableGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTableGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据选择的IDL文件列表，批量创建表格
     * @param req CreateTablesRequest
     * @return CreateTablesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTablesResponse CreateTables(CreateTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除TcaplusDB集群，必须在集群所属所有资源（包括表格组，表）都已经释放的情况下才会成功。
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *指定集群ID和待删除IDL文件的信息，删除目标文件，如果文件正在被表关联则删除失败。
     * @param req DeleteIdlFilesRequest
     * @return DeleteIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIdlFilesResponse DeleteIdlFiles(DeleteIdlFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIdlFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIdlFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIdlFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除表格组
     * @param req DeleteTableGroupRequest
     * @return DeleteTableGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableGroupResponse DeleteTableGroup(DeleteTableGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTableGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTableGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTableGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除表格的分布式索引
     * @param req DeleteTableIndexRequest
     * @return DeleteTableIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableIndexResponse DeleteTableIndex(DeleteTableIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTableIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTableIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTableIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除指定的表,第一次调用此接口代表将表移动至回收站，再次调用代表将此表格从回收站中彻底删除。
     * @param req DeleteTablesRequest
     * @return DeleteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTablesResponse DeleteTables(DeleteTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群关联的标签列表
     * @param req DescribeClusterTagsRequest
     * @return DescribeClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterTagsResponse DescribeClusterTags(DescribeClusterTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询TcaplusDB集群列表，包含集群详细信息。
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询表描述文件详情
     * @param req DescribeIdlFileInfosRequest
     * @return DescribeIdlFileInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdlFileInfosResponse DescribeIdlFileInfos(DescribeIdlFileInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIdlFileInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIdlFileInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIdlFileInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询TcaplusDB服务支持的地域列表
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取表格组关联的标签列表
     * @param req DescribeTableGroupTagsRequest
     * @return DescribeTableGroupTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableGroupTagsResponse DescribeTableGroupTags(DescribeTableGroupTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableGroupTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableGroupTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableGroupTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询表格组列表
     * @param req DescribeTableGroupsRequest
     * @return DescribeTableGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableGroupsResponse DescribeTableGroups(DescribeTableGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取表格标签
     * @param req DescribeTableTagsRequest
     * @return DescribeTableTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableTagsResponse DescribeTableTags(DescribeTableTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询表详情
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询回收站中的表详情
     * @param req DescribeTablesInRecycleRequest
     * @return DescribeTablesInRecycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesInRecycleResponse DescribeTablesInRecycle(DescribeTablesInRecycleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTablesInRecycleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTablesInRecycleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTablesInRecycle");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务列表
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询本用户是否在白名单中，控制是否能创建TDR类型的APP或表
     * @param req DescribeUinInWhitelistRequest
     * @return DescribeUinInWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUinInWhitelistResponse DescribeUinInWhitelist(DescribeUinInWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUinInWhitelistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUinInWhitelistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUinInWhitelist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改指定的集群名称
     * @param req ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNameResponse ModifyClusterName(ModifyClusterNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改指定集群的密码，后台将在旧密码失效之前同时支持TcaplusDB SDK使用旧密码和新密码访问数据库。在旧密码失效之前不能提交新的密码修改请求，在旧密码失效之后不能提交修改旧密码过期时间的请求。
     * @param req ModifyClusterPasswordRequest
     * @return ModifyClusterPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterPasswordResponse ModifyClusterPassword(ModifyClusterPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterPasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改集群标签
     * @param req ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterTagsResponse ModifyClusterTags(ModifyClusterTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改TcaplusDB表格组名称
     * @param req ModifyTableGroupNameRequest
     * @return ModifyTableGroupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableGroupNameResponse ModifyTableGroupName(ModifyTableGroupNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableGroupNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableGroupNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableGroupName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改表格组标签
     * @param req ModifyTableGroupTagsRequest
     * @return ModifyTableGroupTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableGroupTagsResponse ModifyTableGroupTags(ModifyTableGroupTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableGroupTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableGroupTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableGroupTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改表备注信息
     * @param req ModifyTableMemosRequest
     * @return ModifyTableMemosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableMemosResponse ModifyTableMemos(ModifyTableMemosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableMemosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableMemosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableMemos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *表格扩缩容
     * @param req ModifyTableQuotasRequest
     * @return ModifyTableQuotasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableQuotasResponse ModifyTableQuotas(ModifyTableQuotasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableQuotasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableQuotasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableQuotas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改表格标签
     * @param req ModifyTableTagsRequest
     * @return ModifyTableTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableTagsResponse ModifyTableTags(ModifyTableTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据用户选定的表定义IDL文件，批量修改指定的表
     * @param req ModifyTablesRequest
     * @return ModifyTablesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTablesResponse ModifyTables(ModifyTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复回收站中，用户自行删除的表。对欠费待释放的表无效。
     * @param req RecoverRecycleTablesRequest
     * @return RecoverRecycleTablesResponse
     * @throws TencentCloudSDKException
     */
    public RecoverRecycleTablesResponse RecoverRecycleTables(RecoverRecycleTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverRecycleTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverRecycleTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverRecycleTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *表格数据回档
     * @param req RollbackTablesRequest
     * @return RollbackTablesResponse
     * @throws TencentCloudSDKException
     */
    public RollbackTablesResponse RollbackTables(RollbackTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollbackTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RollbackTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollbackTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置表格分布式索引
     * @param req SetTableIndexRequest
     * @return SetTableIndexResponse
     * @throws TencentCloudSDKException
     */
    public SetTableIndexResponse SetTableIndex(SetTableIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTableIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetTableIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTableIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传并校验创建表格文件，返回校验合法的表格定义
     * @param req VerifyIdlFilesRequest
     * @return VerifyIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public VerifyIdlFilesResponse VerifyIdlFiles(VerifyIdlFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyIdlFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyIdlFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyIdlFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
