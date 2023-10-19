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
package com.tencentcloudapi.tiems.v20190416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tiems.v20190416.models.*;

public class TiemsClient extends AbstractClient{
    private static String endpoint = "tiems.tencentcloudapi.com";
    private static String service = "tiems";
    private static String version = "2019-04-16";
    
    public TiemsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TiemsClient(Credential credential, String region, ClientProfile profile) {
        super(TiemsClient.endpoint, TiemsClient.version, credential, region, profile);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

创建任务
     * @param req CreateJobRequest
     * @return CreateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobResponse CreateJob(CreateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJob", CreateJobResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

创建资源组的伸缩组。当前一个资源组仅允许创建一个伸缩组。
     * @param req CreateRsgAsGroupRequest
     * @return CreateRsgAsGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRsgAsGroupResponse CreateRsgAsGroup(CreateRsgAsGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRsgAsGroup", CreateRsgAsGroupResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

创建运行环境
     * @param req CreateRuntimeRequest
     * @return CreateRuntimeResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuntimeResponse CreateRuntime(CreateRuntimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRuntime", CreateRuntimeResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

创建服务
     * @param req CreateServiceRequest
     * @return CreateServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceResponse CreateService(CreateServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateService", CreateServiceResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

创建服务配置
     * @param req CreateServiceConfigRequest
     * @return CreateServiceConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceConfigResponse CreateServiceConfig(CreateServiceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceConfig", CreateServiceConfigResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

删除资源组中的节点。目前仅支持删除已经到期的预付费节点，和按量付费节点。
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

删除任务
     * @param req DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJob", DeleteJobResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

删除资源组
     * @param req DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceGroupResponse DeleteResourceGroup(DeleteResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceGroup", DeleteResourceGroupResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

伸缩
     * @param req DeleteRsgAsGroupRequest
     * @return DeleteRsgAsGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRsgAsGroupResponse DeleteRsgAsGroup(DeleteRsgAsGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRsgAsGroup", DeleteRsgAsGroupResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

删除运行环境
     * @param req DeleteRuntimeRequest
     * @return DeleteRuntimeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuntimeResponse DeleteRuntime(DeleteRuntimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRuntime", DeleteRuntimeResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

删除服务
     * @param req DeleteServiceRequest
     * @return DeleteServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceResponse DeleteService(DeleteServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteService", DeleteServiceResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

删除服务配置
     * @param req DeleteServiceConfigRequest
     * @return DeleteServiceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceConfigResponse DeleteServiceConfig(DeleteServiceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServiceConfig", DeleteServiceConfigResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

获取节点列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

获取资源组列表
     * @param req DescribeResourceGroupsRequest
     * @return DescribeResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceGroupsResponse DescribeResourceGroups(DescribeResourceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceGroups", DescribeResourceGroupsResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

查询伸缩组活动
     * @param req DescribeRsgAsGroupActivitiesRequest
     * @return DescribeRsgAsGroupActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRsgAsGroupActivitiesResponse DescribeRsgAsGroupActivities(DescribeRsgAsGroupActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRsgAsGroupActivities", DescribeRsgAsGroupActivitiesResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

查询资源组的伸缩组信息
     * @param req DescribeRsgAsGroupsRequest
     * @return DescribeRsgAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRsgAsGroupsResponse DescribeRsgAsGroups(DescribeRsgAsGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRsgAsGroups", DescribeRsgAsGroupsResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

描述服务运行环境
     * @param req DescribeRuntimesRequest
     * @return DescribeRuntimesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuntimesResponse DescribeRuntimes(DescribeRuntimesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuntimes", DescribeRuntimesResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

描述服务配置
     * @param req DescribeServiceConfigsRequest
     * @return DescribeServiceConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceConfigsResponse DescribeServiceConfigs(DescribeServiceConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceConfigs", DescribeServiceConfigsResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

描述服务
     * @param req DescribeServicesRequest
     * @return DescribeServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServicesResponse DescribeServices(DescribeServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServices", DescribeServicesResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

停用资源组的伸缩组
     * @param req DisableRsgAsGroupRequest
     * @return DisableRsgAsGroupResponse
     * @throws TencentCloudSDKException
     */
    public DisableRsgAsGroupResponse DisableRsgAsGroup(DisableRsgAsGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableRsgAsGroup", DisableRsgAsGroupResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

启用资源组的伸缩组
     * @param req EnableRsgAsGroupRequest
     * @return EnableRsgAsGroupResponse
     * @throws TencentCloudSDKException
     */
    public EnableRsgAsGroupResponse EnableRsgAsGroup(EnableRsgAsGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableRsgAsGroup", EnableRsgAsGroupResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

暴露服务
     * @param req ExposeServiceRequest
     * @return ExposeServiceResponse
     * @throws TencentCloudSDKException
     */
    public ExposeServiceResponse ExposeService(ExposeServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExposeService", ExposeServiceResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

更新任务
     * @param req UpdateJobRequest
     * @return UpdateJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdateJobResponse UpdateJob(UpdateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateJob", UpdateJobResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

更新资源组的伸缩组
     * @param req UpdateRsgAsGroupRequest
     * @return UpdateRsgAsGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRsgAsGroupResponse UpdateRsgAsGroup(UpdateRsgAsGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRsgAsGroup", UpdateRsgAsGroupResponse.class);
    }

    /**
     *因业务策略调整，腾讯云TI平台TI-EMS已经于2022年6月30日下线并停止提供服务。若您有新增的业务需求，可前往TI-ONE(https://cloud.tencent.com/document/product/851)使用。

更新服务
     * @param req UpdateServiceRequest
     * @return UpdateServiceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateServiceResponse UpdateService(UpdateServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateService", UpdateServiceResponse.class);
    }

}
