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
    private static String service = "mongodb";
    private static String version = "2018-04-08";

    public MongodbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MongodbClient(Credential credential, String region, ClientProfile profile) {
        super(MongodbClient.endpoint, MongodbClient.version, credential, region, profile);
    }

    /**
     *本接口（AssignProject）用于指定云数据库实例的所属项目。
     * @param req AssignProjectRequest
     * @return AssignProjectResponse
     * @throws TencentCloudSDKException
     */
    public AssignProjectResponse AssignProject(AssignProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignProject", AssignProjectResponse.class);
    }

    /**
     *本接口(CreateDBInstance)用于创建包年包月的MongoDB云数据库实例。
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstance", CreateDBInstanceResponse.class);
    }

    /**
     *本接口(CreateDBInstanceHour)用于创建按量计费的MongoDB云数据库实例，可通过传入实例规格、实例类型、MongoDB版本、购买时长和数量等信息创建云数据库实例。
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstanceHour", CreateDBInstanceHourResponse.class);
    }

    /**
     *本接口(DescribeClientConnections)用于查询实例客户端连接信息，包括连接IP和连接数量。目前只支持3.2版本的MongoDB实例。
     * @param req DescribeClientConnectionsRequest
     * @return DescribeClientConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientConnectionsResponse DescribeClientConnections(DescribeClientConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientConnections", DescribeClientConnectionsResponse.class);
    }

    /**
     *本接口(DescribeDBInstances)用于查询云数据库实例列表，支持通过项目ID、实例ID、实例状态等过滤条件来筛选实例。支持查询主实例、灾备实例和只读实例信息列表。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *本接口(DescribeSlowLogs)用于获取云数据库实例的慢查询日志。
     * @param req DescribeSlowLogRequest
     * @return DescribeSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogResponse DescribeSlowLog(DescribeSlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLog", DescribeSlowLogResponse.class);
    }

    /**
     *本接口(DescribeSpecInfo)用于查询实例的售卖规格。
     * @param req DescribeSpecInfoRequest
     * @return DescribeSpecInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecInfoResponse DescribeSpecInfo(DescribeSpecInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecInfo", DescribeSpecInfoResponse.class);
    }

    /**
     *本接口(RenameInstance)用于修改云数据库实例的名称。
     * @param req RenameInstanceRequest
     * @return RenameInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenameInstanceResponse RenameInstance(RenameInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameInstance", RenameInstanceResponse.class);
    }

    /**
     *本接口(SetAutoRenew)用于设置包年包月云数据库实例的续费选项。
     * @param req SetAutoRenewRequest
     * @return SetAutoRenewResponse
     * @throws TencentCloudSDKException
     */
    public SetAutoRenewResponse SetAutoRenew(SetAutoRenewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAutoRenew", SetAutoRenewResponse.class);
    }

    /**
     *本接口(SetPassword)用于设置（初始化）MongoDB云数据库实例账户密码。
     * @param req SetPasswordRequest
     * @return SetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public SetPasswordResponse SetPassword(SetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetPassword", SetPasswordResponse.class);
    }

    /**
     *本接口(TerminateDBInstance)用于销毁按量计费的MongoDB云数据库实例。
     * @param req TerminateDBInstanceRequest
     * @return TerminateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDBInstanceResponse TerminateDBInstance(TerminateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDBInstance", TerminateDBInstanceResponse.class);
    }

    /**
     *本接口(UpgradeDBInstance)用于升级包年包月的MongoDB云数据库实例，可以扩容内存、存储以及Oplog
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstance", UpgradeDBInstanceResponse.class);
    }

    /**
     *本接口(UpgradeDBInstanceHour)用于升级按量计费的MongoDB云数据库实例，可以扩容内存、存储以及oplog
     * @param req UpgradeDBInstanceHourRequest
     * @return UpgradeDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceHourResponse UpgradeDBInstanceHour(UpgradeDBInstanceHourRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstanceHour", UpgradeDBInstanceHourResponse.class);
    }

}
