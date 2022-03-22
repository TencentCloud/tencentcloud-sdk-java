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
     *创建私有域解析账号
     * @param req CreatePrivateDNSAccountRequest
     * @return CreatePrivateDNSAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateDNSAccountResponse CreatePrivateDNSAccount(CreatePrivateDNSAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrivateDNSAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrivateDNSAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrivateDNSAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建私有域
     * @param req CreatePrivateZoneRequest
     * @return CreatePrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateZoneResponse CreatePrivateZone(CreatePrivateZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrivateZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrivateZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrivateZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加私有域解析记录
     * @param req CreatePrivateZoneRecordRequest
     * @return CreatePrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateZoneRecordResponse CreatePrivateZoneRecord(CreatePrivateZoneRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrivateZoneRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrivateZoneRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrivateZoneRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除私有域解析账号
     * @param req DeletePrivateDNSAccountRequest
     * @return DeletePrivateDNSAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateDNSAccountResponse DeletePrivateDNSAccount(DeletePrivateDNSAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrivateDNSAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrivateDNSAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrivateDNSAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除私有域并停止解析
     * @param req DeletePrivateZoneRequest
     * @return DeletePrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateZoneResponse DeletePrivateZone(DeletePrivateZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrivateZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrivateZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrivateZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除私有域解析记录
     * @param req DeletePrivateZoneRecordRequest
     * @return DeletePrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateZoneRecordResponse DeletePrivateZoneRecord(DeletePrivateZoneRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrivateZoneRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrivateZoneRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrivateZoneRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取私有域解析账号的VPC列表
     * @param req DescribeAccountVpcListRequest
     * @return DescribeAccountVpcListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountVpcListResponse DescribeAccountVpcList(DescribeAccountVpcListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountVpcListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountVpcListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountVpcList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取操作日志列表
     * @param req DescribeAuditLogRequest
     * @return DescribeAuditLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogResponse DescribeAuditLog(DescribeAuditLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuditLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuditLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuditLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取私有域解析概览
     * @param req DescribeDashboardRequest
     * @return DescribeDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDashboardResponse DescribeDashboard(DescribeDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDashboardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDashboardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDashboard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取私有域解析账号列表
     * @param req DescribePrivateDNSAccountListRequest
     * @return DescribePrivateDNSAccountListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateDNSAccountListResponse DescribePrivateDNSAccountList(DescribePrivateDNSAccountListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivateDNSAccountListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivateDNSAccountListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivateDNSAccountList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取私有域信息
     * @param req DescribePrivateZoneRequest
     * @return DescribePrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneResponse DescribePrivateZone(DescribePrivateZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivateZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivateZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivateZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取私有域列表
     * @param req DescribePrivateZoneListRequest
     * @return DescribePrivateZoneListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneListResponse DescribePrivateZoneList(DescribePrivateZoneListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivateZoneListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivateZoneListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivateZoneList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取私有域记录列表
     * @param req DescribePrivateZoneRecordListRequest
     * @return DescribePrivateZoneRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneRecordListResponse DescribePrivateZoneRecordList(DescribePrivateZoneRecordListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivateZoneRecordListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivateZoneRecordListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivateZoneRecordList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询私有域解析开通状态
     * @param req DescribePrivateZoneServiceRequest
     * @return DescribePrivateZoneServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneServiceResponse DescribePrivateZoneService(DescribePrivateZoneServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivateZoneServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivateZoneServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivateZoneService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询额度使用情况
     * @param req DescribeQuotaUsageRequest
     * @return DescribeQuotaUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaUsageResponse DescribeQuotaUsage(DescribeQuotaUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQuotaUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQuotaUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQuotaUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取私有域解析请求量
     * @param req DescribeRequestDataRequest
     * @return DescribeRequestDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRequestDataResponse DescribeRequestData(DescribeRequestDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRequestDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRequestDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRequestData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改私有域信息
     * @param req ModifyPrivateZoneRequest
     * @return ModifyPrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneResponse ModifyPrivateZone(ModifyPrivateZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrivateZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrivateZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrivateZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改私有域解析记录
     * @param req ModifyPrivateZoneRecordRequest
     * @return ModifyPrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneRecordResponse ModifyPrivateZoneRecord(ModifyPrivateZoneRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrivateZoneRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrivateZoneRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrivateZoneRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改私有域关联的VPC
     * @param req ModifyPrivateZoneVpcRequest
     * @return ModifyPrivateZoneVpcResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneVpcResponse ModifyPrivateZoneVpc(ModifyPrivateZoneVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrivateZoneVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrivateZoneVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrivateZoneVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开通私有域解析
     * @param req SubscribePrivateZoneServiceRequest
     * @return SubscribePrivateZoneServiceResponse
     * @throws TencentCloudSDKException
     */
    public SubscribePrivateZoneServiceResponse SubscribePrivateZoneService(SubscribePrivateZoneServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubscribePrivateZoneServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubscribePrivateZoneServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubscribePrivateZoneService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
