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
package com.tencentcloudapi.ape.v20200513;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ape.v20200513.models.*;

public class ApeClient extends AbstractClient{
    private static String endpoint = "ape.tencentcloudapi.com";
    private static String service = "ape";
    private static String version = "2020-05-13";

    public ApeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApeClient(Credential credential, String region, ClientProfile profile) {
        super(ApeClient.endpoint, ApeClient.version, credential, region, profile);
    }

    /**
     *批量获取授权书下载地址
     * @param req BatchDescribeOrderCertificateRequest
     * @return BatchDescribeOrderCertificateResponse
     * @throws TencentCloudSDKException
     */
    public BatchDescribeOrderCertificateResponse BatchDescribeOrderCertificate(BatchDescribeOrderCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDescribeOrderCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDescribeOrderCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDescribeOrderCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量获取图片下载地址
     * @param req BatchDescribeOrderImageRequest
     * @return BatchDescribeOrderImageResponse
     * @throws TencentCloudSDKException
     */
    public BatchDescribeOrderImageResponse BatchDescribeOrderImage(BatchDescribeOrderImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDescribeOrderImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDescribeOrderImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDescribeOrderImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核销图片，获取原图URL地址
     * @param req CreateOrderAndDownloadsRequest
     * @return CreateOrderAndDownloadsResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrderAndDownloadsResponse CreateOrderAndDownloads(CreateOrderAndDownloadsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrderAndDownloadsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrderAndDownloadsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrderAndDownloads");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *购买一张图片并且支付
     * @param req CreateOrderAndPayRequest
     * @return CreateOrderAndPayResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrderAndPayResponse CreateOrderAndPay(CreateOrderAndPayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrderAndPayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrderAndPayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrderAndPay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询授权人列表
     * @param req DescribeAuthUsersRequest
     * @return DescribeAuthUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthUsersResponse DescribeAuthUsers(DescribeAuthUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuthUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuthUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuthUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户图片下载记录
     * @param req DescribeDownloadInfosRequest
     * @return DescribeDownloadInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDownloadInfosResponse DescribeDownloadInfos(DescribeDownloadInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDownloadInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDownloadInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDownloadInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据ID查询一张图片的详细信息
     * @param req DescribeImageRequest
     * @return DescribeImageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageResponse DescribeImage(DescribeImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据关键字搜索图片列表
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
