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
package com.tencentcloudapi.domain.v20180808;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.domain.v20180808.models.*;

public class DomainClient extends AbstractClient{
    private static String endpoint = "domain.tencentcloudapi.com";
    private static String service = "domain";
    private static String version = "2018-08-08";

    public DomainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DomainClient(Credential credential, String region, ClientProfile profile) {
        super(DomainClient.endpoint, DomainClient.version, credential, region, profile);
    }

    /**
     *本接口 ( BatchModifyDomainInfo ) 用于批量域名信息修改 。
     * @param req BatchModifyDomainInfoRequest
     * @return BatchModifyDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyDomainInfoResponse BatchModifyDomainInfo(BatchModifyDomainInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchModifyDomainInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchModifyDomainInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchModifyDomainInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( CheckBatchStatus ) 用于查询批量操作日志状态 。
     * @param req CheckBatchStatusRequest
     * @return CheckBatchStatusResponse
     * @throws TencentCloudSDKException
     */
    public CheckBatchStatusResponse CheckBatchStatus(CheckBatchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBatchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBatchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBatchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查域名是否可以注册。
     * @param req CheckDomainRequest
     * @return CheckDomainResponse
     * @throws TencentCloudSDKException
     */
    public CheckDomainResponse CheckDomain(CheckDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( CreateDomainBatch ) 用于批量域名注册 。
     * @param req CreateDomainBatchRequest
     * @return CreateDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainBatchResponse CreateDomainBatch(CreateDomainBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于创建有效的手机、邮箱
     * @param req CreatePhoneEmailRequest
     * @return CreatePhoneEmailResponse
     * @throws TencentCloudSDKException
     */
    public CreatePhoneEmailResponse CreatePhoneEmail(CreatePhoneEmailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePhoneEmailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePhoneEmailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePhoneEmail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( CreateTemplate ) 用于添加域名信息模板 。
     * @param req CreateTemplateRequest
     * @return CreateTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTemplateResponse CreateTemplate(CreateTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于删除已验证的手机邮箱
     * @param req DeletePhoneEmailRequest
     * @return DeletePhoneEmailResponse
     * @throws TencentCloudSDKException
     */
    public DeletePhoneEmailResponse DeletePhoneEmail(DeletePhoneEmailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePhoneEmailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePhoneEmailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePhoneEmail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( DeleteTemplate ) 用于删除信息模板。
     * @param req DeleteTemplateRequest
     * @return DeleteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTemplateResponse DeleteTemplate(DeleteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( DescribeBatchOperationLogDetails ) 用于获取批量操作日志详情。
     * @param req DescribeBatchOperationLogDetailsRequest
     * @return DescribeBatchOperationLogDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchOperationLogDetailsResponse DescribeBatchOperationLogDetails(DescribeBatchOperationLogDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchOperationLogDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchOperationLogDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchOperationLogDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( DescribeBatchOperationLogs ) 用于获取批量操作日志 。
     * @param req DescribeBatchOperationLogsRequest
     * @return DescribeBatchOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchOperationLogsResponse DescribeBatchOperationLogs(DescribeBatchOperationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchOperationLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchOperationLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchOperationLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (  DescribeDomainBaseInfo) 获取域名基本信息。

     * @param req DescribeDomainBaseInfoRequest
     * @return DescribeDomainBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainBaseInfoResponse DescribeDomainBaseInfo(DescribeDomainBaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainBaseInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainBaseInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainBaseInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (  DescribeDomainNameList ) 我的域名列表。

     * @param req DescribeDomainNameListRequest
     * @return DescribeDomainNameListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainNameListResponse DescribeDomainNameList(DescribeDomainNameListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainNameListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainNameListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainNameList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按照域名后缀获取对应的价格列表
     * @param req DescribeDomainPriceListRequest
     * @return DescribeDomainPriceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainPriceListResponse DescribeDomainPriceList(DescribeDomainPriceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainPriceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainPriceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainPriceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名实名信息详情
     * @param req DescribeDomainSimpleInfoRequest
     * @return DescribeDomainSimpleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainSimpleInfoResponse DescribeDomainSimpleInfo(DescribeDomainSimpleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainSimpleInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainSimpleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainSimpleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取已验证的手机邮箱列表
     * @param req DescribePhoneEmailListRequest
     * @return DescribePhoneEmailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePhoneEmailListResponse DescribePhoneEmailList(DescribePhoneEmailListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePhoneEmailListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePhoneEmailListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePhoneEmailList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeTemplate) 用于获取模板信息。
     * @param req DescribeTemplateRequest
     * @return DescribeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateResponse DescribeTemplate(DescribeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeTemplateList) 用于获取信息模板列表。

     * @param req DescribeTemplateListRequest
     * @return DescribeTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateListResponse DescribeTemplateList(DescribeTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplateListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplateListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplateList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( ModifyDomainDNSBatch) 用于批量域名 DNS 修改 。
     * @param req ModifyDomainDNSBatchRequest
     * @return ModifyDomainDNSBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainDNSBatchResponse ModifyDomainDNSBatch(ModifyDomainDNSBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainDNSBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainDNSBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainDNSBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( ModifyDomainOwnerBatch) 用于域名批量账号间转移 。
     * @param req ModifyDomainOwnerBatchRequest
     * @return ModifyDomainOwnerBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainOwnerBatchResponse ModifyDomainOwnerBatch(ModifyDomainOwnerBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainOwnerBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainOwnerBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainOwnerBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( RenewDomainBatch ) 用于批量续费域名 。

     * @param req RenewDomainBatchRequest
     * @return RenewDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public RenewDomainBatchResponse RenewDomainBatch(RenewDomainBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDomainBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDomainBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewDomainBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于发送手机邮箱验证码。
     * @param req SendPhoneEmailCodeRequest
     * @return SendPhoneEmailCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendPhoneEmailCodeResponse SendPhoneEmailCode(SendPhoneEmailCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendPhoneEmailCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendPhoneEmailCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendPhoneEmailCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( SetDomainAutoRenew ) 用于设置域名自动续费。
     * @param req SetDomainAutoRenewRequest
     * @return SetDomainAutoRenewResponse
     * @throws TencentCloudSDKException
     */
    public SetDomainAutoRenewResponse SetDomainAutoRenew(SetDomainAutoRenewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetDomainAutoRenewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetDomainAutoRenewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetDomainAutoRenew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( TransferInDomainBatch ) 用于批量转入域名 。
     * @param req TransferInDomainBatchRequest
     * @return TransferInDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public TransferInDomainBatchResponse TransferInDomainBatch(TransferInDomainBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransferInDomainBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransferInDomainBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransferInDomainBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( TransferProhibitionBatch ) 用于批量禁止域名转移 。
     * @param req TransferProhibitionBatchRequest
     * @return TransferProhibitionBatchResponse
     * @throws TencentCloudSDKException
     */
    public TransferProhibitionBatchResponse TransferProhibitionBatch(TransferProhibitionBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransferProhibitionBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransferProhibitionBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransferProhibitionBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( UpdateProhibitionBatch ) 用于批量禁止更新锁。
     * @param req UpdateProhibitionBatchRequest
     * @return UpdateProhibitionBatchResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProhibitionBatchResponse UpdateProhibitionBatch(UpdateProhibitionBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateProhibitionBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateProhibitionBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateProhibitionBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( UploadImage ) 用于证件图片上传 。
     * @param req UploadImageRequest
     * @return UploadImageResponse
     * @throws TencentCloudSDKException
     */
    public UploadImageResponse UploadImage(UploadImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
