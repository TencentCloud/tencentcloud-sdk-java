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
     *查询集群用户、集群表，数据库等相关信息
     * @param req DescribeCkSqlApisRequest
     * @return DescribeCkSqlApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCkSqlApisResponse DescribeCkSqlApis(DescribeCkSqlApisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCkSqlApisResponse> rsp = null;
        String rspStr = "";
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
     *获取实例shard信息列表
     * @param req DescribeInstanceShardsRequest
     * @return DescribeInstanceShardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceShardsResponse DescribeInstanceShards(DescribeInstanceShardsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceShardsResponse> rsp = null;
        String rspStr = "";
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
     *购买页拉取集群的数据节点和zookeeper节点的规格列表
     * @param req DescribeSpecRequest
     * @return DescribeSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecResponse DescribeSpec(DescribeSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpecResponse> rsp = null;
        String rspStr = "";
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
     *在集群配置页面修改集群配置文件接口，xml模式
     * @param req ModifyClusterConfigsRequest
     * @return ModifyClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterConfigsResponse ModifyClusterConfigs(ModifyClusterConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterConfigsResponse> rsp = null;
        String rspStr = "";
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
     *针对ck账号的权限做管控（新版）
     * @param req ModifyUserNewPrivilegeRequest
     * @return ModifyUserNewPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserNewPrivilegeResponse ModifyUserNewPrivilege(ModifyUserNewPrivilegeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserNewPrivilegeResponse> rsp = null;
        String rspStr = "";
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

}
