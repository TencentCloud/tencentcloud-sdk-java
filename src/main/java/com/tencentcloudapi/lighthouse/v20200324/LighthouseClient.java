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
package com.tencentcloudapi.lighthouse.v20200324;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lighthouse.v20200324.models.*;

public class LighthouseClient extends AbstractClient{
    private static String endpoint = "lighthouse.tencentcloudapi.com";
    private static String service = "lighthouse";
    private static String version = "2020-03-24";
    
    public LighthouseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LighthouseClient(Credential credential, String region, ClientProfile profile) {
        super(LighthouseClient.endpoint, LighthouseClient.version, credential, region, profile);
    }

    /**
     *本接口（ApplyDiskBackup）用于回滚指定云硬盘的备份点。
* 仅支持回滚到原云硬盘。
* 用于回滚的云硬盘备份点必须处于 NORMAL 状态。
  云硬盘备份点状态可以通过  [DescribeDiskBackups](https://cloud.tencent.com/document/api/1207/84379) 接口查询。
* 回滚云硬盘备份点时，云硬盘的状态必须为 UNATTACHED或ATTACHED。
  云硬盘状态可通过 [DescribeDisks](https://cloud.tencent.com/document/api/1207/66093) 接口查询。
* 如果云硬盘处于 ATTACHED状态，相关RUNNING 状态的实例会强制关机，然后回滚云硬盘备份点。
     * @param req ApplyDiskBackupRequest
     * @return ApplyDiskBackupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyDiskBackupResponse ApplyDiskBackup(ApplyDiskBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyDiskBackup", ApplyDiskBackupResponse.class);
    }

    /**
     *本接口 (ApplyFirewallTemplate) 用于应用防火墙模板到多个实例。
     * @param req ApplyFirewallTemplateRequest
     * @return ApplyFirewallTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ApplyFirewallTemplateResponse ApplyFirewallTemplate(ApplyFirewallTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyFirewallTemplate", ApplyFirewallTemplateResponse.class);
    }

    /**
     *本接口（ApplyInstanceSnapshot）用于回滚指定实例的系统盘快照。
<li>仅支持回滚到原系统盘。</li>
<li>用于回滚的快照必须处于 NORMAL 状态。快照状态可以通过 DescribeSnapshots 接口查询，见输出参数中 SnapshotState 字段解释。</li>
<li>回滚快照时，实例的状态必须为 STOPPED 或 RUNNING，可通过 DescribeInstances 接口查询实例状态。处于 RUNNING 状态的实例会强制关机，然后回滚快照。</li>
     * @param req ApplyInstanceSnapshotRequest
     * @return ApplyInstanceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ApplyInstanceSnapshotResponse ApplyInstanceSnapshot(ApplyInstanceSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyInstanceSnapshot", ApplyInstanceSnapshotResponse.class);
    }

    /**
     *本接口（AssociateInstancesKeyPairs）用于绑定用户指定密钥对到实例。
* 只支持 [RUNNING, STOPPED] 状态的 LINUX_UNIX 操作系统的实例。处于 RUNNING 状态的实例会强制关机，然后绑定。
* 将密钥的公钥写入到实例的 SSH 配置当中，用户就可以通过该密钥的私钥来登录实例。
* 如果实例原来绑定过密钥，那么原来的密钥将失效。
* 如果实例原来是通过密码登录，绑定密钥后无法使用密码登录。
* 支持批量操作。每次请求批量实例的上限为 100。如果批量实例存在不允许操作的实例，操作会以特定错误码返回。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req AssociateInstancesKeyPairsRequest
     * @return AssociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateInstancesKeyPairsResponse AssociateInstancesKeyPairs(AssociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateInstancesKeyPairs", AssociateInstancesKeyPairsResponse.class);
    }

    /**
     *本接口 (AttachCcn) 用于建立与云联网的关联。
     * @param req AttachCcnRequest
     * @return AttachCcnResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnResponse AttachCcn(AttachCcnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachCcn", AttachCcnResponse.class);
    }

    /**
     *本接口（AttachDisks）用于挂载一个或多个云硬盘。
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachDisks", AttachDisksResponse.class);
    }

    /**
     *本接口（CancelShareBlueprintAcrossAccounts）用于取消镜像跨账号共享。
指定的镜像ID必须为自定义镜像，且指定账号ID必须已进行共享。
     * @param req CancelShareBlueprintAcrossAccountsRequest
     * @return CancelShareBlueprintAcrossAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CancelShareBlueprintAcrossAccountsResponse CancelShareBlueprintAcrossAccounts(CancelShareBlueprintAcrossAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelShareBlueprintAcrossAccounts", CancelShareBlueprintAcrossAccountsResponse.class);
    }

    /**
     *本接口 (CreateBlueprint) 用于创建镜像。
     * @param req CreateBlueprintRequest
     * @return CreateBlueprintResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlueprintResponse CreateBlueprint(CreateBlueprintRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBlueprint", CreateBlueprintResponse.class);
    }

    /**
     *本接口 ( CreateDiskBackup  ) 用于创建指定云硬盘（当前只支持数据盘）的备份点。
     * @param req CreateDiskBackupRequest
     * @return CreateDiskBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDiskBackupResponse CreateDiskBackup(CreateDiskBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDiskBackup", CreateDiskBackupResponse.class);
    }

    /**
     *本接口(CreateDisks)用于创建一个或多个云硬盘。
     * @param req CreateDisksRequest
     * @return CreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisksResponse CreateDisks(CreateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDisks", CreateDisksResponse.class);
    }

    /**
     *本接口（CreateFirewallRules）用于在实例上添加防火墙规则。


* FirewallVersion 为防火墙版本号，用户每次更新防火墙规则版本会自动加1，防止您更新的规则已过期，不填不考虑冲突。

在 FirewallRules 参数中：
* Protocol 字段支持输入 TCP，UDP，ICMP，ALL。
* Port 字段允许输入 ALL，或者一个单独的端口号，或者用逗号分隔的离散端口号，或者用减号分隔的两个端口号代表的端口范围。当 Port 为范围时，减号分隔的第一个端口号小于第二个端口号。当 Protocol 字段不是 TCP 或 UDP 时，Port 字段只能为空或 ALL。Port 字段长度不得超过 64。
* CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。租户之间网络隔离规则优先于防火墙中的内网规则。
* Action 字段只允许输入 ACCEPT 或 DROP。
* FirewallRuleDescription 字段长度不得超过 64。
     * @param req CreateFirewallRulesRequest
     * @return CreateFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirewallRulesResponse CreateFirewallRules(CreateFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFirewallRules", CreateFirewallRulesResponse.class);
    }

    /**
     *本接口 (CreateFirewallTemplate) 用于创建防火墙模板。
     * @param req CreateFirewallTemplateRequest
     * @return CreateFirewallTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirewallTemplateResponse CreateFirewallTemplate(CreateFirewallTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFirewallTemplate", CreateFirewallTemplateResponse.class);
    }

    /**
     *本接口 (CreateFirewallTemplateRules) 用于创建防火墙模板规则。
     * @param req CreateFirewallTemplateRulesRequest
     * @return CreateFirewallTemplateRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirewallTemplateRulesResponse CreateFirewallTemplateRules(CreateFirewallTemplateRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFirewallTemplateRules", CreateFirewallTemplateRulesResponse.class);
    }

    /**
     *本接口（CreateInstanceSnapshot）用于创建指定实例的系统盘快照。
     * @param req CreateInstanceSnapshotRequest
     * @return CreateInstanceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceSnapshotResponse CreateInstanceSnapshot(CreateInstanceSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceSnapshot", CreateInstanceSnapshotResponse.class);
    }

    /**
     *本接口(CreateInstances)用于创建一个或多个指定套餐的轻量应用服务器实例。
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *本接口（CreateKeyPair）用于创建一个密钥对。
     * @param req CreateKeyPairRequest
     * @return CreateKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyPairResponse CreateKeyPair(CreateKeyPairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKeyPair", CreateKeyPairResponse.class);
    }

    /**
     *本接口 (DeleteBlueprints) 用于删除镜像。
     * @param req DeleteBlueprintsRequest
     * @return DeleteBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlueprintsResponse DeleteBlueprints(DeleteBlueprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBlueprints", DeleteBlueprintsResponse.class);
    }

    /**
     *本接口（DeleteDiskBackups）用于删除云硬盘备份点。
云硬盘备份点必须处于 NORMAL 状态，云硬盘备份点状态可以通过 [DescribeDiskBackups](https://cloud.tencent.com/document/api/1207/84379)接口查询，见输出参数中 DiskBackupState 字段解释。
     * @param req DeleteDiskBackupsRequest
     * @return DeleteDiskBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDiskBackupsResponse DeleteDiskBackups(DeleteDiskBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDiskBackups", DeleteDiskBackupsResponse.class);
    }

    /**
     *本接口（DeleteFirewallRules）用于删除实例的防火墙规则。

* FirewallVersion 用于指定要操作的防火墙的版本。传入 FirewallVersion 版本号若不等于当前防火墙的最新版本，将返回失败；若不传 FirewallVersion 则直接删除指定的规则。

在 FirewallRules 参数中：
* Protocol 字段支持输入 TCP，UDP，ICMP，ALL。
* Port 字段允许输入 ALL，或者一个单独的端口号，或者用逗号分隔的离散端口号，或者用减号分隔的两个端口号代表的端口范围。当 Port 为范围时，减号分隔的第一个端口号小于第二个端口号。当 Protocol 字段不是 TCP 或 UDP 时，Port 字段只能为空或 ALL。Port 字段长度不得超过 64。
* CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。租户之间网络隔离规则优先于防火墙中的内网规则。
* Action 字段只允许输入 ACCEPT 或 DROP。
* FirewallRuleDescription 字段长度不得超过 64。
     * @param req DeleteFirewallRulesRequest
     * @return DeleteFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirewallRulesResponse DeleteFirewallRules(DeleteFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFirewallRules", DeleteFirewallRulesResponse.class);
    }

    /**
     *本接口 (DeleteFirewallTemplate) 用于删除防火墙模板。
     * @param req DeleteFirewallTemplateRequest
     * @return DeleteFirewallTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirewallTemplateResponse DeleteFirewallTemplate(DeleteFirewallTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFirewallTemplate", DeleteFirewallTemplateResponse.class);
    }

    /**
     *本接口 (DeleteFirewallTemplateRules) 用于删除防火墙模板规则。
     * @param req DeleteFirewallTemplateRulesRequest
     * @return DeleteFirewallTemplateRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirewallTemplateRulesResponse DeleteFirewallTemplateRules(DeleteFirewallTemplateRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFirewallTemplateRules", DeleteFirewallTemplateRulesResponse.class);
    }

    /**
     *本接口（DeleteKeyPairs）用于删除密钥对。
     * @param req DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKeyPairsResponse DeleteKeyPairs(DeleteKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKeyPairs", DeleteKeyPairsResponse.class);
    }

    /**
     *本接口（DeleteSnapshots）用于删除快照。
快照必须处于 NORMAL 状态，快照状态可以通过 <a href="https://cloud.tencent.com/document/product/1207/54388" target="_blank">DescribeSnapshots</a> 接口查询，见输出参数中 SnapshotState 字段解释。
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshots", DeleteSnapshotsResponse.class);
    }

    /**
     *本接口(DescribeAllScenes)用于查询全地域使用场景列表。
     * @param req DescribeAllScenesRequest
     * @return DescribeAllScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllScenesResponse DescribeAllScenes(DescribeAllScenesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllScenes", DescribeAllScenesResponse.class);
    }

    /**
     *本接口（DescribeBlueprintInstances）用于查询镜像实例信息。
     * @param req DescribeBlueprintInstancesRequest
     * @return DescribeBlueprintInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlueprintInstancesResponse DescribeBlueprintInstances(DescribeBlueprintInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlueprintInstances", DescribeBlueprintInstancesResponse.class);
    }

    /**
     *本接口（DescribeBlueprints）用于查询镜像信息。
     * @param req DescribeBlueprintsRequest
     * @return DescribeBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlueprintsResponse DescribeBlueprints(DescribeBlueprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlueprints", DescribeBlueprintsResponse.class);
    }

    /**
     *本接口（DescribeBundleDiscount）用于查询套餐折扣信息。
     * @param req DescribeBundleDiscountRequest
     * @return DescribeBundleDiscountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBundleDiscountResponse DescribeBundleDiscount(DescribeBundleDiscountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBundleDiscount", DescribeBundleDiscountResponse.class);
    }

    /**
     *本接口（DescribeBundles）用于查询套餐信息。
     * @param req DescribeBundlesRequest
     * @return DescribeBundlesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBundlesResponse DescribeBundles(DescribeBundlesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBundles", DescribeBundlesResponse.class);
    }

    /**
     *本接口 (DescribeCcnAttachedInstances) 用于查询云联网关联的实例信息。
     * @param req DescribeCcnAttachedInstancesRequest
     * @return DescribeCcnAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnAttachedInstancesResponse DescribeCcnAttachedInstances(DescribeCcnAttachedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcnAttachedInstances", DescribeCcnAttachedInstancesResponse.class);
    }

    /**
     *本接口（DescribeDiskBackups）用于查询云硬盘备份点的详细信息。
     * @param req DescribeDiskBackupsRequest
     * @return DescribeDiskBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskBackupsResponse DescribeDiskBackups(DescribeDiskBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiskBackups", DescribeDiskBackupsResponse.class);
    }

    /**
     *本接口（DescribeDiskBackupsDeniedActions）用于查询一个或多个云硬盘备份点的操作限制列表信息。
     * @param req DescribeDiskBackupsDeniedActionsRequest
     * @return DescribeDiskBackupsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskBackupsDeniedActionsResponse DescribeDiskBackupsDeniedActions(DescribeDiskBackupsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiskBackupsDeniedActions", DescribeDiskBackupsDeniedActionsResponse.class);
    }

    /**
     *本接口（DescribeDiskConfigs）用于查询云硬盘配置。
     * @param req DescribeDiskConfigsRequest
     * @return DescribeDiskConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskConfigsResponse DescribeDiskConfigs(DescribeDiskConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiskConfigs", DescribeDiskConfigsResponse.class);
    }

    /**
     *本接口(DescribeDiskDiscount)用于查询云硬盘折扣信息。
     * @param req DescribeDiskDiscountRequest
     * @return DescribeDiskDiscountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskDiscountResponse DescribeDiskDiscount(DescribeDiskDiscountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiskDiscount", DescribeDiskDiscountResponse.class);
    }

    /**
     *本接口（DescribeDisks）用于查询云硬盘信息。
     * @param req DescribeDisksRequest
     * @return DescribeDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksResponse DescribeDisks(DescribeDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisks", DescribeDisksResponse.class);
    }

    /**
     *本接口（DescribeDisksDeniedActions）用于查询一个或多个云硬盘的操作限制列表信息。
     * @param req DescribeDisksDeniedActionsRequest
     * @return DescribeDisksDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksDeniedActionsResponse DescribeDisksDeniedActions(DescribeDisksDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisksDeniedActions", DescribeDisksDeniedActionsResponse.class);
    }

    /**
     *本接口（DescribeDisksReturnable）用于查询云硬盘是否可退还。
     * @param req DescribeDisksReturnableRequest
     * @return DescribeDisksReturnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksReturnableResponse DescribeDisksReturnable(DescribeDisksReturnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisksReturnable", DescribeDisksReturnableResponse.class);
    }

    /**
     *查询实例内的Docker活动列表。
     * @param req DescribeDockerActivitiesRequest
     * @return DescribeDockerActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDockerActivitiesResponse DescribeDockerActivities(DescribeDockerActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDockerActivities", DescribeDockerActivitiesResponse.class);
    }

    /**
     *查询实例内的Docker容器配置信息
     * @param req DescribeDockerContainerConfigurationRequest
     * @return DescribeDockerContainerConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDockerContainerConfigurationResponse DescribeDockerContainerConfiguration(DescribeDockerContainerConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDockerContainerConfiguration", DescribeDockerContainerConfigurationResponse.class);
    }

    /**
     *查询实例内的Docker容器详情
     * @param req DescribeDockerContainerDetailRequest
     * @return DescribeDockerContainerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDockerContainerDetailResponse DescribeDockerContainerDetail(DescribeDockerContainerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDockerContainerDetail", DescribeDockerContainerDetailResponse.class);
    }

    /**
     *查询实例内的容器列表。
     * @param req DescribeDockerContainersRequest
     * @return DescribeDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDockerContainersResponse DescribeDockerContainers(DescribeDockerContainersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDockerContainers", DescribeDockerContainersResponse.class);
    }

    /**
     *本接口（DescribeFirewallRules）用于查询实例的防火墙规则。
     * @param req DescribeFirewallRulesRequest
     * @return DescribeFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallRulesResponse DescribeFirewallRules(DescribeFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallRules", DescribeFirewallRulesResponse.class);
    }

    /**
     *本接口（DescribeFirewallRulesTemplate）用于查询防火墙规则模板。
     * @param req DescribeFirewallRulesTemplateRequest
     * @return DescribeFirewallRulesTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallRulesTemplateResponse DescribeFirewallRulesTemplate(DescribeFirewallRulesTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallRulesTemplate", DescribeFirewallRulesTemplateResponse.class);
    }

    /**
     *本接口 (DescribeFirewallTemplateApplyRecords) 用于查询防火墙模板应用记录列表。
     * @param req DescribeFirewallTemplateApplyRecordsRequest
     * @return DescribeFirewallTemplateApplyRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplateApplyRecordsResponse DescribeFirewallTemplateApplyRecords(DescribeFirewallTemplateApplyRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallTemplateApplyRecords", DescribeFirewallTemplateApplyRecordsResponse.class);
    }

    /**
     *本接口 (DescribeFirewallTemplateQuota) 用于查询防火墙模板配额。
     * @param req DescribeFirewallTemplateQuotaRequest
     * @return DescribeFirewallTemplateQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplateQuotaResponse DescribeFirewallTemplateQuota(DescribeFirewallTemplateQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallTemplateQuota", DescribeFirewallTemplateQuotaResponse.class);
    }

    /**
     *本接口 (DescribeFirewallTemplateRuleQuota) 用于查询防火墙模板规则配额。
     * @param req DescribeFirewallTemplateRuleQuotaRequest
     * @return DescribeFirewallTemplateRuleQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplateRuleQuotaResponse DescribeFirewallTemplateRuleQuota(DescribeFirewallTemplateRuleQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallTemplateRuleQuota", DescribeFirewallTemplateRuleQuotaResponse.class);
    }

    /**
     *本接口 (DescribeFirewallTemplateRules) 用于查询防火墙模板规则列表。
     * @param req DescribeFirewallTemplateRulesRequest
     * @return DescribeFirewallTemplateRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplateRulesResponse DescribeFirewallTemplateRules(DescribeFirewallTemplateRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallTemplateRules", DescribeFirewallTemplateRulesResponse.class);
    }

    /**
     *本接口 (DescribeFirewallTemplates) 用于查询防火墙模板列表。
     * @param req DescribeFirewallTemplatesRequest
     * @return DescribeFirewallTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplatesResponse DescribeFirewallTemplates(DescribeFirewallTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallTemplates", DescribeFirewallTemplatesResponse.class);
    }

    /**
     *本接口（DescribeGeneralResourceQuotas）用于查询通用资源配额信息。
     * @param req DescribeGeneralResourceQuotasRequest
     * @return DescribeGeneralResourceQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralResourceQuotasResponse DescribeGeneralResourceQuotas(DescribeGeneralResourceQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralResourceQuotas", DescribeGeneralResourceQuotasResponse.class);
    }

    /**
     *本接口用于查询实例默认登录密钥属性。
     * @param req DescribeInstanceLoginKeyPairAttributeRequest
     * @return DescribeInstanceLoginKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLoginKeyPairAttributeResponse DescribeInstanceLoginKeyPairAttribute(DescribeInstanceLoginKeyPairAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLoginKeyPairAttribute", DescribeInstanceLoginKeyPairAttributeResponse.class);
    }

    /**
     *本接口 ( DescribeInstanceVncUrl ) 用于查询实例管理终端地址，获取的地址可用于实例的 VNC 登录。

* 处于 `STOPPED` 状态的机器无法使用此功能。
* 管理终端地址的有效期为 15 秒，调用接口成功后如果 15 秒内不使用该链接进行访问，管理终端地址自动失效，您需要重新查询。
* 管理终端地址一旦被访问，将自动失效，您需要重新查询。
* 如果连接断开，每分钟内重新连接的次数不能超过 30 次。
* 参数 `InstanceVncUrl` ：调用接口成功后会返回的 `InstanceVncUrl` 的值。
获取到 `InstanceVncUrl` 后，您需要在链接 `https://img.qcloud.com/qcloud/app/active_vnc/index.html?` 末尾加上参数 `InstanceVncUrl=xxxx`。
 最后组成的 URL 格式如下：

```
https://img.qcloud.com/qcloud/app/active_vnc/index.html?InstanceVncUrl=wss%3A%2F%2Fbjvnc.qcloud.com%3A26789%2Fvnc%3Fs%3DaHpjWnRVMFNhYmxKdDM5MjRHNlVTSVQwajNUSW0wb2tBbmFtREFCTmFrcy8vUUNPMG0wSHZNOUUxRm5PMmUzWmFDcWlOdDJIbUJxSTZDL0RXcHZxYnZZMmRkWWZWcEZia2lyb09XMzdKNmM9
```

     * @param req DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceVncUrlResponse DescribeInstanceVncUrl(DescribeInstanceVncUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceVncUrl", DescribeInstanceVncUrlResponse.class);
    }

    /**
     *本接口（DescribeInstances）用于查询一个或多个实例的详细信息。

* 可以根据实例 ID、实例名称或者实例的内网 IP 查询实例的详细信息。
* 过滤信息详细请见过滤器 [Filters](https://cloud.tencent.com/document/product/1207/47576#Filter) 。
* 如果参数为空，返回当前用户一定数量（Limit 所指定的数量，默认为 20）的实例。
* 支持查询实例的最新操作（LatestOperation）以及最新操作状态（LatestOperationState）。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *本接口（DescribeInstancesDeniedActions）用于查询一个或多个实例的操作限制列表信息。
     * @param req DescribeInstancesDeniedActionsRequest
     * @return DescribeInstancesDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDeniedActionsResponse DescribeInstancesDeniedActions(DescribeInstancesDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesDeniedActions", DescribeInstancesDeniedActionsResponse.class);
    }

    /**
     *本接口(DescribeInstancesDiskNum)用于查询实例挂载云硬盘数量。
     * @param req DescribeInstancesDiskNumRequest
     * @return DescribeInstancesDiskNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDiskNumResponse DescribeInstancesDiskNum(DescribeInstancesDiskNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesDiskNum", DescribeInstancesDiskNumResponse.class);
    }

    /**
     *本接口（DescribeInstancesReturnable）用于查询实例是否可退还。
     * @param req DescribeInstancesReturnableRequest
     * @return DescribeInstancesReturnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesReturnableResponse DescribeInstancesReturnable(DescribeInstancesReturnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesReturnable", DescribeInstancesReturnableResponse.class);
    }

    /**
     *本接口（DescribeInstancesTrafficPackages）用于查询一个或多个实例的流量包详情。
     * @param req DescribeInstancesTrafficPackagesRequest
     * @return DescribeInstancesTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesTrafficPackagesResponse DescribeInstancesTrafficPackages(DescribeInstancesTrafficPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesTrafficPackages", DescribeInstancesTrafficPackagesResponse.class);
    }

    /**
     *本接口 (DescribeKeyPairs) 用于查询用户密钥对信息。
     * @param req DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyPairsResponse DescribeKeyPairs(DescribeKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeyPairs", DescribeKeyPairsResponse.class);
    }

    /**
     *本接口（DescribeModifyInstanceBundles）用于查询实例可变更套餐列表。
     * @param req DescribeModifyInstanceBundlesRequest
     * @return DescribeModifyInstanceBundlesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModifyInstanceBundlesResponse DescribeModifyInstanceBundles(DescribeModifyInstanceBundlesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModifyInstanceBundles", DescribeModifyInstanceBundlesResponse.class);
    }

    /**
     *本接口（DescribeRegions）用于查询地域信息。
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *本接口（DescribeResetInstanceBlueprints）查询重置实例的镜像信息。
     * @param req DescribeResetInstanceBlueprintsRequest
     * @return DescribeResetInstanceBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResetInstanceBlueprintsResponse DescribeResetInstanceBlueprints(DescribeResetInstanceBlueprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResetInstanceBlueprints", DescribeResetInstanceBlueprintsResponse.class);
    }

    /**
     *本接口(DescribeScenes)用于查看使用场景列表。
     * @param req DescribeScenesRequest
     * @return DescribeScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenesResponse DescribeScenes(DescribeScenesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenes", DescribeScenesResponse.class);
    }

    /**
     *本接口（DescribeSnapshots）用于查询快照的详细信息。
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshots", DescribeSnapshotsResponse.class);
    }

    /**
     *本接口（DescribeSnapshotsDeniedActions）用于查询一个或多个快照的操作限制列表信息。
     * @param req DescribeSnapshotsDeniedActionsRequest
     * @return DescribeSnapshotsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsDeniedActionsResponse DescribeSnapshotsDeniedActions(DescribeSnapshotsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotsDeniedActions", DescribeSnapshotsDeniedActionsResponse.class);
    }

    /**
     *查询地域下可用区
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *本接口 (DetachCcn) 用于解除与云联网的关联。
     * @param req DetachCcnRequest
     * @return DetachCcnResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnResponse DetachCcn(DetachCcnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachCcn", DetachCcnResponse.class);
    }

    /**
     *本接口（DetachDisks）用于卸载一个或多个云硬盘。
     * @param req DetachDisksRequest
     * @return DetachDisksResponse
     * @throws TencentCloudSDKException
     */
    public DetachDisksResponse DetachDisks(DetachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachDisks", DetachDisksResponse.class);
    }

    /**
     *本接口（DisassociateInstancesKeyPairs）用于解除实例与指定密钥对的绑定关系。

* 只支持 [RUNNING, STOPPED] 状态的 LINUX_UNIX 操作系统的实例。处于 RUNNING 状态的实例会强制关机，然后解绑。
* 解绑密钥后，实例可以通过原来设置的密码登录。
* 如果原来没有设置密码，解绑后将无法使用 SSH 登录。可以调用 <a href="https://cloud.tencent.com/document/product/1207/55546" target="_blank">ResetInstancesPassword</a> 接口来设置登录密码。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req DisassociateInstancesKeyPairsRequest
     * @return DisassociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateInstancesKeyPairsResponse DisassociateInstancesKeyPairs(DisassociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateInstancesKeyPairs", DisassociateInstancesKeyPairsResponse.class);
    }

    /**
     *本接口（ImportKeyPair）用于导入用户指定密钥对。
     * @param req ImportKeyPairRequest
     * @return ImportKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyPairResponse ImportKeyPair(ImportKeyPairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportKeyPair", ImportKeyPairResponse.class);
    }

    /**
     *本接口 (InquirePriceCreateBlueprint) 用于创建镜像询价。
     * @param req InquirePriceCreateBlueprintRequest
     * @return InquirePriceCreateBlueprintResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateBlueprintResponse InquirePriceCreateBlueprint(InquirePriceCreateBlueprintRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateBlueprint", InquirePriceCreateBlueprintResponse.class);
    }

    /**
     *本接口（InquirePriceCreateDisks）用于新购云硬盘询价。
     * @param req InquirePriceCreateDisksRequest
     * @return InquirePriceCreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDisksResponse InquirePriceCreateDisks(InquirePriceCreateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateDisks", InquirePriceCreateDisksResponse.class);
    }

    /**
     *本接口（InquiryPriceCreateInstances）用于创建实例询价。
     * @param req InquirePriceCreateInstancesRequest
     * @return InquirePriceCreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateInstancesResponse InquirePriceCreateInstances(InquirePriceCreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateInstances", InquirePriceCreateInstancesResponse.class);
    }

    /**
     *本接口（InquirePriceRenewDisks）用于续费云硬盘询价。
     * @param req InquirePriceRenewDisksRequest
     * @return InquirePriceRenewDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewDisksResponse InquirePriceRenewDisks(InquirePriceRenewDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewDisks", InquirePriceRenewDisksResponse.class);
    }

    /**
     *本接口（InquirePriceRenewInstances）用于续费实例询价。
     * @param req InquirePriceRenewInstancesRequest
     * @return InquirePriceRenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewInstancesResponse InquirePriceRenewInstances(InquirePriceRenewInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewInstances", InquirePriceRenewInstancesResponse.class);
    }

    /**
     *本接口(IsolateDisks)用于退还一个或多个轻量应用服务器云硬盘。

只有状态为 UNATTACHED 的数据盘才可以进行此操作。
接口调用成功后，云硬盘会进入SHUTDOWN 状态。
支持批量操作。每次请求批量资源的上限为 20。
本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。云硬盘操作结果可以通过调用 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询，如果云硬盘的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req IsolateDisksRequest
     * @return IsolateDisksResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDisksResponse IsolateDisks(IsolateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDisks", IsolateDisksResponse.class);
    }

    /**
     *本接口(IsolateInstances)用于退还一个或多个轻量应用服务器实例。
* 只有状态为 RUNNING 或 STOPPED 的实例才可以进行此操作。
* 接口调用成功后，实例会进入SHUTDOWN 状态。
* 支持批量操作。每次请求批量资源（包括实例与数据盘）的上限为 20。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req IsolateInstancesRequest
     * @return IsolateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public IsolateInstancesResponse IsolateInstances(IsolateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateInstances", IsolateInstancesResponse.class);
    }

    /**
     *本接口 (ModifyBlueprintAttribute) 用于修改镜像属性。
     * @param req ModifyBlueprintAttributeRequest
     * @return ModifyBlueprintAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlueprintAttributeResponse ModifyBlueprintAttribute(ModifyBlueprintAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlueprintAttribute", ModifyBlueprintAttributeResponse.class);
    }

    /**
     *本接口 (ModifyDiskBackupsAttribute) 用于修改云硬盘备份点属性。
     * @param req ModifyDiskBackupsAttributeRequest
     * @return ModifyDiskBackupsAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskBackupsAttributeResponse ModifyDiskBackupsAttribute(ModifyDiskBackupsAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDiskBackupsAttribute", ModifyDiskBackupsAttributeResponse.class);
    }

    /**
     *本接口(ModifyDisksAttribute)用于修改云硬盘属性。
     * @param req ModifyDisksAttributeRequest
     * @return ModifyDisksAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksAttributeResponse ModifyDisksAttribute(ModifyDisksAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDisksAttribute", ModifyDisksAttributeResponse.class);
    }

    /**
     *本接口(ModifyDisksBackupQuota)用于调整云硬盘备份点配额。该操作目前仅支持云硬盘类型为数据盘的云硬盘。
     * @param req ModifyDisksBackupQuotaRequest
     * @return ModifyDisksBackupQuotaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksBackupQuotaResponse ModifyDisksBackupQuota(ModifyDisksBackupQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDisksBackupQuota", ModifyDisksBackupQuotaResponse.class);
    }

    /**
     *本接口（ModifyDisksRenewFlag）用于修改云硬盘续费标识。
     * @param req ModifyDisksRenewFlagRequest
     * @return ModifyDisksRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksRenewFlagResponse ModifyDisksRenewFlag(ModifyDisksRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDisksRenewFlag", ModifyDisksRenewFlagResponse.class);
    }

    /**
     *修改实例内的Docker容器，之后可以通过返回的ActivityId调用<a href="https://cloud.tencent.com/document/product/1207/95476" target="_blank">DescribeDockerActivities</a>接口查询重建情况。
请注意：本接口会重新创建并运行实例内的Docker容器。
     * @param req ModifyDockerContainerRequest
     * @return ModifyDockerContainerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDockerContainerResponse ModifyDockerContainer(ModifyDockerContainerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDockerContainer", ModifyDockerContainerResponse.class);
    }

    /**
     *本接口（ModifyFirewallRuleDescription）用于修改单条防火墙规则描述。

* FirewallVersion 用于指定要操作的防火墙的版本。传入 FirewallVersion 版本号若不等于当前防火墙的最新版本，将返回失败；若不传 FirewallVersion 则直接修改防火墙规则备注。

用FirewallRule参数来指定要修改的防火墙规则，使用其中的Protocol， Port， CidrBlock，Action字段来匹配要修改的防火墙规则。

在 FirewallRule 参数中：
* Protocol 字段支持输入 TCP，UDP，ICMP，ALL。
* Port 字段允许输入 ALL，或者一个单独的端口号，或者用逗号分隔的离散端口号，或者用减号分隔的两个端口号代表的端口范围。当 Port 为范围时，减号分隔的第一个端口号小于第二个端口号。当 Protocol 字段不是 TCP 或 UDP 时，Port 字段只能为空或 ALL。Port 字段长度不得超过 64。
* CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。租户之间网络隔离规则优先于防火墙中的内网规则。
* Action 字段只允许输入 ACCEPT 或 DROP。
* FirewallRuleDescription 字段长度不得超过 64。
     * @param req ModifyFirewallRuleDescriptionRequest
     * @return ModifyFirewallRuleDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFirewallRuleDescriptionResponse ModifyFirewallRuleDescription(ModifyFirewallRuleDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFirewallRuleDescription", ModifyFirewallRuleDescriptionResponse.class);
    }

    /**
     *本接口（ModifyFirewallRules）用于重置实例防火墙规则。

本接口先删除当前实例的所有防火墙规则，然后添加新的规则。

* FirewallVersion 用于指定要操作的防火墙的版本。传入 FirewallVersion 版本号若不等于当前防火墙的最新版本，将返回失败；若不传 FirewallVersion 则直接重置防火墙规则。

在 FirewallRules 参数中：
* Protocol 字段支持输入 TCP，UDP，ICMP，ALL。
* Port 字段允许输入 ALL，或者一个单独的端口号，或者用逗号分隔的离散端口号，或者用减号分隔的两个端口号代表的端口范围。当 Port 为范围时，减号分隔的第一个端口号小于第二个端口号。当 Protocol 字段不是 TCP 或 UDP 时，Port 字段只能为空或 ALL。Port 字段长度不得超过 64。
* CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。租户之间网络隔离规则优先于防火墙中的内网规则。
* Action 字段只允许输入 ACCEPT 或 DROP。
* FirewallRuleDescription 字段长度不得超过 64。
     * @param req ModifyFirewallRulesRequest
     * @return ModifyFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFirewallRulesResponse ModifyFirewallRules(ModifyFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFirewallRules", ModifyFirewallRulesResponse.class);
    }

    /**
     *本接口 (ModifyFirewallTemplate) 用于修改防火墙模板。
     * @param req ModifyFirewallTemplateRequest
     * @return ModifyFirewallTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFirewallTemplateResponse ModifyFirewallTemplate(ModifyFirewallTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFirewallTemplate", ModifyFirewallTemplateResponse.class);
    }

    /**
     *本接口（ModifyInstancesAttribute）用于修改实例的属性。
* “实例名称”仅为方便用户自己管理之用。
* 支持批量操作。每次请求批量实例的上限为 100。
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesAttribute", ModifyInstancesAttributeResponse.class);
    }

    /**
     *本接口(ModifyInstancesBundle)用于变更一个或多个轻量应用服务器实例套餐。
* 只有状态为 RUNNING，STOPPED的实例才可以进行此操作。
* 支持批量操作。每次请求批量实例的上限为 30。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req ModifyInstancesBundleRequest
     * @return ModifyInstancesBundleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesBundleResponse ModifyInstancesBundle(ModifyInstancesBundleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesBundle", ModifyInstancesBundleResponse.class);
    }

    /**
     *本接口用于设置实例默认登录密钥对属性。


     * @param req ModifyInstancesLoginKeyPairAttributeRequest
     * @return ModifyInstancesLoginKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesLoginKeyPairAttributeResponse ModifyInstancesLoginKeyPairAttribute(ModifyInstancesLoginKeyPairAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesLoginKeyPairAttribute", ModifyInstancesLoginKeyPairAttributeResponse.class);
    }

    /**
     *本接口 (ModifyInstancesRenewFlag) 用于修改包年包月实例续费标识。

* 实例被标识为自动续费后，每次在实例到期时，会自动续费一个月。
* 支持批量操作。每次请求批量实例的上限为100。
     * @param req ModifyInstancesRenewFlagRequest
     * @return ModifyInstancesRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesRenewFlagResponse ModifyInstancesRenewFlag(ModifyInstancesRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesRenewFlag", ModifyInstancesRenewFlagResponse.class);
    }

    /**
     *本接口（ModifySnapshotAttribute）用于修改指定快照的属性。
<li>“快照名称”仅为方便用户自己管理之用。</li>
     * @param req ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotAttributeResponse ModifySnapshotAttribute(ModifySnapshotAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshotAttribute", ModifySnapshotAttributeResponse.class);
    }

    /**
     *本接口（RebootInstances）用于重启实例。

* 只有状态为 RUNNING 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 REBOOTING 状态；重启实例成功时，实例会进入 RUNNING 状态。
* 支持批量操作，每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootInstances", RebootInstancesResponse.class);
    }

    /**
     *删除实例内的Docker容器，之后可以通过返回的ActivityId调用[DescribeDockerActivities](https://cloud.tencent.com/document/product/1207/95476)接口查询删除情况。
     * @param req RemoveDockerContainersRequest
     * @return RemoveDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public RemoveDockerContainersResponse RemoveDockerContainers(RemoveDockerContainersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveDockerContainers", RemoveDockerContainersResponse.class);
    }

    /**
     *重命名实例内的Docker容器，之后可以通过返回的ActivityId调用[DescribeDockerActivities](https://cloud.tencent.com/document/product/1207/95476)接口查询重命名情况。
     * @param req RenameDockerContainerRequest
     * @return RenameDockerContainerResponse
     * @throws TencentCloudSDKException
     */
    public RenameDockerContainerResponse RenameDockerContainer(RenameDockerContainerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameDockerContainer", RenameDockerContainerResponse.class);
    }

    /**
     *本接口(RenewDisks)用于续费一个或多个轻量应用服务器云硬盘。

只有状态为 ATTACHED，UNATTACHED 或 SHUTDOWN 的数据盘才可以进行此操作。
支持批量操作。每次请求批量云硬盘的上限为 50。
本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。云硬盘操作结果可以通过调用 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询，如果云硬盘的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req RenewDisksRequest
     * @return RenewDisksResponse
     * @throws TencentCloudSDKException
     */
    public RenewDisksResponse RenewDisks(RenewDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDisks", RenewDisksResponse.class);
    }

    /**
     *本接口(RenewInstances)用于续费一个或多个轻量应用服务器实例。
* 只有状态为 RUNNING，STOPPED 或 SHUTDOWN 的实例才可以进行此操作。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req RenewInstancesRequest
     * @return RenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstancesResponse RenewInstances(RenewInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstances", RenewInstancesResponse.class);
    }

    /**
     *本接口 (ReplaceFirewallTemplateRules) 用于替换防火墙模板规则。
     * @param req ReplaceFirewallTemplateRuleRequest
     * @return ReplaceFirewallTemplateRuleResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceFirewallTemplateRuleResponse ReplaceFirewallTemplateRule(ReplaceFirewallTemplateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceFirewallTemplateRule", ReplaceFirewallTemplateRuleResponse.class);
    }

    /**
     *重新创建并运行实例内的Docker容器，之后可以通过返回的ActivityId调用[DescribeDockerActivities](https://cloud.tencent.com/document/product/1207/95476)接口查询重建情况。
     * @param req RerunDockerContainerRequest
     * @return RerunDockerContainerResponse
     * @throws TencentCloudSDKException
     */
    public RerunDockerContainerResponse RerunDockerContainer(RerunDockerContainerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunDockerContainer", RerunDockerContainerResponse.class);
    }

    /**
     *本接口 (ResetAttachCcn) 用于关联云联网实例申请过期时，重新申请关联操作。
     * @param req ResetAttachCcnRequest
     * @return ResetAttachCcnResponse
     * @throws TencentCloudSDKException
     */
    public ResetAttachCcnResponse ResetAttachCcn(ResetAttachCcnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAttachCcn", ResetAttachCcnResponse.class);
    }

    /**
     *本接口 (ResetFirewallTemplateRules) 用于重置防火墙模板下所有规则。
     * @param req ResetFirewallTemplateRulesRequest
     * @return ResetFirewallTemplateRulesResponse
     * @throws TencentCloudSDKException
     */
    public ResetFirewallTemplateRulesResponse ResetFirewallTemplateRules(ResetFirewallTemplateRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetFirewallTemplateRules", ResetFirewallTemplateRulesResponse.class);
    }

    /**
     *本接口（ResetInstance）用于重装指定实例上的镜像。

* 如果指定了 BlueprintId 参数，则使用指定的镜像重装；否则按照当前实例使用的镜像进行重装。
* 系统盘将会被格式化，并重置；请确保系统盘中无重要文件。
* 目前不支持实例使用该接口实现 LINUX_UNIX 和 WINDOWS 操作系统切换。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req ResetInstanceRequest
     * @return ResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstanceResponse ResetInstance(ResetInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstance", ResetInstanceResponse.class);
    }

    /**
     *本接口（ResetInstancesPassword）用于将实例操作系统的密码重置为用户指定的密码。
* 只修改管理员账号的密码。实例的操作系统不同，管理员账号也会不一样（Windows 为 Administrator，Ubuntu 为 ubuntu ，其它系统为 root）。
* 支持批量操作。将多个实例操作系统的密码重置为相同的密码。每次请求批量实例的上限为 100。
* 建议对运行中的实例先手动关机，然后再进行密码重置。如实例处于运行中状态，本接口操作过程中会对实例进行关机操作，尝试正常关机失败后进行强制关机。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
注意：强制关机的效果等同于关闭物理计算机的电源开关。强制关机可能会导致数据丢失或文件系统损坏。
     * @param req ResetInstancesPasswordRequest
     * @return ResetInstancesPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesPasswordResponse ResetInstancesPassword(ResetInstancesPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesPassword", ResetInstancesPasswordResponse.class);
    }

    /**
     *本接口(ResizeDisks)用于扩容云硬盘。该操作目前仅支持云硬盘类型为数据盘的云硬盘。
     * @param req ResizeDisksRequest
     * @return ResizeDisksResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDisksResponse ResizeDisks(ResizeDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDisks", ResizeDisksResponse.class);
    }

    /**
     *重启实例内的Docker容器，之后可以通过返回的ActivityId调用[DescribeDockerActivities](https://cloud.tencent.com/document/product/1207/95476)接口查询重启情况。
     * @param req RestartDockerContainersRequest
     * @return RestartDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public RestartDockerContainersResponse RestartDockerContainers(RestartDockerContainersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDockerContainers", RestartDockerContainersResponse.class);
    }

    /**
     *创建并运行多个Docker容器，之后可以通过返回的ActivityIds调用<a href="https://cloud.tencent.com/document/product/1207/95476" target="_blank">DescribeDockerActivities</a>接口查询创建情况。
     * @param req RunDockerContainersRequest
     * @return RunDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public RunDockerContainersResponse RunDockerContainers(RunDockerContainersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunDockerContainers", RunDockerContainersResponse.class);
    }

    /**
     *本接口（ShareBlueprintAcrossAccounts）用于跨账号共享镜像。
仅支持共享自定义镜像， 且用于共享的镜像状态必须为NORMAL。
共享的账号必须为主账号。
     * @param req ShareBlueprintAcrossAccountsRequest
     * @return ShareBlueprintAcrossAccountsResponse
     * @throws TencentCloudSDKException
     */
    public ShareBlueprintAcrossAccountsResponse ShareBlueprintAcrossAccounts(ShareBlueprintAcrossAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ShareBlueprintAcrossAccounts", ShareBlueprintAcrossAccountsResponse.class);
    }

    /**
     *启动实例内的Docker容器，之后可以通过返回的ActivityId调用[DescribeDockerActivities](https://cloud.tencent.com/document/product/1207/95476)接口查询启动情况。
     * @param req StartDockerContainersRequest
     * @return StartDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public StartDockerContainersResponse StartDockerContainers(StartDockerContainersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartDockerContainers", StartDockerContainersResponse.class);
    }

    /**
     *本接口（StartInstances）用于启动一个或多个实例。

* 只有状态为 STOPPED 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 STARTING 状态；启动实例成功时，实例会进入 RUNNING 状态。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstances", StartInstancesResponse.class);
    }

    /**
     *停止实例内的Docker容器，之后可以通过返回的ActivityId调用[DescribeDockerActivities](https://cloud.tencent.com/document/product/1207/95476)接口查询停止情况。
     * @param req StopDockerContainersRequest
     * @return StopDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public StopDockerContainersResponse StopDockerContainers(StopDockerContainersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopDockerContainers", StopDockerContainersResponse.class);
    }

    /**
     *本接口（StopInstances）用于关闭一个或多个实例。
* 只有状态为 RUNNING 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 STOPPING 状态；关闭实例成功时，实例会进入 STOPPED 状态。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstances", StopInstancesResponse.class);
    }

    /**
     *本接口（TerminateDisks）用于销毁一个或多个云硬盘。
     * @param req TerminateDisksRequest
     * @return TerminateDisksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDisksResponse TerminateDisks(TerminateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDisks", TerminateDisksResponse.class);
    }

    /**
     *本接口 (TerminateInstances) 用于销毁实例。

* 处于 SHUTDOWN 状态的实例，可通过本接口销毁，且不可恢复。
* 支持批量操作，每次请求批量实例的上限为100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 <a href="https://cloud.tencent.com/document/product/1207/47573" target="_blank">DescribeInstances</a> 接口查询，如果实例的最新操作状态 (LatestOperationState) 为“SUCCESS”，则代表操作成功。
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

}
