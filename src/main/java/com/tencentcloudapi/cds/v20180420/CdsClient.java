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
package com.tencentcloudapi.cds.v20180420;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cds.v20180420.models.*;

public class CdsClient extends AbstractClient{
    private static String endpoint = "cds.tencentcloudapi.com";
    private static String service = "cds";
    private static String version = "2018-04-20";
    
    public CdsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdsClient(Credential credential, String region, ClientProfile profile) {
        super(CdsClient.endpoint, CdsClient.version, credential, region, profile);
    }

    /**
     *获取镜像列表
     * @param req DescribeDasbImageIdsRequest
     * @return DescribeDasbImageIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDasbImageIdsResponse DescribeDasbImageIds(DescribeDasbImageIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDasbImageIds", DescribeDasbImageIdsResponse.class);
    }

    /**
     *本接口 (DescribeDbauditInstanceType) 用于查询可售卖的产品规格列表。
     * @param req DescribeDbauditInstanceTypeRequest
     * @return DescribeDbauditInstanceTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbauditInstanceTypeResponse DescribeDbauditInstanceType(DescribeDbauditInstanceTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbauditInstanceType", DescribeDbauditInstanceTypeResponse.class);
    }

    /**
     *本接口 (DescribeDbauditInstances) 用于查询数据安全审计实例列表
     * @param req DescribeDbauditInstancesRequest
     * @return DescribeDbauditInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbauditInstancesResponse DescribeDbauditInstances(DescribeDbauditInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbauditInstances", DescribeDbauditInstancesResponse.class);
    }

    /**
     *本接口 (DescribeDbauditUsedRegions) 用于查询可售卖地域列表。
     * @param req DescribeDbauditUsedRegionsRequest
     * @return DescribeDbauditUsedRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbauditUsedRegionsResponse DescribeDbauditUsedRegions(DescribeDbauditUsedRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbauditUsedRegions", DescribeDbauditUsedRegionsResponse.class);
    }

    /**
     *用于查询数据安全审计产品实例价格
     * @param req InquiryPriceDbauditInstanceRequest
     * @return InquiryPriceDbauditInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceDbauditInstanceResponse InquiryPriceDbauditInstance(InquiryPriceDbauditInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceDbauditInstance", InquiryPriceDbauditInstanceResponse.class);
    }

    /**
     *本接口 (ModifyDbauditInstancesRenewFlag) 用于修改数据安全审计产品实例续费标识
     * @param req ModifyDbauditInstancesRenewFlagRequest
     * @return ModifyDbauditInstancesRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDbauditInstancesRenewFlagResponse ModifyDbauditInstancesRenewFlag(ModifyDbauditInstancesRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDbauditInstancesRenewFlag", ModifyDbauditInstancesRenewFlagResponse.class);
    }

}
