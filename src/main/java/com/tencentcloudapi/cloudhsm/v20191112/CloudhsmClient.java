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
package com.tencentcloudapi.cloudhsm.v20191112;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudhsm.v20191112.models.*;

public class CloudhsmClient extends AbstractClient{
    private static String endpoint = "cloudhsm.tencentcloudapi.com";
    private static String service = "cloudhsm";
    private static String version = "2019-11-12";

    public CloudhsmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudhsmClient(Credential credential, String region, ClientProfile profile) {
        super(CloudhsmClient.endpoint, CloudhsmClient.version, credential, region, profile);
    }

    /**
     *通过SubnetId获取Hsm资源数
     * @param req DescribeHSMBySubnetIdRequest
     * @return DescribeHSMBySubnetIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHSMBySubnetIdResponse DescribeHSMBySubnetId(DescribeHSMBySubnetIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHSMBySubnetId", DescribeHSMBySubnetIdResponse.class);
    }

    /**
     *通过VpcId获取Hsm资源数
     * @param req DescribeHSMByVpcIdRequest
     * @return DescribeHSMByVpcIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHSMByVpcIdResponse DescribeHSMByVpcId(DescribeHSMByVpcIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHSMByVpcId", DescribeHSMByVpcIdResponse.class);
    }

    /**
     *查询子网列表
     * @param req DescribeSubnetRequest
     * @return DescribeSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetResponse DescribeSubnet(DescribeSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnet", DescribeSubnetResponse.class);
    }

    /**
     *获取当前地域所支持的设备列表
     * @param req DescribeSupportedHsmRequest
     * @return DescribeSupportedHsmResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedHsmResponse DescribeSupportedHsm(DescribeSupportedHsmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportedHsm", DescribeSupportedHsmResponse.class);
    }

    /**
     *根据用户的AppId获取用户安全组列表
     * @param req DescribeUsgRequest
     * @return DescribeUsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsgResponse DescribeUsg(DescribeUsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsg", DescribeUsgResponse.class);
    }

    /**
     *获取安全组详情
     * @param req DescribeUsgRuleRequest
     * @return DescribeUsgRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsgRuleResponse DescribeUsgRule(DescribeUsgRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsgRule", DescribeUsgRuleResponse.class);
    }

    /**
     *查询用户的私有网络列表
     * @param req DescribeVpcRequest
     * @return DescribeVpcResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcResponse DescribeVpc(DescribeVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpc", DescribeVpcResponse.class);
    }

    /**
     *获取VSM属性
     * @param req DescribeVsmAttributesRequest
     * @return DescribeVsmAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVsmAttributesResponse DescribeVsmAttributes(DescribeVsmAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVsmAttributes", DescribeVsmAttributesResponse.class);
    }

    /**
     *获取用户VSM列表
     * @param req DescribeVsmsRequest
     * @return DescribeVsmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVsmsResponse DescribeVsms(DescribeVsmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVsms", DescribeVsmsResponse.class);
    }

    /**
     *获取告警事件
     * @param req GetAlarmEventRequest
     * @return GetAlarmEventResponse
     * @throws TencentCloudSDKException
     */
    public GetAlarmEventResponse GetAlarmEvent(GetAlarmEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAlarmEvent", GetAlarmEventResponse.class);
    }

    /**
     *获取VSM监控信息
     * @param req GetVsmMonitorInfoRequest
     * @return GetVsmMonitorInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetVsmMonitorInfoResponse GetVsmMonitorInfo(GetVsmMonitorInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetVsmMonitorInfo", GetVsmMonitorInfoResponse.class);
    }

    /**
     *购买询价接口
     * @param req InquiryPriceBuyVsmRequest
     * @return InquiryPriceBuyVsmResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceBuyVsmResponse InquiryPriceBuyVsm(InquiryPriceBuyVsmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceBuyVsm", InquiryPriceBuyVsmResponse.class);
    }

    /**
     *修改告警事件
     * @param req ModifyAlarmEventRequest
     * @return ModifyAlarmEventResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmEventResponse ModifyAlarmEvent(ModifyAlarmEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmEvent", ModifyAlarmEventResponse.class);
    }

    /**
     *修改VSM属性
     * @param req ModifyVsmAttributesRequest
     * @return ModifyVsmAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVsmAttributesResponse ModifyVsmAttributes(ModifyVsmAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVsmAttributes", ModifyVsmAttributesResponse.class);
    }

}
