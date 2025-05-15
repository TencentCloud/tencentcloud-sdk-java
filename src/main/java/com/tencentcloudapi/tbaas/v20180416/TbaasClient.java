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
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyChainMakerBatchUserCert", ApplyChainMakerBatchUserCertResponse.class);
    }

    /**
     *申请用户证书
     * @param req ApplyUserCertRequest
     * @return ApplyUserCertResponse
     * @throws TencentCloudSDKException
     */
    public ApplyUserCertResponse ApplyUserCert(ApplyUserCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyUserCert", ApplyUserCertResponse.class);
    }

    /**
     *获取Fabric某区块的详细信息
     * @param req DescribeFabricBlockRequest
     * @return DescribeFabricBlockResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFabricBlockResponse DescribeFabricBlock(DescribeFabricBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFabricBlock", DescribeFabricBlockResponse.class);
    }

    /**
     *获取Fabric交易的详细信息
     * @param req DescribeFabricTransactionRequest
     * @return DescribeFabricTransactionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFabricTransactionResponse DescribeFabricTransaction(DescribeFabricTransactionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFabricTransaction", DescribeFabricTransactionResponse.class);
    }

    /**
     *下载用户证书
     * @param req DownloadUserCertRequest
     * @return DownloadUserCertResponse
     * @throws TencentCloudSDKException
     */
    public DownloadUserCertResponse DownloadUserCert(DownloadUserCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadUserCert", DownloadUserCertResponse.class);
    }

    /**
     *查看当前网络下的所有区块列表，分页展示
     * @param req GetBlockListRequest
     * @return GetBlockListResponse
     * @throws TencentCloudSDKException
     */
    public GetBlockListResponse GetBlockList(GetBlockListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetBlockList", GetBlockListResponse.class);
    }

    /**
     *获取区块内交易列表
     * @param req GetBlockTransactionListForUserRequest
     * @return GetBlockTransactionListForUserResponse
     * @throws TencentCloudSDKException
     */
    public GetBlockTransactionListForUserResponse GetBlockTransactionListForUser(GetBlockTransactionListForUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetBlockTransactionListForUser", GetBlockTransactionListForUserResponse.class);
    }

    /**
     *获取区块链网络概要
     * @param req GetClusterSummaryRequest
     * @return GetClusterSummaryResponse
     * @throws TencentCloudSDKException
     */
    public GetClusterSummaryResponse GetClusterSummary(GetClusterSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetClusterSummary", GetClusterSummaryResponse.class);
    }

    /**
     *Invoke异步调用结果查询
     * @param req GetInvokeTxRequest
     * @return GetInvokeTxResponse
     * @throws TencentCloudSDKException
     */
    public GetInvokeTxResponse GetInvokeTx(GetInvokeTxRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetInvokeTx", GetInvokeTxResponse.class);
    }

    /**
     *获取fabric最新交易列表
     * @param req GetLatestTransactionListRequest
     * @return GetLatestTransactionListResponse
     * @throws TencentCloudSDKException
     */
    public GetLatestTransactionListResponse GetLatestTransactionList(GetLatestTransactionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLatestTransactionList", GetLatestTransactionListResponse.class);
    }

    /**
     *获取交易的详情
     * @param req GetTransactionDetailForUserRequest
     * @return GetTransactionDetailForUserResponse
     * @throws TencentCloudSDKException
     */
    public GetTransactionDetailForUserResponse GetTransactionDetailForUser(GetTransactionDetailForUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTransactionDetailForUser", GetTransactionDetailForUserResponse.class);
    }

    /**
     *新增交易
     * @param req InvokeRequest
     * @return InvokeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeResponse Invoke(InvokeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Invoke", InvokeResponse.class);
    }

    /**
     *调用长安链合约执行交易
     * @param req InvokeChainMakerContractRequest
     * @return InvokeChainMakerContractResponse
     * @throws TencentCloudSDKException
     */
    public InvokeChainMakerContractResponse InvokeChainMakerContract(InvokeChainMakerContractRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeChainMakerContract", InvokeChainMakerContractResponse.class);
    }

    /**
     *调用长安链体验网络合约执行交易
     * @param req InvokeChainMakerDemoContractRequest
     * @return InvokeChainMakerDemoContractResponse
     * @throws TencentCloudSDKException
     */
    public InvokeChainMakerDemoContractResponse InvokeChainMakerDemoContract(InvokeChainMakerDemoContractRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeChainMakerDemoContract", InvokeChainMakerDemoContractResponse.class);
    }

    /**
     *调用Fabric用户合约执行交易
     * @param req InvokeFabricChaincodeRequest
     * @return InvokeFabricChaincodeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeFabricChaincodeResponse InvokeFabricChaincode(InvokeFabricChaincodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeFabricChaincode", InvokeFabricChaincodeResponse.class);
    }

    /**
     *查询交易
     * @param req QueryRequest
     * @return QueryResponse
     * @throws TencentCloudSDKException
     */
    public QueryResponse Query(QueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Query", QueryResponse.class);
    }

    /**
     *查询长安链指定高度区块的交易
     * @param req QueryChainMakerBlockTransactionRequest
     * @return QueryChainMakerBlockTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerBlockTransactionResponse QueryChainMakerBlockTransaction(QueryChainMakerBlockTransactionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChainMakerBlockTransaction", QueryChainMakerBlockTransactionResponse.class);
    }

    /**
     *调用长安链合约查询
     * @param req QueryChainMakerContractRequest
     * @return QueryChainMakerContractResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerContractResponse QueryChainMakerContract(QueryChainMakerContractRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChainMakerContract", QueryChainMakerContractResponse.class);
    }

    /**
     *查询长安链体验网络指定高度区块的交易
     * @param req QueryChainMakerDemoBlockTransactionRequest
     * @return QueryChainMakerDemoBlockTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerDemoBlockTransactionResponse QueryChainMakerDemoBlockTransaction(QueryChainMakerDemoBlockTransactionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChainMakerDemoBlockTransaction", QueryChainMakerDemoBlockTransactionResponse.class);
    }

    /**
     *调用长安链体验网络合约查询
     * @param req QueryChainMakerDemoContractRequest
     * @return QueryChainMakerDemoContractResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerDemoContractResponse QueryChainMakerDemoContract(QueryChainMakerDemoContractRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChainMakerDemoContract", QueryChainMakerDemoContractResponse.class);
    }

    /**
     *通过交易ID查询长安链体验网络交易
     * @param req QueryChainMakerDemoTransactionRequest
     * @return QueryChainMakerDemoTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerDemoTransactionResponse QueryChainMakerDemoTransaction(QueryChainMakerDemoTransactionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChainMakerDemoTransaction", QueryChainMakerDemoTransactionResponse.class);
    }

    /**
     *通过交易ID查询长安链交易
     * @param req QueryChainMakerTransactionRequest
     * @return QueryChainMakerTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryChainMakerTransactionResponse QueryChainMakerTransaction(QueryChainMakerTransactionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChainMakerTransaction", QueryChainMakerTransactionResponse.class);
    }

    /**
     *调用Fabric用户合约查询
     * @param req QueryFabricChaincodeRequest
     * @return QueryFabricChaincodeResponse
     * @throws TencentCloudSDKException
     */
    public QueryFabricChaincodeResponse QueryFabricChaincode(QueryFabricChaincodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryFabricChaincode", QueryFabricChaincodeResponse.class);
    }

    /**
     *trustsql服务统一接口
     * @param req SrvInvokeRequest
     * @return SrvInvokeResponse
     * @throws TencentCloudSDKException
     */
    public SrvInvokeResponse SrvInvoke(SrvInvokeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SrvInvoke", SrvInvokeResponse.class);
    }

}
