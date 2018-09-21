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
package com.tencentcloudapi.redis.v20180412;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.redis.v20180412.models.*;

public class RedisClient extends AbstractClient{
    private static String endpoint = "redis.tencentcloudapi.com";
    private static String version = "2018-04-12";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public RedisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public RedisClient(Credential credential, String region, ClientProfile profile) {
        super(RedisClient.endpoint, RedisClient.version, credential, region, profile);
    }

    /**
     *清空Redis实例的实例数据。
     * @param req ClearInstanceRequest
     * @return ClearInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ClearInstanceResponse  ClearInstance(ClearInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ClearInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ClearInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建redis实例
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse  CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取备份配置
     * @param req DescribeAutoBackupConfigRequest
     * @return DescribeAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoBackupConfigResponse  DescribeAutoBackupConfig(DescribeAutoBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoBackupConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoBackupConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAutoBackupConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 CRS 实例备份列表
     * @param req DescribeInstanceBackupsRequest
     * @return DescribeInstanceBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceBackupsResponse  DescribeInstanceBackups(DescribeInstanceBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceBackupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceBackupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceBackups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Redis实例列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse  DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *手动备份Redis实例
     * @param req ManualBackupInstanceRequest
     * @return ManualBackupInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ManualBackupInstanceResponse  ManualBackupInstance(ManualBackupInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManualBackupInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ManualBackupInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ManualBackupInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改redis密码
     * @param req ModfiyInstancePasswordRequest
     * @return ModfiyInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModfiyInstancePasswordResponse  ModfiyInstancePassword(ModfiyInstancePasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModfiyInstancePasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModfiyInstancePasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModfiyInstancePassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置自动备份时间
     * @param req ModifyAutoBackupConfigRequest
     * @return ModifyAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackupConfigResponse  ModifyAutoBackupConfig(ModifyAutoBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoBackupConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoBackupConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAutoBackupConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *续费实例
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse  RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenewInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置密码
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse  ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级实例
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse  UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
