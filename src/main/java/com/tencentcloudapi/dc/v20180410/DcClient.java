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
package com.tencentcloudapi.dc.v20180410;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dc.v20180410.models.*;

public class DcClient extends AbstractClient{
    private static String endpoint = "dc.tencentcloudapi.com";
    private static String service = "dc";
    private static String version = "2018-04-10";
    
    public DcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DcClient(Credential credential, String region, ClientProfile profile) {
        super(DcClient.endpoint, DcClient.version, credential, region, profile);
    }

    /**
     *接受专用通道申请
     * @param req AcceptDirectConnectTunnelRequest
     * @return AcceptDirectConnectTunnelResponse
     * @throws TencentCloudSDKException
     */
    public AcceptDirectConnectTunnelResponse AcceptDirectConnectTunnel(AcceptDirectConnectTunnelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcceptDirectConnectTunnel", AcceptDirectConnectTunnelResponse.class);
    }

    /**
     *申请互联网CIDR地址
     * @param req ApplyInternetAddressRequest
     * @return ApplyInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public ApplyInternetAddressResponse ApplyInternetAddress(ApplyInternetAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyInternetAddress", ApplyInternetAddressResponse.class);
    }

    /**
     *申请物理专线接入。
调用该接口时，请注意：
账号要进行实名认证，否则不允许申请物理专线；
若账户下存在欠费状态的物理专线，则不能申请更多的物理专线。
     * @param req CreateDirectConnectRequest
     * @return CreateDirectConnectResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectResponse CreateDirectConnect(CreateDirectConnectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDirectConnect", CreateDirectConnectResponse.class);
    }

    /**
     *创建专用通道。
     * @param req CreateDirectConnectTunnelRequest
     * @return CreateDirectConnectTunnelResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectTunnelResponse CreateDirectConnectTunnel(CreateDirectConnectTunnelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDirectConnectTunnel", CreateDirectConnectTunnelResponse.class);
    }

    /**
     *删除物理专线。
只能删除处于已连接状态的物理专线。
     * @param req DeleteDirectConnectRequest
     * @return DeleteDirectConnectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectResponse DeleteDirectConnect(DeleteDirectConnectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDirectConnect", DeleteDirectConnectResponse.class);
    }

    /**
     *删除专用通道
     * @param req DeleteDirectConnectTunnelRequest
     * @return DeleteDirectConnectTunnelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectTunnelResponse DeleteDirectConnectTunnel(DeleteDirectConnectTunnelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDirectConnectTunnel", DeleteDirectConnectTunnelResponse.class);
    }

    /**
     *查询物理专线接入点

     * @param req DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessPointsResponse DescribeAccessPoints(DescribeAccessPointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessPoints", DescribeAccessPointsResponse.class);
    }

    /**
     *本接口（DescribeDirectConnectTunnelExtra）用于查询专用通道扩展信息
     * @param req DescribeDirectConnectTunnelExtraRequest
     * @return DescribeDirectConnectTunnelExtraResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectTunnelExtraResponse DescribeDirectConnectTunnelExtra(DescribeDirectConnectTunnelExtraRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDirectConnectTunnelExtra", DescribeDirectConnectTunnelExtraResponse.class);
    }

    /**
     *用于查询专用通道列表。
     * @param req DescribeDirectConnectTunnelsRequest
     * @return DescribeDirectConnectTunnelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectTunnelsResponse DescribeDirectConnectTunnels(DescribeDirectConnectTunnelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDirectConnectTunnels", DescribeDirectConnectTunnelsResponse.class);
    }

    /**
     *查询物理专线列表。
     * @param req DescribeDirectConnectsRequest
     * @return DescribeDirectConnectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectsResponse DescribeDirectConnects(DescribeDirectConnectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDirectConnects", DescribeDirectConnectsResponse.class);
    }

    /**
     *获取用户互联网公网地址信息
     * @param req DescribeInternetAddressRequest
     * @return DescribeInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetAddressResponse DescribeInternetAddress(DescribeInternetAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInternetAddress", DescribeInternetAddressResponse.class);
    }

    /**
     *获取用户互联网公网地址配额
     * @param req DescribeInternetAddressQuotaRequest
     * @return DescribeInternetAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetAddressQuotaResponse DescribeInternetAddressQuota(DescribeInternetAddressQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInternetAddressQuota", DescribeInternetAddressQuotaResponse.class);
    }

    /**
     *获取用户互联网公网地址分配统计信息
     * @param req DescribeInternetAddressStatisticsRequest
     * @return DescribeInternetAddressStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetAddressStatisticsResponse DescribeInternetAddressStatistics(DescribeInternetAddressStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInternetAddressStatistics", DescribeInternetAddressStatisticsResponse.class);
    }

    /**
     *本接口（DescribePublicDirectConnectTunnelRoutes）用于查询互联网通道路由列表
     * @param req DescribePublicDirectConnectTunnelRoutesRequest
     * @return DescribePublicDirectConnectTunnelRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicDirectConnectTunnelRoutesResponse DescribePublicDirectConnectTunnelRoutes(DescribePublicDirectConnectTunnelRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicDirectConnectTunnelRoutes", DescribePublicDirectConnectTunnelRoutesResponse.class);
    }

    /**
     *停用用户申请的公网互联网地址
     * @param req DisableInternetAddressRequest
     * @return DisableInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisableInternetAddressResponse DisableInternetAddress(DisableInternetAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableInternetAddress", DisableInternetAddressResponse.class);
    }

    /**
     *启用已停用的互联网公网地址
     * @param req EnableInternetAddressRequest
     * @return EnableInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public EnableInternetAddressResponse EnableInternetAddress(EnableInternetAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableInternetAddress", EnableInternetAddressResponse.class);
    }

    /**
     *修改物理专线的属性。
     * @param req ModifyDirectConnectAttributeRequest
     * @return ModifyDirectConnectAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectAttributeResponse ModifyDirectConnectAttribute(ModifyDirectConnectAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDirectConnectAttribute", ModifyDirectConnectAttributeResponse.class);
    }

    /**
     *修改专用通道属性
     * @param req ModifyDirectConnectTunnelAttributeRequest
     * @return ModifyDirectConnectTunnelAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectTunnelAttributeResponse ModifyDirectConnectTunnelAttribute(ModifyDirectConnectTunnelAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDirectConnectTunnelAttribute", ModifyDirectConnectTunnelAttributeResponse.class);
    }

    /**
     *修改专用通道扩展信息。
     * @param req ModifyDirectConnectTunnelExtraRequest
     * @return ModifyDirectConnectTunnelExtraResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectTunnelExtraResponse ModifyDirectConnectTunnelExtra(ModifyDirectConnectTunnelExtraRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDirectConnectTunnelExtra", ModifyDirectConnectTunnelExtraResponse.class);
    }

    /**
     *拒绝专用通道申请
     * @param req RejectDirectConnectTunnelRequest
     * @return RejectDirectConnectTunnelResponse
     * @throws TencentCloudSDKException
     */
    public RejectDirectConnectTunnelResponse RejectDirectConnectTunnel(RejectDirectConnectTunnelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RejectDirectConnectTunnel", RejectDirectConnectTunnelResponse.class);
    }

    /**
     *释放已申请的互联网地址
     * @param req ReleaseInternetAddressRequest
     * @return ReleaseInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseInternetAddressResponse ReleaseInternetAddress(ReleaseInternetAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseInternetAddress", ReleaseInternetAddressResponse.class);
    }

}
