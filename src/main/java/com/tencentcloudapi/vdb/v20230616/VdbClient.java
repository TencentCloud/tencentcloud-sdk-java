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
package com.tencentcloudapi.vdb.v20230616;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vdb.v20230616.models.*;

public class VdbClient extends AbstractClient{
    private static String endpoint = "vdb.tencentcloudapi.com";
    private static String service = "vdb";
    private static String version = "2023-06-16";
    
    public VdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VdbClient(Credential credential, String region, ClientProfile profile) {
        super(VdbClient.endpoint, VdbClient.version, credential, region, profile);
    }

    /**
     *本接口 (AssociateSecurityGroups) 用于安全组批量绑定多个指定实例。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *本接口（CreateInstance）用于创建向量数据库实例。
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *本接口(DescribeDBSecurityGroups)用于查询实例的安全组详情。
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeInstanceMaintenanceWindow）用于查看实例维护时间窗。
     * @param req DescribeInstanceMaintenanceWindowRequest
     * @return DescribeInstanceMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMaintenanceWindowResponse DescribeInstanceMaintenanceWindow(DescribeInstanceMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMaintenanceWindow", DescribeInstanceMaintenanceWindowResponse.class);
    }

    /**
     *查询实例pod列表
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *查询实例列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *本接口（DestroyInstances）用于销毁实例。
     * @param req DestroyInstancesRequest
     * @return DestroyInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstancesResponse DestroyInstances(DestroyInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstances", DestroyInstancesResponse.class);
    }

    /**
     *本接口(DisassociateSecurityGroups)用于安全组批量解绑实例。
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *本接口（IsolateInstance）用于隔离实例于回收站，在回收站保护时长内可恢复实例。
     * @param req IsolateInstanceRequest
     * @return IsolateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateInstanceResponse IsolateInstance(IsolateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateInstance", IsolateInstanceResponse.class);
    }

    /**
     *本接口(ModifyDBInstanceSecurityGroups)用于修改实例绑定的安全组。
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *本接口（ModifyInstanceMaintenanceWindow）用于修改实例维护时间窗范围。
     * @param req ModifyInstanceMaintenanceWindowRequest
     * @return ModifyInstanceMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceMaintenanceWindowResponse ModifyInstanceMaintenanceWindow(ModifyInstanceMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceMaintenanceWindow", ModifyInstanceMaintenanceWindowResponse.class);
    }

    /**
     *本接口（RecoverInstance）用于恢复在回收站隔离的实例。
     * @param req RecoverInstanceRequest
     * @return RecoverInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RecoverInstanceResponse RecoverInstance(RecoverInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverInstance", RecoverInstanceResponse.class);
    }

    /**
     *本接口（ScaleOutInstance）用于水平扩容节点数量。
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *本接口（ScaleUpInstance）用于升级节点配置规格。
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

}
