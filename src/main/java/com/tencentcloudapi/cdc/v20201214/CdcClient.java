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
        JsonResponseModel<CreateDedicatedClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDedicatedClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDedicatedCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建专用集群订单
     * @param req CreateDedicatedClusterOrderRequest
     * @return CreateDedicatedClusterOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterOrderResponse CreateDedicatedClusterOrder(CreateDedicatedClusterOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDedicatedClusterOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDedicatedClusterOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDedicatedClusterOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建站点
     * @param req CreateSiteRequest
     * @return CreateSiteResponse
     * @throws TencentCloudSDKException
     */
    public CreateSiteResponse CreateSite(CreateSiteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSiteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSiteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSite");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除专用集群
     * @param req DeleteDedicatedClustersRequest
     * @return DeleteDedicatedClustersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDedicatedClustersResponse DeleteDedicatedClusters(DeleteDedicatedClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDedicatedClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDedicatedClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDedicatedClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除站点
     * @param req DeleteSitesRequest
     * @return DeleteSitesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSitesResponse DeleteSites(DeleteSitesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSitesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSitesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSites");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询专用集群内cos的容量信息
     * @param req DescribeDedicatedClusterCosCapacityRequest
     * @return DescribeDedicatedClusterCosCapacityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterCosCapacityResponse DescribeDedicatedClusterCosCapacity(DescribeDedicatedClusterCosCapacityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedClusterCosCapacityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedClusterCosCapacityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedClusterCosCapacity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询专用集群内宿主机的统计信息
     * @param req DescribeDedicatedClusterHostStatisticsRequest
     * @return DescribeDedicatedClusterHostStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterHostStatisticsResponse DescribeDedicatedClusterHostStatistics(DescribeDedicatedClusterHostStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedClusterHostStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedClusterHostStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedClusterHostStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *专用集群宿主机信息
     * @param req DescribeDedicatedClusterHostsRequest
     * @return DescribeDedicatedClusterHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterHostsResponse DescribeDedicatedClusterHosts(DescribeDedicatedClusterHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedClusterHostsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedClusterHostsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedClusterHosts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询专用集群支持的实例规格列表
     * @param req DescribeDedicatedClusterInstanceTypesRequest
     * @return DescribeDedicatedClusterInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterInstanceTypesResponse DescribeDedicatedClusterInstanceTypes(DescribeDedicatedClusterInstanceTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedClusterInstanceTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedClusterInstanceTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedClusterInstanceTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询专用集群订单列表
     * @param req DescribeDedicatedClusterOrdersRequest
     * @return DescribeDedicatedClusterOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterOrdersResponse DescribeDedicatedClusterOrders(DescribeDedicatedClusterOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedClusterOrdersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedClusterOrdersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedClusterOrders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *专用集群概览信息
     * @param req DescribeDedicatedClusterOverviewRequest
     * @return DescribeDedicatedClusterOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterOverviewResponse DescribeDedicatedClusterOverview(DescribeDedicatedClusterOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedClusterOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedClusterOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedClusterOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询专有集群配置列表
     * @param req DescribeDedicatedClusterTypesRequest
     * @return DescribeDedicatedClusterTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterTypesResponse DescribeDedicatedClusterTypes(DescribeDedicatedClusterTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedClusterTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedClusterTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedClusterTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询专用集群列表
     * @param req DescribeDedicatedClustersRequest
     * @return DescribeDedicatedClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClustersResponse DescribeDedicatedClusters(DescribeDedicatedClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询专用集群支持的可用区列表
     * @param req DescribeDedicatedSupportedZonesRequest
     * @return DescribeDedicatedSupportedZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedSupportedZonesResponse DescribeDedicatedSupportedZones(DescribeDedicatedSupportedZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDedicatedSupportedZonesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDedicatedSupportedZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDedicatedSupportedZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询站点列表
     * @param req DescribeSitesRequest
     * @return DescribeSitesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSitesResponse DescribeSites(DescribeSitesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSitesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSitesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSites");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询站点详情
     * @param req DescribeSitesDetailRequest
     * @return DescribeSitesDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSitesDetailResponse DescribeSitesDetail(DescribeSitesDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSitesDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSitesDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSitesDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改本地专用集群信息
     * @param req ModifyDedicatedClusterInfoRequest
     * @return ModifyDedicatedClusterInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDedicatedClusterInfoResponse ModifyDedicatedClusterInfo(ModifyDedicatedClusterInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDedicatedClusterInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDedicatedClusterInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDedicatedClusterInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改大订单、小订单的状态
     * @param req ModifyOrderStatusRequest
     * @return ModifyOrderStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrderStatusResponse ModifyOrderStatus(ModifyOrderStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyOrderStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyOrderStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyOrderStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改机房设备信息
     * @param req ModifySiteDeviceInfoRequest
     * @return ModifySiteDeviceInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySiteDeviceInfoResponse ModifySiteDeviceInfo(ModifySiteDeviceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySiteDeviceInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySiteDeviceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySiteDeviceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改机房信息
     * @param req ModifySiteInfoRequest
     * @return ModifySiteInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySiteInfoResponse ModifySiteInfo(ModifySiteInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySiteInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySiteInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySiteInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
