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
package com.tencentcloudapi.cloudaudit.v20190319;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudaudit.v20190319.models.*;

public class CloudauditClient extends AbstractClient{
    private static String endpoint = "cloudaudit.tencentcloudapi.com";
    private static String version = "2019-03-19";

    public CloudauditClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudauditClient(Credential credential, String region, ClientProfile profile) {
        super(CloudauditClient.endpoint, CloudauditClient.version, credential, region, profile);
    }

    /**
     *参数要求：
1、如果IsCreateNewBucket的值存在的话，cosRegion和cosBucketName都是必填参数。
2、如果IsEnableCmqNotify的值是1的话，IsCreateNewQueue、CmqRegion和CmqQueueName都是必填参数。
3、如果IsEnableCmqNotify的值是0的话，IsCreateNewQueue、CmqRegion和CmqQueueName都不能传。
4、如果IsEnableKmsEncry的值是1的话，KmsRegion和KeyId属于必填项
     * @param req CreateAuditRequest
     * @return CreateAuditResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditResponse CreateAudit(CreateAuditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAuditResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAuditResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAudit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除跟踪集
     * @param req DeleteAuditRequest
     * @return DeleteAuditResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditResponse DeleteAudit(DeleteAuditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAuditResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAuditResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAudit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询跟踪集详情
     * @param req DescribeAuditRequest
     * @return DescribeAuditResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditResponse DescribeAudit(DescribeAuditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuditResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuditResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAudit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询AttributeKey的有效取值范围
     * @param req GetAttributeKeyRequest
     * @return GetAttributeKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetAttributeKeyResponse GetAttributeKey(GetAttributeKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAttributeKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetAttributeKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetAttributeKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户可创建跟踪集的数量
     * @param req InquireAuditCreditRequest
     * @return InquireAuditCreditResponse
     * @throws TencentCloudSDKException
     */
    public InquireAuditCreditResponse InquireAuditCredit(InquireAuditCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquireAuditCreditResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquireAuditCreditResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquireAuditCredit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询跟踪集概要
     * @param req ListAuditsRequest
     * @return ListAuditsResponse
     * @throws TencentCloudSDKException
     */
    public ListAuditsResponse ListAudits(ListAuditsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuditsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAuditsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAudits"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云审计支持的cmq的可用区
     * @param req ListCmqEnableRegionRequest
     * @return ListCmqEnableRegionResponse
     * @throws TencentCloudSDKException
     */
    public ListCmqEnableRegionResponse ListCmqEnableRegion(ListCmqEnableRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListCmqEnableRegionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListCmqEnableRegionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListCmqEnableRegion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云审计支持的cos可用区
     * @param req ListCosEnableRegionRequest
     * @return ListCosEnableRegionResponse
     * @throws TencentCloudSDKException
     */
    public ListCosEnableRegionResponse ListCosEnableRegion(ListCosEnableRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListCosEnableRegionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListCosEnableRegionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListCosEnableRegion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对操作日志进行检索，便于用户进行查询相关的操作信息。
     * @param req LookUpEventsRequest
     * @return LookUpEventsResponse
     * @throws TencentCloudSDKException
     */
    public LookUpEventsResponse LookUpEvents(LookUpEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LookUpEventsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<LookUpEventsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "LookUpEvents"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启跟踪集
     * @param req StartLoggingRequest
     * @return StartLoggingResponse
     * @throws TencentCloudSDKException
     */
    public StartLoggingResponse StartLogging(StartLoggingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartLoggingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartLoggingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartLogging"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关闭跟踪集
     * @param req StopLoggingRequest
     * @return StopLoggingResponse
     * @throws TencentCloudSDKException
     */
    public StopLoggingResponse StopLogging(StopLoggingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopLoggingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopLoggingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopLogging"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *参数要求：
1、如果IsCreateNewBucket的值存在的话，cosRegion和cosBucketName都是必填参数。
2、如果IsEnableCmqNotify的值是1的话，IsCreateNewQueue、CmqRegion和CmqQueueName都是必填参数。
3、如果IsEnableCmqNotify的值是0的话，IsCreateNewQueue、CmqRegion和CmqQueueName都不能传。
4、如果IsEnableKmsEncry的值是1的话，KmsRegion和KeyId属于必填项
     * @param req UpdateAuditRequest
     * @return UpdateAuditResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAuditResponse UpdateAudit(UpdateAuditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAuditResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAuditResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateAudit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
