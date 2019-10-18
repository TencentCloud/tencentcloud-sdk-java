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
    private static String version = "2018-04-16";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TbaasClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TbaasClient(Credential credential, String region, ClientProfile profile) {
        super(TbaasClient.endpoint, TbaasClient.version, credential, region, profile);
    }

    /**
     *申请用户证书
     * @param req ApplyUserCertRequest
     * @return ApplyUserCertResponse
     * @throws TencentCloudSDKException
     */
    public ApplyUserCertResponse ApplyUserCert(ApplyUserCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyUserCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyUserCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyUserCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Bcos根据块高查询区块信息
     * @param req BlockByNumberHandlerRequest
     * @return BlockByNumberHandlerResponse
     * @throws TencentCloudSDKException
     */
    public BlockByNumberHandlerResponse BlockByNumberHandler(BlockByNumberHandlerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BlockByNumberHandlerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BlockByNumberHandlerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BlockByNumberHandler"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadUserCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadUserCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<GetBlockListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetBlockList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *bcos分页查询当前群组下的区块列表
     * @param req GetBlockListHandlerRequest
     * @return GetBlockListHandlerResponse
     * @throws TencentCloudSDKException
     */
    public GetBlockListHandlerResponse GetBlockListHandler(GetBlockListHandlerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetBlockListHandlerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetBlockListHandlerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetBlockListHandler"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<GetClusterSummaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetClusterSummary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<GetInvokeTxResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetInvokeTx"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取最新交易列表
     * @param req GetLatesdTransactionListRequest
     * @return GetLatesdTransactionListResponse
     * @throws TencentCloudSDKException
     */
    public GetLatesdTransactionListResponse GetLatesdTransactionList(GetLatesdTransactionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLatesdTransactionListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetLatesdTransactionListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetLatesdTransactionList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Bcos根据交易哈希查看交易详细信息
     * @param req GetTransByHashHandlerRequest
     * @return GetTransByHashHandlerResponse
     * @throws TencentCloudSDKException
     */
    public GetTransByHashHandlerResponse GetTransByHashHandler(GetTransByHashHandlerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTransByHashHandlerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetTransByHashHandlerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetTransByHashHandler"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Bcos分页查询当前群组的交易信息列表
     * @param req GetTransListHandlerRequest
     * @return GetTransListHandlerResponse
     * @throws TencentCloudSDKException
     */
    public GetTransListHandlerResponse GetTransListHandler(GetTransListHandlerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTransListHandlerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetTransListHandlerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetTransListHandler"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Invoke"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Query"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Bcos发送交易
     * @param req SendTransactionHandlerRequest
     * @return SendTransactionHandlerResponse
     * @throws TencentCloudSDKException
     */
    public SendTransactionHandlerResponse SendTransactionHandler(SendTransactionHandlerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendTransactionHandlerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendTransactionHandlerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendTransactionHandler"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<SrvInvokeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SrvInvoke"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
