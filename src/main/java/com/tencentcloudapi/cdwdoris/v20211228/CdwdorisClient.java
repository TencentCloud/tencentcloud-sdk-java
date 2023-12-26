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
package com.tencentcloudapi.cdwdoris.v20211228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwdoris.v20211228.models.*;

public class CdwdorisClient extends AbstractClient{
    private static String endpoint = "cdwdoris.tencentcloudapi.com";
    private static String service = "cdwdoris";
    private static String version = "2021-12-28";
    
    public CdwdorisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwdorisClient(Credential credential, String region, ClientProfile profile) {
        super(CdwdorisClient.endpoint, CdwdorisClient.version, credential, region, profile);
    }

    /**
     *通过API创建集群
     * @param req CreateInstanceNewRequest
     * @return CreateInstanceNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNewResponse CreateInstanceNew(CreateInstanceNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceNew", CreateInstanceNewResponse.class);
    }

    /**
     *获取集群的最新的几个配置文件（config.xml、metrika.xml、user.xml）的内容，显示给用户
     * @param req DescribeClusterConfigsRequest
     * @return DescribeClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterConfigsResponse DescribeClusterConfigs(DescribeClusterConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterConfigs", DescribeClusterConfigsResponse.class);
    }

    /**
     *下载数据库审计日志
     * @param req DescribeDatabaseAuditDownloadRequest
     * @return DescribeDatabaseAuditDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditDownloadResponse DescribeDatabaseAuditDownload(DescribeDatabaseAuditDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditDownload", DescribeDatabaseAuditDownloadResponse.class);
    }

    /**
     *获取数据库审计记录
     * @param req DescribeDatabaseAuditRecordsRequest
     * @return DescribeDatabaseAuditRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditRecordsResponse DescribeDatabaseAuditRecords(DescribeDatabaseAuditRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditRecords", DescribeDatabaseAuditRecordsResponse.class);
    }

    /**
     *根据集群ID查询某个集群的具体信息
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *获取集群节点信息列表
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *获取BE/FE节点角色
     * @param req DescribeInstanceNodesInfoRequest
     * @return DescribeInstanceNodesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesInfoResponse DescribeInstanceNodesInfo(DescribeInstanceNodesInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodesInfo", DescribeInstanceNodesInfoResponse.class);
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
     *获取集群列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *获取慢查询列表
     * @param req DescribeSlowQueryRecordsRequest
     * @return DescribeSlowQueryRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsResponse DescribeSlowQueryRecords(DescribeSlowQueryRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecords", DescribeSlowQueryRecordsResponse.class);
    }

    /**
     *下载慢查询文件
     * @param req DescribeSlowQueryRecordsDownloadRequest
     * @return DescribeSlowQueryRecordsDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsDownloadResponse DescribeSlowQueryRecordsDownload(DescribeSlowQueryRecordsDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecordsDownload", DescribeSlowQueryRecordsDownloadResponse.class);
    }

    /**
     *销毁集群
     * @param req DestroyInstanceRequest
     * @return DestroyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceResponse DestroyInstance(DestroyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstance", DestroyInstanceResponse.class);
    }

    /**
     *修改集群名称
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *扩容云盘
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDisk", ResizeDiskResponse.class);
    }

    /**
     *集群滚动重启
     * @param req RestartClusterForNodeRequest
     * @return RestartClusterForNodeResponse
     * @throws TencentCloudSDKException
     */
    public RestartClusterForNodeResponse RestartClusterForNode(RestartClusterForNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartClusterForNode", RestartClusterForNodeResponse.class);
    }

    /**
     *水平扩容节点
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *计算资源垂直变配
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

}
