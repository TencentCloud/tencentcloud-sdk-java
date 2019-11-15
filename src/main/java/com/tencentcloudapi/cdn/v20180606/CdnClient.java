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

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public CdnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public CdnClient(Credential credential, String region, ClientProfile profile) {
        super(CdnClient.endpoint, CdnClient.version, credential, region, profile);
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
     *GetDisableRecords 用户查询资源禁用历史，及 URL 当前状态。（接口尚在内测中，暂未全量开放使用）
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
     *ListTopData 通过入参 Metric 和 Filter 组合不同，可以查询以下排序数据：

+ 依据总流量、总请求数对访问 URL 排序，从大至小返回 TOP 1000 URL
+ 依据总流量、总请求数对客户端省份排序，从大至小返回省份列表
+ 依据总流量、总请求数对客户端运营商排序，从大至小返回运营商列表
+ 依据总流量、峰值带宽、总请求数、平均命中率、2XX/3XX/4XX/5XX 状态码对域名排序，从大至小返回域名列表
+ 依据总回源流量、回源峰值带宽、总回源请求数、平均回源失败率、2XX/3XX/4XX/5XX 回源状态码对域名排序，从大至小返回域名列表
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

}
