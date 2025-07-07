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
package com.tencentcloudapi.svp.v20240125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.svp.v20240125.models.*;

public class SvpClient extends AbstractClient{
    private static String endpoint = "svp.tencentcloudapi.com";
    private static String service = "svp";
    private static String version = "2024-01-25";

    public SvpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SvpClient(Credential credential, String region, ClientProfile profile) {
        super(SvpClient.endpoint, SvpClient.version, credential, region, profile);
    }

    /**
     *创建节省计划订单
     * @param req CreateSavingPlanOrderRequest
     * @return CreateSavingPlanOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateSavingPlanOrderResponse CreateSavingPlanOrder(CreateSavingPlanOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSavingPlanOrder", CreateSavingPlanOrderResponse.class);
    }

    /**
     *查询当前用户节省计划覆盖率明细数据，如无特别说明，金额单位均为元（国内站）或者美元（国际站）。
     * @param req DescribeSavingPlanCoverageRequest
     * @return DescribeSavingPlanCoverageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSavingPlanCoverageResponse DescribeSavingPlanCoverage(DescribeSavingPlanCoverageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSavingPlanCoverage", DescribeSavingPlanCoverageResponse.class);
    }

    /**
     *查询节省计划抵扣明细
     * @param req DescribeSavingPlanDeductRequest
     * @return DescribeSavingPlanDeductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSavingPlanDeductResponse DescribeSavingPlanDeduct(DescribeSavingPlanDeductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSavingPlanDeduct", DescribeSavingPlanDeductResponse.class);
    }

    /**
     *查用当前用户明细节省计划总览查询时段内的使用情况
     * @param req DescribeSavingPlanOverviewRequest
     * @return DescribeSavingPlanOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSavingPlanOverviewResponse DescribeSavingPlanOverview(DescribeSavingPlanOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSavingPlanOverview", DescribeSavingPlanOverviewResponse.class);
    }

    /**
     *查用当前用户明细节省计划查询时段内的使用情况
     * @param req DescribeSavingPlanUsageRequest
     * @return DescribeSavingPlanUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSavingPlanUsageResponse DescribeSavingPlanUsage(DescribeSavingPlanUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSavingPlanUsage", DescribeSavingPlanUsageResponse.class);
    }

}
