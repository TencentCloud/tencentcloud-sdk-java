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
package com.tencentcloudapi.cdwpg.v20201230;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwpg.v20201230.models.*;

public class CdwpgClient extends AbstractClient{
    private static String endpoint = "cdwpg.tencentcloudapi.com";
    private static String service = "cdwpg";
    private static String version = "2020-12-30";
    
    public CdwpgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwpgClient(Credential credential, String region, ClientProfile profile) {
        super(CdwpgClient.endpoint, CdwpgClient.version, credential, region, profile);
    }

    /**
     *创建集群
     * @param req CreateInstanceByApiRequest
     * @return CreateInstanceByApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceByApiResponse CreateInstanceByApi(CreateInstanceByApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceByApi", CreateInstanceByApiResponse.class);
    }

    /**
     *获取云原生实例对应的账号列表
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *DescribeDBConfigHistory1
     * @param req DescribeDBConfigHistoryRequest
     * @return DescribeDBConfigHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBConfigHistoryResponse DescribeDBConfigHistory(DescribeDBConfigHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBConfigHistory", DescribeDBConfigHistoryResponse.class);
    }

    /**
     *配置描述
     * @param req DescribeDBParamsRequest
     * @return DescribeDBParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBParamsResponse DescribeDBParams(DescribeDBParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBParams", DescribeDBParamsResponse.class);
    }

    /**
     *查询错误日志
     * @param req DescribeErrorLogRequest
     * @return DescribeErrorLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorLogResponse DescribeErrorLog(DescribeErrorLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeErrorLog", DescribeErrorLogResponse.class);
    }

    /**
     *根据实例ID查询某个实例的具体信息
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *获取集群信息
     * @param req DescribeInstanceInfoRequest
     * @return DescribeInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceInfoResponse DescribeInstanceInfo(DescribeInstanceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceInfo", DescribeInstanceInfoResponse.class);
    }

    /**
     *节点list
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *在集群详情页面，拉取该集群的操作
     * @param req DescribeInstanceOperationsRequest
     * @return DescribeInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationsResponse DescribeInstanceOperations(DescribeInstanceOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOperations", DescribeInstanceOperationsResponse.class);
    }

    /**
     *集群详情页中显示集群状态、流程进度等
     * @param req DescribeInstanceStateRequest
     * @return DescribeInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStateResponse DescribeInstanceState(DescribeInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceState", DescribeInstanceStateResponse.class);
    }

    /**
     *获取云原生实例列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *获取集群实例列表
     * @param req DescribeSimpleInstancesRequest
     * @return DescribeSimpleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleInstancesResponse DescribeSimpleInstances(DescribeSimpleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleInstances", DescribeSimpleInstancesResponse.class);
    }

    /**
     *查询慢SQL日志
     * @param req DescribeSlowLogRequest
     * @return DescribeSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogResponse DescribeSlowLog(DescribeSlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLog", DescribeSlowLogResponse.class);
    }

    /**
     *升级记录
     * @param req DescribeUpgradeListRequest
     * @return DescribeUpgradeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpgradeListResponse DescribeUpgradeList(DescribeUpgradeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpgradeList", DescribeUpgradeListResponse.class);
    }

    /**
     *user_hba
     * @param req DescribeUserHbaConfigRequest
     * @return DescribeUserHbaConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserHbaConfigResponse DescribeUserHbaConfig(DescribeUserHbaConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserHbaConfig", DescribeUserHbaConfigResponse.class);
    }

    /**
     *销毁集群
     * @param req DestroyInstanceByApiRequest
     * @return DestroyInstanceByApiResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceByApiResponse DestroyInstanceByApi(DestroyInstanceByApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstanceByApi", DestroyInstanceByApiResponse.class);
    }

    /**
     *集群配置下发
     * @param req ModifyDBParametersRequest
     * @return ModifyDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBParametersResponse ModifyDBParameters(ModifyDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBParameters", ModifyDBParametersResponse.class);
    }

    /**
     *修改实例信息，目前为实例名称
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *修改用户Hba配置
     * @param req ModifyUserHbaRequest
     * @return ModifyUserHbaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserHbaResponse ModifyUserHba(ModifyUserHbaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserHba", ModifyUserHbaResponse.class);
    }

    /**
     *修改账号密码
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
    }

    /**
     *用户在控制台主动发起重启实例
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartInstance", RestartInstanceResponse.class);
    }

    /**
     *水平扩容
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *控制台垂直变配集群
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

    /**
     *在线升级
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

}
