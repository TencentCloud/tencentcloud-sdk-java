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
    private static String service = "redis";
    private static String version = "2018-04-12";
    
    public RedisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RedisClient(Credential credential, String region, ClientProfile profile) {
        super(RedisClient.endpoint, RedisClient.version, credential, region, profile);
    }

    /**
     *添加复制组成员
     * @param req AddReplicationInstanceRequest
     * @return AddReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public AddReplicationInstanceResponse AddReplicationInstance(AddReplicationInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddReplicationInstance", AddReplicationInstanceResponse.class);
    }

    /**
     *开通外网
     * @param req AllocateWanAddressRequest
     * @return AllocateWanAddressResponse
     * @throws TencentCloudSDKException
     */
    public AllocateWanAddressResponse AllocateWanAddress(AllocateWanAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateWanAddress", AllocateWanAddressResponse.class);
    }

    /**
     *应用参数模板到实例
     * @param req ApplyParamsTemplateRequest
     * @return ApplyParamsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ApplyParamsTemplateResponse ApplyParamsTemplate(ApplyParamsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyParamsTemplate", ApplyParamsTemplateResponse.class);
    }

    /**
     *本接口 (AssociateSecurityGroups) 用于将一个安全组绑定于一个或多个数据库实例。创建实例时，未配置安全组，建议通过该接口，绑定安全组。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *复制组实例更换角色
     * @param req ChangeInstanceRoleRequest
     * @return ChangeInstanceRoleResponse
     * @throws TencentCloudSDKException
     */
    public ChangeInstanceRoleResponse ChangeInstanceRole(ChangeInstanceRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeInstanceRole", ChangeInstanceRoleResponse.class);
    }

    /**
     *该接口（ChangeMasterInstance）用于将复制组内只读实例设置为主实例。
     * @param req ChangeMasterInstanceRequest
     * @return ChangeMasterInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ChangeMasterInstanceResponse ChangeMasterInstance(ChangeMasterInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeMasterInstance", ChangeMasterInstanceResponse.class);
    }

    /**
     *本接口（ChangeReplicaToMaster）适用于实例副本组提主或副本提主。
     * @param req ChangeReplicaToMasterRequest
     * @return ChangeReplicaToMasterResponse
     * @throws TencentCloudSDKException
     */
    public ChangeReplicaToMasterResponse ChangeReplicaToMaster(ChangeReplicaToMasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeReplicaToMaster", ChangeReplicaToMasterResponse.class);
    }

    /**
     *回收站实例立即下线
     * @param req CleanUpInstanceRequest
     * @return CleanUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CleanUpInstanceResponse CleanUpInstance(CleanUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CleanUpInstance", CleanUpInstanceResponse.class);
    }

    /**
     *清空Redis实例的实例数据。
     * @param req ClearInstanceRequest
     * @return ClearInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ClearInstanceResponse ClearInstance(ClearInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearInstance", ClearInstanceResponse.class);
    }

    /**
     *本接口（CloneInstances）用于基于当前实例的备份文件克隆一个完整的新实例。
     * @param req CloneInstancesRequest
     * @return CloneInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CloneInstancesResponse CloneInstances(CloneInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneInstances", CloneInstancesResponse.class);
    }

    /**
     *关闭SSL
     * @param req CloseSSLRequest
     * @return CloseSSLResponse
     * @throws TencentCloudSDKException
     */
    public CloseSSLResponse CloseSSL(CloseSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseSSL", CloseSSLResponse.class);
    }

    /**
     *该接口（CreateInstanceAccount）用于自定义访问实例的账号。
     * @param req CreateInstanceAccountRequest
     * @return CreateInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceAccountResponse CreateInstanceAccount(CreateInstanceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceAccount", CreateInstanceAccountResponse.class);
    }

    /**
     *本接口（CreateInstances）用于创建 Redis 实例。
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *创建参数模板。
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateParamTemplate", CreateParamTemplateResponse.class);
    }

    /**
     *该接口（CreateReplicationGroup）用于创建复制组。
     * @param req CreateReplicationGroupRequest
     * @return CreateReplicationGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateReplicationGroupResponse CreateReplicationGroup(CreateReplicationGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReplicationGroup", CreateReplicationGroupResponse.class);
    }

    /**
     *删除实例子账号
     * @param req DeleteInstanceAccountRequest
     * @return DeleteInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceAccountResponse DeleteInstanceAccount(DeleteInstanceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstanceAccount", DeleteInstanceAccountResponse.class);
    }

    /**
     *删除参数模板
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteParamTemplate", DeleteParamTemplateResponse.class);
    }

    /**
     *移除复制组成员。注：该接口下线中，请使用 [RemoveReplicationInstance](https://cloud.tencent.com/document/product/239/90099)。
     * @param req DeleteReplicationInstanceRequest
     * @return DeleteReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReplicationInstanceResponse DeleteReplicationInstance(DeleteReplicationInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReplicationInstance", DeleteReplicationInstanceResponse.class);
    }

    /**
     *本接口（DescribeAutoBackupConfig）用于获取自动备份配置规则。
     * @param req DescribeAutoBackupConfigRequest
     * @return DescribeAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoBackupConfigResponse DescribeAutoBackupConfig(DescribeAutoBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoBackupConfig", DescribeAutoBackupConfigResponse.class);
    }

    /**
     *本接口（DescribeBackupDetail）用于查询实例的备份信息详情。
     * @param req DescribeBackupDetailRequest
     * @return DescribeBackupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDetailResponse DescribeBackupDetail(DescribeBackupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDetail", DescribeBackupDetailResponse.class);
    }

    /**
     *本接口（DescribeBackupDownloadRestriction）用于查询当前地域数据库备份文件的下载地址。
     * @param req DescribeBackupDownloadRestrictionRequest
     * @return DescribeBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadRestrictionResponse DescribeBackupDownloadRestriction(DescribeBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadRestriction", DescribeBackupDownloadRestrictionResponse.class);
    }

    /**
     *本接口（DescribeBackupUrl）用于查询备份 Rdb 文件的下载地址。
     * @param req DescribeBackupUrlRequest
     * @return DescribeBackupUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupUrlResponse DescribeBackupUrl(DescribeBackupUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupUrl", DescribeBackupUrlResponse.class);
    }

    /**
     *本接口（DescribeBandwidthRange）用于查询实例带宽信息。
     * @param req DescribeBandwidthRangeRequest
     * @return DescribeBandwidthRangeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthRangeResponse DescribeBandwidthRange(DescribeBandwidthRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBandwidthRange", DescribeBandwidthRangeResponse.class);
    }

    /**
     *查询Redis实例列表信息。该接口已废弃。
     * @param req DescribeCommonDBInstancesRequest
     * @return DescribeCommonDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCommonDBInstancesResponse DescribeCommonDBInstances(DescribeCommonDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCommonDBInstances", DescribeCommonDBInstancesResponse.class);
    }

    /**
     *本接口（DescribeDBSecurityGroups）用于查询实例的安全组详情。
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *查询全球复制支持地域信息
     * @param req DescribeGlobalReplicationAreaRequest
     * @return DescribeGlobalReplicationAreaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalReplicationAreaResponse DescribeGlobalReplicationArea(DescribeGlobalReplicationAreaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalReplicationArea", DescribeGlobalReplicationAreaResponse.class);
    }

    /**
     *本接口（DescribeInstanceAccount）用于查看实例子账号信息。
     * @param req DescribeInstanceAccountRequest
     * @return DescribeInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAccountResponse DescribeInstanceAccount(DescribeInstanceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceAccount", DescribeInstanceAccountResponse.class);
    }

    /**
     *本接口（DescribeInstanceBackups）用于查询实例备份列表。
     * @param req DescribeInstanceBackupsRequest
     * @return DescribeInstanceBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceBackupsResponse DescribeInstanceBackups(DescribeInstanceBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceBackups", DescribeInstanceBackupsResponse.class);
    }

    /**
     *查询实例DTS信息
     * @param req DescribeInstanceDTSInfoRequest
     * @return DescribeInstanceDTSInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDTSInfoResponse DescribeInstanceDTSInfo(DescribeInstanceDTSInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDTSInfo", DescribeInstanceDTSInfoResponse.class);
    }

    /**
     *本接口（DescribeInstanceDealDetail）用于查询订单信息。
     * @param req DescribeInstanceDealDetailRequest
     * @return DescribeInstanceDealDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDealDetailResponse DescribeInstanceDealDetail(DescribeInstanceDealDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDealDetail", DescribeInstanceDealDetailResponse.class);
    }

    /**
     *本接口（DescribeInstanceEvents）用于查询 Redis 实例事件信息。
     * @param req DescribeInstanceEventsRequest
     * @return DescribeInstanceEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceEventsResponse DescribeInstanceEvents(DescribeInstanceEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceEvents", DescribeInstanceEventsResponse.class);
    }

    /**
     *本接口（DescribeInstanceLogDelivery）用于查询实例的日志投递配置。
     * @param req DescribeInstanceLogDeliveryRequest
     * @return DescribeInstanceLogDeliveryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogDeliveryResponse DescribeInstanceLogDelivery(DescribeInstanceLogDeliveryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogDelivery", DescribeInstanceLogDeliveryResponse.class);
    }

    /**
     *腾讯云数据库 Redis 已经于2022年10月31日下线查询实例大 Key 接口。具体公告，请参见[查询实例大 Key 接口下线公告](https://cloud.tencent.com/document/product/239/81005)。
     * @param req DescribeInstanceMonitorBigKeyRequest
     * @return DescribeInstanceMonitorBigKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeyResponse DescribeInstanceMonitorBigKey(DescribeInstanceMonitorBigKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorBigKey", DescribeInstanceMonitorBigKeyResponse.class);
    }

    /**
     *腾讯云数据库 Redis 已经于2022年10月31日下线查询实例大 Key 接口。具体公告，请参见 [查询实例大 Key 接口下线公告](https://cloud.tencent.com/document/product/239/81005)。
     * @param req DescribeInstanceMonitorBigKeySizeDistRequest
     * @return DescribeInstanceMonitorBigKeySizeDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeySizeDistResponse DescribeInstanceMonitorBigKeySizeDist(DescribeInstanceMonitorBigKeySizeDistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorBigKeySizeDist", DescribeInstanceMonitorBigKeySizeDistResponse.class);
    }

    /**
     *腾讯云数据库 Redis 已经于2022年10月31日下线查询实例大 Key 接口。具体公告，请参见 [查询实例大 Key 接口下线公告](https://cloud.tencent.com/document/product/239/81005)。
     * @param req DescribeInstanceMonitorBigKeyTypeDistRequest
     * @return DescribeInstanceMonitorBigKeyTypeDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeyTypeDistResponse DescribeInstanceMonitorBigKeyTypeDist(DescribeInstanceMonitorBigKeyTypeDistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorBigKeyTypeDist", DescribeInstanceMonitorBigKeyTypeDistResponse.class);
    }

    /**
     *本接口（DescribeInstanceMonitorHotKey）用于查询实例热Key。
     * @param req DescribeInstanceMonitorHotKeyRequest
     * @return DescribeInstanceMonitorHotKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorHotKeyResponse DescribeInstanceMonitorHotKey(DescribeInstanceMonitorHotKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorHotKey", DescribeInstanceMonitorHotKeyResponse.class);
    }

    /**
     *该接口已下线，请使用数据库智能管家 DBbrain 接口 [DescribeProxyProcessStatistics] (https://cloud.tencent.com/document/product/1130/84544) 获取实例访问来源。
     * @param req DescribeInstanceMonitorSIPRequest
     * @return DescribeInstanceMonitorSIPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorSIPResponse DescribeInstanceMonitorSIP(DescribeInstanceMonitorSIPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorSIP", DescribeInstanceMonitorSIPResponse.class);
    }

    /**
     *查询实例访问的耗时分布
     * @param req DescribeInstanceMonitorTookDistRequest
     * @return DescribeInstanceMonitorTookDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTookDistResponse DescribeInstanceMonitorTookDist(DescribeInstanceMonitorTookDistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorTookDist", DescribeInstanceMonitorTookDistResponse.class);
    }

    /**
     *查询实例访问命令
     * @param req DescribeInstanceMonitorTopNCmdRequest
     * @return DescribeInstanceMonitorTopNCmdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTopNCmdResponse DescribeInstanceMonitorTopNCmd(DescribeInstanceMonitorTopNCmdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorTopNCmd", DescribeInstanceMonitorTopNCmdResponse.class);
    }

    /**
     *查询实例CPU耗时
     * @param req DescribeInstanceMonitorTopNCmdTookRequest
     * @return DescribeInstanceMonitorTopNCmdTookResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTopNCmdTookResponse DescribeInstanceMonitorTopNCmdTook(DescribeInstanceMonitorTopNCmdTookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorTopNCmdTook", DescribeInstanceMonitorTopNCmdTookResponse.class);
    }

    /**
     *本接口（DescribeInstanceNodeInfo）用于查询实例节点信息。
     * @param req DescribeInstanceNodeInfoRequest
     * @return DescribeInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodeInfoResponse DescribeInstanceNodeInfo(DescribeInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodeInfo", DescribeInstanceNodeInfoResponse.class);
    }

    /**
     *查询参数修改历史列表
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParamRecords", DescribeInstanceParamRecordsResponse.class);
    }

    /**
     *本接口（DescribeInstanceParams）用于查询实例参数列表。
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *本接口（DescribeInstanceSecurityGroup）用于查询实例安全组信息。
     * @param req DescribeInstanceSecurityGroupRequest
     * @return DescribeInstanceSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSecurityGroupResponse DescribeInstanceSecurityGroup(DescribeInstanceSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSecurityGroup", DescribeInstanceSecurityGroupResponse.class);
    }

    /**
     *本接口（DescribeInstanceShards）用于获取集群架构实例的分片信息。
     * @param req DescribeInstanceShardsRequest
     * @return DescribeInstanceShardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceShardsResponse DescribeInstanceShards(DescribeInstanceShardsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceShards", DescribeInstanceShardsResponse.class);
    }

    /**
     *本接口（DescribeInstanceSpecBandwidth）用于查询或计算带宽规格。
     * @param req DescribeInstanceSpecBandwidthRequest
     * @return DescribeInstanceSpecBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSpecBandwidthResponse DescribeInstanceSpecBandwidth(DescribeInstanceSpecBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSpecBandwidth", DescribeInstanceSpecBandwidthResponse.class);
    }

    /**
     *本接口（DescribeInstanceSupportFeature）用于查询实例支持的功能特性。
     * @param req DescribeInstanceSupportFeatureRequest
     * @return DescribeInstanceSupportFeatureResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSupportFeatureResponse DescribeInstanceSupportFeature(DescribeInstanceSupportFeatureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSupportFeature", DescribeInstanceSupportFeatureResponse.class);
    }

    /**
     *本接口（DescribeInstanceZoneInfo）用于查询 Redis 节点详细信息。
     * @param req DescribeInstanceZoneInfoRequest
     * @return DescribeInstanceZoneInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceZoneInfoResponse DescribeInstanceZoneInfo(DescribeInstanceZoneInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceZoneInfo", DescribeInstanceZoneInfoResponse.class);
    }

    /**
     *本接口（DescribeInstances）用于查询Redis实例列表。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *本接口（DescribeMaintenanceWindow）用于查询实例维护时间窗。在实例需要进行版本升级或者架构升级的时候，会在维护时间窗时间内进行切换
     * @param req DescribeMaintenanceWindowRequest
     * @return DescribeMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintenanceWindowResponse DescribeMaintenanceWindow(DescribeMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaintenanceWindow", DescribeMaintenanceWindowResponse.class);
    }

    /**
     *本接口（DescribeParamTemplateInfo）用于查询参数模板详情。
     * @param req DescribeParamTemplateInfoRequest
     * @return DescribeParamTemplateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateInfoResponse DescribeParamTemplateInfo(DescribeParamTemplateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplateInfo", DescribeParamTemplateInfoResponse.class);
    }

    /**
     *查询参数模板列表
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplates", DescribeParamTemplatesResponse.class);
    }

    /**
     *本接口（DescribeProductInfo）用于查询全地域 Redis 的售卖规格。
     * @param req DescribeProductInfoRequest
     * @return DescribeProductInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductInfoResponse DescribeProductInfo(DescribeProductInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductInfo", DescribeProductInfoResponse.class);
    }

    /**
     *查询项目安全组信息
     * @param req DescribeProjectSecurityGroupRequest
     * @return DescribeProjectSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupResponse DescribeProjectSecurityGroup(DescribeProjectSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroup", DescribeProjectSecurityGroupResponse.class);
    }

    /**
     *本接口(DescribeProjectSecurityGroups)用于查询项目的安全组详情。
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeProxySlowLog）用于查询代理慢查询。
     * @param req DescribeProxySlowLogRequest
     * @return DescribeProxySlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySlowLogResponse DescribeProxySlowLog(DescribeProxySlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxySlowLog", DescribeProxySlowLogResponse.class);
    }

    /**
     *查询Redis独享集群概览信息
     * @param req DescribeRedisClusterOverviewRequest
     * @return DescribeRedisClusterOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRedisClusterOverviewResponse DescribeRedisClusterOverview(DescribeRedisClusterOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRedisClusterOverview", DescribeRedisClusterOverviewResponse.class);
    }

    /**
     *查询Redis独享集群列表
     * @param req DescribeRedisClustersRequest
     * @return DescribeRedisClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRedisClustersResponse DescribeRedisClusters(DescribeRedisClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRedisClusters", DescribeRedisClustersResponse.class);
    }

    /**
     *本接口（DescribeReplicationGroup）用于查询复制组。
     * @param req DescribeReplicationGroupRequest
     * @return DescribeReplicationGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationGroupResponse DescribeReplicationGroup(DescribeReplicationGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplicationGroup", DescribeReplicationGroupResponse.class);
    }

    /**
     *查询复制组信息
     * @param req DescribeReplicationGroupInstanceRequest
     * @return DescribeReplicationGroupInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationGroupInstanceResponse DescribeReplicationGroupInstance(DescribeReplicationGroupInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplicationGroupInstance", DescribeReplicationGroupInstanceResponse.class);
    }

    /**
     *本接口（DescribeSSLStatus）用于查询实例 SSL 认证相关信息，包括开启状态、配置状态、证书地址等。
     * @param req DescribeSSLStatusRequest
     * @return DescribeSSLStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSSLStatusResponse DescribeSSLStatus(DescribeSSLStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSSLStatus", DescribeSSLStatusResponse.class);
    }

    /**
     *本接口（DescribeSlowLog）查询实例慢查询记录。
     * @param req DescribeSlowLogRequest
     * @return DescribeSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogResponse DescribeSlowLog(DescribeSlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLog", DescribeSlowLogResponse.class);
    }

    /**
     *本接口（DescribeTaskInfo）用于获取指定任务的执行情况。
     * @param req DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInfoResponse DescribeTaskInfo(DescribeTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskInfo", DescribeTaskInfoResponse.class);
    }

    /**
     *本接口（DescribeTaskList）用于查询指定实例的任务列表信息。

- 可查询近30天内任务列表数据。
     * @param req DescribeTaskListRequest
     * @return DescribeTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListResponse DescribeTaskList(DescribeTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskList", DescribeTaskListResponse.class);
    }

    /**
     *查询Tendis慢查询
     * @param req DescribeTendisSlowLogRequest
     * @return DescribeTendisSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTendisSlowLogResponse DescribeTendisSlowLog(DescribeTendisSlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTendisSlowLog", DescribeTendisSlowLogResponse.class);
    }

    /**
     *按量计费实例销毁
     * @param req DestroyPostpaidInstanceRequest
     * @return DestroyPostpaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPostpaidInstanceResponse DestroyPostpaidInstance(DestroyPostpaidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPostpaidInstance", DestroyPostpaidInstanceResponse.class);
    }

    /**
     *包年包月实例退还
     * @param req DestroyPrepaidInstanceRequest
     * @return DestroyPrepaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPrepaidInstanceResponse DestroyPrepaidInstance(DestroyPrepaidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPrepaidInstance", DestroyPrepaidInstanceResponse.class);
    }

    /**
     *禁用读写分离
     * @param req DisableReplicaReadonlyRequest
     * @return DisableReplicaReadonlyResponse
     * @throws TencentCloudSDKException
     */
    public DisableReplicaReadonlyResponse DisableReplicaReadonly(DisableReplicaReadonlyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableReplicaReadonly", DisableReplicaReadonlyResponse.class);
    }

    /**
     *本接口(DisassociateSecurityGroups)用于安全组批量解绑实例。
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *启用读写分离
     * @param req EnableReplicaReadonlyRequest
     * @return EnableReplicaReadonlyResponse
     * @throws TencentCloudSDKException
     */
    public EnableReplicaReadonlyResponse EnableReplicaReadonly(EnableReplicaReadonlyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableReplicaReadonly", EnableReplicaReadonlyResponse.class);
    }

    /**
     *查询新购实例价格
     * @param req InquiryPriceCreateInstanceRequest
     * @return InquiryPriceCreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateInstanceResponse InquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateInstance", InquiryPriceCreateInstanceResponse.class);
    }

    /**
     *本接口（InquiryPriceRenewInstance）用于查询包年包月计费实例的续费价格。
     * @param req InquiryPriceRenewInstanceRequest
     * @return InquiryPriceRenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewInstanceResponse InquiryPriceRenewInstance(InquiryPriceRenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewInstance", InquiryPriceRenewInstanceResponse.class);
    }

    /**
     *查询实例扩容价格
     * @param req InquiryPriceUpgradeInstanceRequest
     * @return InquiryPriceUpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeInstanceResponse InquiryPriceUpgradeInstance(InquiryPriceUpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpgradeInstance", InquiryPriceUpgradeInstanceResponse.class);
    }

    /**
     *本接口（KillMasterGroup）模拟故障。
     * @param req KillMasterGroupRequest
     * @return KillMasterGroupResponse
     * @throws TencentCloudSDKException
     */
    public KillMasterGroupResponse KillMasterGroup(KillMasterGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillMasterGroup", KillMasterGroupResponse.class);
    }

    /**
     *本接口（ManualBackupInstance）用于手动备份Redis实例。
     * @param req ManualBackupInstanceRequest
     * @return ManualBackupInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ManualBackupInstanceResponse ManualBackupInstance(ManualBackupInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManualBackupInstance", ManualBackupInstanceResponse.class);
    }

    /**
     *本接口（ModfiyInstancePassword）用于修改实例访问密码。鉴于该接口名存在拼写错误，现已更正为（[ModifyInstancePassword](https://cloud.tencent.com/document/product/239/111555)）接口，推荐使用更正后的接口。
     * @param req ModfiyInstancePasswordRequest
     * @return ModfiyInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModfiyInstancePasswordResponse ModfiyInstancePassword(ModfiyInstancePasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModfiyInstancePassword", ModfiyInstancePasswordResponse.class);
    }

    /**
     *本接口（ModifyAutoBackupConfig）用于设置自动备份的配置。
     * @param req ModifyAutoBackupConfigRequest
     * @return ModifyAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackupConfigResponse ModifyAutoBackupConfig(ModifyAutoBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoBackupConfig", ModifyAutoBackupConfigResponse.class);
    }

    /**
     *本接口（ModifyBackupDownloadRestriction）用于修改备份文件下载的网络信息与地址。
     * @param req ModifyBackupDownloadRestrictionRequest
     * @return ModifyBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupDownloadRestrictionResponse ModifyBackupDownloadRestriction(ModifyBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupDownloadRestriction", ModifyBackupDownloadRestrictionResponse.class);
    }

    /**
     *修改实例的连接配置，包括带宽和最大连接数。
     * @param req ModifyConnectionConfigRequest
     * @return ModifyConnectionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConnectionConfigResponse ModifyConnectionConfig(ModifyConnectionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConnectionConfig", ModifyConnectionConfigResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceSecurityGroups）用于对实例原有的安全组列表进行修改。
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *修改实例相关信息
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *修改实例子账号
     * @param req ModifyInstanceAccountRequest
     * @return ModifyInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAccountResponse ModifyInstanceAccount(ModifyInstanceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAccount", ModifyInstanceAccountResponse.class);
    }

    /**
     *本接口（ModifyInstanceAvailabilityZones）用于变更实例可用区
     * @param req ModifyInstanceAvailabilityZonesRequest
     * @return ModifyInstanceAvailabilityZonesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAvailabilityZonesResponse ModifyInstanceAvailabilityZones(ModifyInstanceAvailabilityZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAvailabilityZones", ModifyInstanceAvailabilityZonesResponse.class);
    }

    /**
     *本接口（ModifyInstanceEvent）用于修改实例的运维事件的执行计划。
     * @param req ModifyInstanceEventRequest
     * @return ModifyInstanceEventResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceEventResponse ModifyInstanceEvent(ModifyInstanceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceEvent", ModifyInstanceEventResponse.class);
    }

    /**
     *本接口（ModifyInstanceLogDelivery）用于开启或关闭投递实例日志到CLS。
     * @param req ModifyInstanceLogDeliveryRequest
     * @return ModifyInstanceLogDeliveryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceLogDeliveryResponse ModifyInstanceLogDelivery(ModifyInstanceLogDeliveryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceLogDelivery", ModifyInstanceLogDeliveryResponse.class);
    }

    /**
     *本接口(ModifyInstanceParams)用于修改Redis实例的参数配置。
     * @param req ModifyInstanceParamsRequest
     * @return ModifyInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamsResponse ModifyInstanceParams(ModifyInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParams", ModifyInstanceParamsResponse.class);
    }

    /**
     *本接口（ModifyInstancePassword）用于修改实例访问密码。
     * @param req ModifyInstancePasswordRequest
     * @return ModifyInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancePasswordResponse ModifyInstancePassword(ModifyInstancePasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancePassword", ModifyInstancePasswordResponse.class);
    }

    /**
     *设置实例输入模式
     * @param req ModifyInstanceReadOnlyRequest
     * @return ModifyInstanceReadOnlyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceReadOnlyResponse ModifyInstanceReadOnly(ModifyInstanceReadOnlyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceReadOnly", ModifyInstanceReadOnlyResponse.class);
    }

    /**
     *修改实例维护时间窗时间，需要进行版本升级或者架构升级的实例，会在维护时间窗内进行时间切换。注意：已经发起版本升级或者架构升级的实例，无法修改维护时间窗。
     * @param req ModifyMaintenanceWindowRequest
     * @return ModifyMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintenanceWindowResponse ModifyMaintenanceWindow(ModifyMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaintenanceWindow", ModifyMaintenanceWindowResponse.class);
    }

    /**
     *本接口（ModifyNetworkConfig）用于修改实例网络配置。
     * @param req ModifyNetworkConfigRequest
     * @return ModifyNetworkConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkConfigResponse ModifyNetworkConfig(ModifyNetworkConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkConfig", ModifyNetworkConfigResponse.class);
    }

    /**
     *修改参数模板
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyParamTemplate", ModifyParamTemplateResponse.class);
    }

    /**
     *修改复制组信息
     * @param req ModifyReplicationGroupRequest
     * @return ModifyReplicationGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReplicationGroupResponse ModifyReplicationGroup(ModifyReplicationGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReplicationGroup", ModifyReplicationGroupResponse.class);
    }

    /**
     *开启SSL
     * @param req OpenSSLRequest
     * @return OpenSSLResponse
     * @throws TencentCloudSDKException
     */
    public OpenSSLResponse OpenSSL(OpenSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenSSL", OpenSSLResponse.class);
    }

    /**
     *关闭外网
     * @param req ReleaseWanAddressRequest
     * @return ReleaseWanAddressResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseWanAddressResponse ReleaseWanAddress(ReleaseWanAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseWanAddress", ReleaseWanAddressResponse.class);
    }

    /**
     *移除复制组成员
     * @param req RemoveReplicationInstanceRequest
     * @return RemoveReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RemoveReplicationInstanceResponse RemoveReplicationInstance(RemoveReplicationInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveReplicationInstance", RemoveReplicationInstanceResponse.class);
    }

    /**
     *本接口（RenewInstance）可用于为实例续费。
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstance", RenewInstanceResponse.class);
    }

    /**
     *重置密码
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetPassword", ResetPasswordResponse.class);
    }

    /**
     *恢复 CRS 实例
     * @param req RestoreInstanceRequest
     * @return RestoreInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestoreInstanceResponse RestoreInstance(RestoreInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreInstance", RestoreInstanceResponse.class);
    }

    /**
     *实例解隔离
     * @param req StartupInstanceRequest
     * @return StartupInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartupInstanceResponse StartupInstance(StartupInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartupInstance", StartupInstanceResponse.class);
    }

    /**
     *本接口（SwitchAccessNewInstance）针对处于时间窗口中待切换操作的实例，用户可主动发起该操作。
     * @param req SwitchAccessNewInstanceRequest
     * @return SwitchAccessNewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public SwitchAccessNewInstanceResponse SwitchAccessNewInstance(SwitchAccessNewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchAccessNewInstance", SwitchAccessNewInstanceResponse.class);
    }

    /**
     *在通过DTS支持跨可用区灾备的场景中，通过该接口交换实例VIP完成实例灾备切换。交换VIP后目标实例可写，源和目标实例VIP互换，同时源与目标实例间DTS同步任务断开
     * @param req SwitchInstanceVipRequest
     * @return SwitchInstanceVipResponse
     * @throws TencentCloudSDKException
     */
    public SwitchInstanceVipResponse SwitchInstanceVip(SwitchInstanceVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchInstanceVip", SwitchInstanceVipResponse.class);
    }

    /**
     *Proxy模拟故障接口
     * @param req SwitchProxyRequest
     * @return SwitchProxyResponse
     * @throws TencentCloudSDKException
     */
    public SwitchProxyResponse SwitchProxy(SwitchProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchProxy", SwitchProxyResponse.class);
    }

    /**
     *本接口（UpgradeInstance）用于变更实例的配置规格。
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

    /**
     *将当前实例升级到更高版本，或者将当前标准架构升级至集群架构。
     * @param req UpgradeInstanceVersionRequest
     * @return UpgradeInstanceVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceVersionResponse UpgradeInstanceVersion(UpgradeInstanceVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstanceVersion", UpgradeInstanceVersionResponse.class);
    }

    /**
     *实例proxy版本升级
     * @param req UpgradeProxyVersionRequest
     * @return UpgradeProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyVersionResponse UpgradeProxyVersion(UpgradeProxyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeProxyVersion", UpgradeProxyVersionResponse.class);
    }

    /**
     *实例小版本升级
     * @param req UpgradeSmallVersionRequest
     * @return UpgradeSmallVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeSmallVersionResponse UpgradeSmallVersion(UpgradeSmallVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeSmallVersion", UpgradeSmallVersionResponse.class);
    }

    /**
     *升级实例支持多AZ
     * @param req UpgradeVersionToMultiAvailabilityZonesRequest
     * @return UpgradeVersionToMultiAvailabilityZonesResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeVersionToMultiAvailabilityZonesResponse UpgradeVersionToMultiAvailabilityZones(UpgradeVersionToMultiAvailabilityZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeVersionToMultiAvailabilityZones", UpgradeVersionToMultiAvailabilityZonesResponse.class);
    }

}
