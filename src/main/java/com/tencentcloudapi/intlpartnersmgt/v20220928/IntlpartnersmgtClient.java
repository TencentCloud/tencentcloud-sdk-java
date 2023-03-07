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
package com.tencentcloudapi.intlpartnersmgt.v20220928;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.intlpartnersmgt.v20220928.models.*;

public class IntlpartnersmgtClient extends AbstractClient{
    private static String endpoint = "intlpartnersmgt.tencentcloudapi.com";
    private static String service = "intlpartnersmgt";
    private static String version = "2022-09-28";

    public IntlpartnersmgtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IntlpartnersmgtClient(Credential credential, String region, ClientProfile profile) {
        super(IntlpartnersmgtClient.endpoint, IntlpartnersmgtClient.version, credential, region, profile);
    }

    /**
     *合作伙伴可以为关联客户设置信用额度，包括调高额度、降低额度、设置额度为0
1、信用额度长期有效，不会定期清0；
2、可用信用额度为0，会触发客户停服，请谨慎操作；
3、如需限制客户新购，但不影响已购产品使用，可与渠道经理申请客户欠费不停服特权后，设置可用信用额度为0；
4、设置的额度，为当前可用信用额度的增量，最大不能超过合作伙伴可分配的剩余额度，设置负数代表回收额度，可用信用额度最低设置为0。
     * @param req AllocateCustomerCreditRequest
     * @return AllocateCustomerCreditResponse
     * @throws TencentCloudSDKException
     */
    public AllocateCustomerCreditResponse AllocateCustomerCredit(AllocateCustomerCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateCustomerCreditResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateCustomerCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AllocateCustomerCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在合作伙伴平台，创建腾讯云账号，子客户注册完成后，自动与合作伙伴账号绑定。

注意事项：<br>
1、创建腾讯云账号，输入的邮箱、手机号，需要合作伙伴做有效性验证。<br>
2、客户首次登录需要补充个人信息
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取国家和地区的代码
     * @param req GetCountryCodesRequest
     * @return GetCountryCodesResponse
     * @throws TencentCloudSDKException
     */
    public GetCountryCodesResponse GetCountryCodes(GetCountryCodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCountryCodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCountryCodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCountryCodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单个客户的全部历史分配记录
     * @param req QueryCreditAllocationHistoryRequest
     * @return QueryCreditAllocationHistoryResponse
     * @throws TencentCloudSDKException
     */
    public QueryCreditAllocationHistoryResponse QueryCreditAllocationHistory(QueryCreditAllocationHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCreditAllocationHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCreditAllocationHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCreditAllocationHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户列表信用
     * @param req QueryCreditByUinListRequest
     * @return QueryCreditByUinListResponse
     * @throws TencentCloudSDKException
     */
    public QueryCreditByUinListResponse QueryCreditByUinList(QueryCreditByUinListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCreditByUinListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCreditByUinListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCreditByUinList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合作伙伴可以查询关联客户的信用额度，以及客户的基础信息
     * @param req QueryCustomersCreditRequest
     * @return QueryCustomersCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryCustomersCreditResponse QueryCustomersCredit(QueryCustomersCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCustomersCreditResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCustomersCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCustomersCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询直接子客信用
     * @param req QueryDirectCustomersCreditRequest
     * @return QueryDirectCustomersCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryDirectCustomersCreditResponse QueryDirectCustomersCredit(QueryDirectCustomersCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryDirectCustomersCreditResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryDirectCustomersCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryDirectCustomersCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询合作伙伴自己的总信用额度、可用信用额度、已使用信用额度，单位为美元
     * @param req QueryPartnerCreditRequest
     * @return QueryPartnerCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryPartnerCreditResponse QueryPartnerCredit(QueryPartnerCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryPartnerCreditResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryPartnerCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryPartnerCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据客户uin查询代金券额度
     * @param req QueryVoucherAmountByUinRequest
     * @return QueryVoucherAmountByUinResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherAmountByUinResponse QueryVoucherAmountByUin(QueryVoucherAmountByUinRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryVoucherAmountByUinResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryVoucherAmountByUinResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryVoucherAmountByUin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据客户uin查询代金券列表
     * @param req QueryVoucherListByUinRequest
     * @return QueryVoucherListByUinResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherListByUinResponse QueryVoucherListByUin(QueryVoucherListByUinRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryVoucherListByUinResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryVoucherListByUinResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryVoucherListByUin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询代金券额度池
     * @param req QueryVoucherPoolRequest
     * @return QueryVoucherPoolResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherPoolResponse QueryVoucherPool(QueryVoucherPoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryVoucherPoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryVoucherPoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryVoucherPool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
