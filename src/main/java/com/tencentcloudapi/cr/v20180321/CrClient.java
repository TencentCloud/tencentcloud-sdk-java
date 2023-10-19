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
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyBlackList", ApplyBlackListResponse.class);
    }

    /**
     *提交机器人黑名单申请
     * @param req ApplyBlackListDataRequest
     * @return ApplyBlackListDataResponse
     * @throws TencentCloudSDKException
     */
    public ApplyBlackListDataResponse ApplyBlackListData(ApplyBlackListDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyBlackListData", ApplyBlackListDataResponse.class);
    }

    /**
     *提交信审外呼申请，返回当次请求日期。
     * @param req ApplyCreditAuditRequest
     * @return ApplyCreditAuditResponse
     * @throws TencentCloudSDKException
     */
    public ApplyCreditAuditResponse ApplyCreditAudit(ApplyCreditAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyCreditAudit", ApplyCreditAuditResponse.class);
    }

    /**
     *更新机器人任务作业状态
     * @param req ChangeBotCallStatusRequest
     * @return ChangeBotCallStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeBotCallStatusResponse ChangeBotCallStatus(ChangeBotCallStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeBotCallStatus", ChangeBotCallStatusResponse.class);
    }

    /**
     *更新机器人任务状态
     * @param req ChangeBotTaskStatusRequest
     * @return ChangeBotTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeBotTaskStatusResponse ChangeBotTaskStatus(ChangeBotTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeBotTaskStatus", ChangeBotTaskStatusResponse.class);
    }

    /**
     *创建机器人任务
     * @param req CreateBotTaskRequest
     * @return CreateBotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBotTaskResponse CreateBotTask(CreateBotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBotTask", CreateBotTaskResponse.class);
    }

    /**
     *查询机器人对话流
     * @param req DescribeBotFlowRequest
     * @return DescribeBotFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotFlowResponse DescribeBotFlow(DescribeBotFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBotFlow", DescribeBotFlowResponse.class);
    }

    /**
     *根据信审任务ID和请求日期，获取相关信审结果。
     * @param req DescribeCreditResultRequest
     * @return DescribeCreditResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCreditResultResponse DescribeCreditResult(DescribeCreditResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCreditResult", DescribeCreditResultResponse.class);
    }

    /**
     *查询机器人文件模板
     * @param req DescribeFileModelRequest
     * @return DescribeFileModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileModelResponse DescribeFileModel(DescribeFileModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileModel", DescribeFileModelResponse.class);
    }

    /**
     *用于获取指定案件的录音地址，次日早上8:00后可查询前日录音。
     * @param req DescribeRecordsRequest
     * @return DescribeRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordsResponse DescribeRecords(DescribeRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecords", DescribeRecordsResponse.class);
    }

    /**
     *根据上传文件接口的输出参数DataResId，获取相关上传结果。
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *下载任务录音与文本，第二天12点后可使用此接口获取对应的录音与文本
     * @param req DownloadBotRecordRequest
     * @return DownloadBotRecordResponse
     * @throws TencentCloudSDKException
     */
    public DownloadBotRecordResponse DownloadBotRecord(DownloadBotRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadBotRecord", DownloadBotRecordResponse.class);
    }

    /**
     *用于获取指定案件的对话文本内容，次日早上8:00后可查询前日对话文本内容。
     * @param req DownloadDialogueTextRequest
     * @return DownloadDialogueTextResponse
     * @throws TencentCloudSDKException
     */
    public DownloadDialogueTextResponse DownloadDialogueText(DownloadDialogueTextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadDialogueText", DownloadDialogueTextResponse.class);
    }

    /**
     *<p>用于获取录音下载链接清单，次日早上8:00后可查询前日录音清单。</p>
<p>注意：录音清单中的录音下载链接仅次日20:00之前有效，请及时下载。</p>
     * @param req DownloadRecordListRequest
     * @return DownloadRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DownloadRecordListResponse DownloadRecordList(DownloadRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadRecordList", DownloadRecordListResponse.class);
    }

    /**
     *用于下载结果报表。当日23:00后，可获取当日到期/逾期提醒结果，次日00:30后，可获取昨日回访结果。
     * @param req DownloadReportRequest
     * @return DownloadReportResponse
     * @throws TencentCloudSDKException
     */
    public DownloadReportResponse DownloadReport(DownloadReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadReport", DownloadReportResponse.class);
    }

    /**
     *导出机器人数据
     * @param req ExportBotDataRequest
     * @return ExportBotDataResponse
     * @throws TencentCloudSDKException
     */
    public ExportBotDataResponse ExportBotData(ExportBotDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBotData", ExportBotDataResponse.class);
    }

    /**
     *查看黑名单数据列表
     * @param req QueryBlackListDataRequest
     * @return QueryBlackListDataResponse
     * @throws TencentCloudSDKException
     */
    public QueryBlackListDataResponse QueryBlackListData(QueryBlackListDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryBlackListData", QueryBlackListDataResponse.class);
    }

    /**
     *查询机器人任务状态列表
     * @param req QueryBotListRequest
     * @return QueryBotListResponse
     * @throws TencentCloudSDKException
     */
    public QueryBotListResponse QueryBotList(QueryBotListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryBotList", QueryBotListResponse.class);
    }

    /**
     *机器人任务查询
     * @param req QueryCallListRequest
     * @return QueryCallListResponse
     * @throws TencentCloudSDKException
     */
    public QueryCallListResponse QueryCallList(QueryCallListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCallList", QueryCallListResponse.class);
    }

    /**
     *实时数据查询
     * @param req QueryInstantDataRequest
     * @return QueryInstantDataResponse
     * @throws TencentCloudSDKException
     */
    public QueryInstantDataResponse QueryInstantData(QueryInstantDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryInstantData", QueryInstantDataResponse.class);
    }

    /**
     *查询产品列表
     * @param req QueryProductsRequest
     * @return QueryProductsResponse
     * @throws TencentCloudSDKException
     */
    public QueryProductsResponse QueryProducts(QueryProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryProducts", QueryProductsResponse.class);
    }

    /**
     *查询录音列表
     * @param req QueryRecordListRequest
     * @return QueryRecordListResponse
     * @throws TencentCloudSDKException
     */
    public QueryRecordListResponse QueryRecordList(QueryRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryRecordList", QueryRecordListResponse.class);
    }

    /**
     *更新机器人任务
     * @param req UpdateBotTaskRequest
     * @return UpdateBotTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBotTaskResponse UpdateBotTask(UpdateBotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBotTask", UpdateBotTaskResponse.class);
    }

    /**
     *上传机器人任务数据
     * @param req UploadBotDataRequest
     * @return UploadBotDataResponse
     * @throws TencentCloudSDKException
     */
    public UploadBotDataResponse UploadBotData(UploadBotDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadBotData", UploadBotDataResponse.class);
    }

    /**
     *上传机器人文件
     * @param req UploadBotFileRequest
     * @return UploadBotFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadBotFileResponse UploadBotFile(UploadBotFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadBotFile", UploadBotFileResponse.class);
    }

    /**
     *上传文件，接口返回数据任务ID，支持xlsx、xls、csv、zip格式。
     * @param req UploadDataFileRequest
     * @return UploadDataFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadDataFileResponse UploadDataFile(UploadDataFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadDataFile", UploadDataFileResponse.class);
    }

    /**
     *上传Json格式数据，接口返回数据任务ID
     * @param req UploadDataJsonRequest
     * @return UploadDataJsonResponse
     * @throws TencentCloudSDKException
     */
    public UploadDataJsonResponse UploadDataJson(UploadDataJsonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadDataJson", UploadDataJsonResponse.class);
    }

    /**
     *客户通过调用该接口上传需催收文档，格式需为excel格式。接口返回任务ID。
     * @param req UploadFileRequest
     * @return UploadFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadFileResponse UploadFile(UploadFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFile", UploadFileResponse.class);
    }

}
