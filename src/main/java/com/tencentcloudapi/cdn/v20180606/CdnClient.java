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
    private static String service = "cdn";
    private static String version = "2018-06-06";

    public CdnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdnClient(Credential credential, String region, ClientProfile profile) {
        super(CdnClient.endpoint, CdnClient.version, credential, region, profile);
    }

    /**
     *AddCLSTopicDomains 用于新增域名到某日志主题下
     * @param req AddCLSTopicDomainsRequest
     * @return AddCLSTopicDomainsResponse
     * @throws TencentCloudSDKException
     */
    public AddCLSTopicDomainsResponse AddCLSTopicDomains(AddCLSTopicDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCLSTopicDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddCLSTopicDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCLSTopicDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *AddCdnDomain 用于新增内容分发网络加速域名。1分钟内最多可新增100个域名。
     * @param req AddCdnDomainRequest
     * @return AddCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddCdnDomainResponse AddCdnDomain(AddCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddCdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CreateClsLogTopic 用于创建日志主题。注意：一个日志集下至多可创建10个日志主题。
     * @param req CreateClsLogTopicRequest
     * @return CreateClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateClsLogTopicResponse CreateClsLogTopic(CreateClsLogTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClsLogTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClsLogTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClsLogTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CreateDiagnoseUrl 用于添加域名诊断任务URL
     * @param req CreateDiagnoseUrlRequest
     * @return CreateDiagnoseUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateDiagnoseUrlResponse CreateDiagnoseUrl(CreateDiagnoseUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDiagnoseUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDiagnoseUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDiagnoseUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *动态打包任务提交接口
     * @param req CreateEdgePackTaskRequest
     * @return CreateEdgePackTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgePackTaskResponse CreateEdgePackTask(CreateEdgePackTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgePackTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgePackTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgePackTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CreateScdnDomain 用于创建 SCDN 加速域名
     * @param req CreateScdnDomainRequest
     * @return CreateScdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateScdnDomainResponse CreateScdnDomain(CreateScdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CreateScdnFailedLogTask 用于重试创建失败的事件日志任务
     * @param req CreateScdnFailedLogTaskRequest
     * @return CreateScdnFailedLogTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateScdnFailedLogTaskResponse CreateScdnFailedLogTask(CreateScdnFailedLogTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScdnFailedLogTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScdnFailedLogTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScdnFailedLogTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CreateScdnLogTask 用于创建事件日志任务
     * @param req CreateScdnLogTaskRequest
     * @return CreateScdnLogTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateScdnLogTaskResponse CreateScdnLogTask(CreateScdnLogTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScdnLogTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScdnLogTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScdnLogTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成一条子域名解析，提示客户添加到域名解析上，用于泛域名及域名取回校验归属权
     * @param req CreateVerifyRecordRequest
     * @return CreateVerifyRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateVerifyRecordResponse CreateVerifyRecord(CreateVerifyRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVerifyRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVerifyRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVerifyRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClsLogTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClsLogTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除SCDN域名
     * @param req DeleteScdnDomainRequest
     * @return DeleteScdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScdnDomainResponse DeleteScdnDomain(DeleteScdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillingDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillingData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CC统计数据查询
     * @param req DescribeCcDataRequest
     * @return DescribeCcDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcDataResponse DescribeCcData(DescribeCcDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeCdnData 用于查询 CDN 实时访问监控数据，支持以下指标查询：

+ 流量（单位为 byte）
+ 带宽（单位为 bps）
+ 请求数（单位为 次）
+ 命中请求数（单位为 次）
+ 请求命中率（单位为 %）
+ 命中流量（单位为 byte）
+ 流量命中率（单位为 %）
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCdnData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnDomainLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCdnDomainLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeCdnIp 用于查询 CDN IP 归属。
（注意：此接口请求频率限制以 CDN 侧限制为准：200次/10分钟）  
     * @param req DescribeCdnIpRequest
     * @return DescribeCdnIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnIpResponse DescribeCdnIp(DescribeCdnIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCdnIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCdnOriginIp）用于查询 CDN 回源节点的IP信息。（注：此接口即将下线，不再进行维护，请通过DescribeIpStatus 接口进行查询）
     * @param req DescribeCdnOriginIpRequest
     * @return DescribeCdnOriginIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnOriginIpResponse DescribeCdnOriginIp(DescribeCdnOriginIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnOriginIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnOriginIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCdnOriginIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeCertDomains 用于校验SSL证书并提取证书中包含的域名。
     * @param req DescribeCertDomainsRequest
     * @return DescribeCertDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertDomainsResponse DescribeCertDomains(DescribeCertDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DDoS统计数据查询
     * @param req DescribeDDoSDataRequest
     * @return DescribeDDoSDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSDataResponse DescribeDDoSData(DescribeDDoSDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeDiagnoseReport 用于获取指定报告id的内容
     * @param req DescribeDiagnoseReportRequest
     * @return DescribeDiagnoseReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiagnoseReportResponse DescribeDiagnoseReport(DescribeDiagnoseReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiagnoseReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiagnoseReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiagnoseReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定域名的区域、运营商明细数据
注意事项：接口尚未全量开放，未在内测名单中的账号不支持调用
     * @param req DescribeDistrictIspDataRequest
     * @return DescribeDistrictIspDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDistrictIspDataResponse DescribeDistrictIspData(DescribeDistrictIspDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDistrictIspDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDistrictIspDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDistrictIspData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainsConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeEventLogData 用于查询事件日志统计曲线
     * @param req DescribeEventLogDataRequest
     * @return DescribeEventLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventLogDataResponse DescribeEventLogData(DescribeEventLogDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventLogDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventLogDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventLogData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeImageConfig 用于获取域名图片优化的当前配置，支持Webp、TPG 和 Guetzli。 
     * @param req DescribeImageConfigRequest
     * @return DescribeImageConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageConfigResponse DescribeImageConfig(DescribeImageConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeIpStatus 用于查询域名所在加速平台的边缘节点、回源节点明细。注意事项：边缘节点（edge）尚未全量开放，未在内测名单中的账号不支持调用。

>?  若您的业务已迁移至 CDN 控制台，请参考<a href="https://cloud.tencent.com/document/api/228/41954"> CDN 接口文档</a>，使用  CDN 相关API 进行操作。
     * @param req DescribeIpStatusRequest
     * @return DescribeIpStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpStatusResponse DescribeIpStatus(DescribeIpStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIpStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpVisitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIpVisit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMapInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMapInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOriginDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOriginData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePayTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePayType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePurgeQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePurgeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePushQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePushQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribePushTasks  用于查询预热任务提交历史记录及执行进度。
     * @param req DescribePushTasksRequest
     * @return DescribePushTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushTasksResponse DescribePushTasks(DescribePushTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePushTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePushTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePushTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReportDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReportData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取BOT统计数据列表
     * @param req DescribeScdnBotDataRequest
     * @return DescribeScdnBotDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScdnBotDataResponse DescribeScdnBotData(DescribeScdnBotDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScdnBotDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScdnBotDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScdnBotData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询BOT会话记录列表
     * @param req DescribeScdnBotRecordsRequest
     * @return DescribeScdnBotRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScdnBotRecordsResponse DescribeScdnBotRecords(DescribeScdnBotRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScdnBotRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScdnBotRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScdnBotRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeScdnConfig 用于查询指定 SCDN 加速域名的安全相关配置
     * @param req DescribeScdnConfigRequest
     * @return DescribeScdnConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScdnConfigResponse DescribeScdnConfig(DescribeScdnConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScdnConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScdnConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScdnConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询在SCDN IP安全策略
     * @param req DescribeScdnIpStrategyRequest
     * @return DescribeScdnIpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScdnIpStrategyResponse DescribeScdnIpStrategy(DescribeScdnIpStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScdnIpStrategyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScdnIpStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScdnIpStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取SCDN的Top数据
     * @param req DescribeScdnTopDataRequest
     * @return DescribeScdnTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScdnTopDataResponse DescribeScdnTopData(DescribeScdnTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScdnTopDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScdnTopDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScdnTopData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeTopData 通过入参 Metric 和 Filter 组合不同，可以查询以下排序数据：

+ 依据总流量、总请求数对访问 IP 排序，从大至小返回 TOP 100 IP
+ 依据总流量、总请求数对访问 Refer 排序，从大至小返回 TOP 100 Refer
+ 依据总流量、总请求数对访问 设备 排序，从大至小返回 设备类型
+ 依据总流量、总请求数对访问 操作系统 排序，从大至小返回 操作系统
+ 依据总流量、总请求数对访问 浏览器 排序，从大至小返回 浏览器

注意：
+ 仅支持 90 天内数据查询，且从2021年09月20日开始有数据
+ 本接口为beta版，尚未正式全量发布

     * @param req DescribeTopDataRequest
     * @return DescribeTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopDataResponse DescribeTopData(DescribeTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeTrafficPackages 用于查询 CDN 流量包详情。
     * @param req DescribeTrafficPackagesRequest
     * @return DescribeTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficPackagesResponse DescribeTrafficPackages(DescribeTrafficPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrafficPackagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrafficPackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrafficPackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUrlViolationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUrlViolations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf统计数据查询
     * @param req DescribeWafDataRequest
     * @return DescribeWafDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafDataResponse DescribeWafData(DescribeWafDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWafDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWafDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWafData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DisableCaches 用于禁用 CDN 上指定 URL 的访问，禁用完成后，中国境内访问会直接返回 403。（注：接口尚在内测中，暂未全量开放；封禁URL并非无限期永久封禁）
     * @param req DisableCachesRequest
     * @return DisableCachesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCachesResponse DisableCaches(DisableCachesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableCachesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableCachesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableCaches");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableClsLogTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableClsLogTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拷贝参考域名的配置至新域名。暂不支持自有证书以及定制化配置
     * @param req DuplicateDomainConfigRequest
     * @return DuplicateDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public DuplicateDomainConfigResponse DuplicateDomainConfig(DuplicateDomainConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DuplicateDomainConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DuplicateDomainConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DuplicateDomainConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableCachesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableCaches");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableClsLogTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableClsLogTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDisableRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDisableRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListClsLogTopicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListClsLogTopics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListClsTopicDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListClsTopicDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ListDiagnoseReport 用于获取用户诊断URL访问后各个子任务的简要详情。
     * @param req ListDiagnoseReportRequest
     * @return ListDiagnoseReportResponse
     * @throws TencentCloudSDKException
     */
    public ListDiagnoseReportResponse ListDiagnoseReport(ListDiagnoseReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListDiagnoseReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListDiagnoseReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListDiagnoseReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ListScdnDomains 用于查询 SCDN 安全加速域名列表，及域名基本配置信息
     * @param req ListScdnDomainsRequest
     * @return ListScdnDomainsResponse
     * @throws TencentCloudSDKException
     */
    public ListScdnDomainsResponse ListScdnDomains(ListScdnDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListScdnDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListScdnDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListScdnDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ListScdnLogTasks 用于查询SCDN日志下载任务列表,以及展示下载任务基本信息
     * @param req ListScdnLogTasksRequest
     * @return ListScdnLogTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListScdnLogTasksResponse ListScdnLogTasks(ListScdnLogTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListScdnLogTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListScdnLogTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListScdnLogTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Bot攻击的Top数据列表
     * @param req ListScdnTopBotDataRequest
     * @return ListScdnTopBotDataResponse
     * @throws TencentCloudSDKException
     */
    public ListScdnTopBotDataResponse ListScdnTopBotData(ListScdnTopBotDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListScdnTopBotDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListScdnTopBotDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListScdnTopBotData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Bot攻击的Top信息
     * @param req ListTopBotDataRequest
     * @return ListTopBotDataResponse
     * @throws TencentCloudSDKException
     */
    public ListTopBotDataResponse ListTopBotData(ListTopBotDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTopBotDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopBotDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTopBotData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取CC攻击Top数据
     * @param req ListTopCcDataRequest
     * @return ListTopCcDataResponse
     * @throws TencentCloudSDKException
     */
    public ListTopCcDataResponse ListTopCcData(ListTopCcDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTopCcDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopCcDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTopCcData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过CLS日志计算Top信息。支持近7天的日志数据。
     * @param req ListTopClsLogDataRequest
     * @return ListTopClsLogDataResponse
     * @throws TencentCloudSDKException
     */
    public ListTopClsLogDataResponse ListTopClsLogData(ListTopClsLogDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTopClsLogDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopClsLogDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTopClsLogData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS攻击Top数据
     * @param req ListTopDDoSDataRequest
     * @return ListTopDDoSDataResponse
     * @throws TencentCloudSDKException
     */
    public ListTopDDoSDataResponse ListTopDDoSData(ListTopDDoSDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTopDDoSDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopDDoSDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTopDDoSData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTopData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Waf攻击Top数据
     * @param req ListTopWafDataRequest
     * @return ListTopWafDataResponse
     * @throws TencentCloudSDKException
     */
    public ListTopWafDataResponse ListTopWafData(ListTopWafDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTopWafDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopWafDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTopWafData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ManageClsTopicDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ManageClsTopicDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ModifyPurgeFetchTaskStatus 用于上报定时刷新预热任务执行状态
     * @param req ModifyPurgeFetchTaskStatusRequest
     * @return ModifyPurgeFetchTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPurgeFetchTaskStatusResponse ModifyPurgeFetchTaskStatus(ModifyPurgeFetchTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPurgeFetchTaskStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPurgeFetchTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPurgeFetchTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *PurgePathCache 用于批量提交目录刷新，根据域名的加速区域进行对应区域的刷新。
默认情况下境内、境外加速区域每日目录刷新额度为各 100 条，每次最多可提交 500 条。
     * @param req PurgePathCacheRequest
     * @return PurgePathCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgePathCacheResponse PurgePathCache(PurgePathCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PurgePathCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PurgePathCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PurgePathCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PurgeUrlsCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PurgeUrlsCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *PushUrlsCache 用于将指定 URL 资源列表加载至 CDN 节点，支持指定加速区域预热。
默认情况下境内、境外每日预热 URL 限额为各 1000 条，每次最多可提交 500 条。注意：中国境外区域预热，资源默认加载至中国境外边缘节点，所产生的边缘层流量会计入计费流量。
     * @param req PushUrlsCacheRequest
     * @return PushUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PushUrlsCacheResponse PushUrlsCache(PushUrlsCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PushUrlsCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PushUrlsCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PushUrlsCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchClsLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchClsLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartCdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartCdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *StartScdnDomain 用于开启域名的安全防护配置
     * @param req StartScdnDomainRequest
     * @return StartScdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartScdnDomainResponse StartScdnDomain(StartScdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartScdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartScdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartScdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopCdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopCdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *StopScdnDomain 用于关闭域名的安全防护配置
     * @param req StopScdnDomainRequest
     * @return StopScdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StopScdnDomainResponse StopScdnDomain(StopScdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopScdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopScdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopScdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDomainConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDomainConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *UpdateImageConfig 用于更新控制台图片优化的相关配置，支持Webp、TPG 和 Guetzli。 
     * @param req UpdateImageConfigRequest
     * @return UpdateImageConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateImageConfigResponse UpdateImageConfig(UpdateImageConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateImageConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateImageConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateImageConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePayTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePayType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *UpdateScdnDomain 用于修改 SCDN 加速域名安全相关配置
     * @param req UpdateScdnDomainRequest
     * @return UpdateScdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public UpdateScdnDomainResponse UpdateScdnDomain(UpdateScdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateScdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateScdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateScdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证域名解析值
     * @param req VerifyDomainRecordRequest
     * @return VerifyDomainRecordResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDomainRecordResponse VerifyDomainRecord(VerifyDomainRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyDomainRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyDomainRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyDomainRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
