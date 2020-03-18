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
package com.tencentcloudapi.ecdn.v20191012;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ecdn.v20191012.models.*;

public class EcdnClient extends AbstractClient{
    private static String endpoint = "ecdn.tencentcloudapi.com";
    private static String version = "2019-10-12";

    public EcdnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EcdnClient(Credential credential, String region, ClientProfile profile) {
        super(EcdnClient.endpoint, EcdnClient.version, credential, region, profile);
    }

    /**
     *本接口（AddEcdnDomain）用于创建加速域名。
     * @param req AddEcdnDomainRequest
     * @return AddEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddEcdnDomainResponse AddEcdnDomain(AddEcdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEcdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddEcdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddEcdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteEcdnDomain）用于删除指定加速域名。待删除域名必须处于已停用状态。
     * @param req DeleteEcdnDomainRequest
     * @return DeleteEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEcdnDomainResponse DeleteEcdnDomain(DeleteEcdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEcdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEcdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteEcdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDomains）用于查询CDN域名基本信息，包括项目id，状态，业务类型，创建时间，更新时间等。
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
     *本接口（DescribeDomainsConfig）用于查询CDN加速域名详细配置信息。
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
     *本接口（DescribeEcdnDomainLogs）用于查询域名的访问日志下载地址。
     * @param req DescribeEcdnDomainLogsRequest
     * @return DescribeEcdnDomainLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnDomainLogsResponse DescribeEcdnDomainLogs(DescribeEcdnDomainLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEcdnDomainLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEcdnDomainLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEcdnDomainLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeEcdnDomainStatistics）用于查询指定时间段内的域名访问统计指标
     * @param req DescribeEcdnDomainStatisticsRequest
     * @return DescribeEcdnDomainStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnDomainStatisticsResponse DescribeEcdnDomainStatistics(DescribeEcdnDomainStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEcdnDomainStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEcdnDomainStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEcdnDomainStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeEcdnStatistics用于查询 ECDN 实时访问监控数据，支持以下指标查询：

+ 流量（单位为 byte）
+ 带宽（单位为 bps）
+ 请求数（单位为 次）
+ 响应时间（单位为ms）
+ 状态码 2xx 汇总及各 2 开头状态码明细（单位为 个）
+ 状态码 3xx 汇总及各 3 开头状态码明细（单位为 个）
+ 状态码 4xx 汇总及各 4 开头状态码明细（单位为 个）
+ 状态码 5xx 汇总及各 5 开头状态码明细（单位为 个）
     * @param req DescribeEcdnStatisticsRequest
     * @return DescribeEcdnStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnStatisticsResponse DescribeEcdnStatistics(DescribeEcdnStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEcdnStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEcdnStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEcdnStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询刷新接口的用量配额。
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
     *DescribePurgeTasks 用于查询刷新任务提交历史记录及执行进度。
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
     *PurgeUrlsCache 用于批量刷新目录缓存，一次提交将返回一个刷新任务id。
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
     *PurgeUrlsCache 用于批量刷新Url，一次提交将返回一个刷新任务id。
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
     *本接口（StartEcdnDomain）用于启用加速域名，待启用域名必须处于已下线状态。
     * @param req StartEcdnDomainRequest
     * @return StartEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartEcdnDomainResponse StartEcdnDomain(StartEcdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartEcdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartEcdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartEcdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopCdnDomain）用于停止加速域名，待停用加速域名必须处于已上线或部署中状态。
     * @param req StopEcdnDomainRequest
     * @return StopEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StopEcdnDomainResponse StopEcdnDomain(StopEcdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopEcdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopEcdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopEcdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateDomainConfig）用于更新ECDN加速域名配置信息。
注意：如果需要更新复杂类型的配置项，必须传递整个对象的所有属性，未传递的属性将使用默认值。建议通过查询接口获取配置属性后，直接修改后传递给本接口。Https配置由于证书的特殊性，更新时不用传递证书和密钥字段。
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

}
