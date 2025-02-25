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
package com.tencentcloudapi.ccc.v20200210;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ccc.v20200210.models.*;

public class CccClient extends AbstractClient{
    private static String endpoint = "ccc.tencentcloudapi.com";
    private static String service = "ccc";
    private static String version = "2020-02-10";
    
    public CccClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CccClient(Credential credential, String region, ClientProfile profile) {
        super(CccClient.endpoint, CccClient.version, credential, region, profile);
    }

    /**
     *停止预测式外呼任务
     * @param req AbortPredictiveDialingCampaignRequest
     * @return AbortPredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public AbortPredictiveDialingCampaignResponse AbortPredictiveDialingCampaign(AbortPredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortPredictiveDialingCampaign", AbortPredictiveDialingCampaignResponse.class);
    }

    /**
     *绑定号码外呼技能组
     * @param req BindNumberCallOutSkillGroupRequest
     * @return BindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindNumberCallOutSkillGroupResponse BindNumberCallOutSkillGroup(BindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindNumberCallOutSkillGroup", BindNumberCallOutSkillGroupResponse.class);
    }

    /**
     *绑定座席所属技能组
     * @param req BindStaffSkillGroupListRequest
     * @return BindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public BindStaffSkillGroupListResponse BindStaffSkillGroupList(BindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindStaffSkillGroupList", BindStaffSkillGroupListResponse.class);
    }

    /**
     *用于调用AI模型发起外呼通话，仅限自有电话号码使用，目前开通高级版座席**限时**免费体验。

发起通话前，请先确认您的AI模型是否兼容 OpenAI、Azure 或 Minimax 协议，并前往模型服务商网站获取相关鉴权信息。 具体功能说明请参考文档 [腾讯云联络中心AI通话平台](https://cloud.tencent.com/document/product/679/112100)。
     * @param req CreateAIAgentCallRequest
     * @return CreateAIAgentCallResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIAgentCallResponse CreateAIAgentCall(CreateAIAgentCallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIAgentCall", CreateAIAgentCallResponse.class);
    }

    /**
     *用于调用AI模型发起外呼通话，仅限自有电话号码使用，目前开通高级版座席**限时**免费体验。

发起通话前，请先确认您的AI模型是否兼容 OpenAI、Azure 或 Minimax 协议，并前往模型服务商网站获取相关鉴权信息。 具体功能说明请参考文档 [腾讯云联络中心AI通话平台](https://cloud.tencent.com/document/product/679/112100)。
     * @param req CreateAICallRequest
     * @return CreateAICallResponse
     * @throws TencentCloudSDKException
     */
    public CreateAICallResponse CreateAICall(CreateAICallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAICall", CreateAICallResponse.class);
    }

    /**
     *创建管理端访问链接
     * @param req CreateAdminURLRequest
     * @return CreateAdminURLResponse
     * @throws TencentCloudSDKException
     */
    public CreateAdminURLResponse CreateAdminURL(CreateAdminURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAdminURL", CreateAdminURLResponse.class);
    }

    /**
     *创建自动外呼任务
     * @param req CreateAutoCalloutTaskRequest
     * @return CreateAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoCalloutTaskResponse CreateAutoCalloutTask(CreateAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoCalloutTask", CreateAutoCalloutTaskResponse.class);
    }

    /**
     *新建技能组
     * @param req CreateCCCSkillGroupRequest
     * @return CreateCCCSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCCSkillGroupResponse CreateCCCSkillGroup(CreateCCCSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCCCSkillGroup", CreateCCCSkillGroupResponse.class);
    }

    /**
     *创建外呼会话，当前仅支持双呼，即先使用平台号码呼出到座席手机上，座席接听后，然后再外呼用户，而且由于运营商频率限制，座席手机号必须先加白名单，避免频控导致外呼失败。所以调用此接口前，下述操作均已完成
1. UserId 指定的座席已经[绑定手机号](https://cloud.tencent.com/document/product/679/76067#.E6.AD.A5.E9.AA.A42.EF.BC.9A.E5.AE.8C.E5.96.84.E8.B4.A6.E5.8F.B7.E4.BF.A1.E6.81.AF)
2. 座席绑定的手机号已经[申请并通过了外呼白名单](https://cloud.tencent.com/document/product/679/76744#.E6.93.8D.E4.BD.9C.E6.AD.A5.E9.AA.A4)
3. 当前座席侧只能呼叫其手机，所以 IsForceMobile 字段当前必须为 true
4. 被叫不要填当前 UserId 所绑定的手机号，否则会造成占线呼叫失败
     * @param req CreateCallOutSessionRequest
     * @return CreateCallOutSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCallOutSessionResponse CreateCallOutSession(CreateCallOutSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCallOutSession", CreateCallOutSessionResponse.class);
    }

    /**
     *用于无限频率地呼叫坐席手机
     * @param req CreateCarrierPrivilegeNumberApplicantRequest
     * @return CreateCarrierPrivilegeNumberApplicantResponse
     * @throws TencentCloudSDKException
     */
    public CreateCarrierPrivilegeNumberApplicantResponse CreateCarrierPrivilegeNumberApplicant(CreateCarrierPrivilegeNumberApplicantRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCarrierPrivilegeNumberApplicant", CreateCarrierPrivilegeNumberApplicantResponse.class);
    }

    /**
     *创建公司资质申请（1、首次使用接口，建议先在云联络中心控制台查看各个资料模板:https://console.cloud.tencent.com/ccc/enterprise/update。2、参数中图片Url建议使用腾讯云Cos存储的临时链接）
     * @param req CreateCompanyApplyRequest
     * @return CreateCompanyApplyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCompanyApplyResponse CreateCompanyApply(CreateCompanyApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCompanyApply", CreateCompanyApplyResponse.class);
    }

    /**
     *创建话机账号
     * @param req CreateExtensionRequest
     * @return CreateExtensionResponse
     * @throws TencentCloudSDKException
     */
    public CreateExtensionResponse CreateExtension(CreateExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExtension", CreateExtensionResponse.class);
    }

    /**
     *创建关联 IVR 的会话，仅高级版支持，目前支持呼入和自动外呼两种 IVR 类型。收到请求后 TCCC 会先尝试呼通被叫，然后进入 IVR 流程。
     * @param req CreateIVRSessionRequest
     * @return CreateIVRSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateIVRSessionResponse CreateIVRSession(CreateIVRSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIVRSession", CreateIVRSessionResponse.class);
    }

    /**
     *创建客户自携号码接入审核
     * @param req CreateOwnNumberApplyRequest
     * @return CreateOwnNumberApplyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOwnNumberApplyResponse CreateOwnNumberApply(CreateOwnNumberApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOwnNumberApply", CreateOwnNumberApplyResponse.class);
    }

    /**
     *创建预测式外呼任务
     * @param req CreatePredictiveDialingCampaignRequest
     * @return CreatePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public CreatePredictiveDialingCampaignResponse CreatePredictiveDialingCampaign(CreatePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePredictiveDialingCampaign", CreatePredictiveDialingCampaignResponse.class);
    }

    /**
     *创建 SDK 登录 Token。
     * @param req CreateSDKLoginTokenRequest
     * @return CreateSDKLoginTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateSDKLoginTokenResponse CreateSDKLoginToken(CreateSDKLoginTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSDKLoginToken", CreateSDKLoginTokenResponse.class);
    }

    /**
     *创建客服账号。
     * @param req CreateStaffRequest
     * @return CreateStaffResponse
     * @throws TencentCloudSDKException
     */
    public CreateStaffResponse CreateStaff(CreateStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStaff", CreateStaffResponse.class);
    }

    /**
     *创建用户数据签名
     * @param req CreateUserSigRequest
     * @return CreateUserSigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSigResponse CreateUserSig(CreateUserSigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserSig", CreateUserSigResponse.class);
    }

    /**
     *删除话机账号
     * @param req DeleteExtensionRequest
     * @return DeleteExtensionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExtensionResponse DeleteExtension(DeleteExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExtension", DeleteExtensionResponse.class);
    }

    /**
     *删除预测式外呼任务
     * @param req DeletePredictiveDialingCampaignRequest
     * @return DeletePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public DeletePredictiveDialingCampaignResponse DeletePredictiveDialingCampaign(DeletePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePredictiveDialingCampaign", DeletePredictiveDialingCampaignResponse.class);
    }

    /**
     *删除坐席信息
     * @param req DeleteStaffRequest
     * @return DeleteStaffResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStaffResponse DeleteStaff(DeleteStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStaff", DeleteStaffResponse.class);
    }

    /**
     *获取 AI 通话内容提取结果。
     * @param req DescribeAICallExtractResultRequest
     * @return DescribeAICallExtractResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAICallExtractResultResponse DescribeAICallExtractResult(DescribeAICallExtractResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAICallExtractResult", DescribeAICallExtractResultResponse.class);
    }

    /**
     *查询生效运营商白名单规则
     * @param req DescribeActiveCarrierPrivilegeNumberRequest
     * @return DescribeActiveCarrierPrivilegeNumberResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActiveCarrierPrivilegeNumberResponse DescribeActiveCarrierPrivilegeNumber(DescribeActiveCarrierPrivilegeNumberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActiveCarrierPrivilegeNumber", DescribeActiveCarrierPrivilegeNumberResponse.class);
    }

    /**
     *查询自动外呼任务详情
     * @param req DescribeAutoCalloutTaskRequest
     * @return DescribeAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoCalloutTaskResponse DescribeAutoCalloutTask(DescribeAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoCalloutTask", DescribeAutoCalloutTaskResponse.class);
    }

    /**
     *批量查询自动外呼任务
     * @param req DescribeAutoCalloutTasksRequest
     * @return DescribeAutoCalloutTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoCalloutTasksResponse DescribeAutoCalloutTasks(DescribeAutoCalloutTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoCalloutTasks", DescribeAutoCalloutTasksResponse.class);
    }

    /**
     *获取用户购买信息列表
     * @param req DescribeCCCBuyInfoListRequest
     * @return DescribeCCCBuyInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCCBuyInfoListResponse DescribeCCCBuyInfoList(DescribeCCCBuyInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCCBuyInfoList", DescribeCCCBuyInfoListResponse.class);
    }

    /**
     *获取呼入实时数据统计指标
     * @param req DescribeCallInMetricsRequest
     * @return DescribeCallInMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallInMetricsResponse DescribeCallInMetrics(DescribeCallInMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallInMetrics", DescribeCallInMetricsResponse.class);
    }

    /**
     *查询单状态
     * @param req DescribeCarrierPrivilegeNumberApplicantsRequest
     * @return DescribeCarrierPrivilegeNumberApplicantsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCarrierPrivilegeNumberApplicantsResponse DescribeCarrierPrivilegeNumberApplicants(DescribeCarrierPrivilegeNumberApplicantsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCarrierPrivilegeNumberApplicants", DescribeCarrierPrivilegeNumberApplicantsResponse.class);
    }

    /**
     *获取指定服务记录文本聊天内容，需要先使用查询在线客服记录（DescribeIMCdrs） API 获取服务记录 SessionId。

文本聊天记录只保存了 1 年内的，1 年之前会自动清理。
     * @param req DescribeChatMessagesRequest
     * @return DescribeChatMessagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChatMessagesResponse DescribeChatMessages(DescribeChatMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChatMessages", DescribeChatMessagesResponse.class);
    }

    /**
     *查询公司资质申请列表
     * @param req DescribeCompanyListRequest
     * @return DescribeCompanyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompanyListResponse DescribeCompanyList(DescribeCompanyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompanyList", DescribeCompanyListResponse.class);
    }

    /**
     *获取话机信息
     * @param req DescribeExtensionRequest
     * @return DescribeExtensionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionResponse DescribeExtension(DescribeExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtension", DescribeExtensionResponse.class);
    }

    /**
     *查询话机列表信息
     * @param req DescribeExtensionsRequest
     * @return DescribeExtensionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionsResponse DescribeExtensions(DescribeExtensionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtensions", DescribeExtensionsResponse.class);
    }

    /**
     *获取包括全媒体和文本会话两种类型的服务记录。
     * @param req DescribeIMCdrListRequest
     * @return DescribeIMCdrListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMCdrListResponse DescribeIMCdrList(DescribeIMCdrListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIMCdrList", DescribeIMCdrListResponse.class);
    }

    /**
     *获取包括全媒体和文本会话两种类型的服务记录。
     * @param req DescribeIMCdrsRequest
     * @return DescribeIMCdrsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMCdrsResponse DescribeIMCdrs(DescribeIMCdrsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIMCdrs", DescribeIMCdrsResponse.class);
    }

    /**
     *查询IVR音频文件列表信息
     * @param req DescribeIvrAudioListRequest
     * @return DescribeIvrAudioListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIvrAudioListResponse DescribeIvrAudioList(DescribeIvrAudioListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIvrAudioList", DescribeIvrAudioListResponse.class);
    }

    /**
     *查询号码列表
     * @param req DescribeNumbersRequest
     * @return DescribeNumbersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNumbersResponse DescribeNumbers(DescribeNumbersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNumbers", DescribeNumbersResponse.class);
    }

    /**
     *获取当前正在通话的会话列表
     * @param req DescribePSTNActiveSessionListRequest
     * @return DescribePSTNActiveSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePSTNActiveSessionListResponse DescribePSTNActiveSessionList(DescribePSTNActiveSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePSTNActiveSessionList", DescribePSTNActiveSessionListResponse.class);
    }

    /**
     *查询预测式外呼任务
     * @param req DescribePredictiveDialingCampaignRequest
     * @return DescribePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public DescribePredictiveDialingCampaignResponse DescribePredictiveDialingCampaign(DescribePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePredictiveDialingCampaign", DescribePredictiveDialingCampaignResponse.class);
    }

    /**
     *查询预测式外呼任务列表
     * @param req DescribePredictiveDialingCampaignsRequest
     * @return DescribePredictiveDialingCampaignsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePredictiveDialingCampaignsResponse DescribePredictiveDialingCampaigns(DescribePredictiveDialingCampaignsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePredictiveDialingCampaigns", DescribePredictiveDialingCampaignsResponse.class);
    }

    /**
     *查询预测式外呼呼叫列表
     * @param req DescribePredictiveDialingSessionsRequest
     * @return DescribePredictiveDialingSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePredictiveDialingSessionsResponse DescribePredictiveDialingSessions(DescribePredictiveDialingSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePredictiveDialingSessions", DescribePredictiveDialingSessionsResponse.class);
    }

    /**
     *获取主被叫受保护的电话服务记录与录音
     * @param req DescribeProtectedTelCdrRequest
     * @return DescribeProtectedTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectedTelCdrResponse DescribeProtectedTelCdr(DescribeProtectedTelCdrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectedTelCdr", DescribeProtectedTelCdrResponse.class);
    }

    /**
     *获取技能组信息列表
     * @param req DescribeSkillGroupInfoListRequest
     * @return DescribeSkillGroupInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillGroupInfoListResponse DescribeSkillGroupInfoList(DescribeSkillGroupInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillGroupInfoList", DescribeSkillGroupInfoListResponse.class);
    }

    /**
     *获取坐席信息列表
     * @param req DescribeStaffInfoListRequest
     * @return DescribeStaffInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffInfoListResponse DescribeStaffInfoList(DescribeStaffInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStaffInfoList", DescribeStaffInfoListResponse.class);
    }

    /**
     *获取坐席实时状态统计指标
     * @param req DescribeStaffStatusMetricsRequest
     * @return DescribeStaffStatusMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffStatusMetricsResponse DescribeStaffStatusMetrics(DescribeStaffStatusMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStaffStatusMetrics", DescribeStaffStatusMetricsResponse.class);
    }

    /**
     *按实例获取电话消耗统计
     * @param req DescribeTelCallInfoRequest
     * @return DescribeTelCallInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCallInfoResponse DescribeTelCallInfo(DescribeTelCallInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelCallInfo", DescribeTelCallInfoResponse.class);
    }

    /**
     *获取电话服务记录与录音
     * @param req DescribeTelCdrRequest
     * @return DescribeTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCdrResponse DescribeTelCdr(DescribeTelCdrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelCdr", DescribeTelCdrResponse.class);
    }

    /**
     *拉取会话录音转文本信息
     * @param req DescribeTelRecordAsrRequest
     * @return DescribeTelRecordAsrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelRecordAsrResponse DescribeTelRecordAsr(DescribeTelRecordAsrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelRecordAsr", DescribeTelRecordAsrResponse.class);
    }

    /**
     *获取 PSTN 会话信息
     * @param req DescribeTelSessionRequest
     * @return DescribeTelSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelSessionResponse DescribeTelSession(DescribeTelSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelSession", DescribeTelSessionResponse.class);
    }

    /**
     *停用号码
     * @param req DisableCCCPhoneNumberRequest
     * @return DisableCCCPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public DisableCCCPhoneNumberResponse DisableCCCPhoneNumber(DisableCCCPhoneNumberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableCCCPhoneNumber", DisableCCCPhoneNumberResponse.class);
    }

    /**
     *挂断电话
     * @param req HangUpCallRequest
     * @return HangUpCallResponse
     * @throws TencentCloudSDKException
     */
    public HangUpCallResponse HangUpCall(HangUpCallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HangUpCall", HangUpCallResponse.class);
    }

    /**
     *修改公司资质申请，只能修改状态为驳回或待审核的申请单。（1、首次使用接口，建议先在云联络中心控制台查看各个资料模板:https://console.cloud.tencent.com/ccc/enterprise/update。2、参数中图片Url建议使用腾讯云Cos存储的临时链接）
     * @param req ModifyCompanyApplyRequest
     * @return ModifyCompanyApplyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompanyApplyResponse ModifyCompanyApply(ModifyCompanyApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCompanyApply", ModifyCompanyApplyResponse.class);
    }

    /**
     *修改话机账号(绑定技能组、绑定坐席账号)
     * @param req ModifyExtensionRequest
     * @return ModifyExtensionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExtensionResponse ModifyExtension(ModifyExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExtension", ModifyExtensionResponse.class);
    }

    /**
     *修改客户自携号码审批单
     * @param req ModifyOwnNumberApplyRequest
     * @return ModifyOwnNumberApplyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOwnNumberApplyResponse ModifyOwnNumberApply(ModifyOwnNumberApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOwnNumberApply", ModifyOwnNumberApplyResponse.class);
    }

    /**
     *修改客服账号
     * @param req ModifyStaffRequest
     * @return ModifyStaffResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStaffResponse ModifyStaff(ModifyStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStaff", ModifyStaffResponse.class);
    }

    /**
     *修改座席的密码
     * @param req ModifyStaffPasswordRequest
     * @return ModifyStaffPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStaffPasswordResponse ModifyStaffPassword(ModifyStaffPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStaffPassword", ModifyStaffPasswordResponse.class);
    }

    /**
     *暂停预测式外呼任务
     * @param req PausePredictiveDialingCampaignRequest
     * @return PausePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public PausePredictiveDialingCampaignResponse PausePredictiveDialingCampaign(PausePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PausePredictiveDialingCampaign", PausePredictiveDialingCampaignResponse.class);
    }

    /**
     *重置话机注册密码
     * @param req ResetExtensionPasswordRequest
     * @return ResetExtensionPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetExtensionPasswordResponse ResetExtensionPassword(ResetExtensionPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetExtensionPassword", ResetExtensionPasswordResponse.class);
    }

    /**
     *恢复预测式外呼任务
     * @param req ResumePredictiveDialingCampaignRequest
     * @return ResumePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public ResumePredictiveDialingCampaignResponse ResumePredictiveDialingCampaign(ResumePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumePredictiveDialingCampaign", ResumePredictiveDialingCampaignResponse.class);
    }

    /**
     *停止自动外呼任务
     * @param req StopAutoCalloutTaskRequest
     * @return StopAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopAutoCalloutTaskResponse StopAutoCalloutTask(StopAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAutoCalloutTask", StopAutoCalloutTaskResponse.class);
    }

    /**
     *解绑号码外呼技能组
     * @param req UnbindNumberCallOutSkillGroupRequest
     * @return UnbindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public UnbindNumberCallOutSkillGroupResponse UnbindNumberCallOutSkillGroup(UnbindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindNumberCallOutSkillGroup", UnbindNumberCallOutSkillGroupResponse.class);
    }

    /**
     *解绑坐席所属技能组
     * @param req UnbindStaffSkillGroupListRequest
     * @return UnbindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public UnbindStaffSkillGroupListResponse UnbindStaffSkillGroupList(UnbindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindStaffSkillGroupList", UnbindStaffSkillGroupListResponse.class);
    }

    /**
     *更新技能组
     * @param req UpdateCCCSkillGroupRequest
     * @return UpdateCCCSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCCCSkillGroupResponse UpdateCCCSkillGroup(UpdateCCCSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCCCSkillGroup", UpdateCCCSkillGroupResponse.class);
    }

    /**
     *任务未启动前，更新预测式外呼任务。
     * @param req UpdatePredictiveDialingCampaignRequest
     * @return UpdatePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePredictiveDialingCampaignResponse UpdatePredictiveDialingCampaign(UpdatePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePredictiveDialingCampaign", UpdatePredictiveDialingCampaignResponse.class);
    }

    /**
     *上传IVR中使用的音频文件，每日上传文件限制50个。（参数中音频文件Url建议使用腾讯云Cos存储的临时链接）
     * @param req UploadIvrAudioRequest
     * @return UploadIvrAudioResponse
     * @throws TencentCloudSDKException
     */
    public UploadIvrAudioResponse UploadIvrAudio(UploadIvrAudioRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadIvrAudio", UploadIvrAudioResponse.class);
    }

}
