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
package com.tencentcloudapi.rce.v20260130;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rce.v20260130.models.*;

public class RceClient extends AbstractClient{
    private static String endpoint = "rce.tencentcloudapi.com";
    private static String service = "rce";
    private static String version = "2026-01-30";

    public RceClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RceClient(Credential credential, String region, ClientProfile profile) {
        super(RceClient.endpoint, RceClient.version, credential, region, profile);
    }

    /**
     *设备风险评估-高级版
     * @param req AssessDeviceRiskPremiumProRequest
     * @return AssessDeviceRiskPremiumProResponse
     * @throws TencentCloudSDKException
     */
    public AssessDeviceRiskPremiumProResponse AssessDeviceRiskPremiumPro(AssessDeviceRiskPremiumProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessDeviceRiskPremiumPro", AssessDeviceRiskPremiumProResponse.class);
    }

    /**
     *设备风险评估-基础版
     * @param req AssessDeviceRiskProRequest
     * @return AssessDeviceRiskProResponse
     * @throws TencentCloudSDKException
     */
    public AssessDeviceRiskProResponse AssessDeviceRiskPro(AssessDeviceRiskProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessDeviceRiskPro", AssessDeviceRiskProResponse.class);
    }

    /**
     *环境风险评估
     * @param req AssessEnvironmentRiskRequest
     * @return AssessEnvironmentRiskResponse
     * @throws TencentCloudSDKException
     */
    public AssessEnvironmentRiskResponse AssessEnvironmentRisk(AssessEnvironmentRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessEnvironmentRisk", AssessEnvironmentRiskResponse.class);
    }

    /**
     *事件风险评估。用于实时获取事件的风险信息，您可以在业务的关键事件中获取到我们根据设备风险、环境风险、账号风险、行为风险以及历史上报的事件信息评估出来的风险决策结果、风险评分和风险标签等。
     * @param req AssessRiskRequest
     * @return AssessRiskResponse
     * @throws TencentCloudSDKException
     */
    public AssessRiskResponse AssessRisk(AssessRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssessRisk", AssessRiskResponse.class);
    }

    /**
     *事件信息上报。用于上报您业务中无需实时决策的事件，我们会通过引擎计算、机器学习挖掘风险特征用于实时事件风险评估。
     * @param req ReportEventRequest
     * @return ReportEventResponse
     * @throws TencentCloudSDKException
     */
    public ReportEventResponse ReportEvent(ReportEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportEvent", ReportEventResponse.class);
    }

}
