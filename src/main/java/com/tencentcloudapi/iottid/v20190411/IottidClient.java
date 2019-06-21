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
package com.tencentcloudapi.iottid.v20190411;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iottid.v20190411.models.*;

public class IottidClient extends AbstractClient{
    private static String endpoint = "iottid.tencentcloudapi.com";
    private static String version = "2019-04-11";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public IottidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public IottidClient(Credential credential, String region, ClientProfile profile) {
        super(IottidClient.endpoint, IottidClient.version, credential, region, profile);
    }

    /**
     *安全芯片TID烧录回执
     * @param req BurnTidNotifyRequest
     * @return BurnTidNotifyResponse
     * @throws TencentCloudSDKException
     */
    public BurnTidNotifyResponse BurnTidNotify(BurnTidNotifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BurnTidNotifyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BurnTidNotifyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BurnTidNotify"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全芯片为载体的TID空发回执，绑定TID与订单号。
     * @param req DeliverTidNotifyRequest
     * @return DeliverTidNotifyResponse
     * @throws TencentCloudSDKException
     */
    public DeliverTidNotifyResponse DeliverTidNotify(DeliverTidNotifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeliverTidNotifyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeliverTidNotifyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeliverTidNotify"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设备服务商请求空发产品订单的TID信息
     * @param req DeliverTidsRequest
     * @return DeliverTidsResponse
     * @throws TencentCloudSDKException
     */
    public DeliverTidsResponse DeliverTids(DeliverTidsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeliverTidsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeliverTidsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeliverTids"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业用户TID平台控制台权限
     * @param req DescribePermissionRequest
     * @return DescribePermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribePermissionResponse DescribePermission(DescribePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePermissionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePermissionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePermission"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下载芯片订单的TID
     * @param req DownloadTidsRequest
     * @return DownloadTidsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadTidsResponse DownloadTids(DownloadTidsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadTidsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadTidsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadTids"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
