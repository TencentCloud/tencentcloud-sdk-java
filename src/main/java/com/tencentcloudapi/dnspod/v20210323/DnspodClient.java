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
package com.tencentcloudapi.dnspod.v20210323;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dnspod.v20210323.models.*;

public class DnspodClient extends AbstractClient{
    private static String endpoint = "dnspod.tencentcloudapi.com";
    private static String service = "dnspod";
    private static String version = "2021-03-23";

    public DnspodClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DnspodClient(Credential credential, String region, ClientProfile profile) {
        super(DnspodClient.endpoint, DnspodClient.version, credential, region, profile);
    }

    /**
     *回滚前检查单条记录
     * @param req CheckRecordSnapshotRollbackRequest
     * @return CheckRecordSnapshotRollbackResponse
     * @throws TencentCloudSDKException
     */
    public CheckRecordSnapshotRollbackResponse CheckRecordSnapshotRollback(CheckRecordSnapshotRollbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckRecordSnapshotRollbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckRecordSnapshotRollbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckRecordSnapshotRollback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *快照回滚前检查
     * @param req CheckSnapshotRollbackRequest
     * @return CheckSnapshotRollbackResponse
     * @throws TencentCloudSDKException
     */
    public CheckSnapshotRollbackResponse CheckSnapshotRollback(CheckSnapshotRollbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckSnapshotRollbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckSnapshotRollbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckSnapshotRollback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DNSPod商品下单
     * @param req CreateDealRequest
     * @return CreateDealResponse
     * @throws TencentCloudSDKException
     */
    public CreateDealResponse CreateDeal(CreateDealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加域名

     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建域名别名
     * @param req CreateDomainAliasRequest
     * @return CreateDomainAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAliasResponse CreateDomainAlias(CreateDomainAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量添加域名
     * @param req CreateDomainBatchRequest
     * @return CreateDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainBatchResponse CreateDomainBatch(CreateDomainBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建域名分组
     * @param req CreateDomainGroupRequest
     * @return CreateDomainGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainGroupResponse CreateDomainGroup(CreateDomainGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加记录

     * @param req CreateRecordRequest
     * @return CreateRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordResponse CreateRecord(CreateRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量添加记录
     * @param req CreateRecordBatchRequest
     * @return CreateRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordBatchResponse CreateRecordBatch(CreateRecordBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加记录分组
     * @param req CreateRecordGroupRequest
     * @return CreateRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordGroupResponse CreateRecordGroup(CreateRecordGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建快照
     * @param req CreateSnapshotRequest
     * @return CreateSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotResponse CreateSnapshot(CreateSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除域名

     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除域名别名
     * @param req DeleteDomainAliasRequest
     * @return DeleteDomainAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAliasResponse DeleteDomainAlias(DeleteDomainAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomainAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除记录
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除记录分组
     * @param req DeleteRecordGroupRequest
     * @return DeleteRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordGroupResponse DeleteRecordGroup(DeleteRecordGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除域名共享
     * @param req DeleteShareDomainRequest
     * @return DeleteShareDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareDomainResponse DeleteShareDomain(DeleteShareDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteShareDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteShareDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteShareDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除快照
     * @param req DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotResponse DeleteSnapshot(DeleteSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取任务详情
     * @param req DescribeBatchTaskRequest
     * @return DescribeBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTaskResponse DescribeBatchTask(DescribeBatchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名信息
     * @param req DescribeDomainRequest
     * @return DescribeDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainResponse DescribeDomain(DescribeDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名别名列表
     * @param req DescribeDomainAliasListRequest
     * @return DescribeDomainAliasListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAliasListResponse DescribeDomainAliasList(DescribeDomainAliasListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainAliasListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainAliasListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainAliasList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计各个域名的解析量，帮助您了解流量情况、时间段分布。支持查看近 3 个月内的统计情况
     * @param req DescribeDomainAnalyticsRequest
     * @return DescribeDomainAnalyticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAnalyticsResponse DescribeDomainAnalytics(DescribeDomainAnalyticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainAnalyticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainAnalyticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainAnalytics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名分组列表
     * @param req DescribeDomainGroupListRequest
     * @return DescribeDomainGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainGroupListResponse DescribeDomainGroupList(DescribeDomainGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名列表
     * @param req DescribeDomainListRequest
     * @return DescribeDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainListResponse DescribeDomainList(DescribeDomainListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名日志
     * @param req DescribeDomainLogListRequest
     * @return DescribeDomainLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainLogListResponse DescribeDomainLogList(DescribeDomainLogListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainLogListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainLogListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainLogList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名权限
     * @param req DescribeDomainPurviewRequest
     * @return DescribeDomainPurviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainPurviewResponse DescribeDomainPurview(DescribeDomainPurviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainPurviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainPurviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainPurview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名共享信息
     * @param req DescribeDomainShareInfoRequest
     * @return DescribeDomainShareInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainShareInfoResponse DescribeDomainShareInfo(DescribeDomainShareInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainShareInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainShareInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainShareInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取记录信息
     * @param req DescribeRecordRequest
     * @return DescribeRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordResponse DescribeRecord(DescribeRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询解析记录分组列表
     * @param req DescribeRecordGroupListRequest
     * @return DescribeRecordGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordGroupListResponse DescribeRecordGroupList(DescribeRecordGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取等级允许的线路
     * @param req DescribeRecordLineListRequest
     * @return DescribeRecordLineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordLineListResponse DescribeRecordLineList(DescribeRecordLineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordLineListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordLineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordLineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取某个域名下的解析记录列表
     * @param req DescribeRecordListRequest
     * @return DescribeRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordListResponse DescribeRecordList(DescribeRecordListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询解析记录重新回滚的结果
     * @param req DescribeRecordSnapshotRollbackResultRequest
     * @return DescribeRecordSnapshotRollbackResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordSnapshotRollbackResultResponse DescribeRecordSnapshotRollbackResult(DescribeRecordSnapshotRollbackResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordSnapshotRollbackResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordSnapshotRollbackResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordSnapshotRollbackResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取等级允许的记录类型
     * @param req DescribeRecordTypeRequest
     * @return DescribeRecordTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTypeResponse DescribeRecordType(DescribeRecordTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询解析快照配置
     * @param req DescribeSnapshotConfigRequest
     * @return DescribeSnapshotConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotConfigResponse DescribeSnapshotConfig(DescribeSnapshotConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询快照列表
     * @param req DescribeSnapshotListRequest
     * @return DescribeSnapshotListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotListResponse DescribeSnapshotList(DescribeSnapshotListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询快照回滚结果
     * @param req DescribeSnapshotRollbackResultRequest
     * @return DescribeSnapshotRollbackResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotRollbackResultResponse DescribeSnapshotRollbackResult(DescribeSnapshotRollbackResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotRollbackResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotRollbackResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotRollbackResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询最近一次回滚
     * @param req DescribeSnapshotRollbackTaskRequest
     * @return DescribeSnapshotRollbackTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotRollbackTaskResponse DescribeSnapshotRollbackTask(DescribeSnapshotRollbackTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotRollbackTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotRollbackTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotRollbackTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计子域名的解析量，帮助您了解流量情况、时间段分布。支持查看近 3 个月内的统计情况。仅付费套餐域名可用。
     * @param req DescribeSubdomainAnalyticsRequest
     * @return DescribeSubdomainAnalyticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubdomainAnalyticsResponse DescribeSubdomainAnalytics(DescribeSubdomainAnalyticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubdomainAnalyticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubdomainAnalyticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubdomainAnalytics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取帐户信息
     * @param req DescribeUserDetailRequest
     * @return DescribeUserDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDetailResponse DescribeUserDetail(DescribeUserDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下载快照
     * @param req DownloadSnapshotRequest
     * @return DownloadSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DownloadSnapshotResponse DownloadSnapshot(DownloadSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *锁定域名
     * @param req ModifyDomainLockRequest
     * @return ModifyDomainLockResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainLockResponse ModifyDomainLock(ModifyDomainLockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainLockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainLockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainLock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *域名过户
     * @param req ModifyDomainOwnerRequest
     * @return ModifyDomainOwnerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainOwnerResponse ModifyDomainOwner(ModifyDomainOwnerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainOwnerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainOwnerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainOwner");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置域名备注
     * @param req ModifyDomainRemarkRequest
     * @return ModifyDomainRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainRemarkResponse ModifyDomainRemark(ModifyDomainRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainRemarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改域名状态
     * @param req ModifyDomainStatusRequest
     * @return ModifyDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainStatusResponse ModifyDomainStatus(ModifyDomainStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *域名锁定解锁
     * @param req ModifyDomainUnlockRequest
     * @return ModifyDomainUnlockResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainUnlockResponse ModifyDomainUnlock(ModifyDomainUnlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainUnlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainUnlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainUnlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新动态 DNS 记录

     * @param req ModifyDynamicDNSRequest
     * @return ModifyDynamicDNSResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDynamicDNSResponse ModifyDynamicDNS(ModifyDynamicDNSRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDynamicDNSResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDynamicDNSResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDynamicDNS");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * DNS 解析套餐自动续费设置
     * @param req ModifyPackageAutoRenewRequest
     * @return ModifyPackageAutoRenewResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPackageAutoRenewResponse ModifyPackageAutoRenew(ModifyPackageAutoRenewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPackageAutoRenewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPackageAutoRenewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPackageAutoRenew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改记录
     * @param req ModifyRecordRequest
     * @return ModifyRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordResponse ModifyRecord(ModifyRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量修改记录
     * @param req ModifyRecordBatchRequest
     * @return ModifyRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordBatchResponse ModifyRecordBatch(ModifyRecordBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改记录可选字段
     * @param req ModifyRecordFieldsRequest
     * @return ModifyRecordFieldsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordFieldsResponse ModifyRecordFields(ModifyRecordFieldsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordFieldsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordFieldsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordFields");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改记录分组
     * @param req ModifyRecordGroupRequest
     * @return ModifyRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordGroupResponse ModifyRecordGroup(ModifyRecordGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置记录备注
     * @param req ModifyRecordRemarkRequest
     * @return ModifyRecordRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordRemarkResponse ModifyRecordRemark(ModifyRecordRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordRemarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改解析记录的状态
     * @param req ModifyRecordStatusRequest
     * @return ModifyRecordStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordStatusResponse ModifyRecordStatus(ModifyRecordStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将记录添加到分组
     * @param req ModifyRecordToGroupRequest
     * @return ModifyRecordToGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordToGroupResponse ModifyRecordToGroup(ModifyRecordToGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordToGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordToGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordToGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改快照配置
     * @param req ModifySnapshotConfigRequest
     * @return ModifySnapshotConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotConfigResponse ModifySnapshotConfig(ModifySnapshotConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshotConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停子域名的解析记录
     * @param req ModifySubdomainStatusRequest
     * @return ModifySubdomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubdomainStatusResponse ModifySubdomainStatus(ModifySubdomainStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubdomainStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubdomainStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubdomainStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增值服务自动续费设置
     * @param req ModifyVasAutoRenewStatusRequest
     * @return ModifyVasAutoRenewStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVasAutoRenewStatusResponse ModifyVasAutoRenewStatus(ModifyVasAutoRenewStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVasAutoRenewStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVasAutoRenewStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVasAutoRenewStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DNSPod商品余额支付
     * @param req PayOrderWithBalanceRequest
     * @return PayOrderWithBalanceResponse
     * @throws TencentCloudSDKException
     */
    public PayOrderWithBalanceResponse PayOrderWithBalance(PayOrderWithBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PayOrderWithBalanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PayOrderWithBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PayOrderWithBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新回滚指定解析记录快照
     * @param req RollbackRecordSnapshotRequest
     * @return RollbackRecordSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public RollbackRecordSnapshotResponse RollbackRecordSnapshot(RollbackRecordSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollbackRecordSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RollbackRecordSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollbackRecordSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *回滚快照
     * @param req RollbackSnapshotRequest
     * @return RollbackSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public RollbackSnapshotResponse RollbackSnapshot(RollbackSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollbackSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RollbackSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollbackSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
