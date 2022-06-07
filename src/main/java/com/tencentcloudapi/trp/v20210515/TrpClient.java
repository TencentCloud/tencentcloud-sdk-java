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
package com.tencentcloudapi.trp.v20210515;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trp.v20210515.models.*;

public class TrpClient extends AbstractClient{
    private static String endpoint = "trp.tencentcloudapi.com";
    private static String service = "trp";
    private static String version = "2021-05-15";

    public TrpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrpClient(Credential credential, String region, ClientProfile profile) {
        super(TrpClient.endpoint, TrpClient.version, credential, region, profile);
    }

    /**
     *新增批次
     * @param req CreateCodeBatchRequest
     * @return CreateCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeBatchResponse CreateCodeBatch(CreateCodeBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCodeBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCodeBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCodeBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成码包
     * @param req CreateCodePackRequest
     * @return CreateCodePackResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodePackResponse CreateCodePack(CreateCodePackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCodePackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCodePackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCodePack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建商户
     * @param req CreateMerchantRequest
     * @return CreateMerchantResponse
     * @throws TencentCloudSDKException
     */
    public CreateMerchantResponse CreateMerchant(CreateMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建商品
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上链溯源信息
     * @param req CreateTraceChainRequest
     * @return CreateTraceChainResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceChainResponse CreateTraceChain(CreateTraceChainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTraceChainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTraceChainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTraceChain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量导入二维码，只支持平台发的码
     * @param req CreateTraceCodesRequest
     * @return CreateTraceCodesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceCodesResponse CreateTraceCodes(CreateTraceCodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTraceCodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTraceCodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTraceCodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增溯源信息
     * @param req CreateTraceDataRequest
     * @return CreateTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceDataResponse CreateTraceData(CreateTraceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTraceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTraceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTraceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除批次
     * @param req DeleteCodeBatchRequest
     * @return DeleteCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeBatchResponse DeleteCodeBatch(DeleteCodeBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCodeBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCodeBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCodeBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除商户
     * @param req DeleteMerchantRequest
     * @return DeleteMerchantResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMerchantResponse DeleteMerchant(DeleteMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除商品，如果商品被使用，则不可删除
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除溯源信息，如果已经上链则不可删除
     * @param req DeleteTraceDataRequest
     * @return DeleteTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTraceDataResponse DeleteTraceData(DeleteTraceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTraceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTraceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTraceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询批次信息
     * @param req DescribeCodeBatchByIdRequest
     * @return DescribeCodeBatchByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeBatchByIdResponse DescribeCodeBatchById(DescribeCodeBatchByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodeBatchByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodeBatchByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodeBatchById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询批次列表
     * @param req DescribeCodeBatchsRequest
     * @return DescribeCodeBatchsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeBatchsResponse DescribeCodeBatchs(DescribeCodeBatchsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodeBatchsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodeBatchsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodeBatchs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询码包列表
     * @param req DescribeCodePacksRequest
     * @return DescribeCodePacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodePacksResponse DescribeCodePacks(DescribeCodePacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodePacksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodePacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodePacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询码包的二维码列表，上限 3 万
     * @param req DescribeCodesByPackRequest
     * @return DescribeCodesByPackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodesByPackResponse DescribeCodesByPack(DescribeCodesByPackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodesByPackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodesByPackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodesByPack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询商户信息
     * @param req DescribeMerchantByIdRequest
     * @return DescribeMerchantByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMerchantByIdResponse DescribeMerchantById(DescribeMerchantByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMerchantByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMerchantByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMerchantById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询商户列表
     * @param req DescribeMerchantsRequest
     * @return DescribeMerchantsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMerchantsResponse DescribeMerchants(DescribeMerchantsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMerchantsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMerchantsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMerchants");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询商品信息
     * @param req DescribeProductByIdRequest
     * @return DescribeProductByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductByIdResponse DescribeProductById(DescribeProductByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询商品列表
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProducts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询二维码信息
     * @param req DescribeTraceCodeByIdRequest
     * @return DescribeTraceCodeByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceCodeByIdResponse DescribeTraceCodeById(DescribeTraceCodeByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTraceCodeByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTraceCodeByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTraceCodeById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询二维码列表
     * @param req DescribeTraceCodesRequest
     * @return DescribeTraceCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceCodesResponse DescribeTraceCodes(DescribeTraceCodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTraceCodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTraceCodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTraceCodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询溯源信息，通常溯源信息跟生产批次绑定，即一个批次的所有溯源信息都是一样的
     * @param req DescribeTraceDataListRequest
     * @return DescribeTraceDataListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceDataListResponse DescribeTraceDataList(DescribeTraceDataListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTraceDataListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTraceDataListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTraceDataList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改批次
     * @param req ModifyCodeBatchRequest
     * @return ModifyCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCodeBatchResponse ModifyCodeBatch(ModifyCodeBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCodeBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCodeBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCodeBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑商户
     * @param req ModifyMerchantRequest
     * @return ModifyMerchantResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMerchantResponse ModifyMerchant(ModifyMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑商品
     * @param req ModifyProductRequest
     * @return ModifyProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProductResponse ModifyProduct(ModifyProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *冻结或者激活二维码，所属的批次的冻结状态优先级大于单个二维码的状态，即如果批次是冻结的，那么该批次下二维码的状态都是冻结的
     * @param req ModifyTraceCodeRequest
     * @return ModifyTraceCodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceCodeResponse ModifyTraceCode(ModifyTraceCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTraceCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTraceCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTraceCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改溯源信息
     * @param req ModifyTraceDataRequest
     * @return ModifyTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceDataResponse ModifyTraceData(ModifyTraceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTraceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTraceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTraceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改溯源信息的排序
     * @param req ModifyTraceDataRanksRequest
     * @return ModifyTraceDataRanksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceDataRanksResponse ModifyTraceDataRanks(ModifyTraceDataRanksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTraceDataRanksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTraceDataRanksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTraceDataRanks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
