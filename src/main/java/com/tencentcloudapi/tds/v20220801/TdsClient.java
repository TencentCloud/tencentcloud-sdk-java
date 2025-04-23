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
package com.tencentcloudapi.tds.v20220801;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tds.v20220801.models.*;

public class TdsClient extends AbstractClient{
    private static String endpoint = "tds.tencentcloudapi.com";
    private static String service = "tds";
    private static String version = "2022-08-01";
    
    public TdsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdsClient(Credential credential, String region, ClientProfile profile) {
        super(TdsClient.endpoint, TdsClient.version, credential, region, profile);
    }

    /**
     *查询设备标识及风险（金融旗舰版）
     * @param req DescribeFinanceFraudUltimateRequest
     * @return DescribeFinanceFraudUltimateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFinanceFraudUltimateResponse DescribeFinanceFraudUltimate(DescribeFinanceFraudUltimateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFinanceFraudUltimate", DescribeFinanceFraudUltimateResponse.class);
    }

    /**
     *查询设备风险
     * @param req DescribeFraudBaseRequest
     * @return DescribeFraudBaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFraudBaseResponse DescribeFraudBase(DescribeFraudBaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFraudBase", DescribeFraudBaseResponse.class);
    }

    /**
     *查询设备标识及风险
     * @param req DescribeFraudPremiumRequest
     * @return DescribeFraudPremiumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFraudPremiumResponse DescribeFraudPremium(DescribeFraudPremiumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFraudPremium", DescribeFraudPremiumResponse.class);
    }

    /**
     *查询设备标识及风险（旗舰版）
     * @param req DescribeFraudUltimateRequest
     * @return DescribeFraudUltimateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFraudUltimateResponse DescribeFraudUltimate(DescribeFraudUltimateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFraudUltimate", DescribeFraudUltimateResponse.class);
    }

    /**
     *查询设备标识
     * @param req DescribeTrustedIDRequest
     * @return DescribeTrustedIDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrustedIDResponse DescribeTrustedID(DescribeTrustedIDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrustedID", DescribeTrustedIDResponse.class);
    }

}
