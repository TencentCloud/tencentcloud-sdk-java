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
package com.tencentcloudapi.cdwch.v20200915;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwch.v20200915.models.*;

public class CdwchClient extends AbstractClient{
    private static String endpoint = "cdwch.tencentcloudapi.com";
    private static String service = "cdwch";
    private static String version = "2020-09-15";
    
    public CdwchClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwchClient(Credential credential, String region, ClientProfile profile) {
        super(CdwchClient.endpoint, CdwchClient.version, credential, region, profile);
    }

    /**
     *新增和修改用户接口
     * @param req ActionAlterCkUserRequest
     * @return ActionAlterCkUserResponse
     * @throws TencentCloudSDKException
     */
    public ActionAlterCkUserResponse ActionAlterCkUser(ActionAlterCkUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ActionAlterCkUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ActionAlterCkUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ActionAlterCkUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建或者修改备份策略
     * @param req CreateBackUpScheduleRequest
     * @return CreateBackUpScheduleResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackUpScheduleResponse CreateBackUpSchedule(CreateBackUpScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackUpScheduleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBackUpScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBackUpSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集群
     * @param req CreateInstanceNewRequest
     * @return CreateInstanceNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNewResponse CreateInstanceNew(CreateInstanceNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstanceNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询备份策略信息
     * @param req DescribeBackUpScheduleRequest
     * @return DescribeBackUpScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpScheduleResponse DescribeBackUpSchedule(DescribeBackUpScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackUpScheduleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackUpScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackUpSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群用户、集群表，数据库等相关信息
     * @param req DescribeCkSqlApisRequest
     * @return DescribeCkSqlApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCkSqlApisResponse DescribeCkSqlApis(DescribeCkSqlApisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCkSqlApisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCkSqlApisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCkSqlApis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群的最新的几个配置文件（config.xml、metrika.xml、user.xml）的内容，显示给用户
     * @param req DescribeClusterConfigsRequest
     * @return DescribeClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterConfigsResponse DescribeClusterConfigs(DescribeClusterConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据实例ID查询某个实例的具体信息
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集群vcluster列表
     * @param req DescribeInstanceClustersRequest
     * @return DescribeInstanceClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceClustersResponse DescribeInstanceClusters(DescribeInstanceClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在集群详情页面获取所有参数列表
     * @param req DescribeInstanceKeyValConfigsRequest
     * @return DescribeInstanceKeyValConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceKeyValConfigsResponse DescribeInstanceKeyValConfigs(DescribeInstanceKeyValConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceKeyValConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceKeyValConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceKeyValConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例shard信息列表
     * @param req DescribeInstanceShardsRequest
     * @return DescribeInstanceShardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceShardsResponse DescribeInstanceShards(DescribeInstanceShardsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceShardsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceShardsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceShards");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集群详情页中显示集群状态、流程进度等
     * @param req DescribeInstanceStateRequest
     * @return DescribeInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStateResponse DescribeInstanceState(DescribeInstanceStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例列表，供外部sdk使用
     * @param req DescribeInstancesNewRequest
     * @return DescribeInstancesNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesNewResponse DescribeInstancesNew(DescribeInstancesNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *购买页拉取集群的数据节点和zookeeper节点的规格列表
     * @param req DescribeSpecRequest
     * @return DescribeSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecResponse DescribeSpec(DescribeSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpecResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁集群 open api
     * @param req DestroyInstanceRequest
     * @return DestroyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceResponse DestroyInstance(DestroyInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在集群配置页面修改集群配置文件接口，xml模式
     * @param req ModifyClusterConfigsRequest
     * @return ModifyClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterConfigsResponse ModifyClusterConfigs(ModifyClusterConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *KV模式修改配置接口
     * @param req ModifyInstanceKeyValConfigsRequest
     * @return ModifyInstanceKeyValConfigsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceKeyValConfigsResponse ModifyInstanceKeyValConfigs(ModifyInstanceKeyValConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceKeyValConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceKeyValConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceKeyValConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *针对ck账号的权限做管控（新版）
     * @param req ModifyUserNewPrivilegeRequest
     * @return ModifyUserNewPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserNewPrivilegeResponse ModifyUserNewPrivilege(ModifyUserNewPrivilegeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserNewPrivilegeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserNewPrivilegeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserNewPrivilege");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或者关闭策略
     * @param req OpenBackUpRequest
     * @return OpenBackUpResponse
     * @throws TencentCloudSDKException
     */
    public OpenBackUpResponse OpenBackUp(OpenBackUpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenBackUpResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OpenBackUpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenBackUp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *扩容磁盘，包含扩容数据节点，zk节点
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResizeDiskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResizeDiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResizeDisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调整clickhouse节点数量
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScaleOutInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScaleOutInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScaleOutInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *垂直扩缩容节点规格，修改节点cvm的规格cpu，内存。 规格变化阶段，服务不可用。
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScaleUpInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScaleUpInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScaleUpInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
