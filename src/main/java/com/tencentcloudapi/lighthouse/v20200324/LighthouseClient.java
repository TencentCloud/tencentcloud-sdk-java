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
     *本接口（ApplyInstanceSnapshot）用于回滚指定实例的系统盘快照。
<li>仅支持回滚到原系统盘。</li>
<li>用于回滚的快照必须处于 NORMAL 状态。快照状态可以通 DescribeSnapshots 接口查询，见输出参数中 SnapshotState 字段解释。</li>
<li>回滚快照时，实例的状态必须为 STOPPED 或 RUNNING，可通过 DescribeInstances 接口查询实例状态。处于 RUNNING 状态的实例会强制关机，然后回滚快照。</li>
     * @param req ApplyInstanceSnapshotRequest
     * @return ApplyInstanceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ApplyInstanceSnapshotResponse ApplyInstanceSnapshot(ApplyInstanceSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyInstanceSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyInstanceSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyInstanceSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateBlueprint) 用于创建镜像。
     * @param req CreateBlueprintRequest
     * @return CreateBlueprintResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlueprintResponse CreateBlueprint(CreateBlueprintRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBlueprintResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBlueprintResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBlueprint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<CreateFirewallRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFirewallRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFirewallRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateInstanceSnapshot）用于创建指定实例的系统盘快照。
     * @param req CreateInstanceSnapshotRequest
     * @return CreateInstanceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceSnapshotResponse CreateInstanceSnapshot(CreateInstanceSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstanceSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteBlueprints) 用于删除镜像。
     * @param req DeleteBlueprintsRequest
     * @return DeleteBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlueprintsResponse DeleteBlueprints(DeleteBlueprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBlueprintsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBlueprintsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBlueprints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DeleteFirewallRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFirewallRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFirewallRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSnapshots）用于删除快照。
快照必须处于 NORMAL 状态，快照状态可以通过 DescribeSnapshots 接口查询，见输出参数中 SnapshotState 字段解释。
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBlueprints）用于查询镜像信息。
     * @param req DescribeBlueprintsRequest
     * @return DescribeBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlueprintsResponse DescribeBlueprints(DescribeBlueprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlueprintsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlueprintsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlueprints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBundles）用于查询套餐信息。
     * @param req DescribeBundlesRequest
     * @return DescribeBundlesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBundlesResponse DescribeBundles(DescribeBundlesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBundlesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBundlesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBundles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFirewallRules）用于查询实例的防火墙规则。
     * @param req DescribeFirewallRulesRequest
     * @return DescribeFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallRulesResponse DescribeFirewallRules(DescribeFirewallRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirewallRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirewallRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirewallRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstancesTrafficPackages）用于查询一个或多个实例的流量包详情。
     * @param req DescribeInstancesTrafficPackagesRequest
     * @return DescribeInstancesTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesTrafficPackagesResponse DescribeInstancesTrafficPackages(DescribeInstancesTrafficPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesTrafficPackagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesTrafficPackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesTrafficPackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSnapshots）用于查询快照的详细信息。
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyBlueprintAttribute) 用于修改镜像属性。
     * @param req ModifyBlueprintAttributeRequest
     * @return ModifyBlueprintAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlueprintAttributeResponse ModifyBlueprintAttribute(ModifyBlueprintAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBlueprintAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBlueprintAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBlueprintAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySnapshotAttribute）用于修改指定快照的属性。
<li>“快照名称”仅为方便用户自己管理之用，腾讯云并不以此名称作为提交工单或是进行快照管理操作的依据。</li>
     * @param req ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotAttributeResponse ModifySnapshotAttribute(ModifySnapshotAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshotAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RebootInstances）用于重启实例。

* 只有状态为 RUNNING 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 REBOOTING 状态；重启实例成功时，实例会进入 RUNNING 状态。
* 支持批量操作，每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebootInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RebootInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RebootInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetInstance）用于重装指定实例上的镜像。

* 如果指定了 BlueprintId 参数，则使用指定的镜像重装；否则按照当前实例使用的镜像进行重装。
* 系统盘将会被格式化，并重置；请确保系统盘中无重要文件。
* 目前不支持实例使用该接口实现 LINUX_UNIX 和 WINDOWS 操作系统切换。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req ResetInstanceRequest
     * @return ResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstanceResponse ResetInstance(ResetInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartInstances）用于启动一个或多个实例。

* 只有状态为 STOPPED 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 STARTING 状态；启动实例成功时，实例会进入 RUNNING 状态。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopInstances）用于关闭一个或多个实例。
* 只有状态为 RUNNING 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 STOPPING 状态；关闭实例成功时，实例会进入 STOPPED 状态。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
