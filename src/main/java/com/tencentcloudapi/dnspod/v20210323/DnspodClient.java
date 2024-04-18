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
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckRecordSnapshotRollback", CheckRecordSnapshotRollbackResponse.class);
    }

    /**
     *快照回滚前检查
     * @param req CheckSnapshotRollbackRequest
     * @return CheckSnapshotRollbackResponse
     * @throws TencentCloudSDKException
     */
    public CheckSnapshotRollbackResponse CheckSnapshotRollback(CheckSnapshotRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckSnapshotRollback", CheckSnapshotRollbackResponse.class);
    }

    /**
     *DNSPod商品下单
     * @param req CreateDealRequest
     * @return CreateDealResponse
     * @throws TencentCloudSDKException
     */
    public CreateDealResponse CreateDeal(CreateDealRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeal", CreateDealResponse.class);
    }

    /**
     *添加域名
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomain", CreateDomainResponse.class);
    }

    /**
     *创建域名别名
     * @param req CreateDomainAliasRequest
     * @return CreateDomainAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAliasResponse CreateDomainAlias(CreateDomainAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainAlias", CreateDomainAliasResponse.class);
    }

    /**
     *批量添加域名
     * @param req CreateDomainBatchRequest
     * @return CreateDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainBatchResponse CreateDomainBatch(CreateDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainBatch", CreateDomainBatchResponse.class);
    }

    /**
     *创建域名的自定义线路
     * @param req CreateDomainCustomLineRequest
     * @return CreateDomainCustomLineResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainCustomLineResponse CreateDomainCustomLine(CreateDomainCustomLineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainCustomLine", CreateDomainCustomLineResponse.class);
    }

    /**
     *创建域名分组
     * @param req CreateDomainGroupRequest
     * @return CreateDomainGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainGroupResponse CreateDomainGroup(CreateDomainGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainGroup", CreateDomainGroupResponse.class);
    }

    /**
     *添加记录
备注：新添加的解析记录存在短暂的索引延迟，如果查询不到新增记录，请在 30 秒后重试
     * @param req CreateRecordRequest
     * @return CreateRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordResponse CreateRecord(CreateRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecord", CreateRecordResponse.class);
    }

    /**
     *批量添加记录
     * @param req CreateRecordBatchRequest
     * @return CreateRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordBatchResponse CreateRecordBatch(CreateRecordBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordBatch", CreateRecordBatchResponse.class);
    }

    /**
     *添加记录分组
     * @param req CreateRecordGroupRequest
     * @return CreateRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordGroupResponse CreateRecordGroup(CreateRecordGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordGroup", CreateRecordGroupResponse.class);
    }

    /**
     *创建快照
     * @param req CreateSnapshotRequest
     * @return CreateSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotResponse CreateSnapshot(CreateSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSnapshot", CreateSnapshotResponse.class);
    }

    /**
     *删除域名
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomain", DeleteDomainResponse.class);
    }

    /**
     *删除域名别名
     * @param req DeleteDomainAliasRequest
     * @return DeleteDomainAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAliasResponse DeleteDomainAlias(DeleteDomainAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainAlias", DeleteDomainAliasResponse.class);
    }

    /**
     *批量删除域名
     * @param req DeleteDomainBatchRequest
     * @return DeleteDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainBatchResponse DeleteDomainBatch(DeleteDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainBatch", DeleteDomainBatchResponse.class);
    }

    /**
     *删除域名的自定义线路
     * @param req DeleteDomainCustomLineRequest
     * @return DeleteDomainCustomLineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainCustomLineResponse DeleteDomainCustomLine(DeleteDomainCustomLineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainCustomLine", DeleteDomainCustomLineResponse.class);
    }

    /**
     *删除记录
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecord", DeleteRecordResponse.class);
    }

    /**
     *批量删除解析记录
     * @param req DeleteRecordBatchRequest
     * @return DeleteRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordBatchResponse DeleteRecordBatch(DeleteRecordBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordBatch", DeleteRecordBatchResponse.class);
    }

    /**
     *删除记录分组
     * @param req DeleteRecordGroupRequest
     * @return DeleteRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordGroupResponse DeleteRecordGroup(DeleteRecordGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordGroup", DeleteRecordGroupResponse.class);
    }

    /**
     *按账号删除域名共享
     * @param req DeleteShareDomainRequest
     * @return DeleteShareDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareDomainResponse DeleteShareDomain(DeleteShareDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShareDomain", DeleteShareDomainResponse.class);
    }

    /**
     *删除快照
     * @param req DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotResponse DeleteSnapshot(DeleteSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshot", DeleteSnapshotResponse.class);
    }

    /**
     *获取任务详情
     * @param req DescribeBatchTaskRequest
     * @return DescribeBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTaskResponse DescribeBatchTask(DescribeBatchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchTask", DescribeBatchTaskResponse.class);
    }

    /**
     *获取域名信息
     * @param req DescribeDomainRequest
     * @return DescribeDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainResponse DescribeDomain(DescribeDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomain", DescribeDomainResponse.class);
    }

    /**
     *获取域名别名列表
     * @param req DescribeDomainAliasListRequest
     * @return DescribeDomainAliasListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAliasListResponse DescribeDomainAliasList(DescribeDomainAliasListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainAliasList", DescribeDomainAliasListResponse.class);
    }

    /**
     *统计各个域名的解析量，帮助您了解流量情况、时间段分布。支持查看近 3 个月内的统计情况
     * @param req DescribeDomainAnalyticsRequest
     * @return DescribeDomainAnalyticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAnalyticsResponse DescribeDomainAnalytics(DescribeDomainAnalyticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainAnalytics", DescribeDomainAnalyticsResponse.class);
    }

    /**
     *获取域名的自定义线路列表
     * @param req DescribeDomainCustomLineListRequest
     * @return DescribeDomainCustomLineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainCustomLineListResponse DescribeDomainCustomLineList(DescribeDomainCustomLineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainCustomLineList", DescribeDomainCustomLineListResponse.class);
    }

    /**
     *获取域名筛选列表
备注：新添加的解析记录存在短暂的索引延迟，如果查询不到新增记录，请在 30 秒后重试
     * @param req DescribeDomainFilterListRequest
     * @return DescribeDomainFilterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainFilterListResponse DescribeDomainFilterList(DescribeDomainFilterListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainFilterList", DescribeDomainFilterListResponse.class);
    }

    /**
     *获取域名分组列表
     * @param req DescribeDomainGroupListRequest
     * @return DescribeDomainGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainGroupListResponse DescribeDomainGroupList(DescribeDomainGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainGroupList", DescribeDomainGroupListResponse.class);
    }

    /**
     *获取域名列表
     * @param req DescribeDomainListRequest
     * @return DescribeDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainListResponse DescribeDomainList(DescribeDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainList", DescribeDomainListResponse.class);
    }

    /**
     *获取域名日志
     * @param req DescribeDomainLogListRequest
     * @return DescribeDomainLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainLogListResponse DescribeDomainLogList(DescribeDomainLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainLogList", DescribeDomainLogListResponse.class);
    }

    /**
     *获取域名概览信息
     * @param req DescribeDomainPreviewRequest
     * @return DescribeDomainPreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainPreviewResponse DescribeDomainPreview(DescribeDomainPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainPreview", DescribeDomainPreviewResponse.class);
    }

    /**
     *获取域名权限
     * @param req DescribeDomainPurviewRequest
     * @return DescribeDomainPurviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainPurviewResponse DescribeDomainPurview(DescribeDomainPurviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainPurview", DescribeDomainPurviewResponse.class);
    }

    /**
     *获取域名共享信息
     * @param req DescribeDomainShareInfoRequest
     * @return DescribeDomainShareInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainShareInfoResponse DescribeDomainShareInfo(DescribeDomainShareInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainShareInfo", DescribeDomainShareInfoResponse.class);
    }

    /**
     *获取域名Whois信息
     * @param req DescribeDomainWhoisRequest
     * @return DescribeDomainWhoisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainWhoisResponse DescribeDomainWhois(DescribeDomainWhoisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainWhois", DescribeDomainWhoisResponse.class);
    }

    /**
     *获取各套餐配置详情
     * @param req DescribePackageDetailRequest
     * @return DescribePackageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackageDetailResponse DescribePackageDetail(DescribePackageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePackageDetail", DescribePackageDetailResponse.class);
    }

    /**
     *获取记录信息
     * @param req DescribeRecordRequest
     * @return DescribeRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordResponse DescribeRecord(DescribeRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecord", DescribeRecordResponse.class);
    }

    /**
     *判断是否有除系统默认的@-NS记录之外的记录存在
     * @param req DescribeRecordExistExceptDefaultNSRequest
     * @return DescribeRecordExistExceptDefaultNSResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordExistExceptDefaultNSResponse DescribeRecordExistExceptDefaultNS(DescribeRecordExistExceptDefaultNSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordExistExceptDefaultNS", DescribeRecordExistExceptDefaultNSResponse.class);
    }

    /**
     *获取某个域名下的解析记录列表
备注：
1. 新添加的解析记录存在短暂的索引延迟，如果查询不到新增记录，请在 30 秒后重试
2.  API获取的记录总条数会比控制台多2条，原因是： 为了防止用户误操作导致解析服务不可用，对2021-10-29 14:24:26之后添加的域名，在控制台都不显示这2条NS记录。
     * @param req DescribeRecordFilterListRequest
     * @return DescribeRecordFilterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordFilterListResponse DescribeRecordFilterList(DescribeRecordFilterListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordFilterList", DescribeRecordFilterListResponse.class);
    }

    /**
     *查询解析记录分组列表
     * @param req DescribeRecordGroupListRequest
     * @return DescribeRecordGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordGroupListResponse DescribeRecordGroupList(DescribeRecordGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordGroupList", DescribeRecordGroupListResponse.class);
    }

    /**
     *按分类返回线路列表
     * @param req DescribeRecordLineCategoryListRequest
     * @return DescribeRecordLineCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordLineCategoryListResponse DescribeRecordLineCategoryList(DescribeRecordLineCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordLineCategoryList", DescribeRecordLineCategoryListResponse.class);
    }

    /**
     *获取等级允许的线路
     * @param req DescribeRecordLineListRequest
     * @return DescribeRecordLineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordLineListResponse DescribeRecordLineList(DescribeRecordLineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordLineList", DescribeRecordLineListResponse.class);
    }

    /**
     *获取某个域名下的解析记录列表
备注：
1. 新添加的解析记录存在短暂的索引延迟，如果查询不到新增记录，请在 30 秒后重试
2.  API获取的记录总条数会比控制台多2条，原因是： 为了防止用户误操作导致解析服务不可用，对2021-10-29 14:24:26之后添加的域名，在控制台都不显示这2条NS记录。
     * @param req DescribeRecordListRequest
     * @return DescribeRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordListResponse DescribeRecordList(DescribeRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordList", DescribeRecordListResponse.class);
    }

    /**
     *查询解析记录重新回滚的结果
     * @param req DescribeRecordSnapshotRollbackResultRequest
     * @return DescribeRecordSnapshotRollbackResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordSnapshotRollbackResultResponse DescribeRecordSnapshotRollbackResult(DescribeRecordSnapshotRollbackResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordSnapshotRollbackResult", DescribeRecordSnapshotRollbackResultResponse.class);
    }

    /**
     *获取等级允许的记录类型
     * @param req DescribeRecordTypeRequest
     * @return DescribeRecordTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTypeResponse DescribeRecordType(DescribeRecordTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordType", DescribeRecordTypeResponse.class);
    }

    /**
     *查询解析快照配置
     * @param req DescribeSnapshotConfigRequest
     * @return DescribeSnapshotConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotConfigResponse DescribeSnapshotConfig(DescribeSnapshotConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotConfig", DescribeSnapshotConfigResponse.class);
    }

    /**
     *查询快照列表
     * @param req DescribeSnapshotListRequest
     * @return DescribeSnapshotListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotListResponse DescribeSnapshotList(DescribeSnapshotListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotList", DescribeSnapshotListResponse.class);
    }

    /**
     *查询快照回滚结果
     * @param req DescribeSnapshotRollbackResultRequest
     * @return DescribeSnapshotRollbackResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotRollbackResultResponse DescribeSnapshotRollbackResult(DescribeSnapshotRollbackResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotRollbackResult", DescribeSnapshotRollbackResultResponse.class);
    }

    /**
     *查询最近一次回滚
     * @param req DescribeSnapshotRollbackTaskRequest
     * @return DescribeSnapshotRollbackTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotRollbackTaskResponse DescribeSnapshotRollbackTask(DescribeSnapshotRollbackTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotRollbackTask", DescribeSnapshotRollbackTaskResponse.class);
    }

    /**
     *统计子域名的解析量，帮助您了解流量情况、时间段分布。支持查看近 3 个月内的统计情况。仅付费套餐域名可用。
     * @param req DescribeSubdomainAnalyticsRequest
     * @return DescribeSubdomainAnalyticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubdomainAnalyticsResponse DescribeSubdomainAnalytics(DescribeSubdomainAnalyticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubdomainAnalytics", DescribeSubdomainAnalyticsResponse.class);
    }

    /**
     *获取账户信息
     * @param req DescribeUserDetailRequest
     * @return DescribeUserDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDetailResponse DescribeUserDetail(DescribeUserDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDetail", DescribeUserDetailResponse.class);
    }

    /**
     *获取域名增值服务用量
     * @param req DescribeVASStatisticRequest
     * @return DescribeVASStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVASStatisticResponse DescribeVASStatistic(DescribeVASStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVASStatistic", DescribeVASStatisticResponse.class);
    }

    /**
     *下载快照
     * @param req DownloadSnapshotRequest
     * @return DownloadSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DownloadSnapshotResponse DownloadSnapshot(DownloadSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadSnapshot", DownloadSnapshotResponse.class);
    }

    /**
     *修改域名的自定义线路
     * @param req ModifyDomainCustomLineRequest
     * @return ModifyDomainCustomLineResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainCustomLineResponse ModifyDomainCustomLine(ModifyDomainCustomLineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainCustomLine", ModifyDomainCustomLineResponse.class);
    }

    /**
     *锁定域名
     * @param req ModifyDomainLockRequest
     * @return ModifyDomainLockResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainLockResponse ModifyDomainLock(ModifyDomainLockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainLock", ModifyDomainLockResponse.class);
    }

    /**
     *域名过户
     * @param req ModifyDomainOwnerRequest
     * @return ModifyDomainOwnerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainOwnerResponse ModifyDomainOwner(ModifyDomainOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainOwner", ModifyDomainOwnerResponse.class);
    }

    /**
     *设置域名备注
     * @param req ModifyDomainRemarkRequest
     * @return ModifyDomainRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainRemarkResponse ModifyDomainRemark(ModifyDomainRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainRemark", ModifyDomainRemarkResponse.class);
    }

    /**
     *修改域名状态
     * @param req ModifyDomainStatusRequest
     * @return ModifyDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainStatusResponse ModifyDomainStatus(ModifyDomainStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainStatus", ModifyDomainStatusResponse.class);
    }

    /**
     *域名锁定解锁
     * @param req ModifyDomainUnlockRequest
     * @return ModifyDomainUnlockResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainUnlockResponse ModifyDomainUnlock(ModifyDomainUnlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainUnlock", ModifyDomainUnlockResponse.class);
    }

    /**
     *更新动态 DNS 记录
     * @param req ModifyDynamicDNSRequest
     * @return ModifyDynamicDNSResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDynamicDNSResponse ModifyDynamicDNS(ModifyDynamicDNSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDynamicDNS", ModifyDynamicDNSResponse.class);
    }

    /**
     *DNS 解析套餐自动续费设置
     * @param req ModifyPackageAutoRenewRequest
     * @return ModifyPackageAutoRenewResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPackageAutoRenewResponse ModifyPackageAutoRenew(ModifyPackageAutoRenewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPackageAutoRenew", ModifyPackageAutoRenewResponse.class);
    }

    /**
     *修改记录
     * @param req ModifyRecordRequest
     * @return ModifyRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordResponse ModifyRecord(ModifyRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecord", ModifyRecordResponse.class);
    }

    /**
     *批量修改记录
     * @param req ModifyRecordBatchRequest
     * @return ModifyRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordBatchResponse ModifyRecordBatch(ModifyRecordBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordBatch", ModifyRecordBatchResponse.class);
    }

    /**
     *修改记录可选字段
     * @param req ModifyRecordFieldsRequest
     * @return ModifyRecordFieldsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordFieldsResponse ModifyRecordFields(ModifyRecordFieldsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordFields", ModifyRecordFieldsResponse.class);
    }

    /**
     *修改记录分组
     * @param req ModifyRecordGroupRequest
     * @return ModifyRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordGroupResponse ModifyRecordGroup(ModifyRecordGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordGroup", ModifyRecordGroupResponse.class);
    }

    /**
     *设置记录备注
     * @param req ModifyRecordRemarkRequest
     * @return ModifyRecordRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordRemarkResponse ModifyRecordRemark(ModifyRecordRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordRemark", ModifyRecordRemarkResponse.class);
    }

    /**
     *修改解析记录的状态
     * @param req ModifyRecordStatusRequest
     * @return ModifyRecordStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordStatusResponse ModifyRecordStatus(ModifyRecordStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordStatus", ModifyRecordStatusResponse.class);
    }

    /**
     *将记录添加到分组
     * @param req ModifyRecordToGroupRequest
     * @return ModifyRecordToGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordToGroupResponse ModifyRecordToGroup(ModifyRecordToGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordToGroup", ModifyRecordToGroupResponse.class);
    }

    /**
     *修改快照配置
     * @param req ModifySnapshotConfigRequest
     * @return ModifySnapshotConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotConfigResponse ModifySnapshotConfig(ModifySnapshotConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshotConfig", ModifySnapshotConfigResponse.class);
    }

    /**
     *暂停子域名的解析记录
     * @param req ModifySubdomainStatusRequest
     * @return ModifySubdomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubdomainStatusResponse ModifySubdomainStatus(ModifySubdomainStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubdomainStatus", ModifySubdomainStatusResponse.class);
    }

    /**
     *增值服务自动续费设置
     * @param req ModifyVasAutoRenewStatusRequest
     * @return ModifyVasAutoRenewStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVasAutoRenewStatusResponse ModifyVasAutoRenewStatus(ModifyVasAutoRenewStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVasAutoRenewStatus", ModifyVasAutoRenewStatusResponse.class);
    }

    /**
     *DNSPod商品余额支付
     * @param req PayOrderWithBalanceRequest
     * @return PayOrderWithBalanceResponse
     * @throws TencentCloudSDKException
     */
    public PayOrderWithBalanceResponse PayOrderWithBalance(PayOrderWithBalanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PayOrderWithBalance", PayOrderWithBalanceResponse.class);
    }

    /**
     *重新回滚指定解析记录快照
     * @param req RollbackRecordSnapshotRequest
     * @return RollbackRecordSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public RollbackRecordSnapshotResponse RollbackRecordSnapshot(RollbackRecordSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackRecordSnapshot", RollbackRecordSnapshotResponse.class);
    }

    /**
     *回滚快照
     * @param req RollbackSnapshotRequest
     * @return RollbackSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public RollbackSnapshotResponse RollbackSnapshot(RollbackSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackSnapshot", RollbackSnapshotResponse.class);
    }

}
