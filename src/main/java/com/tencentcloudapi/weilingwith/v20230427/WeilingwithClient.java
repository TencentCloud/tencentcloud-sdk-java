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
package com.tencentcloudapi.weilingwith.v20230427;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.weilingwith.v20230427.models.*;

public class WeilingwithClient extends AbstractClient{
    private static String endpoint = "weilingwith.tencentcloudapi.com";
    private static String service = "weilingwith";
    private static String version = "2023-04-27";
    
    public WeilingwithClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WeilingwithClient(Credential credential, String region, ClientProfile profile) {
        super(WeilingwithClient.endpoint, WeilingwithClient.version, credential, region, profile);
    }

    /**
     *查询指定空间关联的应用列表
     * @param req DescribeApplicationListRequest
     * @return DescribeApplicationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationListResponse DescribeApplicationList(DescribeApplicationListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘应用凭证
     * @param req DescribeEdgeApplicationTokenRequest
     * @return DescribeEdgeApplicationTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeApplicationTokenResponse DescribeEdgeApplicationToken(DescribeEdgeApplicationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeApplicationTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeApplicationTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeApplicationToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询接口列表
     * @param req DescribeInterfaceListRequest
     * @return DescribeInterfaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInterfaceListResponse DescribeInterfaceList(DescribeInterfaceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInterfaceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInterfaceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInterfaceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取租户下的空间列表
     * @param req DescribeWorkspaceListRequest
     * @return DescribeWorkspaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceListResponse DescribeWorkspaceList(DescribeWorkspaceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkspaceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkspaceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkspaceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询项目空间人员列表
     * @param req DescribeWorkspaceUserListRequest
     * @return DescribeWorkspaceUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceUserListResponse DescribeWorkspaceUserList(DescribeWorkspaceUserListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkspaceUserListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkspaceUserListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkspaceUserList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
