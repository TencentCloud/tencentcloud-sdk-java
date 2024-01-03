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
package com.tencentcloudapi.cdc.v20201214;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdc.v20201214.models.*;

public class CdcClient extends AbstractClient{
    private static String endpoint = "cdc.tencentcloudapi.com";
    private static String service = "cdc";
    private static String version = "2020-12-14";
    
    public CdcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdcClient(Credential credential, String region, ClientProfile profile) {
        super(CdcClient.endpoint, CdcClient.version, credential, region, profile);
    }

    /**
     *创建专用集群
     * @param req CreateDedicatedClusterRequest
     * @return CreateDedicatedClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterResponse CreateDedicatedCluster(CreateDedicatedClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDedicatedCluster", CreateDedicatedClusterResponse.class);
    }

    /**
     *创建专用集群订单
     * @param req CreateDedicatedClusterOrderRequest
     * @return CreateDedicatedClusterOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterOrderResponse CreateDedicatedClusterOrder(CreateDedicatedClusterOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDedicatedClusterOrder", CreateDedicatedClusterOrderResponse.class);
    }

    /**
     *创建站点
     * @param req CreateSiteRequest
     * @return CreateSiteResponse
     * @throws TencentCloudSDKException
     */
    public CreateSiteResponse CreateSite(CreateSiteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSite", CreateSiteResponse.class);
    }

    /**
     *删除专用集群
     * @param req DeleteDedicatedClustersRequest
     * @return DeleteDedicatedClustersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDedicatedClustersResponse DeleteDedicatedClusters(DeleteDedicatedClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDedicatedClusters", DeleteDedicatedClustersResponse.class);
    }

    /**
     *删除站点
     * @param req DeleteSitesRequest
     * @return DeleteSitesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSitesResponse DeleteSites(DeleteSitesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSites", DeleteSitesResponse.class);
    }

    /**
     *查询专用集群内cos的容量信息
     * @param req DescribeDedicatedClusterCosCapacityRequest
     * @return DescribeDedicatedClusterCosCapacityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterCosCapacityResponse DescribeDedicatedClusterCosCapacity(DescribeDedicatedClusterCosCapacityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterCosCapacity", DescribeDedicatedClusterCosCapacityResponse.class);
    }

    /**
     *查询专用集群内宿主机的统计信息
     * @param req DescribeDedicatedClusterHostStatisticsRequest
     * @return DescribeDedicatedClusterHostStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterHostStatisticsResponse DescribeDedicatedClusterHostStatistics(DescribeDedicatedClusterHostStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterHostStatistics", DescribeDedicatedClusterHostStatisticsResponse.class);
    }

    /**
     *查询专用集群宿主机信息
     * @param req DescribeDedicatedClusterHostsRequest
     * @return DescribeDedicatedClusterHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterHostsResponse DescribeDedicatedClusterHosts(DescribeDedicatedClusterHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterHosts", DescribeDedicatedClusterHostsResponse.class);
    }

    /**
     *查询专用集群支持的实例规格列表
     * @param req DescribeDedicatedClusterInstanceTypesRequest
     * @return DescribeDedicatedClusterInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterInstanceTypesResponse DescribeDedicatedClusterInstanceTypes(DescribeDedicatedClusterInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterInstanceTypes", DescribeDedicatedClusterInstanceTypesResponse.class);
    }

    /**
     *查询专用集群订单列表
     * @param req DescribeDedicatedClusterOrdersRequest
     * @return DescribeDedicatedClusterOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterOrdersResponse DescribeDedicatedClusterOrders(DescribeDedicatedClusterOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterOrders", DescribeDedicatedClusterOrdersResponse.class);
    }

    /**
     *查询专用集群概览信息
     * @param req DescribeDedicatedClusterOverviewRequest
     * @return DescribeDedicatedClusterOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterOverviewResponse DescribeDedicatedClusterOverview(DescribeDedicatedClusterOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterOverview", DescribeDedicatedClusterOverviewResponse.class);
    }

    /**
     *查询专有集群配置列表
     * @param req DescribeDedicatedClusterTypesRequest
     * @return DescribeDedicatedClusterTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterTypesResponse DescribeDedicatedClusterTypes(DescribeDedicatedClusterTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterTypes", DescribeDedicatedClusterTypesResponse.class);
    }

    /**
     *查询专用集群列表
     * @param req DescribeDedicatedClustersRequest
     * @return DescribeDedicatedClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClustersResponse DescribeDedicatedClusters(DescribeDedicatedClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusters", DescribeDedicatedClustersResponse.class);
    }

    /**
     *查询专用集群支持的可用区列表
     * @param req DescribeDedicatedSupportedZonesRequest
     * @return DescribeDedicatedSupportedZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedSupportedZonesResponse DescribeDedicatedSupportedZones(DescribeDedicatedSupportedZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedSupportedZones", DescribeDedicatedSupportedZonesResponse.class);
    }

    /**
     *查询站点列表
     * @param req DescribeSitesRequest
     * @return DescribeSitesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSitesResponse DescribeSites(DescribeSitesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSites", DescribeSitesResponse.class);
    }

    /**
     *查询站点详情
     * @param req DescribeSitesDetailRequest
     * @return DescribeSitesDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSitesDetailResponse DescribeSitesDetail(DescribeSitesDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSitesDetail", DescribeSitesDetailResponse.class);
    }

    /**
     *修改本地专用集群信息
     * @param req ModifyDedicatedClusterInfoRequest
     * @return ModifyDedicatedClusterInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDedicatedClusterInfoResponse ModifyDedicatedClusterInfo(ModifyDedicatedClusterInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDedicatedClusterInfo", ModifyDedicatedClusterInfoResponse.class);
    }

    /**
     *修改大订单、小订单的状态
     * @param req ModifyOrderStatusRequest
     * @return ModifyOrderStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrderStatusResponse ModifyOrderStatus(ModifyOrderStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOrderStatus", ModifyOrderStatusResponse.class);
    }

    /**
     *修改机房设备信息
     * @param req ModifySiteDeviceInfoRequest
     * @return ModifySiteDeviceInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySiteDeviceInfoResponse ModifySiteDeviceInfo(ModifySiteDeviceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySiteDeviceInfo", ModifySiteDeviceInfoResponse.class);
    }

    /**
     *修改机房信息
     * @param req ModifySiteInfoRequest
     * @return ModifySiteInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySiteInfoResponse ModifySiteInfo(ModifySiteInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySiteInfo", ModifySiteInfoResponse.class);
    }

}
