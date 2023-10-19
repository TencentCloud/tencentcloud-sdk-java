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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateChannelCode", CreateChannelCodeResponse.class);
    }

    /**
     *该接口用户设置标签库, 每个企业最多可配置3000个企业标签。
     * @param req CreateCorpTagRequest
     * @return CreateCorpTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateCorpTagResponse CreateCorpTag(CreateCorpTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCorpTag", CreateCorpTagResponse.class);
    }

    /**
     *线索回收接口
     * @param req CreateLeadRequest
     * @return CreateLeadResponse
     * @throws TencentCloudSDKException
     */
    public CreateLeadResponse CreateLead(CreateLeadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLead", CreateLeadResponse.class);
    }

    /**
     *根据游标拉取活动参与列表信息
     * @param req QueryActivityJoinListRequest
     * @return QueryActivityJoinListResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityJoinListResponse QueryActivityJoinList(QueryActivityJoinListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryActivityJoinList", QueryActivityJoinListResponse.class);
    }

    /**
     *根据游标拉取活动列表信息
     * @param req QueryActivityListRequest
     * @return QueryActivityListResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityListResponse QueryActivityList(QueryActivityListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryActivityList", QueryActivityListResponse.class);
    }

    /**
     *根据游标拉取活动活码列表信息
     * @param req QueryActivityLiveCodeListRequest
     * @return QueryActivityLiveCodeListResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityLiveCodeListResponse QueryActivityLiveCodeList(QueryActivityLiveCodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryActivityLiveCodeList", QueryActivityLiveCodeListResponse.class);
    }

    /**
     *查询指定时间范围内发生过到店的潜客到店信息
     * @param req QueryArrivalListRequest
     * @return QueryArrivalListResponse
     * @throws TencentCloudSDKException
     */
    public QueryArrivalListResponse QueryArrivalList(QueryArrivalListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryArrivalList", QueryArrivalListResponse.class);
    }

    /**
     *根据游标拉取渠道活码列表信息
     * @param req QueryChannelCodeListRequest
     * @return QueryChannelCodeListResponse
     * @throws TencentCloudSDKException
     */
    public QueryChannelCodeListResponse QueryChannelCodeList(QueryChannelCodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChannelCodeList", QueryChannelCodeListResponse.class);
    }

    /**
     *根据游标拉取会话存档列表信息
     * @param req QueryChatArchivingListRequest
     * @return QueryChatArchivingListResponse
     * @throws TencentCloudSDKException
     */
    public QueryChatArchivingListResponse QueryChatArchivingList(QueryChatArchivingListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChatArchivingList", QueryChatArchivingListResponse.class);
    }

    /**
     *企业可通过此接口获取线索列表。
     * @param req QueryClueInfoListRequest
     * @return QueryClueInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryClueInfoListResponse QueryClueInfoList(QueryClueInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryClueInfoList", QueryClueInfoListResponse.class);
    }

    /**
     *通过接口拉取租户/指定成员/部门在指定日期范围内的CRM跟进统计数据
     * @param req QueryCrmStatisticsRequest
     * @return QueryCrmStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public QueryCrmStatisticsResponse QueryCrmStatistics(QueryCrmStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCrmStatistics", QueryCrmStatisticsResponse.class);
    }

    /**
     *通过接口拉取SaaS内C端外部联系人在指定时间范围内的行为事件明细。此接口提供的数据以天为维度，查询的时间范围为[start_time,end_time]，即前后均为闭区间，支持的最大查询跨度为365天。
     * @param req QueryCustomerEventDetailStatisticsRequest
     * @return QueryCustomerEventDetailStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public QueryCustomerEventDetailStatisticsResponse QueryCustomerEventDetailStatistics(QueryCustomerEventDetailStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCustomerEventDetailStatistics", QueryCustomerEventDetailStatisticsResponse.class);
    }

    /**
     *通过接口拉取租户已有潜客客户档案列表信息
     * @param req QueryCustomerProfileListRequest
     * @return QueryCustomerProfileListResponse
     * @throws TencentCloudSDKException
     */
    public QueryCustomerProfileListResponse QueryCustomerProfileList(QueryCustomerProfileListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCustomerProfileList", QueryCustomerProfileListResponse.class);
    }

    /**
     *企业可通过此接口获取录入在企微SaaS平台上的经销商信息。
     * @param req QueryDealerInfoListRequest
     * @return QueryDealerInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryDealerInfoListResponse QueryDealerInfoList(QueryDealerInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryDealerInfoList", QueryDealerInfoListResponse.class);
    }

    /**
     *企业可通过此接口，根据外部联系人的userid，拉取外部联系人详情
     * @param req QueryExternalContactDetailRequest
     * @return QueryExternalContactDetailResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalContactDetailResponse QueryExternalContactDetail(QueryExternalContactDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryExternalContactDetail", QueryExternalContactDetailResponse.class);
    }

    /**
     *企业可通过传入起始和结束时间，获取该时间段的外部联系人详情列表
     * @param req QueryExternalContactDetailByDateRequest
     * @return QueryExternalContactDetailByDateResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalContactDetailByDateResponse QueryExternalContactDetailByDate(QueryExternalContactDetailByDateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryExternalContactDetailByDate", QueryExternalContactDetailByDateResponse.class);
    }

    /**
     *企业可通过此接口基于外部联系人获取指定成员添加的客户列表。客户是指配置了客户联系功能的成员所添加的外部联系人。没有配置客户联系功能的成员，所添加的外部联系人将不会作为客户返回。
     * @param req QueryExternalContactListRequest
     * @return QueryExternalContactListResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalContactListResponse QueryExternalContactList(QueryExternalContactListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryExternalContactList", QueryExternalContactListResponse.class);
    }

    /**
     *通过接口拉取租户在指定时间范围内的外部联系人添加/删除明细，此接口提供的数据以天为维度，查询的时间范围为[StarTime, EndTime]，即前后均为闭区间，支持的最大查询跨度为365天；
     * @param req QueryExternalUserEventListRequest
     * @return QueryExternalUserEventListResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalUserEventListResponse QueryExternalUserEventList(QueryExternalUserEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryExternalUserEventList", QueryExternalUserEventListResponse.class);
    }

    /**
     *企业可通过此接口将企业主体对应的外部联系人id转换为乐销车应用主体对应的外部联系人。
     * @param req QueryExternalUserMappingInfoRequest
     * @return QueryExternalUserMappingInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryExternalUserMappingInfoResponse QueryExternalUserMappingInfo(QueryExternalUserMappingInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryExternalUserMappingInfo", QueryExternalUserMappingInfoResponse.class);
    }

    /**
     *查询指定时间范围内发生过跟进的潜客信息
     * @param req QueryFollowListRequest
     * @return QueryFollowListResponse
     * @throws TencentCloudSDKException
     */
    public QueryFollowListResponse QueryFollowList(QueryFollowListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryFollowList", QueryFollowListResponse.class);
    }

    /**
     *该接口获取license对应的详细信息
     * @param req QueryLicenseInfoRequest
     * @return QueryLicenseInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryLicenseInfoResponse QueryLicenseInfo(QueryLicenseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryLicenseInfo", QueryLicenseInfoResponse.class);
    }

    /**
     *通过接口按类型拉取租户当前的素材列表及关键信息
     * @param req QueryMaterialListRequest
     * @return QueryMaterialListResponse
     * @throws TencentCloudSDKException
     */
    public QueryMaterialListResponse QueryMaterialList(QueryMaterialListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryMaterialList", QueryMaterialListResponse.class);
    }

    /**
     *查询小程序码列表接口
     * @param req QueryMiniAppCodeListRequest
     * @return QueryMiniAppCodeListResponse
     * @throws TencentCloudSDKException
     */
    public QueryMiniAppCodeListResponse QueryMiniAppCodeList(QueryMiniAppCodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryMiniAppCodeList", QueryMiniAppCodeListResponse.class);
    }

    /**
     *通过接口拉取SaaS内企业成员在指定时间范围内的行为事件明细。此接口提供的数据以天为维度，查询的时间范围为[start_time,end_time]，即前后均为闭区间，支持的最大查询跨度为365天。
     * @param req QueryStaffEventDetailStatisticsRequest
     * @return QueryStaffEventDetailStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public QueryStaffEventDetailStatisticsResponse QueryStaffEventDetailStatistics(QueryStaffEventDetailStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryStaffEventDetailStatistics", QueryStaffEventDetailStatisticsResponse.class);
    }

    /**
     *查询企业成员信息列表接口
     * @param req QueryUserInfoListRequest
     * @return QueryUserInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryUserInfoListResponse QueryUserInfoList(QueryUserInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryUserInfoList", QueryUserInfoListResponse.class);
    }

    /**
     *企业可通过此接口获取企微SaaS平台上的车系车型信息。
     * @param req QueryVehicleInfoListRequest
     * @return QueryVehicleInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryVehicleInfoListResponse QueryVehicleInfoList(QueryVehicleInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryVehicleInfoList", QueryVehicleInfoListResponse.class);
    }

}
