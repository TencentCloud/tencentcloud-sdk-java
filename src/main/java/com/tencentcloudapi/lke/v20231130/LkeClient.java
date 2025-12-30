/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
     *工作流工具节点异步回调
     * @param req CallbackWorkflowToolNodeRequest
     * @return CallbackWorkflowToolNodeResponse
     * @throws TencentCloudSDKException
     */
    public CallbackWorkflowToolNodeResponse CallbackWorkflowToolNode(CallbackWorkflowToolNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CallbackWorkflowToolNode", CallbackWorkflowToolNodeResponse.class);
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
     *创建标签
     * @param req CreateAttributeLabelRequest
     * @return CreateAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public CreateAttributeLabelResponse CreateAttributeLabel(CreateAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAttributeLabel", CreateAttributeLabelResponse.class);
    }

    /**
     *创建Doc分类
     * @param req CreateDocCateRequest
     * @return CreateDocCateResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocCateResponse CreateDocCate(CreateDocCateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDocCate", CreateDocCateResponse.class);
    }

    /**
     *录入问答
知识库相关背景知识介绍
“知识库检索范围”文档：https://cloud.tencent.com/document/product/1759/112704
“标签”文档：https://cloud.tencent.com/document/product/1759/112956
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
知识库相关背景知识介绍
“知识库检索范围”文档：https://cloud.tencent.com/document/product/1759/112704
“标签”文档：https://cloud.tencent.com/document/product/1759/112956
     * @param req CreateQACateRequest
     * @return CreateQACateResponse
     * @throws TencentCloudSDKException
     */
    public CreateQACateResponse CreateQACate(CreateQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQACate", CreateQACateResponse.class);
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
     *创建共享知识库。
     * @param req CreateSharedKnowledgeRequest
     * @return CreateSharedKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public CreateSharedKnowledgeResponse CreateSharedKnowledge(CreateSharedKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSharedKnowledge", CreateSharedKnowledgeResponse.class);
    }

    /**
     *创建变量
     * @param req CreateVarRequest
     * @return CreateVarResponse
     * @throws TencentCloudSDKException
     */
    public CreateVarResponse CreateVar(CreateVarRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVar", CreateVarResponse.class);
    }

    /**
     *本接口用来创建工作流的异步运行实例，创建成功后工作流会在后台异步运行，接口返回工作流运行实例ID（WorkflowRunId）等信息。后面可通过调用DescribeWorkflowRun接口查工作流运行的详情。
注意：工作流的异步运行是基于应用的，需要先把对应的应用配置成“单工作流模式”，并且打开“异步调用”的开关，才能创建成功。
     * @param req CreateWorkflowRunRequest
     * @return CreateWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowRunResponse CreateWorkflowRun(CreateWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflowRun", CreateWorkflowRunResponse.class);
    }

    /**
     *删除Agent
     * @param req DeleteAgentRequest
     * @return DeleteAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentResponse DeleteAgent(DeleteAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAgent", DeleteAgentResponse.class);
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
     *Doc分类删除
     * @param req DeleteDocCateRequest
     * @return DeleteDocCateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocCateResponse DeleteDocCate(DeleteDocCateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDocCate", DeleteDocCateResponse.class);
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
     *删除共享知识库。
     * @param req DeleteSharedKnowledgeRequest
     * @return DeleteSharedKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSharedKnowledgeResponse DeleteSharedKnowledge(DeleteSharedKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSharedKnowledge", DeleteSharedKnowledgeResponse.class);
    }

    /**
     *删除变量
     * @param req DeleteVarRequest
     * @return DeleteVarResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVarResponse DeleteVar(DeleteVarRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVar", DeleteVarResponse.class);
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
     *查询指定应用下的Agent列表
     * @param req DescribeAppAgentListRequest
     * @return DescribeAppAgentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppAgentListResponse DescribeAppAgentList(DescribeAppAgentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppAgentList", DescribeAppAgentListResponse.class);
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
     *接口调用折线图
     * @param req DescribeCallStatsGraphRequest
     * @return DescribeCallStatsGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallStatsGraphResponse DescribeCallStatsGraph(DescribeCallStatsGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallStatsGraph", DescribeCallStatsGraphResponse.class);
    }

    /**
     *并发调用响应
     * @param req DescribeConcurrencyUsageRequest
     * @return DescribeConcurrencyUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrencyUsageResponse DescribeConcurrencyUsage(DescribeConcurrencyUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrencyUsage", DescribeConcurrencyUsageResponse.class);
    }

    /**
     *并发调用折线图
     * @param req DescribeConcurrencyUsageGraphRequest
     * @return DescribeConcurrencyUsageGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrencyUsageGraphResponse DescribeConcurrencyUsageGraph(DescribeConcurrencyUsageGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrencyUsageGraph", DescribeConcurrencyUsageGraphResponse.class);
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
     *查询知识库用量
     * @param req DescribeKnowledgeUsageRequest
     * @return DescribeKnowledgeUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKnowledgeUsageResponse DescribeKnowledgeUsage(DescribeKnowledgeUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKnowledgeUsage", DescribeKnowledgeUsageResponse.class);
    }

    /**
     *查询企业知识库容量饼图
     * @param req DescribeKnowledgeUsagePieGraphRequest
     * @return DescribeKnowledgeUsagePieGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKnowledgeUsagePieGraphResponse DescribeKnowledgeUsagePieGraph(DescribeKnowledgeUsagePieGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKnowledgeUsagePieGraph", DescribeKnowledgeUsagePieGraphResponse.class);
    }

    /**
     *通过DescribeWorkflowRun接口获取了工作流异步运行的整体内容，其中包含了基本的节点信息，再通过本接口可查看节点的运行详情（包括输入、输出、日志等）。
     * @param req DescribeNodeRunRequest
     * @return DescribeNodeRunResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeRunResponse DescribeNodeRun(DescribeNodeRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeRun", DescribeNodeRunResponse.class);
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
     *查询搜索服务调用折线图
     * @param req DescribeSearchStatsGraphRequest
     * @return DescribeSearchStatsGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchStatsGraphResponse DescribeSearchStatsGraph(DescribeSearchStatsGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchStatsGraph", DescribeSearchStatsGraphResponse.class);
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
     *查询共享知识库。
     * @param req DescribeSharedKnowledgeRequest
     * @return DescribeSharedKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSharedKnowledgeResponse DescribeSharedKnowledge(DescribeSharedKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSharedKnowledge", DescribeSharedKnowledgeResponse.class);
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
     *接口调用token详情
     * @param req DescribeTokenUsageRequest
     * @return DescribeTokenUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenUsageResponse DescribeTokenUsage(DescribeTokenUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenUsage", DescribeTokenUsageResponse.class);
    }

    /**
     *接口调用token折线图
     * @param req DescribeTokenUsageGraphRequest
     * @return DescribeTokenUsageGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenUsageGraphResponse DescribeTokenUsageGraph(DescribeTokenUsageGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenUsageGraph", DescribeTokenUsageGraphResponse.class);
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
     *创建了工作流的异步运行实例后，通过本接口可以查询整体的运行详情。
     * @param req DescribeWorkflowRunRequest
     * @return DescribeWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowRunResponse DescribeWorkflowRun(DescribeWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowRun", DescribeWorkflowRunResponse.class);
    }

    /**
     *导出标签
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
知识库相关背景知识介绍
“知识库检索范围”文档：https://cloud.tencent.com/document/product/1759/112704
“标签”文档：https://cloud.tencent.com/document/product/1759/112956
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
知识库相关背景知识介绍
“知识库检索范围”文档：https://cloud.tencent.com/document/product/1759/112704
“标签”文档：https://cloud.tencent.com/document/product/1759/112956
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
     *获取聊天历史
根据会话session id获取聊天历史（仅保留180天内的历史对话数据）
     * @param req GetMsgRecordRequest
     * @return GetMsgRecordResponse
     * @throws TencentCloudSDKException
     */
    public GetMsgRecordResponse GetMsgRecord(GetMsgRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMsgRecord", GetMsgRecordResponse.class);
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
     *查询自定义变量列表
     * @param req GetVarListRequest
     * @return GetVarListResponse
     * @throws TencentCloudSDKException
     */
    public GetVarListResponse GetVarList(GetVarListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetVarList", GetVarListResponse.class);
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
     *Doc分组
     * @param req GroupDocRequest
     * @return GroupDocResponse
     * @throws TencentCloudSDKException
     */
    public GroupDocResponse GroupDoc(GroupDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupDoc", GroupDocResponse.class);
    }

    /**
     *用户将多个问答批量的分类到知识库的具体分类
知识库相关背景知识介绍
“知识库检索范围”文档：https://cloud.tencent.com/document/product/1759/112704
“标签”文档：https://cloud.tencent.com/document/product/1759/112956
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
     *列表查询知识库容量详情
     * @param req ListAppKnowledgeDetailRequest
     * @return ListAppKnowledgeDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListAppKnowledgeDetailResponse ListAppKnowledgeDetail(ListAppKnowledgeDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAppKnowledgeDetail", ListAppKnowledgeDetailResponse.class);
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
     *获取发布渠道列表
     * @param req ListChannelRequest
     * @return ListChannelResponse
     * @throws TencentCloudSDKException
     */
    public ListChannelResponse ListChannel(ListChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListChannel", ListChannelResponse.class);
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
     *获取Doc分类
     * @param req ListDocCateRequest
     * @return ListDocCateResponse
     * @throws TencentCloudSDKException
     */
    public ListDocCateResponse ListDocCate(ListDocCateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDocCate", ListDocCateResponse.class);
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
知识库相关背景知识介绍
“知识库检索范围”文档：https://cloud.tencent.com/document/product/1759/112704
“标签”文档：https://cloud.tencent.com/document/product/1759/112956
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
知识库相关背景知识介绍
“知识库检索范围”文档：https://cloud.tencent.com/document/product/1759/112704
“标签”文档：https://cloud.tencent.com/document/product/1759/112956
     * @param req ListQACateRequest
     * @return ListQACateResponse
     * @throws TencentCloudSDKException
     */
    public ListQACateResponse ListQACate(ListQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQACate", ListQACateResponse.class);
    }

    /**
     *查看应用引用了哪些共享知识库，可以看到共享知识库的基础信息，包括名称，id等
     * @param req ListReferShareKnowledgeRequest
     * @return ListReferShareKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public ListReferShareKnowledgeResponse ListReferShareKnowledge(ListReferShareKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReferShareKnowledge", ListReferShareKnowledgeResponse.class);
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
     *获取文档下拉列表。
     * @param req ListSelectDocRequest
     * @return ListSelectDocResponse
     * @throws TencentCloudSDKException
     */
    public ListSelectDocResponse ListSelectDoc(ListSelectDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSelectDoc", ListSelectDocResponse.class);
    }

    /**
     *列举共享知识库。
     * @param req ListSharedKnowledgeRequest
     * @return ListSharedKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public ListSharedKnowledgeResponse ListSharedKnowledge(ListSharedKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSharedKnowledge", ListSharedKnowledgeResponse.class);
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
     *列表查询单次调用明细
     * @param req ListUsageCallDetailRequest
     * @return ListUsageCallDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListUsageCallDetailResponse ListUsageCallDetail(ListUsageCallDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUsageCallDetail", ListUsageCallDetailResponse.class);
    }

    /**
     *此接口可查询已创建的所有工作流异步运行实例。
     * @param req ListWorkflowRunsRequest
     * @return ListWorkflowRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowRunsResponse ListWorkflowRuns(ListWorkflowRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowRuns", ListWorkflowRunsResponse.class);
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
     *修改Doc分类
     * @param req ModifyDocCateRequest
     * @return ModifyDocCateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocCateResponse ModifyDocCate(ModifyDocCateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDocCate", ModifyDocCateResponse.class);
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
     *应用引用共享知识库，可以引用一个或多个，每次都是全量覆盖
     * @param req ReferShareKnowledgeRequest
     * @return ReferShareKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public ReferShareKnowledgeResponse ReferShareKnowledge(ReferShareKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReferShareKnowledge", ReferShareKnowledgeResponse.class);
    }

    /**
     *文档重命名
     * @param req RenameDocRequest
     * @return RenameDocResponse
     * @throws TencentCloudSDKException
     */
    public RenameDocResponse RenameDoc(RenameDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameDoc", RenameDocResponse.class);
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
     *知识库文档问答保存。
将文件存储到应用的知识库内需要三步：
1.获取临时密钥，参考[接口文档](https://cloud.tencent.com/document/product/1759/105050)。获取临时密钥不同参数组合权限不一样，可参考 [智能体开发平台操作 cos 指南](https://cloud.tencent.com/document/product/1759/116238)
2.调用腾讯云提供的 cos 存储接口，将文件存储到智能体开发平台 cos 中：具体可参考[ COS SDK 概览](https://cloud.tencent.com/document/product/436/6474), 注意使用的是临时密钥的方式操作 COS 
3.调用本接口，将文件的基础信息存储到智能体开发平台中。
以上步骤可参考[文档](https://cloud.tencent.com/document/product/1759/108903)，文档最后有[代码demo](https://cloud.tencent.com/document/product/1759/108903#demo)，可作为参考。
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
     *此接口用来停止正在进行的工作流异步运行实例。
     * @param req StopWorkflowRunRequest
     * @return StopWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public StopWorkflowRunResponse StopWorkflowRun(StopWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopWorkflowRun", StopWorkflowRunResponse.class);
    }

    /**
     *更新共享知识库。
     * @param req UpdateSharedKnowledgeRequest
     * @return UpdateSharedKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSharedKnowledgeResponse UpdateSharedKnowledge(UpdateSharedKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSharedKnowledge", UpdateSharedKnowledgeResponse.class);
    }

    /**
     *更新变量
     * @param req UpdateVarRequest
     * @return UpdateVarResponse
     * @throws TencentCloudSDKException
     */
    public UpdateVarResponse UpdateVar(UpdateVarRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateVar", UpdateVarResponse.class);
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
知识库相关背景知识介绍
“知识库检索范围”文档：https://cloud.tencent.com/document/product/1759/112704
“标签”文档：https://cloud.tencent.com/document/product/1759/112956
     * @param req VerifyQARequest
     * @return VerifyQAResponse
     * @throws TencentCloudSDKException
     */
    public VerifyQAResponse VerifyQA(VerifyQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyQA", VerifyQAResponse.class);
    }

}
