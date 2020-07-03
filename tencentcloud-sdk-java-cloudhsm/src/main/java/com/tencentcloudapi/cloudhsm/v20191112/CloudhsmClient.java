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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHSMBySubnetIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHSMBySubnetId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHSMByVpcIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHSMByVpcId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSubnet"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsgResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsg"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsgRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsgRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVsmAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVsmAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVsmsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVsms"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceBuyVsmResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceBuyVsm"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVsmAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyVsmAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
