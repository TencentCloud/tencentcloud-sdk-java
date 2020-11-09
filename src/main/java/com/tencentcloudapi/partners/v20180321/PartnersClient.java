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
    private static String service = "partners";
    private static String version = "2018-03-21";

    public PartnersClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PartnersClient(Credential credential, String region, ClientProfile profile) {
        super(PartnersClient.endpoint, PartnersClient.version, credential, region, profile);
    }

    /**
     *代理商支付订单接口，支持自付/代付
     * @param req AgentPayDealsRequest
     * @return AgentPayDealsResponse
     * @throws TencentCloudSDKException
     */
    public AgentPayDealsResponse AgentPayDeals(AgentPayDealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AgentPayDealsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AgentPayDealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AgentPayDeals");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为合作伙伴提供转账给客户能力。仅支持合作伙伴为自己名下客户转账。
     * @param req AgentTransferMoneyRequest
     * @return AgentTransferMoneyResponse
     * @throws TencentCloudSDKException
     */
    public AgentTransferMoneyResponse AgentTransferMoney(AgentTransferMoneyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AgentTransferMoneyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AgentTransferMoneyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AgentTransferMoney");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可以审核其名下申请中代客
     * @param req AuditApplyClientRequest
     * @return AuditApplyClientResponse
     * @throws TencentCloudSDKException
     */
    public AuditApplyClientResponse AuditApplyClient(AuditApplyClientRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuditApplyClientResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AuditApplyClientResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AuditApplyClient");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合作伙伴为客户创建强代付关系
     * @param req CreatePayRelationForClientRequest
     * @return CreatePayRelationForClientResponse
     * @throws TencentCloudSDKException
     */
    public CreatePayRelationForClientResponse CreatePayRelationForClient(CreatePayRelationForClientRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePayRelationForClientResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePayRelationForClientResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePayRelationForClient");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询已审核客户列表
     * @param req DescribeAgentAuditedClientsRequest
     * @return DescribeAgentAuditedClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentAuditedClientsResponse DescribeAgentAuditedClients(DescribeAgentAuditedClientsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentAuditedClientsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentAuditedClientsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentAuditedClients");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己及名下代客所有业务明细
     * @param req DescribeAgentBillsRequest
     * @return DescribeAgentBillsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentBillsResponse DescribeAgentBills(DescribeAgentBillsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentBillsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentBillsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentBills");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入代客uin，查客户级别，客户审核状态，客户实名认证状态
     * @param req DescribeAgentClientGradeRequest
     * @return DescribeAgentClientGradeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentClientGradeResponse DescribeAgentClientGrade(DescribeAgentClientGradeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentClientGradeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentClientGradeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentClientGrade");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己名下待审核客户列表
     * @param req DescribeAgentClientsRequest
     * @return DescribeAgentClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentClientsResponse DescribeAgentClients(DescribeAgentClientsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentClientsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentClientsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentClients");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *供超大型代理商（代客数量>=3000 ）拉取缓存的全量客户订单。
     * @param req DescribeAgentDealsCacheRequest
     * @return DescribeAgentDealsCacheResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDealsCacheResponse DescribeAgentDealsCache(DescribeAgentDealsCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentDealsCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentDealsCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentDealsCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可以查询代理商代付的所有订单
     * @param req DescribeAgentPayDealsRequest
     * @return DescribeAgentPayDealsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentPayDealsResponse DescribeAgentPayDeals(DescribeAgentPayDealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentPayDealsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentPayDealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentPayDeals");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可以查询代理商下指定客户的自付订单
     * @param req DescribeAgentSelfPayDealsRequest
     * @return DescribeAgentSelfPayDealsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentSelfPayDealsResponse DescribeAgentSelfPayDeals(DescribeAgentSelfPayDealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentSelfPayDealsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentSelfPayDealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentSelfPayDeals");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为合作伙伴提供查询客户余额能力。调用者必须是合作伙伴，只能查询自己名下客户余额
     * @param req DescribeClientBalanceRequest
     * @return DescribeClientBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientBalanceResponse DescribeClientBalance(DescribeClientBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClientBalanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClientBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClientBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己名下全部返佣信息
     * @param req DescribeRebateInfosRequest
     * @return DescribeRebateInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebateInfosResponse DescribeRebateInfos(DescribeRebateInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRebateInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRebateInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRebateInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商查询名下业务员列表信息
     * @param req DescribeSalesmansRequest
     * @return DescribeSalesmansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSalesmansResponse DescribeSalesmans(DescribeSalesmansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSalesmansResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSalesmansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSalesmans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可以对名下客户添加备注、修改备注
     * @param req ModifyClientRemarkRequest
     * @return ModifyClientRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClientRemarkResponse ModifyClientRemark(ModifyClientRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClientRemarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClientRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClientRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合作伙伴为客户消除强代付关系
     * @param req RemovePayRelationForClientRequest
     * @return RemovePayRelationForClientResponse
     * @throws TencentCloudSDKException
     */
    public RemovePayRelationForClientResponse RemovePayRelationForClient(RemovePayRelationForClientRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemovePayRelationForClientResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemovePayRelationForClientResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemovePayRelationForClient");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
