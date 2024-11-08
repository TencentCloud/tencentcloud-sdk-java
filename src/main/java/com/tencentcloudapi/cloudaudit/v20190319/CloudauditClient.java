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
     *创建操作审计跟踪集
     * @param req CreateAuditTrackRequest
     * @return CreateAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditTrackResponse CreateAuditTrack(CreateAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditTrack", CreateAuditTrackResponse.class);
    }

    /**
     *创建操作审计跟踪集
     * @param req CreateEventsAuditTrackRequest
     * @return CreateEventsAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public CreateEventsAuditTrackResponse CreateEventsAuditTrack(CreateEventsAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEventsAuditTrack", CreateEventsAuditTrackResponse.class);
    }

    /**
     *删除操作审计跟踪集
     * @param req DeleteAuditTrackRequest
     * @return DeleteAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditTrackResponse DeleteAuditTrack(DeleteAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditTrack", DeleteAuditTrackResponse.class);
    }

    /**
     *查询跟踪集详情
     * @param req DescribeAuditRequest
     * @return DescribeAuditResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditResponse DescribeAudit(DescribeAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAudit", DescribeAuditResponse.class);
    }

    /**
     *查询操作审计跟踪集详情
     * @param req DescribeAuditTrackRequest
     * @return DescribeAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditTrackResponse DescribeAuditTrack(DescribeAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditTrack", DescribeAuditTrackResponse.class);
    }

    /**
     *查询操作审计跟踪集列表
     * @param req DescribeAuditTracksRequest
     * @return DescribeAuditTracksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditTracksResponse DescribeAuditTracks(DescribeAuditTracksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditTracks", DescribeAuditTracksResponse.class);
    }

    /**
     *查询操作审计日志
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvents", DescribeEventsResponse.class);
    }

    /**
     *查询AttributeKey的有效取值范围
     * @param req GetAttributeKeyRequest
     * @return GetAttributeKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetAttributeKeyResponse GetAttributeKey(GetAttributeKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAttributeKey", GetAttributeKeyResponse.class);
    }

    /**
     *查询用户可创建跟踪集的数量
     * @param req InquireAuditCreditRequest
     * @return InquireAuditCreditResponse
     * @throws TencentCloudSDKException
     */
    public InquireAuditCreditResponse InquireAuditCredit(InquireAuditCreditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquireAuditCredit", InquireAuditCreditResponse.class);
    }

    /**
     *查询跟踪集概要
     * @param req ListAuditsRequest
     * @return ListAuditsResponse
     * @throws TencentCloudSDKException
     */
    public ListAuditsResponse ListAudits(ListAuditsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAudits", ListAuditsResponse.class);
    }

    /**
     *查询操作审计支持的cmq的可用区
     * @param req ListCmqEnableRegionRequest
     * @return ListCmqEnableRegionResponse
     * @throws TencentCloudSDKException
     */
    public ListCmqEnableRegionResponse ListCmqEnableRegion(ListCmqEnableRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCmqEnableRegion", ListCmqEnableRegionResponse.class);
    }

    /**
     *查询操作审计支持的cos可用区
     * @param req ListCosEnableRegionRequest
     * @return ListCosEnableRegionResponse
     * @throws TencentCloudSDKException
     */
    public ListCosEnableRegionResponse ListCosEnableRegion(ListCosEnableRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCosEnableRegion", ListCosEnableRegionResponse.class);
    }

    /**
     *根据地域获取KMS密钥别名
     * @param req ListKeyAliasByRegionRequest
     * @return ListKeyAliasByRegionResponse
     * @throws TencentCloudSDKException
     */
    public ListKeyAliasByRegionResponse ListKeyAliasByRegion(ListKeyAliasByRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListKeyAliasByRegion", ListKeyAliasByRegionResponse.class);
    }

    /**
     *用于对操作日志进行检索，便于用户进行查询相关的操作信息。
     * @param req LookUpEventsRequest
     * @return LookUpEventsResponse
     * @throws TencentCloudSDKException
     */
    public LookUpEventsResponse LookUpEvents(LookUpEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LookUpEvents", LookUpEventsResponse.class);
    }

    /**
     *修改操作审计跟踪集
     * @param req ModifyAuditTrackRequest
     * @return ModifyAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditTrackResponse ModifyAuditTrack(ModifyAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditTrack", ModifyAuditTrackResponse.class);
    }

    /**
     *修改操作审计跟踪集
     * @param req ModifyEventsAuditTrackRequest
     * @return ModifyEventsAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEventsAuditTrackResponse ModifyEventsAuditTrack(ModifyEventsAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEventsAuditTrack", ModifyEventsAuditTrackResponse.class);
    }

    /**
     *开启跟踪集
     * @param req StartLoggingRequest
     * @return StartLoggingResponse
     * @throws TencentCloudSDKException
     */
    public StartLoggingResponse StartLogging(StartLoggingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartLogging", StartLoggingResponse.class);
    }

    /**
     *关闭跟踪集
     * @param req StopLoggingRequest
     * @return StopLoggingResponse
     * @throws TencentCloudSDKException
     */
    public StopLoggingResponse StopLogging(StopLoggingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopLogging", StopLoggingResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAudit", UpdateAuditResponse.class);
    }

}
