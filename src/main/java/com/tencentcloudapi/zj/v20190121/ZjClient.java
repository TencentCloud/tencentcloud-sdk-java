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
package com.tencentcloudapi.zj.v20190121;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.zj.v20190121.models.*;

public class ZjClient extends AbstractClient{
    private static String endpoint = "zj.tencentcloudapi.com";
    private static String service = "zj";
    private static String version = "2019-01-21";

    public ZjClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ZjClient(Credential credential, String region, ClientProfile profile) {
        super(ZjClient.endpoint, ZjClient.version, credential, region, profile);
    }

    /**
     *添加短信人群包信息
     * @param req AddCrowdPackInfoRequest
     * @return AddCrowdPackInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddCrowdPackInfoResponse AddCrowdPackInfo(AddCrowdPackInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCrowdPackInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddCrowdPackInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCrowdPackInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建普通短信签名信息
     * @param req AddSmsSignRequest
     * @return AddSmsSignResponse
     * @throws TencentCloudSDKException
     */
    public AddSmsSignResponse AddSmsSign(AddSmsSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSmsSignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddSmsSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddSmsSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据短信标题、模板内容等创建短信模板
     * @param req AddSmsTemplateRequest
     * @return AddSmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddSmsTemplateResponse AddSmsTemplate(AddSmsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSmsTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddSmsTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddSmsTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消短信推送活动
     * @param req CancelCampaignRequest
     * @return CancelCampaignResponse
     * @throws TencentCloudSDKException
     */
    public CancelCampaignResponse CancelCampaign(CancelCampaignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelCampaignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelCampaignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelCampaign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建短信推送活动
     * @param req CreateCampaignRequest
     * @return CreateCampaignResponse
     * @throws TencentCloudSDKException
     */
    public CreateCampaignResponse CreateCampaign(CreateCampaignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCampaignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCampaignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCampaign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建超级短信的素材样例内容
     * @param req CreateMmsInstanceRequest
     * @return CreateMmsInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMmsInstanceResponse CreateMmsInstance(CreateMmsInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMmsInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMmsInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMmsInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除人群包
     * @param req DelCrowdPackRequest
     * @return DelCrowdPackResponse
     * @throws TencentCloudSDKException
     */
    public DelCrowdPackResponse DelCrowdPack(DelCrowdPackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DelCrowdPackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DelCrowdPackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DelCrowdPack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除短信模板
     * @param req DelTemplateRequest
     * @return DelTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DelTemplateResponse DelTemplate(DelTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DelTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DelTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DelTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除超级短信样例
     * @param req DeleteMmsInstanceRequest
     * @return DeleteMmsInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMmsInstanceResponse DeleteMmsInstance(DeleteMmsInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMmsInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMmsInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMmsInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取彩信实例信息
     * @param req DescribeMmsInstanceInfoRequest
     * @return DescribeMmsInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMmsInstanceInfoResponse DescribeMmsInstanceInfo(DescribeMmsInstanceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMmsInstanceInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMmsInstanceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMmsInstanceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取彩信实例列表
     * @param req DescribeMmsInstanceListRequest
     * @return DescribeMmsInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMmsInstanceListResponse DescribeMmsInstanceList(DescribeMmsInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMmsInstanceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMmsInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMmsInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取短信超短活动统计数据
     * @param req DescribeSmsCampaignStatisticsRequest
     * @return DescribeSmsCampaignStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsCampaignStatisticsResponse DescribeSmsCampaignStatistics(DescribeSmsCampaignStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmsCampaignStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmsCampaignStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmsCampaignStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取普通短信签名信息
     * @param req DescribeSmsSignListRequest
     * @return DescribeSmsSignListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsSignListResponse DescribeSmsSignList(DescribeSmsSignListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmsSignListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmsSignListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmsSignList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取模板信息
     * @param req DescribeSmsTemplateListRequest
     * @return DescribeSmsTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsTemplateListResponse DescribeSmsTemplateList(DescribeSmsTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmsTemplateListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmsTemplateListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmsTemplateList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取人群包列表接口
     * @param req GetCrowdPackListRequest
     * @return GetCrowdPackListResponse
     * @throws TencentCloudSDKException
     */
    public GetCrowdPackListResponse GetCrowdPackList(GetCrowdPackListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCrowdPackListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCrowdPackListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCrowdPackList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取短信人群包cos上传需要的信息
     * @param req GetCrowdUploadInfoRequest
     * @return GetCrowdUploadInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetCrowdUploadInfoResponse GetCrowdUploadInfo(GetCrowdUploadInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCrowdUploadInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCrowdUploadInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCrowdUploadInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取账号短信额度配置信息
     * @param req GetSmsAmountInfoRequest
     * @return GetSmsAmountInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetSmsAmountInfoResponse GetSmsAmountInfo(GetSmsAmountInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSmsAmountInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSmsAmountInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSmsAmountInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取短信活动状态信息
     * @param req GetSmsCampaignStatusRequest
     * @return GetSmsCampaignStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetSmsCampaignStatusResponse GetSmsCampaignStatus(GetSmsCampaignStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSmsCampaignStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSmsCampaignStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSmsCampaignStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对未审核或者审核未通过的短信模板内容进行编辑修改
     * @param req ModifySmsTemplateRequest
     * @return ModifySmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySmsTemplateResponse ModifySmsTemplate(ModifySmsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySmsTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySmsTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySmsTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *推送超级短信
     * @param req PushMmsContentRequest
     * @return PushMmsContentResponse
     * @throws TencentCloudSDKException
     */
    public PushMmsContentResponse PushMmsContent(PushMmsContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PushMmsContentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PushMmsContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PushMmsContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送短信
     * @param req SendSmsRequest
     * @return SendSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsResponse SendSms(SendSmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendSmsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendSmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendSms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
