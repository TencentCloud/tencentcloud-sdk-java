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
package com.tencentcloudapi.domain.v20180808;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.domain.v20180808.models.*;

public class DomainClient extends AbstractClient{
    private static String endpoint = "domain.tencentcloudapi.com";
    private static String service = "domain";
    private static String version = "2018-08-08";
    
    public DomainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DomainClient(Credential credential, String region, ClientProfile profile) {
        super(DomainClient.endpoint, DomainClient.version, credential, region, profile);
    }

    /**
     *本接口 ( BatchModifyDomainInfo ) 用于批量域名信息修改 。
     * @param req BatchModifyDomainInfoRequest
     * @return BatchModifyDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyDomainInfoResponse BatchModifyDomainInfo(BatchModifyDomainInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyDomainInfo", BatchModifyDomainInfoResponse.class);
    }

    /**
     *该接口用于用户详情页出价请求
     * @param req BidDetailPageRequest
     * @return BidDetailPageResponse
     * @throws TencentCloudSDKException
     */
    public BidDetailPageResponse BidDetailPage(BidDetailPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BidDetailPage", BidDetailPageResponse.class);
    }

    /**
     *用户合作商预释放出价
     * @param req BidPreDomainsRequest
     * @return BidPreDomainsResponse
     * @throws TencentCloudSDKException
     */
    public BidPreDomainsResponse BidPreDomains(BidPreDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BidPreDomains", BidPreDomainsResponse.class);
    }

    /**
     *用于出价界面出价请求
     * @param req BiddingPreReleaseRequest
     * @return BiddingPreReleaseResponse
     * @throws TencentCloudSDKException
     */
    public BiddingPreReleaseResponse BiddingPreRelease(BiddingPreReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BiddingPreRelease", BiddingPreReleaseResponse.class);
    }

    /**
     *本接口 ( CheckBatchStatus ) 用于查询批量操作日志状态 。
     * @param req CheckBatchStatusRequest
     * @return CheckBatchStatusResponse
     * @throws TencentCloudSDKException
     */
    public CheckBatchStatusResponse CheckBatchStatus(CheckBatchStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckBatchStatus", CheckBatchStatusResponse.class);
    }

    /**
     *检查域名是否可以注册。
     * @param req CheckDomainRequest
     * @return CheckDomainResponse
     * @throws TencentCloudSDKException
     */
    public CheckDomainResponse CheckDomain(CheckDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDomain", CheckDomainResponse.class);
    }

    /**
     *创建自定义DNS Host
     * @param req CreateCustomDnsHostRequest
     * @return CreateCustomDnsHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomDnsHostResponse CreateCustomDnsHost(CreateCustomDnsHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomDnsHost", CreateCustomDnsHostResponse.class);
    }

    /**
     *本接口 ( CreateDomainBatch ) 用于批量域名注册 。
     * @param req CreateDomainBatchRequest
     * @return CreateDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainBatchResponse CreateDomainBatch(CreateDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainBatch", CreateDomainBatchResponse.class);
    }

    /**
     *创建赎回订单。
     * @param req CreateDomainRedemptionRequest
     * @return CreateDomainRedemptionResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainRedemptionResponse CreateDomainRedemption(CreateDomainRedemptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainRedemption", CreateDomainRedemptionResponse.class);
    }

    /**
     *此接口用于创建有效的手机、邮箱
     * @param req CreatePhoneEmailRequest
     * @return CreatePhoneEmailResponse
     * @throws TencentCloudSDKException
     */
    public CreatePhoneEmailResponse CreatePhoneEmail(CreatePhoneEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePhoneEmail", CreatePhoneEmailResponse.class);
    }

    /**
     *本接口 ( CreateTemplate ) 用于添加域名信息模板 。
     * @param req CreateTemplateRequest
     * @return CreateTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTemplateResponse CreateTemplate(CreateTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTemplate", CreateTemplateResponse.class);
    }

    /**
     *删除记录。
     * @param req DeleteBiddingRequest
     * @return DeleteBiddingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBiddingResponse DeleteBidding(DeleteBiddingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBidding", DeleteBiddingResponse.class);
    }

    /**
     *删除自定义DNS Host
     * @param req DeleteCustomDnsHostRequest
     * @return DeleteCustomDnsHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomDnsHostResponse DeleteCustomDnsHost(DeleteCustomDnsHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomDnsHost", DeleteCustomDnsHostResponse.class);
    }

    /**
     *此接口用于删除已验证的手机邮箱
     * @param req DeletePhoneEmailRequest
     * @return DeletePhoneEmailResponse
     * @throws TencentCloudSDKException
     */
    public DeletePhoneEmailResponse DeletePhoneEmail(DeletePhoneEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePhoneEmail", DeletePhoneEmailResponse.class);
    }

    /**
     *用于清除多余的预定域名信息
     * @param req DeleteReservedPreDomainInfoRequest
     * @return DeleteReservedPreDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReservedPreDomainInfoResponse DeleteReservedPreDomainInfo(DeleteReservedPreDomainInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReservedPreDomainInfo", DeleteReservedPreDomainInfoResponse.class);
    }

    /**
     *本接口 ( DeleteTemplate ) 用于删除信息模板。
     * @param req DeleteTemplateRequest
     * @return DeleteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTemplateResponse DeleteTemplate(DeleteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTemplate", DeleteTemplateResponse.class);
    }

    /**
     *用户控制台获取竞价列表
     * @param req DescribeAuctionListRequest
     * @return DescribeAuctionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuctionListResponse DescribeAuctionList(DescribeAuctionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuctionList", DescribeAuctionListResponse.class);
    }

    /**
     *本接口 ( DescribeBatchOperationLogDetails ) 用于获取批量操作日志详情。
     * @param req DescribeBatchOperationLogDetailsRequest
     * @return DescribeBatchOperationLogDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchOperationLogDetailsResponse DescribeBatchOperationLogDetails(DescribeBatchOperationLogDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchOperationLogDetails", DescribeBatchOperationLogDetailsResponse.class);
    }

    /**
     *本接口 ( DescribeBatchOperationLogs ) 用于获取批量操作日志 。
     * @param req DescribeBatchOperationLogsRequest
     * @return DescribeBatchOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchOperationLogsResponse DescribeBatchOperationLogs(DescribeBatchOperationLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchOperationLogs", DescribeBatchOperationLogsResponse.class);
    }

    /**
     *我预约的域名-预约详情。
     * @param req DescribeBiddingAppointDetailRequest
     * @return DescribeBiddingAppointDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBiddingAppointDetailResponse DescribeBiddingAppointDetail(DescribeBiddingAppointDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBiddingAppointDetail", DescribeBiddingAppointDetailResponse.class);
    }

    /**
     *我预定的域名。
     * @param req DescribeBiddingAppointListRequest
     * @return DescribeBiddingAppointListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBiddingAppointListResponse DescribeBiddingAppointList(DescribeBiddingAppointListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBiddingAppointList", DescribeBiddingAppointListResponse.class);
    }

    /**
     *我竞价的域名-竞价详情。
     * @param req DescribeBiddingDetailRequest
     * @return DescribeBiddingDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBiddingDetailResponse DescribeBiddingDetail(DescribeBiddingDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBiddingDetail", DescribeBiddingDetailResponse.class);
    }

    /**
     *我竞价的域名。
     * @param req DescribeBiddingListRequest
     * @return DescribeBiddingListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBiddingListResponse DescribeBiddingList(DescribeBiddingListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBiddingList", DescribeBiddingListResponse.class);
    }

    /**
     *我得标的域名-得标详情。
     * @param req DescribeBiddingSuccessfulDetailRequest
     * @return DescribeBiddingSuccessfulDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBiddingSuccessfulDetailResponse DescribeBiddingSuccessfulDetail(DescribeBiddingSuccessfulDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBiddingSuccessfulDetail", DescribeBiddingSuccessfulDetailResponse.class);
    }

    /**
     *我得标的域名。
     * @param req DescribeBiddingSuccessfulListRequest
     * @return DescribeBiddingSuccessfulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBiddingSuccessfulListResponse DescribeBiddingSuccessfulList(DescribeBiddingSuccessfulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBiddingSuccessfulList", DescribeBiddingSuccessfulListResponse.class);
    }

    /**
     *查询自定义DNS Host
     * @param req DescribeCustomDnsHostSetRequest
     * @return DescribeCustomDnsHostSetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomDnsHostSetResponse DescribeCustomDnsHostSet(DescribeCustomDnsHostSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomDnsHostSet", DescribeCustomDnsHostSetResponse.class);
    }

    /**
     *本接口 (  DescribeDomainBaseInfo) 获取域名基本信息。
     * @param req DescribeDomainBaseInfoRequest
     * @return DescribeDomainBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainBaseInfoResponse DescribeDomainBaseInfo(DescribeDomainBaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainBaseInfo", DescribeDomainBaseInfoResponse.class);
    }

    /**
     *本接口 (  DescribeDomainNameList ) 我的域名列表。
     * @param req DescribeDomainNameListRequest
     * @return DescribeDomainNameListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainNameListResponse DescribeDomainNameList(DescribeDomainNameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainNameList", DescribeDomainNameListResponse.class);
    }

    /**
     *按照域名后缀获取对应的价格列表
     * @param req DescribeDomainPriceListRequest
     * @return DescribeDomainPriceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainPriceListResponse DescribeDomainPriceList(DescribeDomainPriceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainPriceList", DescribeDomainPriceListResponse.class);
    }

    /**
     *获取域名实名信息详情
     * @param req DescribeDomainSimpleInfoRequest
     * @return DescribeDomainSimpleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainSimpleInfoResponse DescribeDomainSimpleInfo(DescribeDomainSimpleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainSimpleInfo", DescribeDomainSimpleInfoResponse.class);
    }

    /**
     *等待支付详情接口
     * @param req DescribePayWaitDetailRequest
     * @return DescribePayWaitDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePayWaitDetailResponse DescribePayWaitDetail(DescribePayWaitDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePayWaitDetail", DescribePayWaitDetailResponse.class);
    }

    /**
     *本接口用于获取已验证的手机邮箱列表
     * @param req DescribePhoneEmailListRequest
     * @return DescribePhoneEmailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePhoneEmailListResponse DescribePhoneEmailList(DescribePhoneEmailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePhoneEmailList", DescribePhoneEmailListResponse.class);
    }

    /**
     *用于预释放竞价列表数据查询
     * @param req DescribePreAuctionListRequest
     * @return DescribePreAuctionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePreAuctionListResponse DescribePreAuctionList(DescribePreAuctionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePreAuctionList", DescribePreAuctionListResponse.class);
    }

    /**
     *用户服务商提前获取预释放域名数据，查询数据根据结束时间进行倒序。
     * @param req DescribePreDomainListRequest
     * @return DescribePreDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePreDomainListResponse DescribePreDomainList(DescribePreDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePreDomainList", DescribePreDomainListResponse.class);
    }

    /**
     *接口用于预释放页面查询
     * @param req DescribePreReleaseListRequest
     * @return DescribePreReleaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePreReleaseListResponse DescribePreReleaseList(DescribePreReleaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePreReleaseList", DescribePreReleaseListResponse.class);
    }

    /**
     *接口用于获取合作商竞价过程中竞价详情数据
     * @param req DescribeReservedBidInfoRequest
     * @return DescribeReservedBidInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedBidInfoResponse DescribeReservedBidInfo(DescribeReservedBidInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReservedBidInfo", DescribeReservedBidInfoResponse.class);
    }

    /**
     *合作商用于查询预约预释放状态信息内容
     * @param req DescribeReservedPreDomainInfoRequest
     * @return DescribeReservedPreDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedPreDomainInfoResponse DescribeReservedPreDomainInfo(DescribeReservedPreDomainInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReservedPreDomainInfo", DescribeReservedPreDomainInfoResponse.class);
    }

    /**
     *本接口 (DescribeTemplate) 用于获取模板信息。
     * @param req DescribeTemplateRequest
     * @return DescribeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateResponse DescribeTemplate(DescribeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplate", DescribeTemplateResponse.class);
    }

    /**
     *本接口 (DescribeTemplateList) 用于获取信息模板列表。
     * @param req DescribeTemplateListRequest
     * @return DescribeTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateListResponse DescribeTemplateList(DescribeTemplateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplateList", DescribeTemplateListResponse.class);
    }

    /**
     *用于获取域名注册当前支持注册的后缀
     * @param req DescribeTldListRequest
     * @return DescribeTldListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTldListResponse DescribeTldList(DescribeTldListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTldList", DescribeTldListResponse.class);
    }

    /**
     *查询预释放未预约域名详情接口
     * @param req DescribeUnPreDomainDetailRequest
     * @return DescribeUnPreDomainDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnPreDomainDetailResponse DescribeUnPreDomainDetail(DescribeUnPreDomainDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnPreDomainDetail", DescribeUnPreDomainDetailResponse.class);
    }

    /**
     *修改自定义DNS Host
     * @param req ModifyCustomDnsHostRequest
     * @return ModifyCustomDnsHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomDnsHostResponse ModifyCustomDnsHost(ModifyCustomDnsHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomDnsHost", ModifyCustomDnsHostResponse.class);
    }

    /**
     *本接口 ( ModifyDomainDNSBatch) 用于批量域名 DNS 修改 。
     * @param req ModifyDomainDNSBatchRequest
     * @return ModifyDomainDNSBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainDNSBatchResponse ModifyDomainDNSBatch(ModifyDomainDNSBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainDNSBatch", ModifyDomainDNSBatchResponse.class);
    }

    /**
     *本接口 ( ModifyDomainOwnerBatch) 用于域名批量账号间转移 。
     * @param req ModifyDomainOwnerBatchRequest
     * @return ModifyDomainOwnerBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainOwnerBatchResponse ModifyDomainOwnerBatch(ModifyDomainOwnerBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainOwnerBatch", ModifyDomainOwnerBatchResponse.class);
    }

    /**
     *国际站-修改DNS Host
     * @param req ModifyIntlCustomDnsHostRequest
     * @return ModifyIntlCustomDnsHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIntlCustomDnsHostResponse ModifyIntlCustomDnsHost(ModifyIntlCustomDnsHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIntlCustomDnsHost", ModifyIntlCustomDnsHostResponse.class);
    }

    /**
     *修改模板信息
     * @param req ModifyTemplateRequest
     * @return ModifyTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTemplateResponse ModifyTemplate(ModifyTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTemplate", ModifyTemplateResponse.class);
    }

    /**
     *本接口 ( RenewDomainBatch ) 用于批量续费域名 。
     * @param req RenewDomainBatchRequest
     * @return RenewDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public RenewDomainBatchResponse RenewDomainBatch(RenewDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDomainBatch", RenewDomainBatchResponse.class);
    }

    /**
     *用于合作商对预释放域名进行预留。
     * @param req ReservedPreDomainsRequest
     * @return ReservedPreDomainsResponse
     * @throws TencentCloudSDKException
     */
    public ReservedPreDomainsResponse ReservedPreDomains(ReservedPreDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReservedPreDomains", ReservedPreDomainsResponse.class);
    }

    /**
     *此接口用于发送手机邮箱验证码。
     * @param req SendPhoneEmailCodeRequest
     * @return SendPhoneEmailCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendPhoneEmailCodeResponse SendPhoneEmailCode(SendPhoneEmailCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendPhoneEmailCode", SendPhoneEmailCodeResponse.class);
    }

    /**
     *本接口 ( SetDomainAutoRenew ) 用于设置域名自动续费。
     * @param req SetDomainAutoRenewRequest
     * @return SetDomainAutoRenewResponse
     * @throws TencentCloudSDKException
     */
    public SetDomainAutoRenewResponse SetDomainAutoRenew(SetDomainAutoRenewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetDomainAutoRenew", SetDomainAutoRenewResponse.class);
    }

    /**
     *同步自定义DNS Host
     * @param req SyncCustomDnsHostRequest
     * @return SyncCustomDnsHostResponse
     * @throws TencentCloudSDKException
     */
    public SyncCustomDnsHostResponse SyncCustomDnsHost(SyncCustomDnsHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncCustomDnsHost", SyncCustomDnsHostResponse.class);
    }

    /**
     *本接口 ( TransferInDomainBatch ) 用于批量转入域名 。
     * @param req TransferInDomainBatchRequest
     * @return TransferInDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public TransferInDomainBatchResponse TransferInDomainBatch(TransferInDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransferInDomainBatch", TransferInDomainBatchResponse.class);
    }

    /**
     *本接口 ( TransferProhibitionBatch ) 用于批量禁止域名转移 。
     * @param req TransferProhibitionBatchRequest
     * @return TransferProhibitionBatchResponse
     * @throws TencentCloudSDKException
     */
    public TransferProhibitionBatchResponse TransferProhibitionBatch(TransferProhibitionBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransferProhibitionBatch", TransferProhibitionBatchResponse.class);
    }

    /**
     *本接口 ( UpdateProhibitionBatch ) 用于批量禁止更新锁。
     * @param req UpdateProhibitionBatchRequest
     * @return UpdateProhibitionBatchResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProhibitionBatchResponse UpdateProhibitionBatch(UpdateProhibitionBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProhibitionBatch", UpdateProhibitionBatchResponse.class);
    }

    /**
     *本接口 ( UploadImage ) 用于证件图片上传 。
     * @param req UploadImageRequest
     * @return UploadImageResponse
     * @throws TencentCloudSDKException
     */
    public UploadImageResponse UploadImage(UploadImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadImage", UploadImageResponse.class);
    }

}
