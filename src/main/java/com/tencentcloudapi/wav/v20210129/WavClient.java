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
package com.tencentcloudapi.wav.v20210129;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wav.v20210129.models.*;

public class WavClient extends AbstractClient{
    private static String endpoint = "wav.tencentcloudapi.com";
    private static String service = "wav";
    private static String version = "2021-01-29";

    public WavClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WavClient(Credential credential, String region, ClientProfile profile) {
        super(WavClient.endpoint, WavClient.version, credential, region, profile);
    }

    /**
     *新增渠道活码接口
     * @param req CreateChannelCodeRequest
     * @return CreateChannelCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateChannelCodeResponse CreateChannelCode(CreateChannelCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateChannelCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateChannelCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateChannelCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用户设置标签库, 每个企业最多可配置3000个企业标签。
     * @param req CreateCorpTagRequest
     * @return CreateCorpTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateCorpTagResponse CreateCorpTag(CreateCorpTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCorpTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCorpTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCorpTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据游标拉取活动参与列表信息
     * @param req QueryActivityJoinListRequest
     * @return QueryActivityJoinListResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityJoinListResponse QueryActivityJoinList(QueryActivityJoinListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryActivityJoinListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryActivityJoinListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryActivityJoinList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据游标拉取活动列表信息
     * @param req QueryActivityListRequest
     * @return QueryActivityListResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityListResponse QueryActivityList(QueryActivityListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryActivityListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryActivityListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryActivityList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据游标拉取活动活码列表信息
     * @param req QueryActivityLiveCodeListRequest
     * @return QueryActivityLiveCodeListResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityLiveCodeListResponse QueryActivityLiveCodeList(QueryActivityLiveCodeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryActivityLiveCodeListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryActivityLiveCodeListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryActivityLiveCodeList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据游标拉取渠道活码列表信息
     * @param req QueryChannelCodeListRequest
     * @return QueryChannelCodeListResponse
     * @throws TencentCloudSDKException
     */
    public QueryChannelCodeListResponse QueryChannelCodeList(QueryChannelCodeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryChannelCodeListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryChannelCodeListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryChannelCodeList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据游标拉取会话存档列表信息
     * @param req QueryChatArchivingListRequest
     * @return QueryChatArchivingListResponse
     * @throws TencentCloudSDKException
     */
    public QueryChatArchivingListResponse QueryChatArchivingList(QueryChatArchivingListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryChatArchivingListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryChatArchivingListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryChatArchivingList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业可通过此接口获取线索列表。
     * @param req QueryClueInfoListRequest
     * @return QueryClueInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryClueInfoListResponse QueryClueInfoList(QueryClueInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryClueInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryClueInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryClueInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业可通过此接口，根据外部联系人的userid，拉取客户详情
     * @param req QueryExternalContactDetailRequest
     * @return QueryExternalContactDetailResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalContactDetailResponse QueryExternalContactDetail(QueryExternalContactDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryExternalContactDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryExternalContactDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryExternalContactDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业可通过此接口获取指定成员添加的客户列表。客户是指配置了客户联系功能的成员所添加的外部联系人。没有配置客户联系功能的成员，所添加的外部联系人将不会作为客户返回。
     * @param req QueryExternalContactListRequest
     * @return QueryExternalContactListResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalContactListResponse QueryExternalContactList(QueryExternalContactListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryExternalContactListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryExternalContactListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryExternalContactList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业可通过此接口将企业主体对应的外部联系人id转换为乐销车应用主体对应的外部联系人。
     * @param req QueryExternalUserMappingInfoRequest
     * @return QueryExternalUserMappingInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalUserMappingInfoResponse QueryExternalUserMappingInfo(QueryExternalUserMappingInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryExternalUserMappingInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryExternalUserMappingInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryExternalUserMappingInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口获取license对应的详细信息
     * @param req QueryLicenseInfoRequest
     * @return QueryLicenseInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryLicenseInfoResponse QueryLicenseInfo(QueryLicenseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryLicenseInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryLicenseInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryLicenseInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询小程序码列表接口
     * @param req QueryMiniAppCodeListRequest
     * @return QueryMiniAppCodeListResponse
     * @throws TencentCloudSDKException
     */
    public QueryMiniAppCodeListResponse QueryMiniAppCodeList(QueryMiniAppCodeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMiniAppCodeListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMiniAppCodeListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMiniAppCodeList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
