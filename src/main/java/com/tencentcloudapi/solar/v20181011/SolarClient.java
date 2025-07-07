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
    private static String service = "solar";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckStaffChUser", CheckStaffChUserResponse.class);
    }

    /**
     *复制活动渠道的策略
     * @param req CopyActivityChannelRequest
     * @return CopyActivityChannelResponse
     * @throws TencentCloudSDKException
     */
    public CopyActivityChannelResponse CopyActivityChannel(CopyActivityChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyActivityChannel", CopyActivityChannelResponse.class);
    }

    /**
     *创建项目
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *创建子项目
     * @param req CreateSubProjectRequest
     * @return CreateSubProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubProjectResponse CreateSubProject(CreateSubProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubProject", CreateSubProjectResponse.class);
    }

    /**
     *删除项目
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *客户档案查询客户详情
     * @param req DescribeCustomerRequest
     * @return DescribeCustomerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerResponse DescribeCustomer(DescribeCustomerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomer", DescribeCustomerResponse.class);
    }

    /**
     *查询客户档案列表
     * @param req DescribeCustomersRequest
     * @return DescribeCustomersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomersResponse DescribeCustomers(DescribeCustomersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomers", DescribeCustomersResponse.class);
    }

    /**
     *项目详情展示
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProject", DescribeProjectResponse.class);
    }

    /**
     *项目库存详情
     * @param req DescribeProjectStockRequest
     * @return DescribeProjectStockResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectStockResponse DescribeProjectStock(DescribeProjectStockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectStock", DescribeProjectStockResponse.class);
    }

    /**
     *项目列表展示
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *素材查询服务号模板的列表（样例）
     * @param req DescribeResourceTemplateHeadersRequest
     * @return DescribeResourceTemplateHeadersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTemplateHeadersResponse DescribeResourceTemplateHeaders(DescribeResourceTemplateHeadersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTemplateHeaders", DescribeResourceTemplateHeadersResponse.class);
    }

    /**
     *子项目详情
     * @param req DescribeSubProjectRequest
     * @return DescribeSubProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubProjectResponse DescribeSubProject(DescribeSubProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubProject", DescribeSubProjectResponse.class);
    }

    /**
     *把审批中的工单置为已失效
     * @param req ExpireFlowRequest
     * @return ExpireFlowResponse
     * @throws TencentCloudSDKException
     */
    public ExpireFlowResponse ExpireFlow(ExpireFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExpireFlow", ExpireFlowResponse.class);
    }

    /**
     *修改项目
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *下线项目
     * @param req OffLineProjectRequest
     * @return OffLineProjectResponse
     * @throws TencentCloudSDKException
     */
    public OffLineProjectResponse OffLineProject(OffLineProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OffLineProject", OffLineProjectResponse.class);
    }

    /**
     *补充子项目库存
     * @param req ReplenishProjectStockRequest
     * @return ReplenishProjectStockResponse
     * @throws TencentCloudSDKException
     */
    public ReplenishProjectStockResponse ReplenishProjectStock(ReplenishProjectStockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplenishProjectStock", ReplenishProjectStockResponse.class);
    }

    /**
     *发送企业微信触达任务
     * @param req SendWxTouchTaskRequest
     * @return SendWxTouchTaskResponse
     * @throws TencentCloudSDKException
     */
    public SendWxTouchTaskResponse SendWxTouchTask(SendWxTouchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendWxTouchTask", SendWxTouchTaskResponse.class);
    }

}
