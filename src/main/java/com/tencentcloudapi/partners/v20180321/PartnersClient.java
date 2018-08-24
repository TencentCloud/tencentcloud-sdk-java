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
package com.tencentcloudapi.partners.v20180321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.partners.v20180321.models.*;

public class PartnersClient extends AbstractClient{
    private static String endpoint = "partners.tencentcloudapi.com";
    private static String version = "2018-03-21";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public PartnersClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public PartnersClient(Credential credential, String region, ClientProfile profile) {
        super(PartnersClient.endpoint, PartnersClient.version, credential, region, profile);
    }

    /**
     *代理商支付订单接口，支持自付/代付
     * @param req AgentPayDealsRequest
     * @return AgentPayDealsResponse
     * @throws TencentCloudSDKException
     */
    public AgentPayDealsResponse  AgentPayDeals(AgentPayDealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AgentPayDealsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AgentPayDealsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AgentPayDeals"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可以审核其名下申请中代客
     * @param req AuditApplyClientRequest
     * @return AuditApplyClientResponse
     * @throws TencentCloudSDKException
     */
    public AuditApplyClientResponse  AuditApplyClient(AuditApplyClientRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuditApplyClientResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AuditApplyClientResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AuditApplyClient"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询已审核客户列表
     * @param req DescribeAgentAuditedClientsRequest
     * @return DescribeAgentAuditedClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentAuditedClientsResponse  DescribeAgentAuditedClients(DescribeAgentAuditedClientsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentAuditedClientsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentAuditedClientsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentAuditedClients"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己及名下代客所有业务明细
     * @param req DescribeAgentBillsRequest
     * @return DescribeAgentBillsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentBillsResponse  DescribeAgentBills(DescribeAgentBillsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentBillsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentBillsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentBills"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己名下待审核客户列表
     * @param req DescribeAgentClientsRequest
     * @return DescribeAgentClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentClientsResponse  DescribeAgentClients(DescribeAgentClientsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentClientsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentClientsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentClients"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己名下全部返佣信息
     * @param req DescribeRebateInfosRequest
     * @return DescribeRebateInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebateInfosResponse  DescribeRebateInfos(DescribeRebateInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRebateInfosResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRebateInfosResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRebateInfos"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可以对名下客户添加备注、修改备注
     * @param req ModifyClientRemarkRequest
     * @return ModifyClientRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClientRemarkResponse  ModifyClientRemark(ModifyClientRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClientRemarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClientRemarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyClientRemark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
