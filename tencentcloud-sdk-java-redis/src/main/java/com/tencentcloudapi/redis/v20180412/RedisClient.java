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
package com.tencentcloudapi.redis.v20180412;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.redis.v20180412.models.*;

public class RedisClient extends AbstractClient{
    private static String endpoint = "redis.tencentcloudapi.com";
    private static String version = "2018-04-12";

    public RedisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RedisClient(Credential credential, String region, ClientProfile profile) {
        super(RedisClient.endpoint, RedisClient.version, credential, region, profile);
    }

    /**
     *本接口 (AssociateSecurityGroups) 用于绑定安全组到指定实例。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *回收站实例立即下线
     * @param req CleanUpInstanceRequest
     * @return CleanUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CleanUpInstanceResponse CleanUpInstance(CleanUpInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CleanUpInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CleanUpInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CleanUpInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *清空Redis实例的实例数据。
     * @param req ClearInstanceRequest
     * @return ClearInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ClearInstanceResponse ClearInstance(ClearInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ClearInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ClearInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建实例子账号
     * @param req CreateInstanceAccountRequest
     * @return CreateInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceAccountResponse CreateInstanceAccount(CreateInstanceAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateInstanceAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建redis实例
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除实例子账号
     * @param req DeleteInstanceAccountRequest
     * @return DeleteInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceAccountResponse DeleteInstanceAccount(DeleteInstanceAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInstanceAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstanceAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteInstanceAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取备份配置
     * @param req DescribeAutoBackupConfigRequest
     * @return DescribeAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoBackupConfigResponse DescribeAutoBackupConfig(DescribeAutoBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoBackupConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoBackupConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAutoBackupConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询备份Rdb下载地址(接口灰度中，需要加白名单使用)
     * @param req DescribeBackupUrlRequest
     * @return DescribeBackupUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupUrlResponse DescribeBackupUrl(DescribeBackupUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupUrlResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupUrlResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupUrl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBSecurityGroups)用于查询实例的安全组详情。
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看实例子账号信息
     * @param req DescribeInstanceAccountRequest
     * @return DescribeInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAccountResponse DescribeInstanceAccount(DescribeInstanceAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 CRS 实例备份列表
     * @param req DescribeInstanceBackupsRequest
     * @return DescribeInstanceBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceBackupsResponse DescribeInstanceBackups(DescribeInstanceBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceBackupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceBackupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceBackups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例DTS信息
     * @param req DescribeInstanceDTSInfoRequest
     * @return DescribeInstanceDTSInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDTSInfoResponse DescribeInstanceDTSInfo(DescribeInstanceDTSInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceDTSInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceDTSInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceDTSInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询订单信息
     * @param req DescribeInstanceDealDetailRequest
     * @return DescribeInstanceDealDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDealDetailResponse DescribeInstanceDealDetail(DescribeInstanceDealDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceDealDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceDealDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceDealDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例大Key
     * @param req DescribeInstanceMonitorBigKeyRequest
     * @return DescribeInstanceMonitorBigKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeyResponse DescribeInstanceMonitorBigKey(DescribeInstanceMonitorBigKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorBigKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorBigKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceMonitorBigKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例大Key大小分布
     * @param req DescribeInstanceMonitorBigKeySizeDistRequest
     * @return DescribeInstanceMonitorBigKeySizeDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeySizeDistResponse DescribeInstanceMonitorBigKeySizeDist(DescribeInstanceMonitorBigKeySizeDistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorBigKeySizeDistResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorBigKeySizeDistResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceMonitorBigKeySizeDist"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例大Key类型分布
     * @param req DescribeInstanceMonitorBigKeyTypeDistRequest
     * @return DescribeInstanceMonitorBigKeyTypeDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeyTypeDistResponse DescribeInstanceMonitorBigKeyTypeDist(DescribeInstanceMonitorBigKeyTypeDistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorBigKeyTypeDistResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorBigKeyTypeDistResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceMonitorBigKeyTypeDist"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例热Key
     * @param req DescribeInstanceMonitorHotKeyRequest
     * @return DescribeInstanceMonitorHotKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorHotKeyResponse DescribeInstanceMonitorHotKey(DescribeInstanceMonitorHotKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorHotKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorHotKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceMonitorHotKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例访问来源信息
     * @param req DescribeInstanceMonitorSIPRequest
     * @return DescribeInstanceMonitorSIPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorSIPResponse DescribeInstanceMonitorSIP(DescribeInstanceMonitorSIPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorSIPResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorSIPResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceMonitorSIP"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例访问的耗时分布
     * @param req DescribeInstanceMonitorTookDistRequest
     * @return DescribeInstanceMonitorTookDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTookDistResponse DescribeInstanceMonitorTookDist(DescribeInstanceMonitorTookDistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorTookDistResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorTookDistResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceMonitorTookDist"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例访问命令
     * @param req DescribeInstanceMonitorTopNCmdRequest
     * @return DescribeInstanceMonitorTopNCmdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTopNCmdResponse DescribeInstanceMonitorTopNCmd(DescribeInstanceMonitorTopNCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorTopNCmdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorTopNCmdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceMonitorTopNCmd"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例CPU耗时
     * @param req DescribeInstanceMonitorTopNCmdTookRequest
     * @return DescribeInstanceMonitorTopNCmdTookResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTopNCmdTookResponse DescribeInstanceMonitorTopNCmdTook(DescribeInstanceMonitorTopNCmdTookRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorTopNCmdTookResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorTopNCmdTookResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceMonitorTopNCmdTook"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询参数修改历史列表
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceParamRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceParamRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceParamRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例参数列表
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceParamsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceParamsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceParams"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例安全组信息
     * @param req DescribeInstanceSecurityGroupRequest
     * @return DescribeInstanceSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSecurityGroupResponse DescribeInstanceSecurityGroup(DescribeInstanceSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群版实例分片信息
     * @param req DescribeInstanceShardsRequest
     * @return DescribeInstanceShardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceShardsResponse DescribeInstanceShards(DescribeInstanceShardsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceShardsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceShardsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceShards"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Redis实例列表
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
     *本接口查询指定可用区和实例类型下 Redis 的售卖规格， 如果用户不在购买白名单中，将不能查询该可用区或该类型的售卖规格详情。申请购买某地域白名单可以提交工单
     * @param req DescribeProductInfoRequest
     * @return DescribeProductInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductInfoResponse DescribeProductInfo(DescribeProductInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProductInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询项目安全组信息
     * @param req DescribeProjectSecurityGroupRequest
     * @return DescribeProjectSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupResponse DescribeProjectSecurityGroup(DescribeProjectSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjectSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeProjectSecurityGroups)用于查询项目的安全组详情。
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjectSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例慢查询记录
     * @param req DescribeSlowLogRequest
     * @return DescribeSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogResponse DescribeSlowLog(DescribeSlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSlowLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询任务结果
     * @param req DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInfoResponse DescribeTaskInfo(DescribeTaskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务列表信息
     * @param req DescribeTaskListRequest
     * @return DescribeTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListResponse DescribeTaskList(DescribeTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按量计费实例销毁
     * @param req DestroyPostpaidInstanceRequest
     * @return DestroyPostpaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPostpaidInstanceResponse DestroyPostpaidInstance(DestroyPostpaidInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyPostpaidInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyPostpaidInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DestroyPostpaidInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *包年包月实例退还
     * @param req DestroyPrepaidInstanceRequest
     * @return DestroyPrepaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPrepaidInstanceResponse DestroyPrepaidInstance(DestroyPrepaidInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyPrepaidInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyPrepaidInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DestroyPrepaidInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁用读写分离
     * @param req DisableReplicaReadonlyRequest
     * @return DisableReplicaReadonlyResponse
     * @throws TencentCloudSDKException
     */
    public DisableReplicaReadonlyResponse DisableReplicaReadonly(DisableReplicaReadonlyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableReplicaReadonlyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableReplicaReadonlyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableReplicaReadonly"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DisassociateSecurityGroups)用于安全组批量解绑实例。
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用读写分离
     * @param req EnableReplicaReadonlyRequest
     * @return EnableReplicaReadonlyResponse
     * @throws TencentCloudSDKException
     */
    public EnableReplicaReadonlyResponse EnableReplicaReadonly(EnableReplicaReadonlyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableReplicaReadonlyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableReplicaReadonlyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableReplicaReadonly"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询新购实例价格
     * @param req InquiryPriceCreateInstanceRequest
     * @return InquiryPriceCreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateInstanceResponse InquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceCreateInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例续费价格（包年包月）
     * @param req InquiryPriceRenewInstanceRequest
     * @return InquiryPriceRenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewInstanceResponse InquiryPriceRenewInstance(InquiryPriceRenewInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceRenewInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例扩容价格
     * @param req InquiryPriceUpgradeInstanceRequest
     * @return InquiryPriceUpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeInstanceResponse InquiryPriceUpgradeInstance(InquiryPriceUpgradeInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceUpgradeInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceUpgradeInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceUpgradeInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *手动备份Redis实例
     * @param req ManualBackupInstanceRequest
     * @return ManualBackupInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ManualBackupInstanceResponse ManualBackupInstance(ManualBackupInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManualBackupInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ManualBackupInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ManualBackupInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改redis密码
     * @param req ModfiyInstancePasswordRequest
     * @return ModfiyInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModfiyInstancePasswordResponse ModfiyInstancePassword(ModfiyInstancePasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModfiyInstancePasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModfiyInstancePasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModfiyInstancePassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置自动备份时间
     * @param req ModifyAutoBackupConfigRequest
     * @return ModifyAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackupConfigResponse ModifyAutoBackupConfig(ModifyAutoBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoBackupConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoBackupConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAutoBackupConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDBInstanceSecurityGroups)用于修改实例绑定的安全组
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例相关信息
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例子账号
     * @param req ModifyInstanceAccountRequest
     * @return ModifyInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAccountResponse ModifyInstanceAccount(ModifyInstanceAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstanceAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例参数
     * @param req ModifyInstanceParamsRequest
     * @return ModifyInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamsResponse ModifyInstanceParams(ModifyInstanceParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceParamsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceParamsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstanceParams"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例网络配置
     * @param req ModifyNetworkConfigRequest
     * @return ModifyNetworkConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkConfigResponse ModifyNetworkConfig(ModifyNetworkConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetworkConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *续费实例
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenewInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置密码
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复 CRS 实例
     * @param req RestoreInstanceRequest
     * @return RestoreInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestoreInstanceResponse RestoreInstance(RestoreInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestoreInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RestoreInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RestoreInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实例解隔离
     * @param req StartupInstanceRequest
     * @return StartupInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartupInstanceResponse StartupInstance(StartupInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartupInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartupInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartupInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在通过DTS支持跨可用区灾备的场景中，通过该接口交换实例VIP完成实例灾备切换。交换VIP后目标实例可写，源和目标实例VIP互换，同时源与目标实例间DTS同步任务断开
     * @param req SwitchInstanceVipRequest
     * @return SwitchInstanceVipResponse
     * @throws TencentCloudSDKException
     */
    public SwitchInstanceVipResponse SwitchInstanceVip(SwitchInstanceVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchInstanceVipResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchInstanceVipResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SwitchInstanceVip"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级实例
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
