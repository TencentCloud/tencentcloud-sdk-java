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
package com.tencentcloudapi.mongodb.v20180408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mongodb.v20180408.models.*;

public class MongodbClient extends AbstractClient{
    private static String endpoint = "mongodb.tencentcloudapi.com";
    private static String version = "2018-04-08";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public MongodbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public MongodbClient(Credential credential, String region, ClientProfile profile) {
        super(MongodbClient.endpoint, MongodbClient.version, credential, region, profile);
    }

    /**
     *本接口(CreateDBInstance)用于创建包年包月的MongoDB云数据库实例。
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse  CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDBInstanceHour)用于创建按量计费的MongoDB云数据库实例（包括主实例、灾备实例和只读实例），可通过传入实例规格、实例类型、MongoDB版本、购买时长和数量等信息创建云数据库实例。
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse  CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceHourResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceHourResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBInstanceHour"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(TerminateDBInstance)用于销毁按量计费的MongoDB云数据库实例
     * @param req TerminateDBInstanceRequest
     * @return TerminateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDBInstanceResponse  TerminateDBInstance(TerminateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TerminateDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(UpgradeDBInstance)用于升级包年包月的MongoDB云数据库实例，可以扩容内存、存储以及Oplog
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse  UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(UpgradeDBInstanceHour)用于升级按量计费的MongoDB云数据库实例，可以扩容内存、存储以及oplog
     * @param req UpgradeDBInstanceHourRequest
     * @return UpgradeDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceHourResponse  UpgradeDBInstanceHour(UpgradeDBInstanceHourRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceHourResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceHourResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDBInstanceHour"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
