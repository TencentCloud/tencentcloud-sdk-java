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
package com.tencentcloudapi.cr.v20180321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cr.v20180321.models.*;

public class CrClient extends AbstractClient{
    private static String endpoint = "cr.tencentcloudapi.com";
    private static String version = "2018-03-21";

    public CrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CrClient(Credential credential, String region, ClientProfile profile) {
        super(CrClient.endpoint, CrClient.version, credential, region, profile);
    }

    /**
     *提交黑名单后，黑名单中有效期内的号码将停止拨打，适用于到期/逾期提醒、回访场景。
     * @param req ApplyBlackListRequest
     * @return ApplyBlackListResponse
     * @throws TencentCloudSDKException
     */
    public ApplyBlackListResponse ApplyBlackList(ApplyBlackListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyBlackListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyBlackListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyBlackList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交信审外呼申请，返回当次请求日期。
     * @param req ApplyCreditAuditRequest
     * @return ApplyCreditAuditResponse
     * @throws TencentCloudSDKException
     */
    public ApplyCreditAuditResponse ApplyCreditAudit(ApplyCreditAuditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyCreditAuditResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyCreditAuditResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyCreditAudit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据信审任务ID和请求日期，获取相关信审结果。
     * @param req DescribeCreditResultRequest
     * @return DescribeCreditResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCreditResultResponse DescribeCreditResult(DescribeCreditResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCreditResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCreditResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCreditResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取指定案件的录音地址，次日早上8:00后可查询前日录音。
     * @param req DescribeRecordsRequest
     * @return DescribeRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordsResponse DescribeRecords(DescribeRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据上传文件接口的输出参数DataResId，获取相关上传结果。
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取指定案件的对话文本内容，次日早上8:00后可查询前日对话文本内容。
     * @param req DownloadDialogueTextRequest
     * @return DownloadDialogueTextResponse
     * @throws TencentCloudSDKException
     */
    public DownloadDialogueTextResponse DownloadDialogueText(DownloadDialogueTextRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadDialogueTextResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadDialogueTextResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadDialogueText"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p>用于获取录音下载链接清单，次日早上8:00后可查询前日录音清单。</p>
<p>注意：录音清单中的录音下载链接仅次日20:00之前有效，请及时下载。</p>
     * @param req DownloadRecordListRequest
     * @return DownloadRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DownloadRecordListResponse DownloadRecordList(DownloadRecordListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadRecordListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadRecordListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadRecordList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于下载结果报表。当日23:00后，可获取当日到期/逾期提醒结果，次日00:30后，可获取昨日回访结果。
     * @param req DownloadReportRequest
     * @return DownloadReportResponse
     * @throws TencentCloudSDKException
     */
    public DownloadReportResponse DownloadReport(DownloadReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadReportResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadReportResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadReport"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实时数据查询
     * @param req QueryInstantDataRequest
     * @return QueryInstantDataResponse
     * @throws TencentCloudSDKException
     */
    public QueryInstantDataResponse QueryInstantData(QueryInstantDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryInstantDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryInstantDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryInstantData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传文件，接口返回数据任务ID，支持xlsx、xls、csv、zip格式。
     * @param req UploadDataFileRequest
     * @return UploadDataFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadDataFileResponse UploadDataFile(UploadDataFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadDataFileResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UploadDataFileResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadDataFile"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传Json格式数据，接口返回数据任务ID
     * @param req UploadDataJsonRequest
     * @return UploadDataJsonResponse
     * @throws TencentCloudSDKException
     */
    public UploadDataJsonResponse UploadDataJson(UploadDataJsonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadDataJsonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UploadDataJsonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadDataJson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *客户通过调用该接口上传需催收文档，格式需为excel格式。接口返回任务ID。
     * @param req UploadFileRequest
     * @return UploadFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadFileResponse UploadFile(UploadFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFileResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFileResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadFile"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
