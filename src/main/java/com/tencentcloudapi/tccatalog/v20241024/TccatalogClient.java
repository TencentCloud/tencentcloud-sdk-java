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
package com.tencentcloudapi.tccatalog.v20241024;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tccatalog.v20241024.models.*;

public class TccatalogClient extends AbstractClient{
    private static String endpoint = "tccatalog.tencentcloudapi.com";
    private static String service = "tccatalog";
    private static String version = "2024-10-24";
    
    public TccatalogClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TccatalogClient(Credential credential, String region, ClientProfile profile) {
        super(TccatalogClient.endpoint, TccatalogClient.version, credential, region, profile);
    }

    /**
     *接受终端节点连接
     * @param req AcceptTccVpcEndPointConnectRequest
     * @return AcceptTccVpcEndPointConnectResponse
     * @throws TencentCloudSDKException
     */
    public AcceptTccVpcEndPointConnectResponse AcceptTccVpcEndPointConnect(AcceptTccVpcEndPointConnectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcceptTccVpcEndPointConnect", AcceptTccVpcEndPointConnectResponse.class);
    }

    /**
     *绑定终端节点服务白名单用户
     * @param req BindTccVpcEndPointServiceWhiteListRequest
     * @return BindTccVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public BindTccVpcEndPointServiceWhiteListResponse BindTccVpcEndPointServiceWhiteList(BindTccVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindTccVpcEndPointServiceWhiteList", BindTccVpcEndPointServiceWhiteListResponse.class);
    }

    /**
     *获取Tcc数据目录详情
     * @param req DescribeTccCatalogRequest
     * @return DescribeTccCatalogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTccCatalogResponse DescribeTccCatalog(DescribeTccCatalogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTccCatalog", DescribeTccCatalogResponse.class);
    }

    /**
     *获取Tcc数据目录列表
     * @param req DescribeTccCatalogsRequest
     * @return DescribeTccCatalogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTccCatalogsResponse DescribeTccCatalogs(DescribeTccCatalogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTccCatalogs", DescribeTccCatalogsResponse.class);
    }

}
