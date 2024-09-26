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
package com.tencentcloudapi.ca.v20230228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ca.v20230228.models.*;

public class CaClient extends AbstractClient{
    private static String endpoint = "ca.tencentcloudapi.com";
    private static String service = "ca";
    private static String version = "2023-02-28";
    
    public CaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CaClient(Credential credential, String region, ClientProfile profile) {
        super(CaClient.endpoint, CaClient.version, credential, region, profile);
    }

    /**
     *创建签名验证报告任务，此接口为异步盖章接口，盖章时效24小时。
     * @param req CreateVerifyReportRequest
     * @return CreateVerifyReportResponse
     * @throws TencentCloudSDKException
     */
    public CreateVerifyReportResponse CreateVerifyReport(CreateVerifyReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVerifyReport", CreateVerifyReportResponse.class);
    }

    /**
     *下载验签报告url，url有效期默认12小时
     * @param req DescribeVerifyReportRequest
     * @return DescribeVerifyReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVerifyReportResponse DescribeVerifyReport(DescribeVerifyReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVerifyReport", DescribeVerifyReportResponse.class);
    }

    /**
     *文件上传接口
     * @param req UploadFileRequest
     * @return UploadFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadFileResponse UploadFile(UploadFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFile", UploadFileResponse.class);
    }

}
