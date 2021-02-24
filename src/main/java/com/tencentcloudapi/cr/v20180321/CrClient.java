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
    private static String service = "cr";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyBlackListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyBlackList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交机器人黑名单申请
     * @param req ApplyBlackListDataRequest
     * @return ApplyBlackListDataResponse
     * @throws TencentCloudSDKException
     */
    public ApplyBlackListDataResponse ApplyBlackListData(ApplyBlackListDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyBlackListDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyBlackListDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyBlackListData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyCreditAuditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyCreditAudit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新机器人任务作业状态
     * @param req ChangeBotCallStatusRequest
     * @return ChangeBotCallStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeBotCallStatusResponse ChangeBotCallStatus(ChangeBotCallStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeBotCallStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeBotCallStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeBotCallStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新机器人任务状态
     * @param req ChangeBotTaskStatusRequest
     * @return ChangeBotTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeBotTaskStatusResponse ChangeBotTaskStatus(ChangeBotTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeBotTaskStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeBotTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeBotTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建机器人任务
     * @param req CreateBotTaskRequest
     * @return CreateBotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBotTaskResponse CreateBotTask(CreateBotTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBotTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBotTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBotTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询机器人对话流
     * @param req DescribeBotFlowRequest
     * @return DescribeBotFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotFlowResponse DescribeBotFlow(DescribeBotFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBotFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBotFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBotFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCreditResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCreditResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询机器人文件模板
     * @param req DescribeFileModelRequest
     * @return DescribeFileModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileModelResponse DescribeFileModel(DescribeFileModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下载任务录音与文本，第二天12点后可使用此接口获取对应的录音与文本
     * @param req DownloadBotRecordRequest
     * @return DownloadBotRecordResponse
     * @throws TencentCloudSDKException
     */
    public DownloadBotRecordResponse DownloadBotRecord(DownloadBotRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadBotRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadBotRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadBotRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadDialogueTextResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadDialogueText");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadRecordListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadRecordList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出机器人数据
     * @param req ExportBotDataRequest
     * @return ExportBotDataResponse
     * @throws TencentCloudSDKException
     */
    public ExportBotDataResponse ExportBotData(ExportBotDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBotDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBotDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBotData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看黑名单数据列表
     * @param req QueryBlackListDataRequest
     * @return QueryBlackListDataResponse
     * @throws TencentCloudSDKException
     */
    public QueryBlackListDataResponse QueryBlackListData(QueryBlackListDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBlackListDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBlackListDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBlackListData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询机器人任务状态列表
     * @param req QueryBotListRequest
     * @return QueryBotListResponse
     * @throws TencentCloudSDKException
     */
    public QueryBotListResponse QueryBotList(QueryBotListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBotListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBotListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBotList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *机器人任务查询
     * @param req QueryCallListRequest
     * @return QueryCallListResponse
     * @throws TencentCloudSDKException
     */
    public QueryCallListResponse QueryCallList(QueryCallListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCallListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCallListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCallList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryInstantDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryInstantData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询产品列表
     * @param req QueryProductsRequest
     * @return QueryProductsResponse
     * @throws TencentCloudSDKException
     */
    public QueryProductsResponse QueryProducts(QueryProductsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryProductsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryProductsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryProducts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询录音列表
     * @param req QueryRecordListRequest
     * @return QueryRecordListResponse
     * @throws TencentCloudSDKException
     */
    public QueryRecordListResponse QueryRecordList(QueryRecordListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryRecordListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryRecordListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryRecordList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新机器人任务
     * @param req UpdateBotTaskRequest
     * @return UpdateBotTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBotTaskResponse UpdateBotTask(UpdateBotTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateBotTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateBotTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateBotTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传机器人任务数据
     * @param req UploadBotDataRequest
     * @return UploadBotDataResponse
     * @throws TencentCloudSDKException
     */
    public UploadBotDataResponse UploadBotData(UploadBotDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadBotDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadBotDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadBotData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传机器人文件
     * @param req UploadBotFileRequest
     * @return UploadBotFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadBotFileResponse UploadBotFile(UploadBotFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadBotFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadBotFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadBotFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadDataFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadDataFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadDataJsonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadDataJson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
