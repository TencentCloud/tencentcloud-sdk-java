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
package com.tencentcloudapi.essbasic.v20210526;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.essbasic.v20210526.models.*;

public class EssbasicClient extends AbstractClient{
    private static String endpoint = "essbasic.tencentcloudapi.com";
    private static String service = "essbasic";
    private static String version = "2021-05-26";

    public EssbasicClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EssbasicClient(Credential credential, String region, ClientProfile profile) {
        super(EssbasicClient.endpoint, EssbasicClient.version, credential, region, profile);
    }

    /**
     *此接口（CreateConsoleLoginUrl）用于创建电子签控制台登录链接。若企业未激活，调用同步企业信息、同步经办人信息

     * @param req CreateConsoleLoginUrlRequest
     * @return CreateConsoleLoginUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleLoginUrlResponse CreateConsoleLoginUrl(CreateConsoleLoginUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConsoleLoginUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConsoleLoginUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConsoleLoginUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口（CreateFlowsByTemplates）用于使用多个模板批量创建流程
     * @param req CreateFlowsByTemplatesRequest
     * @return CreateFlowsByTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowsByTemplatesResponse CreateFlowsByTemplates(CreateFlowsByTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowsByTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowsByTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowsByTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据流程Id批量创建签署参与者签署H5链接
     * @param req CreateSignUrlsRequest
     * @return CreateSignUrlsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignUrlsResponse CreateSignUrls(CreateSignUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSignUrlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSignUrlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSignUrls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据流程信息批量获取资源下载链接
     * @param req DescribeResourceUrlsByFlowsRequest
     * @return DescribeResourceUrlsByFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUrlsByFlowsResponse DescribeResourceUrlsByFlows(DescribeResourceUrlsByFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceUrlsByFlowsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceUrlsByFlowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceUrlsByFlows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口（DescribeTemplates）查询该企业在电子签渠道版中配置的有效模板列表
     * @param req DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplatesResponse DescribeTemplates(DescribeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeUsage）用于获取渠道所有合作企业流量消耗情况。
 注: 此接口每日限频2次，若要扩大限制次数,请提前与客服经理或邮件至e-contract@tencent.com进行联系。
     * @param req DescribeUsageRequest
     * @return DescribeUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageResponse DescribeUsage(DescribeUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口 (PrepareFlows) 用于创建待发起文件
     * @param req PrepareFlowsRequest
     * @return PrepareFlowsResponse
     * @throws TencentCloudSDKException
     */
    public PrepareFlowsResponse PrepareFlows(PrepareFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PrepareFlowsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PrepareFlowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PrepareFlows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（SyncProxyOrganization）用于同步渠道侧企业信息
     * @param req SyncProxyOrganizationRequest
     * @return SyncProxyOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public SyncProxyOrganizationResponse SyncProxyOrganization(SyncProxyOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncProxyOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncProxyOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncProxyOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（SyncProxyOrganizationOperators）用于同步渠道合作企业经办人列表
     * @param req SyncProxyOrganizationOperatorsRequest
     * @return SyncProxyOrganizationOperatorsResponse
     * @throws TencentCloudSDKException
     */
    public SyncProxyOrganizationOperatorsResponse SyncProxyOrganizationOperators(SyncProxyOrganizationOperatorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncProxyOrganizationOperatorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncProxyOrganizationOperatorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncProxyOrganizationOperators");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
