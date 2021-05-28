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
        JsonResponseModel<DescribeHSMBySubnetIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHSMBySubnetIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHSMBySubnetId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过VpcId获取Hsm资源数
     * @param req DescribeHSMByVpcIdRequest
     * @return DescribeHSMByVpcIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHSMByVpcIdResponse DescribeHSMByVpcId(DescribeHSMByVpcIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHSMByVpcIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHSMByVpcIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHSMByVpcId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询子网列表
     * @param req DescribeSubnetRequest
     * @return DescribeSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetResponse DescribeSubnet(DescribeSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubnet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取当前地域所支持的设备列表
     * @param req DescribeSupportedHsmRequest
     * @return DescribeSupportedHsmResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedHsmResponse DescribeSupportedHsm(DescribeSupportedHsmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSupportedHsmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSupportedHsmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSupportedHsm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据用户的AppId获取用户安全组列表
     * @param req DescribeUsgRequest
     * @return DescribeUsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsgResponse DescribeUsg(DescribeUsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全组详情
     * @param req DescribeUsgRuleRequest
     * @return DescribeUsgRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsgRuleResponse DescribeUsgRule(DescribeUsgRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsgRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsgRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsgRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户的私有网络列表
     * @param req DescribeVpcRequest
     * @return DescribeVpcResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcResponse DescribeVpc(DescribeVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取VSM属性
     * @param req DescribeVsmAttributesRequest
     * @return DescribeVsmAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVsmAttributesResponse DescribeVsmAttributes(DescribeVsmAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVsmAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVsmAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVsmAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户VSM列表
     * @param req DescribeVsmsRequest
     * @return DescribeVsmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVsmsResponse DescribeVsms(DescribeVsmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVsmsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVsmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVsms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *购买询价接口
     * @param req InquiryPriceBuyVsmRequest
     * @return InquiryPriceBuyVsmResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceBuyVsmResponse InquiryPriceBuyVsm(InquiryPriceBuyVsmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceBuyVsmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceBuyVsmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceBuyVsm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改VSM属性
     * @param req ModifyVsmAttributesRequest
     * @return ModifyVsmAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVsmAttributesResponse ModifyVsmAttributes(ModifyVsmAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVsmAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVsmAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVsmAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
