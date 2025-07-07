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
package com.tencentcloudapi.bma.v20221115;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bma.v20221115.models.*;

public class BmaClient extends AbstractClient{
    private static String endpoint = "bma.tencentcloudapi.com";
    private static String service = "bma";
    private static String version = "2022-11-15";

    public BmaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BmaClient(Credential credential, String region, ClientProfile profile) {
        super(BmaClient.endpoint, BmaClient.version, credential, region, profile);
    }

    /**
     *添加品牌
     * @param req CreateBPBrandRequest
     * @return CreateBPBrandResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPBrandResponse CreateBPBrand(CreateBPBrandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPBrand", CreateBPBrandResponse.class);
    }

    /**
     *仿冒应用举报
     * @param req CreateBPFakeAPPRequest
     * @return CreateBPFakeAPPResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeAPPResponse CreateBPFakeAPP(CreateBPFakeAPPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPFakeAPP", CreateBPFakeAPPResponse.class);
    }

    /**
     *批量仿冒应用举报
     * @param req CreateBPFakeAPPListRequest
     * @return CreateBPFakeAPPListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeAPPListResponse CreateBPFakeAPPList(CreateBPFakeAPPListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPFakeAPPList", CreateBPFakeAPPListResponse.class);
    }

    /**
     *仿冒网址举报
     * @param req CreateBPFakeURLRequest
     * @return CreateBPFakeURLResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeURLResponse CreateBPFakeURL(CreateBPFakeURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPFakeURL", CreateBPFakeURLResponse.class);
    }

    /**
     *批量仿冒网址举报
     * @param req CreateBPFakeURLsRequest
     * @return CreateBPFakeURLsResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeURLsResponse CreateBPFakeURLs(CreateBPFakeURLsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPFakeURLs", CreateBPFakeURLsResponse.class);
    }

    /**
     *添加白名单
     * @param req CreateBPWhiteListRequest
     * @return CreateBPWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPWhiteListResponse CreateBPWhiteList(CreateBPWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPWhiteList", CreateBPWhiteListResponse.class);
    }

    /**
     *删除白名单
     * @param req DeleteBPWhiteListRequest
     * @return DeleteBPWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBPWhiteListResponse DeleteBPWhiteList(DeleteBPWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBPWhiteList", DeleteBPWhiteListResponse.class);
    }

    /**
     *查询品牌列表
     * @param req DescribeBPBrandsRequest
     * @return DescribeBPBrandsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPBrandsResponse DescribeBPBrands(DescribeBPBrandsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBPBrands", DescribeBPBrandsResponse.class);
    }

    /**
     *查询仿冒应用列表
     * @param req DescribeBPFakeAPPListRequest
     * @return DescribeBPFakeAPPListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPFakeAPPListResponse DescribeBPFakeAPPList(DescribeBPFakeAPPListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBPFakeAPPList", DescribeBPFakeAPPListResponse.class);
    }

    /**
     *查询仿冒网址列表
     * @param req DescribeBPFakeURLsRequest
     * @return DescribeBPFakeURLsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPFakeURLsResponse DescribeBPFakeURLs(DescribeBPFakeURLsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBPFakeURLs", DescribeBPFakeURLsResponse.class);
    }

    /**
     *查询白名单列表
     * @param req DescribeBPWhiteListsRequest
     * @return DescribeBPWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPWhiteListsResponse DescribeBPWhiteLists(DescribeBPWhiteListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBPWhiteLists", DescribeBPWhiteListsResponse.class);
    }

}
