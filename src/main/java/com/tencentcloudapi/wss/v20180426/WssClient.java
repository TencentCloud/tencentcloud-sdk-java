/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.wss.v20180426;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wss.v20180426.models.*;

public class WssClient extends AbstractClient{
    private static String endpoint = "wss.tencentcloudapi.com";
    private static String service = "wss";
    private static String version = "2018-04-26";

    public WssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WssClient(Credential credential, String region, ClientProfile profile) {
        super(WssClient.endpoint, WssClient.version, credential, region, profile);
    }

    /**
     *本接口（DeleteCert）用于删除证书。
     * @param req DeleteCertRequest
     * @return DeleteCertResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertResponse DeleteCert(DeleteCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCert", DeleteCertResponse.class);
    }

    /**
     *本接口(DescribeCertList)用于获取证书列表。
     * @param req DescribeCertListRequest
     * @return DescribeCertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertListResponse DescribeCertList(DescribeCertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertList", DescribeCertListResponse.class);
    }

    /**
     *本接口（UploadCert）用于上传证书。
     * @param req UploadCertRequest
     * @return UploadCertResponse
     * @throws TencentCloudSDKException
     */
    public UploadCertResponse UploadCert(UploadCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadCert", UploadCertResponse.class);
    }

}
