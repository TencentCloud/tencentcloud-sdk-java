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
package com.tencentcloudapi.youmall.v20180228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.youmall.v20180228.models.*;

public class YoumallClient extends AbstractClient{
    private static String endpoint = "youmall.tencentcloudapi.com";
    private static String version = "2018-02-28";

    public YoumallClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public YoumallClient(Credential credential, String region, ClientProfile profile) {
        super(YoumallClient.endpoint, YoumallClient.version, credential, region, profile);
    }

    /**
     *创建集团门店管理员账号
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过上传指定规格的人脸图片，创建黑名单用户或者白名单用户。
     * @param req CreateFacePictureRequest
     * @return CreateFacePictureResponse
     * @throws TencentCloudSDKException
     */
    public CreateFacePictureResponse CreateFacePicture(CreateFacePictureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFacePictureResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFacePictureResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateFacePicture"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除顾客特征，仅支持删除黑名单或者白名单用户特征。
     * @param req DeletePersonFeatureRequest
     * @return DeletePersonFeatureResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonFeatureResponse DeletePersonFeature(DeletePersonFeatureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonFeatureResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonFeatureResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePersonFeature"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过指定设备ID和指定时段，获取该时段内中收银台摄像设备抓取到顾客头像及身份ID
     * @param req DescribeCameraPersonRequest
     * @return DescribeCameraPersonResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCameraPersonResponse DescribeCameraPerson(DescribeCameraPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCameraPersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCameraPersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCameraPerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输出开始时间到结束时间段内的进出场数据。按天聚合的情况下，每天多次进出场算一次，以最初进场时间为进场时间，最后离场时间为离场时间。停留时间为多次进出场的停留时间之和。
     * @param req DescribeClusterPersonArrivedMallRequest
     * @return DescribeClusterPersonArrivedMallResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPersonArrivedMallResponse DescribeClusterPersonArrivedMall(DescribeClusterPersonArrivedMallRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterPersonArrivedMallResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterPersonArrivedMallResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClusterPersonArrivedMall"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输出开始时间到结束时间段内的进出场数据。按天聚合的情况下，每天多次进出场算一次，以最初进场时间为进场时间，最后离场时间为离场时间。
     * @param req DescribeClusterPersonTraceRequest
     * @return DescribeClusterPersonTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPersonTraceResponse DescribeClusterPersonTrace(DescribeClusterPersonTraceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterPersonTraceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterPersonTraceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClusterPersonTrace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过DescribeCameraPerson接口上报的收银台身份ID查询顾客的FaceID。查询最佳时间为收银台上报的次日1点后。
     * @param req DescribeFaceIdByTempIdRequest
     * @return DescribeFaceIdByTempIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFaceIdByTempIdResponse DescribeFaceIdByTempId(DescribeFaceIdByTempIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFaceIdByTempIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFaceIdByTempIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeFaceIdByTempId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回当前门店历史网络状态数据
     * @param req DescribeHistoryNetworkInfoRequest
     * @return DescribeHistoryNetworkInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryNetworkInfoResponse DescribeHistoryNetworkInfo(DescribeHistoryNetworkInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHistoryNetworkInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHistoryNetworkInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHistoryNetworkInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回当前门店最新网络状态数据
     * @param req DescribeNetworkInfoRequest
     * @return DescribeNetworkInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInfoResponse DescribeNetworkInfo(DescribeNetworkInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetworkInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定某一卖场的用户信息
     * @param req DescribePersonRequest
     * @return DescribePersonResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonResponse DescribePerson(DescribePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输出开始时间到结束时间段内的进出场数据。不做按天聚合的情况下，每次进出场，产生一条进出场数据。


     * @param req DescribePersonArrivedMallRequest
     * @return DescribePersonArrivedMallResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonArrivedMallResponse DescribePersonArrivedMall(DescribePersonArrivedMallRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonArrivedMallResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonArrivedMallResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersonArrivedMall"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *指定门店获取所有顾客详情列表，包含客户ID、图片、年龄、性别
     * @param req DescribePersonInfoRequest
     * @return DescribePersonInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonInfoResponse DescribePersonInfo(DescribePersonInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersonInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过上传人脸图片检索系统face id、顾客身份信息及底图
     * @param req DescribePersonInfoByFacePictureRequest
     * @return DescribePersonInfoByFacePictureResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonInfoByFacePictureResponse DescribePersonInfoByFacePicture(DescribePersonInfoByFacePictureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonInfoByFacePictureResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonInfoByFacePictureResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersonInfoByFacePicture"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输出开始时间到结束时间段内的进出场数据。
     * @param req DescribePersonTraceRequest
     * @return DescribePersonTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonTraceResponse DescribePersonTrace(DescribePersonTraceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonTraceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonTraceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersonTrace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询客户单次到场轨迹明细
     * @param req DescribePersonTraceDetailRequest
     * @return DescribePersonTraceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonTraceDetailResponse DescribePersonTraceDetail(DescribePersonTraceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonTraceDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonTraceDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersonTraceDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取门店指定时间范围内的所有用户到访信息记录，支持的时间范围：过去365天，含当天。
     * @param req DescribePersonVisitInfoRequest
     * @return DescribePersonVisitInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonVisitInfoResponse DescribePersonVisitInfo(DescribePersonVisitInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonVisitInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonVisitInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersonVisitInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按小时提供查询日期范围内门店的每天每小时累计客流人数数据，支持的时间范围：过去365天，含当天。
     * @param req DescribeShopHourTrafficInfoRequest
     * @return DescribeShopHourTrafficInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShopHourTrafficInfoResponse DescribeShopHourTrafficInfo(DescribeShopHourTrafficInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShopHourTrafficInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShopHourTrafficInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeShopHourTrafficInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据客户身份标识获取客户下所有的门店信息列表
     * @param req DescribeShopInfoRequest
     * @return DescribeShopInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShopInfoResponse DescribeShopInfo(DescribeShopInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShopInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShopInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeShopInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按天提供查询日期范围内门店的单日累计客流人数，支持的时间范围：过去365天，含当天。
     * @param req DescribeShopTrafficInfoRequest
     * @return DescribeShopTrafficInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShopTrafficInfoResponse DescribeShopTrafficInfo(DescribeShopTrafficInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShopTrafficInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShopTrafficInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeShopTrafficInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取动线轨迹信息
     * @param req DescribeTrajectoryDataRequest
     * @return DescribeTrajectoryDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrajectoryDataResponse DescribeTrajectoryData(DescribeTrajectoryDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrajectoryDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrajectoryDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTrajectoryData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定区域人流各年龄占比
     * @param req DescribeZoneFlowAgeInfoByZoneIdRequest
     * @return DescribeZoneFlowAgeInfoByZoneIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneFlowAgeInfoByZoneIdResponse DescribeZoneFlowAgeInfoByZoneId(DescribeZoneFlowAgeInfoByZoneIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneFlowAgeInfoByZoneIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneFlowAgeInfoByZoneIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZoneFlowAgeInfoByZoneId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取区域人流和停留时间
     * @param req DescribeZoneFlowAndStayTimeRequest
     * @return DescribeZoneFlowAndStayTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneFlowAndStayTimeResponse DescribeZoneFlowAndStayTime(DescribeZoneFlowAndStayTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneFlowAndStayTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneFlowAndStayTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZoneFlowAndStayTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定区域每日客流量
     * @param req DescribeZoneFlowDailyByZoneIdRequest
     * @return DescribeZoneFlowDailyByZoneIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneFlowDailyByZoneIdResponse DescribeZoneFlowDailyByZoneId(DescribeZoneFlowDailyByZoneIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneFlowDailyByZoneIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneFlowDailyByZoneIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZoneFlowDailyByZoneId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定区域不同年龄段男女平均停留时间
     * @param req DescribeZoneFlowGenderAvrStayTimeByZoneIdRequest
     * @return DescribeZoneFlowGenderAvrStayTimeByZoneIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneFlowGenderAvrStayTimeByZoneIdResponse DescribeZoneFlowGenderAvrStayTimeByZoneId(DescribeZoneFlowGenderAvrStayTimeByZoneIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneFlowGenderAvrStayTimeByZoneIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneFlowGenderAvrStayTimeByZoneIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZoneFlowGenderAvrStayTimeByZoneId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定区域性别占比
     * @param req DescribeZoneFlowGenderInfoByZoneIdRequest
     * @return DescribeZoneFlowGenderInfoByZoneIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneFlowGenderInfoByZoneIdResponse DescribeZoneFlowGenderInfoByZoneId(DescribeZoneFlowGenderInfoByZoneIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneFlowGenderInfoByZoneIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneFlowGenderInfoByZoneIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZoneFlowGenderInfoByZoneId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定区域分时客流量
     * @param req DescribeZoneFlowHourlyByZoneIdRequest
     * @return DescribeZoneFlowHourlyByZoneIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneFlowHourlyByZoneIdResponse DescribeZoneFlowHourlyByZoneId(DescribeZoneFlowHourlyByZoneIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneFlowHourlyByZoneIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneFlowHourlyByZoneIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZoneFlowHourlyByZoneId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按天提供查询日期范围内，客户指定门店下的所有区域（优Mall部署时已配置区域）的累计客流人次和平均停留时间。支持的时间范围：过去365天，含当天。
     * @param req DescribeZoneTrafficInfoRequest
     * @return DescribeZoneTrafficInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneTrafficInfoResponse DescribeZoneTrafficInfo(DescribeZoneTrafficInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneTrafficInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneTrafficInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZoneTrafficInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持修改黑白名单类型的顾客特征
     * @param req ModifyPersonFeatureInfoRequest
     * @return ModifyPersonFeatureInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonFeatureInfoResponse ModifyPersonFeatureInfo(ModifyPersonFeatureInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonFeatureInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonFeatureInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonFeatureInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *标记到店顾客的身份类型，例如黑名单、白名单等

     * @param req ModifyPersonTagInfoRequest
     * @return ModifyPersonTagInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonTagInfoResponse ModifyPersonTagInfo(ModifyPersonTagInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonTagInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonTagInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonTagInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改顾客身份类型接口
     * @param req ModifyPersonTypeRequest
     * @return ModifyPersonTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonTypeResponse ModifyPersonType(ModifyPersonTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调用本接口在优Mall中注册自己集团的到店通知回调接口地址，接口协议为HTTP或HTTPS。注册后，若集团有特殊身份（例如老客）到店通知，优Mall后台将主动将到店信息push给该接口
     * @param req RegisterCallbackRequest
     * @return RegisterCallbackResponse
     * @throws TencentCloudSDKException
     */
    public RegisterCallbackResponse RegisterCallback(RegisterCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterCallbackResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterCallbackResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RegisterCallback"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
