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
        req.setSkipSign(false);
        return this.internalRequest(req, "AgentPayDeals", AgentPayDealsResponse.class);
    }

    /**
     *为合作伙伴提供转账给客户能力。仅支持合作伙伴为自己名下客户转账。
     * @param req AgentTransferMoneyRequest
     * @return AgentTransferMoneyResponse
     * @throws TencentCloudSDKException
     */
    public AgentTransferMoneyResponse AgentTransferMoney(AgentTransferMoneyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AgentTransferMoney", AgentTransferMoneyResponse.class);
    }

    /**
     *为代客or申请中代客分派跟进人（业务员），入参可从以下API获取
- 代客列表获取API： [DescribeAgentAuditedClients](https://cloud.tencent.com/document/product/563/19184)
- 申请中代客列表获取API：[DescribeAgentClients](https://cloud.tencent.com/document/product/563/16046)
- 业务员列表获取API：[DescribeSalesmans](https://cloud.tencent.com/document/product/563/35196) <br><br>
     * @param req AssignClientsToSalesRequest
     * @return AssignClientsToSalesResponse
     * @throws TencentCloudSDKException
     */
    public AssignClientsToSalesResponse AssignClientsToSales(AssignClientsToSalesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignClientsToSales", AssignClientsToSalesResponse.class);
    }

    /**
     *代理商可以审核其名下申请中代客
     * @param req AuditApplyClientRequest
     * @return AuditApplyClientResponse
     * @throws TencentCloudSDKException
     */
    public AuditApplyClientResponse AuditApplyClient(AuditApplyClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuditApplyClient", AuditApplyClientResponse.class);
    }

    /**
     *合作伙伴为客户创建强代付关系
     * @param req CreatePayRelationForClientRequest
     * @return CreatePayRelationForClientResponse
     * @throws TencentCloudSDKException
     */
    public CreatePayRelationForClientResponse CreatePayRelationForClient(CreatePayRelationForClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePayRelationForClient", CreatePayRelationForClientResponse.class);
    }

    /**
     *查询已审核客户列表
     * @param req DescribeAgentAuditedClientsRequest
     * @return DescribeAgentAuditedClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentAuditedClientsResponse DescribeAgentAuditedClients(DescribeAgentAuditedClientsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentAuditedClients", DescribeAgentAuditedClientsResponse.class);
    }

    /**
     *代理商可查询自己及名下代客所有业务明细
     * @param req DescribeAgentBillsRequest
     * @return DescribeAgentBillsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentBillsResponse DescribeAgentBills(DescribeAgentBillsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentBills", DescribeAgentBillsResponse.class);
    }

    /**
     *传入代客uin，查客户级别，客户审核状态，客户实名认证状态
     * @param req DescribeAgentClientGradeRequest
     * @return DescribeAgentClientGradeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentClientGradeResponse DescribeAgentClientGrade(DescribeAgentClientGradeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentClientGrade", DescribeAgentClientGradeResponse.class);
    }

    /**
     *代理商可查询自己名下待审核客户列表
     * @param req DescribeAgentClientsRequest
     * @return DescribeAgentClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentClientsResponse DescribeAgentClients(DescribeAgentClientsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentClients", DescribeAgentClientsResponse.class);
    }

    /**
     *供代理商拉取缓存的全量预付费客户订单
     * @param req DescribeAgentDealsByCacheRequest
     * @return DescribeAgentDealsByCacheResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDealsByCacheResponse DescribeAgentDealsByCache(DescribeAgentDealsByCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentDealsByCache", DescribeAgentDealsByCacheResponse.class);
    }

    /**
     *供代理商使用名下有效普通代客的预付费子订单号查询订单费用详情
     * @param req DescribeAgentDealsPriceDetailByDealNameRequest
     * @return DescribeAgentDealsPriceDetailByDealNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDealsPriceDetailByDealNameResponse DescribeAgentDealsPriceDetailByDealName(DescribeAgentDealsPriceDetailByDealNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentDealsPriceDetailByDealName", DescribeAgentDealsPriceDetailByDealNameResponse.class);
    }

    /**
     *可以查询代理商代付的预付费订单
     * @param req DescribeAgentPayDealsV2Request
     * @return DescribeAgentPayDealsV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeAgentPayDealsV2Response DescribeAgentPayDealsV2(DescribeAgentPayDealsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentPayDealsV2", DescribeAgentPayDealsV2Response.class);
    }

    /**
     *根据大订单号查询关联申请合并支付的其他订单号
     * @param req DescribeAgentRelateBigDealIdsRequest
     * @return DescribeAgentRelateBigDealIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentRelateBigDealIdsResponse DescribeAgentRelateBigDealIds(DescribeAgentRelateBigDealIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentRelateBigDealIds", DescribeAgentRelateBigDealIdsResponse.class);
    }

    /**
     *查询代理商名下指定代客的自付订单（预付费）
     * @param req DescribeAgentSelfPayDealsV2Request
     * @return DescribeAgentSelfPayDealsV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeAgentSelfPayDealsV2Response DescribeAgentSelfPayDealsV2(DescribeAgentSelfPayDealsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentSelfPayDealsV2", DescribeAgentSelfPayDealsV2Response.class);
    }

    /**
     *为合作伙伴提供查询客户余额能力。调用者必须是合作伙伴，只能查询自己名下客户余额
     * @param req DescribeClientBalanceNewRequest
     * @return DescribeClientBalanceNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientBalanceNewResponse DescribeClientBalanceNew(DescribeClientBalanceNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientBalanceNew", DescribeClientBalanceNewResponse.class);
    }

    /**
     *查询合作伙伴名下客户的参与增量激励考核信息列表
     * @param req DescribeClientJoinIncreaseListRequest
     * @return DescribeClientJoinIncreaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientJoinIncreaseListResponse DescribeClientJoinIncreaseList(DescribeClientJoinIncreaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientJoinIncreaseList", DescribeClientJoinIncreaseListResponse.class);
    }

    /**
     *查询客户的交易类型切换任务的信息，查询成功则获取当前用户的切换链接，查询失败则返回失败的原因
     * @param req DescribeClientSwitchTraTaskInfoRequest
     * @return DescribeClientSwitchTraTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientSwitchTraTaskInfoResponse DescribeClientSwitchTraTaskInfo(DescribeClientSwitchTraTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientSwitchTraTaskInfo", DescribeClientSwitchTraTaskInfoResponse.class);
    }

    /**
     *【该接口已下线，请切换使用升级版本DescribeRebateInfosNew】代理商可查询自己名下全部返佣信息
     * @param req DescribeRebateInfosRequest
     * @return DescribeRebateInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebateInfosResponse DescribeRebateInfos(DescribeRebateInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRebateInfos", DescribeRebateInfosResponse.class);
    }

    /**
     *代理商可查询自己名下全部返佣信息
     * @param req DescribeRebateInfosNewRequest
     * @return DescribeRebateInfosNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebateInfosNewResponse DescribeRebateInfosNew(DescribeRebateInfosNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRebateInfosNew", DescribeRebateInfosNewResponse.class);
    }

    /**
     *代理商查询名下业务员列表信息
     * @param req DescribeSalesmansRequest
     * @return DescribeSalesmansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSalesmansResponse DescribeSalesmans(DescribeSalesmansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSalesmans", DescribeSalesmansResponse.class);
    }

    /**
     *代理商名下客户解绑记录查询接口
     * @param req DescribeUnbindClientListRequest
     * @return DescribeUnbindClientListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnbindClientListResponse DescribeUnbindClientList(DescribeUnbindClientListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnbindClientList", DescribeUnbindClientListResponse.class);
    }

    /**
     *代理商可以对名下客户添加备注、修改备注
     * @param req ModifyClientRemarkRequest
     * @return ModifyClientRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClientRemarkResponse ModifyClientRemark(ModifyClientRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClientRemark", ModifyClientRemarkResponse.class);
    }

    /**
     *合作伙伴为客户消除强代付关系
     * @param req RemovePayRelationForClientRequest
     * @return RemovePayRelationForClientResponse
     * @throws TencentCloudSDKException
     */
    public RemovePayRelationForClientResponse RemovePayRelationForClient(RemovePayRelationForClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemovePayRelationForClient", RemovePayRelationForClientResponse.class);
    }

}
