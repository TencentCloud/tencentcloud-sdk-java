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
package com.tencentcloudapi.taf.v20200210;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.taf.v20200210.models.*;

public class TafClient extends AbstractClient{
    private static String endpoint = "taf.tencentcloudapi.com";
    private static String version = "2020-02-10";

    public TafClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TafClient(Credential credential, String region, ClientProfile profile) {
        super(TafClient.endpoint, TafClient.version, credential, region, profile);
    }

    /**
     *DetectAccountActivity
     * @param req DetectAccountActivityRequest
     * @return DetectAccountActivityResponse
     * @throws TencentCloudSDKException
     */
    public DetectAccountActivityResponse DetectAccountActivity(DetectAccountActivityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectAccountActivityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectAccountActivityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectAccountActivity"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DetectFraudKOL
     * @param req DetectFraudKOLRequest
     * @return DetectFraudKOLResponse
     * @throws TencentCloudSDKException
     */
    public DetectFraudKOLResponse DetectFraudKOL(DetectFraudKOLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectFraudKOLResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectFraudKOLResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectFraudKOL"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *EnhanceTaDegree
     * @param req EnhanceTaDegreeRequest
     * @return EnhanceTaDegreeResponse
     * @throws TencentCloudSDKException
     */
    public EnhanceTaDegreeResponse EnhanceTaDegree(EnhanceTaDegreeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnhanceTaDegreeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnhanceTaDegreeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnhanceTaDegree"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *流量反欺诈-流量验准定制版
     * @param req RecognizeCustomizedAudienceRequest
     * @return RecognizeCustomizedAudienceResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeCustomizedAudienceResponse RecognizeCustomizedAudience(RecognizeCustomizedAudienceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeCustomizedAudienceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeCustomizedAudienceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RecognizeCustomizedAudience"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *RecognizePreciseTargetAudience
     * @param req RecognizePreciseTargetAudienceRequest
     * @return RecognizePreciseTargetAudienceResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePreciseTargetAudienceResponse RecognizePreciseTargetAudience(RecognizePreciseTargetAudienceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizePreciseTargetAudienceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizePreciseTargetAudienceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RecognizePreciseTargetAudience"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *流量反欺诈-流量验准
     * @param req RecognizeTargetAudienceRequest
     * @return RecognizeTargetAudienceResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeTargetAudienceResponse RecognizeTargetAudience(RecognizeTargetAudienceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeTargetAudienceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeTargetAudienceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RecognizeTargetAudience"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *SendTrafficSecuritySmsMessage
     * @param req SendTrafficSecuritySmsMessageRequest
     * @return SendTrafficSecuritySmsMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendTrafficSecuritySmsMessageResponse SendTrafficSecuritySmsMessage(SendTrafficSecuritySmsMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendTrafficSecuritySmsMessageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendTrafficSecuritySmsMessageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendTrafficSecuritySmsMessage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
