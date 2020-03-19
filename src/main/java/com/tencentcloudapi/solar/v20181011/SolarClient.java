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
package com.tencentcloudapi.solar.v20181011;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.solar.v20181011.models.*;

public class SolarClient extends AbstractClient{
    private static String endpoint = "solar.tencentcloudapi.com";
    private static String version = "2018-10-11";

    public SolarClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SolarClient(Credential credential, String region, ClientProfile profile) {
        super(SolarClient.endpoint, SolarClient.version, credential, region, profile);
    }

    /**
     *员工渠道更改员工状态
     * @param req CheckStaffChUserRequest
     * @return CheckStaffChUserResponse
     * @throws TencentCloudSDKException
     */
    public CheckStaffChUserResponse CheckStaffChUser(CheckStaffChUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckStaffChUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckStaffChUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckStaffChUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *复制活动渠道的策略
     * @param req CopyActivityChannelRequest
     * @return CopyActivityChannelResponse
     * @throws TencentCloudSDKException
     */
    public CopyActivityChannelResponse CopyActivityChannel(CopyActivityChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyActivityChannelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CopyActivityChannelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CopyActivityChannel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建项目
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建子项目
     * @param req CreateSubProjectRequest
     * @return CreateSubProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubProjectResponse CreateSubProject(CreateSubProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSubProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除项目
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *客户档案查询客户详情
     * @param req DescribeCustomerRequest
     * @return DescribeCustomerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerResponse DescribeCustomer(DescribeCustomerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCustomer"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询客户档案列表
     * @param req DescribeCustomersRequest
     * @return DescribeCustomersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomersResponse DescribeCustomers(DescribeCustomersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCustomers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目详情展示
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目库存详情
     * @param req DescribeProjectStockRequest
     * @return DescribeProjectStockResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectStockResponse DescribeProjectStock(DescribeProjectStockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectStockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectStockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjectStock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目列表展示
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *素材查询服务号模板的列表（样例）
     * @param req DescribeResourceTemplateHeadersRequest
     * @return DescribeResourceTemplateHeadersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTemplateHeadersResponse DescribeResourceTemplateHeaders(DescribeResourceTemplateHeadersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTemplateHeadersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTemplateHeadersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourceTemplateHeaders"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *子项目详情
     * @param req DescribeSubProjectRequest
     * @return DescribeSubProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubProjectResponse DescribeSubProject(DescribeSubProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSubProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *把审批中的工单置为已失效
     * @param req ExpireFlowRequest
     * @return ExpireFlowResponse
     * @throws TencentCloudSDKException
     */
    public ExpireFlowResponse ExpireFlow(ExpireFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExpireFlowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ExpireFlowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ExpireFlow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改项目
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下线项目
     * @param req OffLineProjectRequest
     * @return OffLineProjectResponse
     * @throws TencentCloudSDKException
     */
    public OffLineProjectResponse OffLineProject(OffLineProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OffLineProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OffLineProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OffLineProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *补充子项目库存
     * @param req ReplenishProjectStockRequest
     * @return ReplenishProjectStockResponse
     * @throws TencentCloudSDKException
     */
    public ReplenishProjectStockResponse ReplenishProjectStock(ReplenishProjectStockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplenishProjectStockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplenishProjectStockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplenishProjectStock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送企业微信触达任务
     * @param req SendWxTouchTaskRequest
     * @return SendWxTouchTaskResponse
     * @throws TencentCloudSDKException
     */
    public SendWxTouchTaskResponse SendWxTouchTask(SendWxTouchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendWxTouchTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendWxTouchTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendWxTouchTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
