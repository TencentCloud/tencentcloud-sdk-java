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

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public YoumallClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public YoumallClient(Credential credential, String region, ClientProfile profile) {
        super(YoumallClient.endpoint, YoumallClient.version, credential, region, profile);
    }

    /**
     *指定门店获取所有顾客详情列表，包含客户ID、图片、年龄、性别
     * @param req DescribePersonInfoRequest
     * @return DescribePersonInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonInfoResponse  DescribePersonInfo(DescribePersonInfoRequest req) throws TencentCloudSDKException{
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
     *获取门店指定时间范围内的所有用户到访信息记录，支持的时间范围：过去365天，含当天。
     * @param req DescribePersonVisitInfoRequest
     * @return DescribePersonVisitInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonVisitInfoResponse  DescribePersonVisitInfo(DescribePersonVisitInfoRequest req) throws TencentCloudSDKException{
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
    public DescribeShopHourTrafficInfoResponse  DescribeShopHourTrafficInfo(DescribeShopHourTrafficInfoRequest req) throws TencentCloudSDKException{
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
    public DescribeShopInfoResponse  DescribeShopInfo(DescribeShopInfoRequest req) throws TencentCloudSDKException{
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
    public DescribeShopTrafficInfoResponse  DescribeShopTrafficInfo(DescribeShopTrafficInfoRequest req) throws TencentCloudSDKException{
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
     *按天提供查询日期范围内，客户指定门店下的所有区域（优Mall部署时已配置区域）的累计客流人次和平均停留时间。支持的时间范围：过去365天，含当天。
     * @param req DescribeZoneTrafficInfoRequest
     * @return DescribeZoneTrafficInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneTrafficInfoResponse  DescribeZoneTrafficInfo(DescribeZoneTrafficInfoRequest req) throws TencentCloudSDKException{
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
     *调用本接口在优Mall中注册自己集团的到店通知回调接口地址，接口协议为HTTP或HTTPS。注册后，若集团有特殊身份（例如老客）到店通知，优Mall后台将主动将到店信息push给该接口
     * @param req RegisterCallbackRequest
     * @return RegisterCallbackResponse
     * @throws TencentCloudSDKException
     */
    public RegisterCallbackResponse  RegisterCallback(RegisterCallbackRequest req) throws TencentCloudSDKException{
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
