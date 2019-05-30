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

}
