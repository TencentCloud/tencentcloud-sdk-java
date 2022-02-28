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
    private static String service = "cloudaudit";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAuditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAudit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建跟踪集
     * @param req CreateAuditTrackRequest
     * @return CreateAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditTrackResponse CreateAuditTrack(CreateAuditTrackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAuditTrackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAuditTrackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAuditTrack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAuditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAudit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云审计跟踪集
     * @param req DeleteAuditTrackRequest
     * @return DeleteAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditTrackResponse DeleteAuditTrack(DeleteAuditTrackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAuditTrackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAuditTrackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAuditTrack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAudit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云审计跟踪集列表
     * @param req DescribeAuditTracksRequest
     * @return DescribeAuditTracksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditTracksResponse DescribeAuditTracks(DescribeAuditTracksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuditTracksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuditTracksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuditTracks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云审计日志
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAttributeKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAttributeKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquireAuditCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquireAuditCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAuditsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAudits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListCmqEnableRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListCmqEnableRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListCosEnableRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListCosEnableRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据地域获取KMS密钥别名
     * @param req ListKeyAliasByRegionRequest
     * @return ListKeyAliasByRegionResponse
     * @throws TencentCloudSDKException
     */
    public ListKeyAliasByRegionResponse ListKeyAliasByRegion(ListKeyAliasByRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListKeyAliasByRegionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListKeyAliasByRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListKeyAliasByRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LookUpEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LookUpEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云审计跟踪
     * @param req ModifyAuditTrackRequest
     * @return ModifyAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditTrackResponse ModifyAuditTrack(ModifyAuditTrackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAuditTrackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAuditTrackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAuditTrack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartLoggingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartLogging");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopLoggingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopLogging");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAuditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAudit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
