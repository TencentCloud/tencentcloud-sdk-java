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
     *线索回收接口
     * @param req CreateLeadRequest
     * @return CreateLeadResponse
     * @throws TencentCloudSDKException
     */
    public CreateLeadResponse CreateLead(CreateLeadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLeadResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLeadResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLead");
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
     *通过接口拉取租户/指定成员/部门在指定日期范围内的CRM跟进统计数据
     * @param req QueryCrmStatisticsRequest
     * @return QueryCrmStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public QueryCrmStatisticsResponse QueryCrmStatistics(QueryCrmStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCrmStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCrmStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCrmStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过接口拉取SaaS内C端外部联系人在指定时间范围内的行为事件明细。此接口提供的数据以天为维度，查询的时间范围为[start_time,end_time]，即前后均为闭区间，支持的最大查询跨度为365天。
     * @param req QueryCustomerEventDetailStatisticsRequest
     * @return QueryCustomerEventDetailStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public QueryCustomerEventDetailStatisticsResponse QueryCustomerEventDetailStatistics(QueryCustomerEventDetailStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCustomerEventDetailStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCustomerEventDetailStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCustomerEventDetailStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业可通过此接口获取录入在企微SaaS平台上的经销商信息。
     * @param req QueryDealerInfoListRequest
     * @return QueryDealerInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryDealerInfoListResponse QueryDealerInfoList(QueryDealerInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryDealerInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryDealerInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryDealerInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业可通过此接口，根据外部联系人的userid，拉取外部联系人详情
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
     *企业可通过此接口基于外部联系人获取指定成员添加的客户列表。客户是指配置了客户联系功能的成员所添加的外部联系人。没有配置客户联系功能的成员，所添加的外部联系人将不会作为客户返回。
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
     *通过接口拉取租户在指定时间范围内的外部联系人添加/删除明细，此接口提供的数据以天为维度，查询的时间范围为[StarTime, EndTime]，即前后均为闭区间，支持的最大查询跨度为365天；
     * @param req QueryExternalUserEventListRequest
     * @return QueryExternalUserEventListResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalUserEventListResponse QueryExternalUserEventList(QueryExternalUserEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryExternalUserEventListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryExternalUserEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryExternalUserEventList");
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
     *通过接口按类型拉取租户当前的素材列表及关键信息
     * @param req QueryMaterialListRequest
     * @return QueryMaterialListResponse
     * @throws TencentCloudSDKException
     */
    public QueryMaterialListResponse QueryMaterialList(QueryMaterialListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMaterialListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMaterialListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMaterialList");
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

    /**
     *通过接口拉取SaaS内企业成员在指定时间范围内的行为事件明细。此接口提供的数据以天为维度，查询的时间范围为[start_time,end_time]，即前后均为闭区间，支持的最大查询跨度为365天。
     * @param req QueryStaffEventDetailStatisticsRequest
     * @return QueryStaffEventDetailStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public QueryStaffEventDetailStatisticsResponse QueryStaffEventDetailStatistics(QueryStaffEventDetailStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryStaffEventDetailStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryStaffEventDetailStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryStaffEventDetailStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业成员信息列表接口
     * @param req QueryUserInfoListRequest
     * @return QueryUserInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryUserInfoListResponse QueryUserInfoList(QueryUserInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryUserInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryUserInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryUserInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业可通过此接口获取企微SaaS平台上的车系车型信息。
     * @param req QueryVehicleInfoListRequest
     * @return QueryVehicleInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryVehicleInfoListResponse QueryVehicleInfoList(QueryVehicleInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryVehicleInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryVehicleInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryVehicleInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
