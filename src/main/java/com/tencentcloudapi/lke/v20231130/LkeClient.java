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
package com.tencentcloudapi.lke.v20231130;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lke.v20231130.models.*;

public class LkeClient extends AbstractClient{
    private static String endpoint = "lke.tencentcloudapi.com";
    private static String service = "lke";
    private static String version = "2023-11-30";
    
    public LkeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LkeClient(Credential credential, String region, ClientProfile profile) {
        super(LkeClient.endpoint, LkeClient.version, credential, region, profile);
    }

    /**
     *检查属性下的标签名是否存在
     * @param req CheckAttributeLabelExistRequest
     * @return CheckAttributeLabelExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckAttributeLabelExistResponse CheckAttributeLabelExist(CheckAttributeLabelExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAttributeLabelExist", CheckAttributeLabelExistResponse.class);
    }

    /**
     *检查属性标签引用
     * @param req CheckAttributeLabelReferRequest
     * @return CheckAttributeLabelReferResponse
     * @throws TencentCloudSDKException
     */
    public CheckAttributeLabelReferResponse CheckAttributeLabelRefer(CheckAttributeLabelReferRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAttributeLabelRefer", CheckAttributeLabelReferResponse.class);
    }

    /**
     *接口支持图片和PDF转可编辑word格式文件，将文件中的图片、文本、表格等元素识别，并根据位置进行还原。
     * @param req ConvertDocumentRequest
     * @return ConvertDocumentResponse
     * @throws TencentCloudSDKException
     */
    public ConvertDocumentResponse ConvertDocument(ConvertDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConvertDocument", ConvertDocumentResponse.class);
    }

    /**
     *创建知识引擎应用。
     * @param req CreateAppRequest
     * @return CreateAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppResponse CreateApp(CreateAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApp", CreateAppResponse.class);
    }

    /**
     *创建属性
     * @param req CreateAttributeLabelRequest
     * @return CreateAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public CreateAttributeLabelResponse CreateAttributeLabel(CreateAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAttributeLabel", CreateAttributeLabelResponse.class);
    }

    /**
     *创建企业
     * @param req CreateCorpRequest
     * @return CreateCorpResponse
     * @throws TencentCloudSDKException
     */
    public CreateCorpResponse CreateCorp(CreateCorpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCorp", CreateCorpResponse.class);
    }

    /**
     *录入问答
     * @param req CreateQARequest
     * @return CreateQAResponse
     * @throws TencentCloudSDKException
     */
    public CreateQAResponse CreateQA(CreateQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQA", CreateQAResponse.class);
    }

    /**
     *创建QA分类
     * @param req CreateQACateRequest
     * @return CreateQACateResponse
     * @throws TencentCloudSDKException
     */
    public CreateQACateResponse CreateQACate(CreateQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQACate", CreateQACateResponse.class);
    }

    /**
     *本接口为异步接口的发起请求接口，用于发起文档解析任务。
文档解析支持将图片或PDF文件转换成Markdown格式文件，可解析包括表格、公式、图片、标题、段落、页眉、页脚等内容元素，并将内容智能转换成阅读顺序。

体验期间单账号限制qps仅为1，若有正式接入需要请与产研团队沟通开放。
     * @param req CreateReconstructDocumentFlowRequest
     * @return CreateReconstructDocumentFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateReconstructDocumentFlowResponse CreateReconstructDocumentFlow(CreateReconstructDocumentFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReconstructDocumentFlow", CreateReconstructDocumentFlowResponse.class);
    }

    /**
     *创建拒答问题
     * @param req CreateRejectedQuestionRequest
     * @return CreateRejectedQuestionResponse
     * @throws TencentCloudSDKException
     */
    public CreateRejectedQuestionResponse CreateRejectedQuestion(CreateRejectedQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRejectedQuestion", CreateRejectedQuestionResponse.class);
    }

    /**
     *创建发布
     * @param req CreateReleaseRequest
     * @return CreateReleaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseResponse CreateRelease(CreateReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRelease", CreateReleaseResponse.class);
    }

    /**
     *删除应用
     * @param req DeleteAppRequest
     * @return DeleteAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppResponse DeleteApp(DeleteAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApp", DeleteAppResponse.class);
    }

    /**
     *删除属性标签
     * @param req DeleteAttributeLabelRequest
     * @return DeleteAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttributeLabelResponse DeleteAttributeLabel(DeleteAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAttributeLabel", DeleteAttributeLabelResponse.class);
    }

    /**
     *删除文档
     * @param req DeleteDocRequest
     * @return DeleteDocResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocResponse DeleteDoc(DeleteDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDoc", DeleteDocResponse.class);
    }

    /**
     *删除问答
     * @param req DeleteQARequest
     * @return DeleteQAResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQAResponse DeleteQA(DeleteQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQA", DeleteQAResponse.class);
    }

    /**
     *分类删除
     * @param req DeleteQACateRequest
     * @return DeleteQACateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQACateResponse DeleteQACate(DeleteQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQACate", DeleteQACateResponse.class);
    }

    /**
     *删除拒答问题
     * @param req DeleteRejectedQuestionRequest
     * @return DeleteRejectedQuestionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRejectedQuestionResponse DeleteRejectedQuestion(DeleteRejectedQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRejectedQuestion", DeleteRejectedQuestionResponse.class);
    }

    /**
     *获取企业下应用详情
     * @param req DescribeAppRequest
     * @return DescribeAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppResponse DescribeApp(DescribeAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApp", DescribeAppResponse.class);
    }

    /**
     *查询属性标签详情
     * @param req DescribeAttributeLabelRequest
     * @return DescribeAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttributeLabelResponse DescribeAttributeLabel(DescribeAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttributeLabel", DescribeAttributeLabelResponse.class);
    }

    /**
     *企业详情
     * @param req DescribeCorpRequest
     * @return DescribeCorpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCorpResponse DescribeCorp(DescribeCorpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCorp", DescribeCorpResponse.class);
    }

    /**
     *文档详情
     * @param req DescribeDocRequest
     * @return DescribeDocResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocResponse DescribeDoc(DescribeDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDoc", DescribeDocResponse.class);
    }

    /**
     *问答详情
     * @param req DescribeQARequest
     * @return DescribeQAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQAResponse DescribeQA(DescribeQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQA", DescribeQAResponse.class);
    }

    /**
     *获取来源详情列表
     * @param req DescribeReferRequest
     * @return DescribeReferResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReferResponse DescribeRefer(DescribeReferRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRefer", DescribeReferResponse.class);
    }

    /**
     *发布详情
     * @param req DescribeReleaseRequest
     * @return DescribeReleaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseResponse DescribeRelease(DescribeReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRelease", DescribeReleaseResponse.class);
    }

    /**
     *拉取发布按钮状态、最后发布时间
     * @param req DescribeReleaseInfoRequest
     * @return DescribeReleaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseInfoResponse DescribeReleaseInfo(DescribeReleaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseInfo", DescribeReleaseInfoResponse.class);
    }

    /**
     *通过appKey获取应用业务ID
     * @param req DescribeRobotBizIDByAppKeyRequest
     * @return DescribeRobotBizIDByAppKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRobotBizIDByAppKeyResponse DescribeRobotBizIDByAppKey(DescribeRobotBizIDByAppKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRobotBizIDByAppKey", DescribeRobotBizIDByAppKeyResponse.class);
    }

    /**
     *获取片段详情
     * @param req DescribeSegmentsRequest
     * @return DescribeSegmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSegmentsResponse DescribeSegments(DescribeSegmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSegments", DescribeSegmentsResponse.class);
    }

    /**
     *获取文件上传临时密钥
     * @param req DescribeStorageCredentialRequest
     * @return DescribeStorageCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageCredentialResponse DescribeStorageCredential(DescribeStorageCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageCredential", DescribeStorageCredentialResponse.class);
    }

    /**
     *获取不满意回复上下文
     * @param req DescribeUnsatisfiedReplyContextRequest
     * @return DescribeUnsatisfiedReplyContextResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnsatisfiedReplyContextResponse DescribeUnsatisfiedReplyContext(DescribeUnsatisfiedReplyContextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnsatisfiedReplyContext", DescribeUnsatisfiedReplyContextResponse.class);
    }

    /**
     *导出属性标签
     * @param req ExportAttributeLabelRequest
     * @return ExportAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public ExportAttributeLabelResponse ExportAttributeLabel(ExportAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAttributeLabel", ExportAttributeLabelResponse.class);
    }

    /**
     *导出QA列表
     * @param req ExportQAListRequest
     * @return ExportQAListResponse
     * @throws TencentCloudSDKException
     */
    public ExportQAListResponse ExportQAList(ExportQAListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportQAList", ExportQAListResponse.class);
    }

    /**
     *导出不满意回复
     * @param req ExportUnsatisfiedReplyRequest
     * @return ExportUnsatisfiedReplyResponse
     * @throws TencentCloudSDKException
     */
    public ExportUnsatisfiedReplyResponse ExportUnsatisfiedReply(ExportUnsatisfiedReplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportUnsatisfiedReply", ExportUnsatisfiedReplyResponse.class);
    }

    /**
     *文档生成问答
     * @param req GenerateQARequest
     * @return GenerateQAResponse
     * @throws TencentCloudSDKException
     */
    public GenerateQAResponse GenerateQA(GenerateQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateQA", GenerateQAResponse.class);
    }

    /**
     *回答类型数据统计
     * @param req GetAnswerTypeDataCountRequest
     * @return GetAnswerTypeDataCountResponse
     * @throws TencentCloudSDKException
     */
    public GetAnswerTypeDataCountResponse GetAnswerTypeDataCount(GetAnswerTypeDataCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAnswerTypeDataCount", GetAnswerTypeDataCountResponse.class);
    }

    /**
     *获取模型列表
     * @param req GetAppKnowledgeCountRequest
     * @return GetAppKnowledgeCountResponse
     * @throws TencentCloudSDKException
     */
    public GetAppKnowledgeCountResponse GetAppKnowledgeCount(GetAppKnowledgeCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAppKnowledgeCount", GetAppKnowledgeCountResponse.class);
    }

    /**
     *获取应用密钥
     * @param req GetAppSecretRequest
     * @return GetAppSecretResponse
     * @throws TencentCloudSDKException
     */
    public GetAppSecretResponse GetAppSecret(GetAppSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAppSecret", GetAppSecretResponse.class);
    }

    /**
     *获取文档预览信息
     * @param req GetDocPreviewRequest
     * @return GetDocPreviewResponse
     * @throws TencentCloudSDKException
     */
    public GetDocPreviewResponse GetDocPreview(GetDocPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDocPreview", GetDocPreviewResponse.class);
    }

    /**
     *本接口（GetEmbedding）调用文本表示模型，将文本转化为用数值表示的向量形式，可用于文本检索、信息推荐、知识挖掘等场景。
本接口（GetEmbedding）有单账号调用上限控制，如您有提高并发限制的需求请 [联系我们](https://cloud.tencent.com/act/event/Online_service) 。
     * @param req GetEmbeddingRequest
     * @return GetEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public GetEmbeddingResponse GetEmbedding(GetEmbeddingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetEmbedding", GetEmbeddingResponse.class);
    }

    /**
     *点赞点踩数据统计
     * @param req GetLikeDataCountRequest
     * @return GetLikeDataCountResponse
     * @throws TencentCloudSDKException
     */
    public GetLikeDataCountResponse GetLikeDataCount(GetLikeDataCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLikeDataCount", GetLikeDataCountResponse.class);
    }

    /**
     *获取聊天历史请求
     * @param req GetMsgRecordRequest
     * @return GetMsgRecordResponse
     * @throws TencentCloudSDKException
     */
    public GetMsgRecordResponse GetMsgRecord(GetMsgRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMsgRecord", GetMsgRecordResponse.class);
    }

    /**
     *本接口为异步接口的查询结果接口，用于获取文档解析处理结果。
     * @param req GetReconstructDocumentResultRequest
     * @return GetReconstructDocumentResultResponse
     * @throws TencentCloudSDKException
     */
    public GetReconstructDocumentResultResponse GetReconstructDocumentResult(GetReconstructDocumentResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetReconstructDocumentResult", GetReconstructDocumentResultResponse.class);
    }

    /**
     *获取任务状态
     * @param req GetTaskStatusRequest
     * @return GetTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskStatusResponse GetTaskStatus(GetTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskStatus", GetTaskStatusResponse.class);
    }

    /**
     *获取ws token
     * @param req GetWsTokenRequest
     * @return GetWsTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetWsTokenResponse GetWsToken(GetWsTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWsToken", GetWsTokenResponse.class);
    }

    /**
     *QA分组
     * @param req GroupQARequest
     * @return GroupQAResponse
     * @throws TencentCloudSDKException
     */
    public GroupQAResponse GroupQA(GroupQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupQA", GroupQAResponse.class);
    }

    /**
     *忽略不满意回复
     * @param req IgnoreUnsatisfiedReplyRequest
     * @return IgnoreUnsatisfiedReplyResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreUnsatisfiedReplyResponse IgnoreUnsatisfiedReply(IgnoreUnsatisfiedReplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IgnoreUnsatisfiedReply", IgnoreUnsatisfiedReplyResponse.class);
    }

    /**
     *是否意图转人工
     * @param req IsTransferIntentRequest
     * @return IsTransferIntentResponse
     * @throws TencentCloudSDKException
     */
    public IsTransferIntentResponse IsTransferIntent(IsTransferIntentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsTransferIntent", IsTransferIntentResponse.class);
    }

    /**
     *获取企业下应用列表
     * @param req ListAppRequest
     * @return ListAppResponse
     * @throws TencentCloudSDKException
     */
    public ListAppResponse ListApp(ListAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListApp", ListAppResponse.class);
    }

    /**
     *应用类型列表
     * @param req ListAppCategoryRequest
     * @return ListAppCategoryResponse
     * @throws TencentCloudSDKException
     */
    public ListAppCategoryResponse ListAppCategory(ListAppCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAppCategory", ListAppCategoryResponse.class);
    }

    /**
     *查询属性标签列表
     * @param req ListAttributeLabelRequest
     * @return ListAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public ListAttributeLabelResponse ListAttributeLabel(ListAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAttributeLabel", ListAttributeLabelResponse.class);
    }

    /**
     *文档列表
     * @param req ListDocRequest
     * @return ListDocResponse
     * @throws TencentCloudSDKException
     */
    public ListDocResponse ListDoc(ListDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDoc", ListDocResponse.class);
    }

    /**
     *获取模型列表
     * @param req ListModelRequest
     * @return ListModelResponse
     * @throws TencentCloudSDKException
     */
    public ListModelResponse ListModel(ListModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListModel", ListModelResponse.class);
    }

    /**
     *问答列表
     * @param req ListQARequest
     * @return ListQAResponse
     * @throws TencentCloudSDKException
     */
    public ListQAResponse ListQA(ListQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQA", ListQAResponse.class);
    }

    /**
     *获取QA分类
     * @param req ListQACateRequest
     * @return ListQACateResponse
     * @throws TencentCloudSDKException
     */
    public ListQACateResponse ListQACate(ListQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQACate", ListQACateResponse.class);
    }

    /**
     *获取拒答问题
     * @param req ListRejectedQuestionRequest
     * @return ListRejectedQuestionResponse
     * @throws TencentCloudSDKException
     */
    public ListRejectedQuestionResponse ListRejectedQuestion(ListRejectedQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRejectedQuestion", ListRejectedQuestionResponse.class);
    }

    /**
     *发布拒答问题预览
     * @param req ListRejectedQuestionPreviewRequest
     * @return ListRejectedQuestionPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ListRejectedQuestionPreviewResponse ListRejectedQuestionPreview(ListRejectedQuestionPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRejectedQuestionPreview", ListRejectedQuestionPreviewResponse.class);
    }

    /**
     *发布列表
     * @param req ListReleaseRequest
     * @return ListReleaseResponse
     * @throws TencentCloudSDKException
     */
    public ListReleaseResponse ListRelease(ListReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRelease", ListReleaseResponse.class);
    }

    /**
     *发布配置项预览
     * @param req ListReleaseConfigPreviewRequest
     * @return ListReleaseConfigPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ListReleaseConfigPreviewResponse ListReleaseConfigPreview(ListReleaseConfigPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReleaseConfigPreview", ListReleaseConfigPreviewResponse.class);
    }

    /**
     *发布文档预览
     * @param req ListReleaseDocPreviewRequest
     * @return ListReleaseDocPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ListReleaseDocPreviewResponse ListReleaseDocPreview(ListReleaseDocPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReleaseDocPreview", ListReleaseDocPreviewResponse.class);
    }

    /**
     *文档列表
     * @param req ListReleaseQAPreviewRequest
     * @return ListReleaseQAPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ListReleaseQAPreviewResponse ListReleaseQAPreview(ListReleaseQAPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReleaseQAPreview", ListReleaseQAPreviewResponse.class);
    }

    /**
     *获取账户信息
     * @param req ListSelectDocRequest
     * @return ListSelectDocResponse
     * @throws TencentCloudSDKException
     */
    public ListSelectDocResponse ListSelectDoc(ListSelectDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSelectDoc", ListSelectDocResponse.class);
    }

    /**
     *查询不满意回复列表
     * @param req ListUnsatisfiedReplyRequest
     * @return ListUnsatisfiedReplyResponse
     * @throws TencentCloudSDKException
     */
    public ListUnsatisfiedReplyResponse ListUnsatisfiedReply(ListUnsatisfiedReplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUnsatisfiedReply", ListUnsatisfiedReplyResponse.class);
    }

    /**
     *修改应用请求结构体
     * @param req ModifyAppRequest
     * @return ModifyAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppResponse ModifyApp(ModifyAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApp", ModifyAppResponse.class);
    }

    /**
     *编辑属性标签
     * @param req ModifyAttributeLabelRequest
     * @return ModifyAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAttributeLabelResponse ModifyAttributeLabel(ModifyAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAttributeLabel", ModifyAttributeLabelResponse.class);
    }

    /**
     *修改文档
     * @param req ModifyDocRequest
     * @return ModifyDocResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocResponse ModifyDoc(ModifyDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDoc", ModifyDocResponse.class);
    }

    /**
     *批量修改文档适用范围
     * @param req ModifyDocAttrRangeRequest
     * @return ModifyDocAttrRangeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocAttrRangeResponse ModifyDocAttrRange(ModifyDocAttrRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDocAttrRange", ModifyDocAttrRangeResponse.class);
    }

    /**
     *更新问答
     * @param req ModifyQARequest
     * @return ModifyQAResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQAResponse ModifyQA(ModifyQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQA", ModifyQAResponse.class);
    }

    /**
     *批量修改问答适用范围
     * @param req ModifyQAAttrRangeRequest
     * @return ModifyQAAttrRangeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQAAttrRangeResponse ModifyQAAttrRange(ModifyQAAttrRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQAAttrRange", ModifyQAAttrRangeResponse.class);
    }

    /**
     *更新QA分类
     * @param req ModifyQACateRequest
     * @return ModifyQACateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQACateResponse ModifyQACate(ModifyQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQACate", ModifyQACateResponse.class);
    }

    /**
     *修改拒答问题
     * @param req ModifyRejectedQuestionRequest
     * @return ModifyRejectedQuestionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRejectedQuestionResponse ModifyRejectedQuestion(ModifyRejectedQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRejectedQuestion", ModifyRejectedQuestionResponse.class);
    }

    /**
     *接口即将下线，请切换使用新接口：[文档解析](https://cloud.tencent.com/document/product/1759/107504)
     * @param req ParseDocRequest
     * @return ParseDocResponse
     * @throws TencentCloudSDKException
     */
    public ParseDocResponse ParseDoc(ParseDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseDoc", ParseDocResponse.class);
    }

    /**
     *查询文档解析结果。该接口需开通文档解析原子能力后调用。文档解析原子能力内测中，如有需要请联系架构师或[联系客服](https://cloud.tencent.com/act/event/Online_service) 。
     * @param req QueryParseDocResultRequest
     * @return QueryParseDocResultResponse
     * @throws TencentCloudSDKException
     */
    public QueryParseDocResultResponse QueryParseDocResult(QueryParseDocResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryParseDocResult", QueryParseDocResultResponse.class);
    }

    /**
     *多轮改写（QueryRewrite）主要用于多轮对话中，进行指代消解和省略补全。使用本接口，无需输入prompt描述，根据对话历史即可生成更精确的用户查询。在应用场景上，本接口可应用于智能问答、对话式搜索等多种场景。
本接口（QueryRewrite）有单账号调用上限控制，如您有提高并发限制的需求请 [联系我们](https://cloud.tencent.com/act/event/Online_service) 。
     * @param req QueryRewriteRequest
     * @return QueryRewriteResponse
     * @throws TencentCloudSDKException
     */
    public QueryRewriteResponse QueryRewrite(QueryRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryRewrite", QueryRewriteResponse.class);
    }

    /**
     *点赞点踩消息
     * @param req RateMsgRecordRequest
     * @return RateMsgRecordResponse
     * @throws TencentCloudSDKException
     */
    public RateMsgRecordResponse RateMsgRecord(RateMsgRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RateMsgRecord", RateMsgRecordResponse.class);
    }

    /**
     *支持将图片或PDF文件转换成Markdown格式文件，可解析包括表格、公式、图片、标题、段落、页眉、页脚等内容元素，并将内容智能转换成阅读顺序。

体验期间单账号限制qps仅为1，若有正式接入需要请与产研团队沟通开放。
     * @param req ReconstructDocumentRequest
     * @return ReconstructDocumentResponse
     * @throws TencentCloudSDKException
     */
    public ReconstructDocumentResponse ReconstructDocument(ReconstructDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReconstructDocument", ReconstructDocumentResponse.class);
    }

    /**
     *重置会话
     * @param req ResetSessionRequest
     * @return ResetSessionResponse
     * @throws TencentCloudSDKException
     */
    public ResetSessionResponse ResetSession(ResetSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetSession", ResetSessionResponse.class);
    }

    /**
     *文档解析重试
     * @param req RetryDocAuditRequest
     * @return RetryDocAuditResponse
     * @throws TencentCloudSDKException
     */
    public RetryDocAuditResponse RetryDocAudit(RetryDocAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryDocAudit", RetryDocAuditResponse.class);
    }

    /**
     *文档解析重试
     * @param req RetryDocParseRequest
     * @return RetryDocParseResponse
     * @throws TencentCloudSDKException
     */
    public RetryDocParseResponse RetryDocParse(RetryDocParseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryDocParse", RetryDocParseResponse.class);
    }

    /**
     *发布暂停后重试
     * @param req RetryReleaseRequest
     * @return RetryReleaseResponse
     * @throws TencentCloudSDKException
     */
    public RetryReleaseResponse RetryRelease(RetryReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryRelease", RetryReleaseResponse.class);
    }

    /**
     *保存文档
     * @param req SaveDocRequest
     * @return SaveDocResponse
     * @throws TencentCloudSDKException
     */
    public SaveDocResponse SaveDoc(SaveDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveDoc", SaveDocResponse.class);
    }

    /**
     *终止文档解析
     * @param req StopDocParseRequest
     * @return StopDocParseResponse
     * @throws TencentCloudSDKException
     */
    public StopDocParseResponse StopDocParse(StopDocParseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopDocParse", StopDocParseResponse.class);
    }

    /**
     *上传导入属性标签
     * @param req UploadAttributeLabelRequest
     * @return UploadAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public UploadAttributeLabelResponse UploadAttributeLabel(UploadAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadAttributeLabel", UploadAttributeLabelResponse.class);
    }

    /**
     *校验问答
     * @param req VerifyQARequest
     * @return VerifyQAResponse
     * @throws TencentCloudSDKException
     */
    public VerifyQAResponse VerifyQA(VerifyQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyQA", VerifyQAResponse.class);
    }

}
