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
package com.tencentcloudapi.cfs.v20190719;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cfs.v20190719.models.*;

public class CfsClient extends AbstractClient{
    private static String endpoint = "cfs.tencentcloudapi.com";
    private static String version = "2019-07-19";

    public CfsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CfsClient(Credential credential, String region, ClientProfile profile) {
        super(CfsClient.endpoint, CfsClient.version, credential, region, profile);
    }

    /**
     *用于添加新文件系统
     * @param req CreateCfsFileSystemRequest
     * @return CreateCfsFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsFileSystemResponse CreateCfsFileSystem(CreateCfsFileSystemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCfsFileSystemResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCfsFileSystemResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCfsFileSystem"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateCfsPGroup）用于创建权限组
     * @param req CreateCfsPGroupRequest
     * @return CreateCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsPGroupResponse CreateCfsPGroup(CreateCfsPGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCfsPGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCfsPGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCfsPGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateCfsRule）用于创建权限组规则。
     * @param req CreateCfsRuleRequest
     * @return CreateCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsRuleResponse CreateCfsRule(CreateCfsRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCfsRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCfsRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCfsRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除文件系统
     * @param req DeleteCfsFileSystemRequest
     * @return DeleteCfsFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsFileSystemResponse DeleteCfsFileSystem(DeleteCfsFileSystemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCfsFileSystemResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCfsFileSystemResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCfsFileSystem"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCfsPGroup）用于删除权限组。
     * @param req DeleteCfsPGroupRequest
     * @return DeleteCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsPGroupResponse DeleteCfsPGroup(DeleteCfsPGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCfsPGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCfsPGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCfsPGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCfsRule）用于删除权限组规则。
     * @param req DeleteCfsRuleRequest
     * @return DeleteCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsRuleResponse DeleteCfsRule(DeleteCfsRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCfsRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCfsRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCfsRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteMountTarget）用于删除挂载点
     * @param req DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMountTargetResponse DeleteMountTarget(DeleteMountTargetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMountTargetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMountTargetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMountTarget"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAvailableZoneInfo）用于查询区域的可用情况。
     * @param req DescribeAvailableZoneInfoRequest
     * @return DescribeAvailableZoneInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableZoneInfoResponse DescribeAvailableZoneInfo(DescribeAvailableZoneInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableZoneInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableZoneInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAvailableZoneInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCfsFileSystems）用于查询文件系统
     * @param req DescribeCfsFileSystemsRequest
     * @return DescribeCfsFileSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsFileSystemsResponse DescribeCfsFileSystems(DescribeCfsFileSystemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCfsFileSystemsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCfsFileSystemsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCfsFileSystems"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCfsPGroups）用于查询权限组列表。
     * @param req DescribeCfsPGroupsRequest
     * @return DescribeCfsPGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsPGroupsResponse DescribeCfsPGroups(DescribeCfsPGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCfsPGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCfsPGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCfsPGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCfsRules）用于查询权限组规则列表。
     * @param req DescribeCfsRulesRequest
     * @return DescribeCfsRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsRulesResponse DescribeCfsRules(DescribeCfsRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCfsRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCfsRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCfsRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCfsServiceStatus）用于查询用户使用CFS的服务状态。
     * @param req DescribeCfsServiceStatusRequest
     * @return DescribeCfsServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsServiceStatusResponse DescribeCfsServiceStatus(DescribeCfsServiceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCfsServiceStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCfsServiceStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCfsServiceStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeMountTargets）用于查询文件系统挂载点信息
     * @param req DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountTargetsResponse DescribeMountTargets(DescribeMountTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMountTargetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMountTargetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMountTargets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SignUpCfsService）用于开通CFS服务。
     * @param req SignUpCfsServiceRequest
     * @return SignUpCfsServiceResponse
     * @throws TencentCloudSDKException
     */
    public SignUpCfsServiceResponse SignUpCfsService(SignUpCfsServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SignUpCfsServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SignUpCfsServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SignUpCfsService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateCfsFileSystemName）用于更新文件系统名
     * @param req UpdateCfsFileSystemNameRequest
     * @return UpdateCfsFileSystemNameResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemNameResponse UpdateCfsFileSystemName(UpdateCfsFileSystemNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCfsFileSystemNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCfsFileSystemNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateCfsFileSystemName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateCfsFileSystemPGroup）用于更新文件系统所使用的权限组
     * @param req UpdateCfsFileSystemPGroupRequest
     * @return UpdateCfsFileSystemPGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemPGroupResponse UpdateCfsFileSystemPGroup(UpdateCfsFileSystemPGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCfsFileSystemPGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCfsFileSystemPGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateCfsFileSystemPGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateCfsFileSystemSizeLimit）用于更新文件系统存储容量限制。
     * @param req UpdateCfsFileSystemSizeLimitRequest
     * @return UpdateCfsFileSystemSizeLimitResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemSizeLimitResponse UpdateCfsFileSystemSizeLimit(UpdateCfsFileSystemSizeLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCfsFileSystemSizeLimitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCfsFileSystemSizeLimitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateCfsFileSystemSizeLimit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateCfsPGroup）更新权限组信息。
     * @param req UpdateCfsPGroupRequest
     * @return UpdateCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsPGroupResponse UpdateCfsPGroup(UpdateCfsPGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCfsPGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCfsPGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateCfsPGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateCfsRule）用于更新权限规则。
     * @param req UpdateCfsRuleRequest
     * @return UpdateCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsRuleResponse UpdateCfsRule(UpdateCfsRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCfsRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCfsRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateCfsRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
