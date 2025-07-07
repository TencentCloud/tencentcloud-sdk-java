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
package com.tencentcloudapi.thpc.v20211109;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.thpc.v20211109.models.*;

public class ThpcClient extends AbstractClient{
    private static String endpoint = "thpc.tencentcloudapi.com";
    private static String service = "thpc";
    private static String version = "2021-11-09";

    public ThpcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ThpcClient(Credential credential, String region, ClientProfile profile) {
        super(ThpcClient.endpoint, ThpcClient.version, credential, region, profile);
    }

    /**
     *本接口(BindAutoScalingGroup)用于为集群队列绑定弹性伸缩组
     * @param req BindAutoScalingGroupRequest
     * @return BindAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoScalingGroupResponse BindAutoScalingGroup(BindAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindAutoScalingGroup", BindAutoScalingGroupResponse.class);
    }

    /**
     *本接口 (CreateCluster) 用于创建并启动集群。
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *本接口（DeleteCluster）用于删除一个指定的集群。
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *本接口（DescribeClusters）用于查询集群列表。
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

}
