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
package com.tencentcloudapi.ioa.v20220601;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ioa.v20220601.models.*;

public class IoaClient extends AbstractClient{
    private static String endpoint = "ioa.tencentcloudapi.com";
    private static String service = "ioa";
    private static String version = "2022-06-01";
    
    public IoaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IoaClient(Credential credential, String region, ClientProfile profile) {
        super(IoaClient.endpoint, IoaClient.version, credential, region, profile);
    }

    /**
     *以分页的方式查询账户目录列表,私有化调用path为：/capi/Assets/DescribeAccountGroups
     * @param req DescribeAccountGroupsRequest
     * @return DescribeAccountGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountGroupsResponse DescribeAccountGroups(DescribeAccountGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountGroups", DescribeAccountGroupsResponse.class);
    }

    /**
     *查询满足条件的终端数据详情，私有化调用path为：/capi/Assets/Device/DescribeDevices
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevices", DescribeDevicesResponse.class);
    }

    /**
     *获取账号列表，支持分页，模糊搜索，私有化调用path为：/capi/Assets/Account/DescribeLocalAccounts
     * @param req DescribeLocalAccountsRequest
     * @return DescribeLocalAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLocalAccountsResponse DescribeLocalAccounts(DescribeLocalAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLocalAccounts", DescribeLocalAccountsResponse.class);
    }

    /**
     *查询账户根分组详情，私有化调用path为：capi/Assets/DescribeRootAccountGroup
     * @param req DescribeRootAccountGroupRequest
     * @return DescribeRootAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRootAccountGroupResponse DescribeRootAccountGroup(DescribeRootAccountGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRootAccountGroup", DescribeRootAccountGroupResponse.class);
    }

}
