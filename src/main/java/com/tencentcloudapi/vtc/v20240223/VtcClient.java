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
package com.tencentcloudapi.vtc.v20240223;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vtc.v20240223.models.*;

public class VtcClient extends AbstractClient{
    private static String endpoint = "vtc.tencentcloudapi.com";
    private static String service = "vtc";
    private static String version = "2024-02-23";
    
    public VtcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VtcClient(Credential credential, String region, ClientProfile profile) {
        super(VtcClient.endpoint, VtcClient.version, credential, region, profile);
    }

    /**
     *确认视频翻译结果
     * @param req ConfirmVideoTranslateJobRequest
     * @return ConfirmVideoTranslateJobResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmVideoTranslateJobResponse ConfirmVideoTranslateJob(ConfirmVideoTranslateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmVideoTranslateJob", ConfirmVideoTranslateJobResponse.class);
    }

    /**
     *查询视频翻译任务
     * @param req DescribeVideoTranslateJobRequest
     * @return DescribeVideoTranslateJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoTranslateJobResponse DescribeVideoTranslateJob(DescribeVideoTranslateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoTranslateJob", DescribeVideoTranslateJobResponse.class);
    }

    /**
     *提交视频转译任务
     * @param req SubmitVideoTranslateJobRequest
     * @return SubmitVideoTranslateJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitVideoTranslateJobResponse SubmitVideoTranslateJob(SubmitVideoTranslateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitVideoTranslateJob", SubmitVideoTranslateJobResponse.class);
    }

}
