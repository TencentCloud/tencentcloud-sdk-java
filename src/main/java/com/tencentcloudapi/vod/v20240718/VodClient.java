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
package com.tencentcloudapi.vod.v20240718;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vod.v20240718.models.*;

public class VodClient extends AbstractClient{
    private static String endpoint = "vod.tencentcloudapi.com";
    private static String service = "vod";
    private static String version = "2024-07-18";
    
    public VodClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VodClient(Credential credential, String region, ClientProfile profile) {
        super(VodClient.endpoint, VodClient.version, credential, region, profile);
    }

    /**
     *创建增量迁移策略。
     * @param req CreateIncrementalMigrationStrategyRequest
     * @return CreateIncrementalMigrationStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateIncrementalMigrationStrategyResponse CreateIncrementalMigrationStrategy(CreateIncrementalMigrationStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIncrementalMigrationStrategy", CreateIncrementalMigrationStrategyResponse.class);
    }

    /**
     *该接口用于为专业版应用创建存储桶。

注：
- 本接口仅用于专业版应用；
- 客户创建点播专业版应用时，系统默认为客户开通了部分地域的存储，用户如果需要开通其它地域的存储，可以通过该接口进行开通；
- 通过 [DescribeStorageRegions](https://cloud.tencent.com/document/product/266/72480) 接口可以查询到所有存储地域及已经开通存储桶的地域。
     * @param req CreateStorageRequest
     * @return CreateStorageResponse
     * @throws TencentCloudSDKException
     */
    public CreateStorageResponse CreateStorage(CreateStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStorage", CreateStorageResponse.class);
    }

    /**
     *用于按指定策略，生成专业版应用的临时访问凭证，比如生成用于客户端上传的临时凭证。
     * @param req CreateStorageCredentialsRequest
     * @return CreateStorageCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public CreateStorageCredentialsResponse CreateStorageCredentials(CreateStorageCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStorageCredentials", CreateStorageCredentialsResponse.class);
    }

    /**
     *删除增量迁移策略。
     * @param req DeleteIncrementalMigrationStrategyRequest
     * @return DeleteIncrementalMigrationStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIncrementalMigrationStrategyResponse DeleteIncrementalMigrationStrategy(DeleteIncrementalMigrationStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIncrementalMigrationStrategy", DeleteIncrementalMigrationStrategyResponse.class);
    }

    /**
     *查询增量迁移策略信息。
     * @param req DescribeIncrementalMigrationStrategyInfosRequest
     * @return DescribeIncrementalMigrationStrategyInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIncrementalMigrationStrategyInfosResponse DescribeIncrementalMigrationStrategyInfos(DescribeIncrementalMigrationStrategyInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIncrementalMigrationStrategyInfos", DescribeIncrementalMigrationStrategyInfosResponse.class);
    }

    /**
     *该接口用于查询专业版应用中的存储桶信息，同时支持分页查询。

注：
- 本接口仅用于专业版应用。
     * @param req DescribeStorageRequest
     * @return DescribeStorageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageResponse DescribeStorage(DescribeStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorage", DescribeStorageResponse.class);
    }

    /**
     *创建增量迁移策略。
     * @param req ModifyIncrementalMigrationStrategyRequest
     * @return ModifyIncrementalMigrationStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIncrementalMigrationStrategyResponse ModifyIncrementalMigrationStrategy(ModifyIncrementalMigrationStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIncrementalMigrationStrategy", ModifyIncrementalMigrationStrategyResponse.class);
    }

}
