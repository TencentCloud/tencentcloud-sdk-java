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
package com.tencentcloudapi.cr.v20180321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cr.v20180321.models.*;

public class CrClient extends AbstractClient{
    private static String endpoint = "cr.tencentcloudapi.com";
    private static String version = "2018-03-21";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public CrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public CrClient(Credential credential, String region, ClientProfile profile) {
        super(CrClient.endpoint, CrClient.version, credential, region, profile);
    }

    /**
     *客户调用该接口查看任务执行状态。输入任务ID，输出任务执行状态或者结果
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse  DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *客户调用该接口下载指定日期的催收报告
     * @param req DownloadReportRequest
     * @return DownloadReportResponse
     * @throws TencentCloudSDKException
     */
    public DownloadReportResponse  DownloadReport(DownloadReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadReportResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadReportResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadReport"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *客户通过调用该接口上传需催收文档，格式需为csv或者excel格式。接口返回任务ID。
     * @param req UploadFileRequest
     * @return UploadFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadFileResponse  UploadFile(UploadFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFileResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFileResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadFile"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
