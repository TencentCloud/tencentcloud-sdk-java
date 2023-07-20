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
package com.tencentcloudapi.tbaas.v20180416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tbaas.v20180416.models.*;

public class TbaasClient extends AbstractClient{
    private static String endpoint = "tbaas.tencentcloudapi.com";
    private static String service = "tbaas";
    private static String version = "2018-04-16";
    
    public TbaasClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TbaasClient(Credential credential, String region, ClientProfile profile) {
        super(TbaasClient.endpoint, TbaasClient.version, credential, region, profile);
    }

    /**
     *批量申请长安链用户签名证书
     * @param req ApplyChainMakerBatchUserCertRequest
     * @return ApplyChainMakerBatchUserCertResponse
     * @throws TencentCloudSDKException
     */
    public ApplyChainMakerBatchUserCertResponse ApplyChainMakerBatchUserCert(ApplyChainMakerBatchUserCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyChainMakerBatchUserCertResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyChainMakerBatchUserCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyChainMakerBatchUserCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *申请用户证书
     * @param req ApplyUserCertRequest
     * @return ApplyUserCertResponse
     * @throws TencentCloudSDKException
     */
    public ApplyUserCertResponse ApplyUserCert(ApplyUserCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyUserCertResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyUserCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyUserCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下载用户证书
     * @param req DownloadUserCertRequest
     * @return DownloadUserCertResponse
     * @throws TencentCloudSDKException
     */
    public DownloadUserCertResponse DownloadUserCert(DownloadUserCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadUserCertResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadUserCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadUserCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看当前网络下的所有区块列表，分页展示
     * @param req GetBlockListRequest
     * @return GetBlockListResponse
     * @throws TencentCloudSDKException
     */
    public GetBlockListResponse GetBlockList(GetBlockListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetBlockListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetBlockListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetBlockList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取区块内的交易列表
     * @param req GetBlockTransactionListForUserRequest
     * @return GetBlockTransactionListForUserResponse
     * @throws TencentCloudSDKException
     */
    public GetBlockTransactionListForUserResponse GetBlockTransactionListForUser(GetBlockTransactionListForUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetBlockTransactionListForUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetBlockTransactionListForUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetBlockTransactionListForUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取区块链网络概要
     * @param req GetClusterSummaryRequest
     * @return GetClusterSummaryResponse
     * @throws TencentCloudSDKException
     */
    public GetClusterSummaryResponse GetClusterSummary(GetClusterSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetClusterSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetClusterSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetClusterSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Invoke异步调用结果查询
     * @param req GetInvokeTxRequest
     * @return GetInvokeTxResponse
     * @throws TencentCloudSDKException
     */
    public GetInvokeTxResponse GetInvokeTx(GetInvokeTxRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetInvokeTxResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetInvokeTxResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetInvokeTx");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取最新交易列表（已废弃）
     * @param req GetLatesdTransactionListRequest
     * @return GetLatesdTransactionListResponse
     * @throws TencentCloudSDKException
     */
    public GetLatesdTransactionListResponse GetLatesdTransactionList(GetLatesdTransactionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLatesdTransactionListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetLatesdTransactionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetLatesdTransactionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取fabric最新交易列表
     * @param req GetLatestTransactionListRequest
     * @return GetLatestTransactionListResponse
     * @throws TencentCloudSDKException
     */
    public GetLatestTransactionListResponse GetLatestTransactionList(GetLatestTransactionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLatestTransactionListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetLatestTransactionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetLatestTransactionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取交易详情
     * @param req GetTransactionDetailForUserRequest
     * @return GetTransactionDetailForUserResponse
     * @throws TencentCloudSDKException
     */
    public GetTransactionDetailForUserResponse GetTransactionDetailForUser(GetTransactionDetailForUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTransactionDetailForUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetTransactionDetailForUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTransactionDetailForUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增交易
     * @param req InvokeRequest
     * @return InvokeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeResponse Invoke(InvokeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvokeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "Invoke");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调用长安链合约执行交易
     * @param req InvokeChainMakerContractRequest
     * @return InvokeChainMakerContractResponse
     * @throws TencentCloudSDKException
     */
    public InvokeChainMakerContractResponse InvokeChainMakerContract(InvokeChainMakerContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvokeChainMakerContractResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeChainMakerContractResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InvokeChainMakerContract");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调用长安链体验网络合约执行交易
     * @param req InvokeChainMakerDemoContractRequest
     * @return InvokeChainMakerDemoContractResponse
     * @throws TencentCloudSDKException
     */
    public InvokeChainMakerDemoContractResponse InvokeChainMakerDemoContract(InvokeChainMakerDemoContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvokeChainMakerDemoContractResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeChainMakerDemoContractResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InvokeChainMakerDemoContract");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询交易
     * @param req QueryRequest
     * @return QueryResponse
     * @throws TencentCloudSDKException
     */
    public QueryResponse Query(QueryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "Query");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询长安链指定高度区块的交易
     * @param req QueryChainMakerBlockTransactionRequest
     * @return QueryChainMakerBlockTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerBlockTransactionResponse QueryChainMakerBlockTransaction(QueryChainMakerBlockTransactionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryChainMakerBlockTransactionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryChainMakerBlockTransactionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryChainMakerBlockTransaction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调用长安链合约查询
     * @param req QueryChainMakerContractRequest
     * @return QueryChainMakerContractResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerContractResponse QueryChainMakerContract(QueryChainMakerContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryChainMakerContractResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryChainMakerContractResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryChainMakerContract");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询长安链体验网络指定高度区块的交易
     * @param req QueryChainMakerDemoBlockTransactionRequest
     * @return QueryChainMakerDemoBlockTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerDemoBlockTransactionResponse QueryChainMakerDemoBlockTransaction(QueryChainMakerDemoBlockTransactionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryChainMakerDemoBlockTransactionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryChainMakerDemoBlockTransactionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryChainMakerDemoBlockTransaction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调用长安链体验网络合约查询
     * @param req QueryChainMakerDemoContractRequest
     * @return QueryChainMakerDemoContractResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerDemoContractResponse QueryChainMakerDemoContract(QueryChainMakerDemoContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryChainMakerDemoContractResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryChainMakerDemoContractResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryChainMakerDemoContract");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过交易ID查询长安链体验网络交易
     * @param req QueryChainMakerDemoTransactionRequest
     * @return QueryChainMakerDemoTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerDemoTransactionResponse QueryChainMakerDemoTransaction(QueryChainMakerDemoTransactionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryChainMakerDemoTransactionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryChainMakerDemoTransactionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryChainMakerDemoTransaction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过交易ID查询长安链交易
     * @param req QueryChainMakerTransactionRequest
     * @return QueryChainMakerTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerTransactionResponse QueryChainMakerTransaction(QueryChainMakerTransactionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryChainMakerTransactionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryChainMakerTransactionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryChainMakerTransaction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *trustsql服务统一接口
     * @param req SrvInvokeRequest
     * @return SrvInvokeResponse
     * @throws TencentCloudSDKException
     */
    public SrvInvokeResponse SrvInvoke(SrvInvokeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SrvInvokeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SrvInvokeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SrvInvoke");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
