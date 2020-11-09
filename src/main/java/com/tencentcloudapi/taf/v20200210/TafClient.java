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
    private static String service = "taf";
    private static String version = "2020-02-10";

    public TafClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TafClient(Credential credential, String region, ClientProfile profile) {
        super(TafClient.endpoint, TafClient.version, credential, region, profile);
    }

    /**
     *DetectFraudKOL
     * @param req DetectFraudKOLRequest
     * @return DetectFraudKOLResponse
     * @throws TencentCloudSDKException
     */
    public DetectFraudKOLResponse DetectFraudKOL(DetectFraudKOLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectFraudKOLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetectFraudKOLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetectFraudKOL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *流量反欺诈-虚假TA识别
     * @param req EnhanceTaDegreeRequest
     * @return EnhanceTaDegreeResponse
     * @throws TencentCloudSDKException
     */
    public EnhanceTaDegreeResponse EnhanceTaDegree(EnhanceTaDegreeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnhanceTaDegreeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnhanceTaDegreeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnhanceTaDegree");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeCustomizedAudienceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeCustomizedAudience");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *流量反欺诈-流量验准高级版
     * @param req RecognizePreciseTargetAudienceRequest
     * @return RecognizePreciseTargetAudienceResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePreciseTargetAudienceResponse RecognizePreciseTargetAudience(RecognizePreciseTargetAudienceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizePreciseTargetAudienceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizePreciseTargetAudienceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizePreciseTargetAudience");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeTargetAudienceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeTargetAudience");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendTrafficSecuritySmsMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendTrafficSecuritySmsMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
