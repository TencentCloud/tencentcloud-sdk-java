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
package com.tencentcloudapi.cdn.v20180606;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdn.v20180606.models.*;

public class CdnClient extends AbstractClient{
    private static String endpoint = "cdn.tencentcloudapi.com";
    private static String version = "2018-06-06";

    public CdnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdnClient(Credential credential, String region, ClientProfile profile) {
        super(CdnClient.endpoint, CdnClient.version, credential, region, profile);
    }

    /**
     *AddCdnDomain 用于新增内容分发网络加速域名。
     * @param req AddCdnDomainRequest
     * @return AddCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddCdnDomainResponse AddCdnDomain(AddCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddCdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddCdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CreatClsLogTopic 用于创建日志主题。注意：一个日志集下至多可创建10个日志主题。
     * @param req CreateClsLogTopicRequest
     * @return CreateClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateClsLogTopicResponse CreateClsLogTopic(CreateClsLogTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClsLogTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClsLogTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateClsLogTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DeleteCdnDomain 用于删除指定加速域名
     * @param req DeleteCdnDomainRequest
     * @return DeleteCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCdnDomainResponse DeleteCdnDomain(DeleteCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DeleteClsLogTopic 用于删除日志主题。注意：删除后，所有该日志主题下绑定域名的日志将不再继续投递至该主题，已经投递的日志将会被全部清空。生效时间约为 5~15 分钟。
     * @param req DeleteClsLogTopicRequest
     * @return DeleteClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClsLogTopicResponse DeleteClsLogTopic(DeleteClsLogTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClsLogTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClsLogTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteClsLogTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeBillingData 用于查询实际计费数据明细。
     * @param req DescribeBillingDataRequest
     * @return DescribeBillingDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingDataResponse DescribeBillingData(DescribeBillingDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillingDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillingDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillingData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeCdnData 用于查询 CDN 实时访问监控数据，支持以下指标查询：

+ 流量（单位为 byte）
+ 带宽（单位为 bps）
+ 请求数（单位为 次）
+ 流量命中率（单位为 %，小数点后保留两位）
+ 状态码 2xx 汇总及各 2 开头状态码明细（单位为 个）
+ 状态码 3xx 汇总及各 3 开头状态码明细（单位为 个）
+ 状态码 4xx 汇总及各 4 开头状态码明细（单位为 个）
+ 状态码 5xx 汇总及各 5 开头状态码明细（单位为 个）
     * @param req DescribeCdnDataRequest
     * @return DescribeCdnDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnDataResponse DescribeCdnData(DescribeCdnDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCdnData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeCdnDomainLogs 用于查询访问日志下载地址，仅支持 30 天以内的境内、境外访问日志下载链接查询。
     * @param req DescribeCdnDomainLogsRequest
     * @return DescribeCdnDomainLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnDomainLogsResponse DescribeCdnDomainLogs(DescribeCdnDomainLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnDomainLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnDomainLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCdnDomainLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeCdnIp 用于查询 CDN IP 归属。
     * @param req DescribeCdnIpRequest
     * @return DescribeCdnIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnIpResponse DescribeCdnIp(DescribeCdnIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCdnIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *校验证书并提取SSL证书中包含的域名，返回CDN已接入的域名列表，及已配置证书的域名列表
     * @param req DescribeCertDomainsRequest
     * @return DescribeCertDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertDomainsResponse DescribeCertDomains(DescribeCertDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertDomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeDomains 用于查询内容分发网络加速域名（含境内、境外）基本配置信息，包括项目ID、服务状态，业务类型、创建时间、更新时间等信息。
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeDomainsConfig 用于查询内容分发网络加速域名（含境内、境外）的所有配置信息。
     * @param req DescribeDomainsConfigRequest
     * @return DescribeDomainsConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsConfigResponse DescribeDomainsConfig(DescribeDomainsConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainsConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDomainsConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名图片优化的当前配置，支持Webp、TPG、Guetzli 
     * @param req DescribeImageConfigRequest
     * @return DescribeImageConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageConfigResponse DescribeImageConfig(DescribeImageConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeIpStatus 用于查询域名所在加速平台的边缘节点、回源节点明细。注意事项：边缘节点（edge）尚未全量开放，未在内测名单中的账号不支持调用
     * @param req DescribeIpStatusRequest
     * @return DescribeIpStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpStatusResponse DescribeIpStatus(DescribeIpStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIpStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeIpVisit 用于查询 5 分钟活跃用户数，及日活跃用户数明细

+ 5 分钟活跃用户数：根据日志中客户端 IP，5 分钟粒度去重统计
+ 日活跃用户数：根据日志中客户端 IP，按天粒度去重统计
     * @param req DescribeIpVisitRequest
     * @return DescribeIpVisitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpVisitResponse DescribeIpVisit(DescribeIpVisitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpVisitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpVisitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIpVisit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeMapInfo 用于查询省份对应的 ID，运营商对应的 ID 信息。
     * @param req DescribeMapInfoRequest
     * @return DescribeMapInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMapInfoResponse DescribeMapInfo(DescribeMapInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMapInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMapInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMapInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeOriginData 用于查询 CDN 实时回源监控数据，支持以下指标查询：

+ 回源流量（单位为 byte）
+ 回源带宽（单位为 bps）
+ 回源请求数（单位为 次）
+ 回源失败请求数（单位为 次）
+ 回源失败率（单位为 %，小数点后保留两位）
+ 回源状态码 2xx 汇总及各 2 开头回源状态码明细（单位为 个）
+ 回源状态码 3xx 汇总及各 3 开头回源状态码明细（单位为 个）
+ 回源状态码 4xx 汇总及各 4 开头回源状态码明细（单位为 个）
+ 回源状态码 5xx 汇总及各 5 开头回源状态码明细（单位为 个）
     * @param req DescribeOriginDataRequest
     * @return DescribeOriginDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginDataResponse DescribeOriginData(DescribeOriginDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOriginDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOriginDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOriginData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribePayType 用于查询用户的计费类型，计费周期等信息。
     * @param req DescribePayTypeRequest
     * @return DescribePayTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribePayTypeResponse DescribePayType(DescribePayTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePayTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePayTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePayType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribePurgeQuota 用于查询账户刷新配额和每日可用量。
     * @param req DescribePurgeQuotaRequest
     * @return DescribePurgeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeQuotaResponse DescribePurgeQuota(DescribePurgeQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurgeQuotaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePurgeQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribePurgeTasks 用于查询提交的 URL 刷新、目录刷新记录及执行进度，通过 PurgePathCache 与 PurgeUrlsCache 接口提交的任务均可通过此接口进行查询。
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurgeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePurgeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribePushQuota  用于查询预热配额和每日可用量。
     * @param req DescribePushQuotaRequest
     * @return DescribePushQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushQuotaResponse DescribePushQuota(DescribePushQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePushQuotaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePushQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePushQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribePushTasks  用于查询预热任务提交历史记录及执行进度。
接口灰度中，暂未全量开放，敬请期待。
     * @param req DescribePushTasksRequest
     * @return DescribePushTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushTasksResponse DescribePushTasks(DescribePushTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePushTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePushTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePushTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeReportData 用于查询域名/项目维度的日/周/月报表数据。
     * @param req DescribeReportDataRequest
     * @return DescribeReportDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportDataResponse DescribeReportData(DescribeReportDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReportDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReportDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeReportData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeTrafficPackages 用于查询境内 CDN 流量包详情。
     * @param req DescribeTrafficPackagesRequest
     * @return DescribeTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficPackagesResponse DescribeTrafficPackages(DescribeTrafficPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrafficPackagesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrafficPackagesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTrafficPackages"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeUrlViolations 用于查询被 CDN 系统扫描到的域名违规 URL 列表及当前状态。
对应内容分发网络控制台【图片鉴黄】页面。
     * @param req DescribeUrlViolationsRequest
     * @return DescribeUrlViolationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUrlViolationsResponse DescribeUrlViolations(DescribeUrlViolationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUrlViolationsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUrlViolationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUrlViolations"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DisableCaches 用于禁用 CDN 上指定 URL 的访问，禁用完成后，全网访问会直接返回 403。（接口尚在内测中，暂未全量开放使用）
     * @param req DisableCachesRequest
     * @return DisableCachesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCachesResponse DisableCaches(DisableCachesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableCachesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableCachesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableCaches"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DisableClsLogTopic 用于停止日志主题投递。注意：停止后，所有绑定该日志主题域名的日志将不再继续投递至该主题，已经投递的日志将会继续保留。生效时间约为 5~15 分钟。

     * @param req DisableClsLogTopicRequest
     * @return DisableClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public DisableClsLogTopicResponse DisableClsLogTopic(DisableClsLogTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableClsLogTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableClsLogTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableClsLogTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *EnableCaches 用于解禁手工封禁的 URL，解禁成功后，全网生效时间约 5~10 分钟。（接口尚在内测中，暂未全量开放使用）
     * @param req EnableCachesRequest
     * @return EnableCachesResponse
     * @throws TencentCloudSDKException
     */
    public EnableCachesResponse EnableCaches(EnableCachesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableCachesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableCachesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableCaches"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *EnableClsLogTopic 用于启动日志主题投递。注意：启动后，所有绑定该日志主题域名的日志将继续投递至该主题。生效时间约为 5~15 分钟。
     * @param req EnableClsLogTopicRequest
     * @return EnableClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public EnableClsLogTopicResponse EnableClsLogTopic(EnableClsLogTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableClsLogTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableClsLogTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableClsLogTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *GetDisableRecords 用于查询资源禁用历史，及 URL 当前状态。（接口尚在内测中，暂未全量开放使用）
     * @param req GetDisableRecordsRequest
     * @return GetDisableRecordsResponse
     * @throws TencentCloudSDKException
     */
    public GetDisableRecordsResponse GetDisableRecords(GetDisableRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDisableRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDisableRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDisableRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ListClsLogTopics 用于显示日志主题列表。注意：一个日志集下至多含10个日志主题。
     * @param req ListClsLogTopicsRequest
     * @return ListClsLogTopicsResponse
     * @throws TencentCloudSDKException
     */
    public ListClsLogTopicsResponse ListClsLogTopics(ListClsLogTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListClsLogTopicsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListClsLogTopicsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListClsLogTopics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ListClsTopicDomains 用于获取某日志主题下绑定的域名列表。
     * @param req ListClsTopicDomainsRequest
     * @return ListClsTopicDomainsResponse
     * @throws TencentCloudSDKException
     */
    public ListClsTopicDomainsResponse ListClsTopicDomains(ListClsTopicDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListClsTopicDomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListClsTopicDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListClsTopicDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ListTopData 通过入参 Metric 和 Filter 组合不同，可以查询以下排序数据：

+ 依据总流量、总请求数对访问 URL 排序，从大至小返回 TOP 1000 URL
+ 依据总流量、总请求数对客户端省份排序，从大至小返回省份列表
+ 依据总流量、总请求数对客户端运营商排序，从大至小返回运营商列表
+ 依据总流量、峰值带宽、总请求数、平均命中率、2XX/3XX/4XX/5XX 状态码对域名排序，从大至小返回域名列表
+ 依据总回源流量、回源峰值带宽、总回源请求数、平均回源失败率、2XX/3XX/4XX/5XX 回源状态码对域名排序，从大至小返回域名列表

注意：仅支持 90 天内数据查询
     * @param req ListTopDataRequest
     * @return ListTopDataResponse
     * @throws TencentCloudSDKException
     */
    public ListTopDataResponse ListTopData(ListTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTopDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListTopData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ManageClsTopicDomains 用于管理某日志主题下绑定的域名列表。
     * @param req ManageClsTopicDomainsRequest
     * @return ManageClsTopicDomainsResponse
     * @throws TencentCloudSDKException
     */
    public ManageClsTopicDomainsResponse ManageClsTopicDomains(ManageClsTopicDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManageClsTopicDomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ManageClsTopicDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ManageClsTopicDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *PurgePathCache 用于批量提交目录刷新，根据域名的加速区域进行对应区域的刷新。
默认情况下境内、境外加速区域每日目录刷新额度为各 100 条，每次最多可提交 20 条。
     * @param req PurgePathCacheRequest
     * @return PurgePathCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgePathCacheResponse PurgePathCache(PurgePathCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PurgePathCacheResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PurgePathCacheResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PurgePathCache"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *PurgeUrlsCache 用于批量提交 URL 进行刷新，根据 URL 中域名的当前加速区域进行对应区域的刷新。
默认情况下境内、境外加速区域每日 URL 刷新额度各为 10000 条，每次最多可提交 1000 条。
     * @param req PurgeUrlsCacheRequest
     * @return PurgeUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgeUrlsCacheResponse PurgeUrlsCache(PurgeUrlsCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PurgeUrlsCacheResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PurgeUrlsCacheResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PurgeUrlsCache"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *PushUrlsCache 用于将指定 URL 资源列表加载至 CDN 节点，支持指定加速区域预热。
默认情况下境内、境外每日预热 URL 限额为各 1000 条，每次最多可提交 20 条。
接口灰度中，暂未全量开放，敬请期待。
     * @param req PushUrlsCacheRequest
     * @return PushUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PushUrlsCacheResponse PushUrlsCache(PushUrlsCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PushUrlsCacheResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PushUrlsCacheResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PushUrlsCache"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *SearchClsLog 用于 CLS 日志检索。支持检索今天，24小时（可选近7中的某一天），近7天的日志数据。
     * @param req SearchClsLogRequest
     * @return SearchClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchClsLogResponse SearchClsLog(SearchClsLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchClsLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchClsLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchClsLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *StartCdnDomain 用于启用已停用域名的加速服务
     * @param req StartCdnDomainRequest
     * @return StartCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartCdnDomainResponse StartCdnDomain(StartCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartCdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartCdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartCdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *StopCdnDomain 用于停止域名的加速服务。
注意：停止加速服务后，访问至加速节点的请求将会直接返回 404。为避免对您的业务造成影响，请在停止加速服务前将解析切走。
     * @param req StopCdnDomainRequest
     * @return StopCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StopCdnDomainResponse StopCdnDomain(StopCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopCdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopCdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopCdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *UpdateDomainConfig 用于修改内容分发网络加速域名配置信息
注意：如果需要更新复杂类型的配置项，必须传递整个对象的所有属性，未传递的属性将使用默认值，建议通过查询接口获取配置属性后，直接修改后传递给本接口。Https配置由于证书的特殊性，更新时不用传递证书和密钥字段。
     * @param req UpdateDomainConfigRequest
     * @return UpdateDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDomainConfigResponse UpdateDomainConfig(UpdateDomainConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDomainConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDomainConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateDomainConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新控制台图片优化的相关配置，支持Webp、TPG、Guetzli 
     * @param req UpdateImageConfigRequest
     * @return UpdateImageConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateImageConfigResponse UpdateImageConfig(UpdateImageConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateImageConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateImageConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateImageConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(UpdatePayType)用于修改账号计费类型，暂不支持月结用户或子账号修改。
     * @param req UpdatePayTypeRequest
     * @return UpdatePayTypeResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePayTypeResponse UpdatePayType(UpdatePayTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePayTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePayTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdatePayType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
