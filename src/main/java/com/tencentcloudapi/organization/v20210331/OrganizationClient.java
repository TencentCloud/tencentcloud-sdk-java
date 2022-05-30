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
package com.tencentcloudapi.organization.v20210331;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.organization.v20210331.models.*;

public class OrganizationClient extends AbstractClient{
    private static String endpoint = "organization.tencentcloudapi.com";
    private static String service = "organization";
    private static String version = "2021-03-31";

    public OrganizationClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OrganizationClient(Credential credential, String region, ClientProfile profile) {
        super(OrganizationClient.endpoint, OrganizationClient.version, credential, region, profile);
    }

    /**
     *绑定组织成员和子账号的授权关系
     * @param req BindOrganizationMemberAuthAccountRequest
     * @return BindOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public BindOrganizationMemberAuthAccountResponse BindOrganizationMemberAuthAccount(BindOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindOrganizationMemberAuthAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindOrganizationMemberAuthAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindOrganizationMemberAuthAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建组织成员
     * @param req CreateOrganizationMemberRequest
     * @return CreateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberResponse CreateOrganizationMember(CreateOrganizationMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrganizationMemberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrganizationMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrganizationMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建组织成员的授权策略
     * @param req CreateOrganizationMemberPolicyRequest
     * @return CreateOrganizationMemberPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberPolicyResponse CreateOrganizationMemberPolicy(CreateOrganizationMemberPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrganizationMemberPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrganizationMemberPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrganizationMemberPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织信息
     * @param req DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationResponse DescribeOrganization(DescribeOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织成员列表
     * @param req DescribeOrganizationMembersRequest
     * @return DescribeOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMembersResponse DescribeOrganizationMembers(DescribeOrganizationMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
