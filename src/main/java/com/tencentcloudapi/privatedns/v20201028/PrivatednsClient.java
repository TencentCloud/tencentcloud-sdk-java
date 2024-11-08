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
package com.tencentcloudapi.privatedns.v20201028;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.privatedns.v20201028.models.*;

public class PrivatednsClient extends AbstractClient{
    private static String endpoint = "privatedns.tencentcloudapi.com";
    private static String service = "privatedns";
    private static String version = "2020-10-28";
    
    public PrivatednsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PrivatednsClient(Credential credential, String region, ClientProfile profile) {
        super(PrivatednsClient.endpoint, PrivatednsClient.version, credential, region, profile);
    }

    /**
     *追加与私有域关联的VPC
     * @param req AddSpecifyPrivateZoneVpcRequest
     * @return AddSpecifyPrivateZoneVpcResponse
     * @throws TencentCloudSDKException
     */
    public AddSpecifyPrivateZoneVpcResponse AddSpecifyPrivateZoneVpc(AddSpecifyPrivateZoneVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddSpecifyPrivateZoneVpc", AddSpecifyPrivateZoneVpcResponse.class);
    }

    /**
     *创建终端节点
     * @param req CreateEndPointRequest
     * @return CreateEndPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateEndPointResponse CreateEndPoint(CreateEndPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEndPoint", CreateEndPointResponse.class);
    }

    /**
     *同时创建终端节点和终端节点服务
     * @param req CreateEndPointAndEndPointServiceRequest
     * @return CreateEndPointAndEndPointServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateEndPointAndEndPointServiceResponse CreateEndPointAndEndPointService(CreateEndPointAndEndPointServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEndPointAndEndPointService", CreateEndPointAndEndPointServiceResponse.class);
    }

    /**
     *创建自定义转发规则
     * @param req CreateForwardRuleRequest
     * @return CreateForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateForwardRuleResponse CreateForwardRule(CreateForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateForwardRule", CreateForwardRuleResponse.class);
    }

    /**
     *创建私有域解析账号
     * @param req CreatePrivateDNSAccountRequest
     * @return CreatePrivateDNSAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateDNSAccountResponse CreatePrivateDNSAccount(CreatePrivateDNSAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateDNSAccount", CreatePrivateDNSAccountResponse.class);
    }

    /**
     *创建私有域
     * @param req CreatePrivateZoneRequest
     * @return CreatePrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateZoneResponse CreatePrivateZone(CreatePrivateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateZone", CreatePrivateZoneResponse.class);
    }

    /**
     *添加私有域解析记录
     * @param req CreatePrivateZoneRecordRequest
     * @return CreatePrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateZoneRecordResponse CreatePrivateZoneRecord(CreatePrivateZoneRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateZoneRecord", CreatePrivateZoneRecordResponse.class);
    }

    /**
     *删除终端节点
     * @param req DeleteEndPointRequest
     * @return DeleteEndPointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEndPointResponse DeleteEndPoint(DeleteEndPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEndPoint", DeleteEndPointResponse.class);
    }

    /**
     *删除转发规则并停止转发
     * @param req DeleteForwardRuleRequest
     * @return DeleteForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteForwardRuleResponse DeleteForwardRule(DeleteForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteForwardRule", DeleteForwardRuleResponse.class);
    }

    /**
     *删除私有域解析账号
     * @param req DeletePrivateDNSAccountRequest
     * @return DeletePrivateDNSAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateDNSAccountResponse DeletePrivateDNSAccount(DeletePrivateDNSAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateDNSAccount", DeletePrivateDNSAccountResponse.class);
    }

    /**
     *删除私有域并停止解析
     * @param req DeletePrivateZoneRequest
     * @return DeletePrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateZoneResponse DeletePrivateZone(DeletePrivateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateZone", DeletePrivateZoneResponse.class);
    }

    /**
     *删除私有域解析记录
     * @param req DeletePrivateZoneRecordRequest
     * @return DeletePrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateZoneRecordResponse DeletePrivateZoneRecord(DeletePrivateZoneRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateZoneRecord", DeletePrivateZoneRecordResponse.class);
    }

    /**
     *删除与私有域关联的VPC
     * @param req DeleteSpecifyPrivateZoneVpcRequest
     * @return DeleteSpecifyPrivateZoneVpcResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSpecifyPrivateZoneVpcResponse DeleteSpecifyPrivateZoneVpc(DeleteSpecifyPrivateZoneVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSpecifyPrivateZoneVpc", DeleteSpecifyPrivateZoneVpcResponse.class);
    }

    /**
     *获取私有域解析账号的VPC列表
     * @param req DescribeAccountVpcListRequest
     * @return DescribeAccountVpcListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountVpcListResponse DescribeAccountVpcList(DescribeAccountVpcListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountVpcList", DescribeAccountVpcListResponse.class);
    }

    /**
     *获取操作日志列表
     * @param req DescribeAuditLogRequest
     * @return DescribeAuditLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogResponse DescribeAuditLog(DescribeAuditLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLog", DescribeAuditLogResponse.class);
    }

    /**
     *获取私有域解析概览
     * @param req DescribeDashboardRequest
     * @return DescribeDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDashboardResponse DescribeDashboard(DescribeDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDashboard", DescribeDashboardResponse.class);
    }

    /**
     *获取终端节点列表
     * @param req DescribeEndPointListRequest
     * @return DescribeEndPointListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndPointListResponse DescribeEndPointList(DescribeEndPointListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndPointList", DescribeEndPointListResponse.class);
    }

    /**
     *查询终端节点已经启用了的地域
     * @param req DescribeEndPointRegionRequest
     * @return DescribeEndPointRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndPointRegionResponse DescribeEndPointRegion(DescribeEndPointRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndPointRegion", DescribeEndPointRegionResponse.class);
    }

    /**
     *查询转发规则
     * @param req DescribeForwardRuleRequest
     * @return DescribeForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForwardRuleResponse DescribeForwardRule(DescribeForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForwardRule", DescribeForwardRuleResponse.class);
    }

    /**
     *查询转发规则列表
     * @param req DescribeForwardRuleListRequest
     * @return DescribeForwardRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForwardRuleListResponse DescribeForwardRuleList(DescribeForwardRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForwardRuleList", DescribeForwardRuleListResponse.class);
    }

    /**
     *获取私有域解析账号列表
     * @param req DescribePrivateDNSAccountListRequest
     * @return DescribePrivateDNSAccountListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateDNSAccountListResponse DescribePrivateDNSAccountList(DescribePrivateDNSAccountListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateDNSAccountList", DescribePrivateDNSAccountListResponse.class);
    }

    /**
     *获取私有域信息
     * @param req DescribePrivateZoneRequest
     * @return DescribePrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneResponse DescribePrivateZone(DescribePrivateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateZone", DescribePrivateZoneResponse.class);
    }

    /**
     *获取私有域列表
     * @param req DescribePrivateZoneListRequest
     * @return DescribePrivateZoneListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneListResponse DescribePrivateZoneList(DescribePrivateZoneListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateZoneList", DescribePrivateZoneListResponse.class);
    }

    /**
     *获取私有域记录列表
     * @param req DescribePrivateZoneRecordListRequest
     * @return DescribePrivateZoneRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneRecordListResponse DescribePrivateZoneRecordList(DescribePrivateZoneRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateZoneRecordList", DescribePrivateZoneRecordListResponse.class);
    }

    /**
     *查询私有域解析开通状态
     * @param req DescribePrivateZoneServiceRequest
     * @return DescribePrivateZoneServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneServiceResponse DescribePrivateZoneService(DescribePrivateZoneServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateZoneService", DescribePrivateZoneServiceResponse.class);
    }

    /**
     *查询额度使用情况
     * @param req DescribeQuotaUsageRequest
     * @return DescribeQuotaUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaUsageResponse DescribeQuotaUsage(DescribeQuotaUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuotaUsage", DescribeQuotaUsageResponse.class);
    }

    /**
     *获取私有域解析请求量
     * @param req DescribeRequestDataRequest
     * @return DescribeRequestDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRequestDataResponse DescribeRequestData(DescribeRequestDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRequestData", DescribeRequestDataResponse.class);
    }

    /**
     *修改转发规则
     * @param req ModifyForwardRuleRequest
     * @return ModifyForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyForwardRuleResponse ModifyForwardRule(ModifyForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyForwardRule", ModifyForwardRuleResponse.class);
    }

    /**
     *修改私有域信息
     * @param req ModifyPrivateZoneRequest
     * @return ModifyPrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneResponse ModifyPrivateZone(ModifyPrivateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateZone", ModifyPrivateZoneResponse.class);
    }

    /**
     *修改私有域解析记录
     * @param req ModifyPrivateZoneRecordRequest
     * @return ModifyPrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneRecordResponse ModifyPrivateZoneRecord(ModifyPrivateZoneRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateZoneRecord", ModifyPrivateZoneRecordResponse.class);
    }

    /**
     *修改私有域关联的VPC
     * @param req ModifyPrivateZoneVpcRequest
     * @return ModifyPrivateZoneVpcResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneVpcResponse ModifyPrivateZoneVpc(ModifyPrivateZoneVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateZoneVpc", ModifyPrivateZoneVpcResponse.class);
    }

    /**
     *修改解析记录状态
     * @param req ModifyRecordsStatusRequest
     * @return ModifyRecordsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordsStatusResponse ModifyRecordsStatus(ModifyRecordsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordsStatus", ModifyRecordsStatusResponse.class);
    }

    /**
     *查询异步绑定vpc操作状态
     * @param req QueryAsyncBindVpcStatusRequest
     * @return QueryAsyncBindVpcStatusResponse
     * @throws TencentCloudSDKException
     */
    public QueryAsyncBindVpcStatusResponse QueryAsyncBindVpcStatus(QueryAsyncBindVpcStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryAsyncBindVpcStatus", QueryAsyncBindVpcStatusResponse.class);
    }

    /**
     *开通私有域解析
     * @param req SubscribePrivateZoneServiceRequest
     * @return SubscribePrivateZoneServiceResponse
     * @throws TencentCloudSDKException
     */
    public SubscribePrivateZoneServiceResponse SubscribePrivateZoneService(SubscribePrivateZoneServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubscribePrivateZoneService", SubscribePrivateZoneServiceResponse.class);
    }

}
